package org.jacademie.projet.controller;

import javax.ws.rs.PathParam;

import org.jacademie.projet.domain.Album;
import org.jacademie.projet.domain.Artiste;
import org.jacademie.projet.services.AlbumService;
import org.jacademie.projet.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@RequestMapping(value="/album", method= RequestMethod.GET)
	
	public String displayAlbum(@PathParam("id_artiste") Integer codeArtiste, Model model){
		model.addAttribute("albums",this.albumService.retrieveAlbums(codeArtiste));
		model.addAttribute("codeArtiste", codeArtiste);
		return "album";
	}
	
	@RequestMapping(value="/registerAlbum", method= RequestMethod.GET)
	public String displayNewArtistes(Model model){
		return "registerAlbum";
	}
	
	@ModelAttribute("album")
	public Album getAlbum(){
		return new Album();
	}
	
	@RequestMapping(value="/registerAlbum", method= RequestMethod.POST)
	public String submitForm(@ModelAttribute("album")Album album, @ModelAttribute("codeArtiste")Integer codeArtiste,Model model){
		Artiste artist = new Artiste();
		artist.setCodeArtiste(codeArtiste);
		album.setArtiste(artist);
		this.albumService.createAlbum(album);
		return this.displayAlbum(album.getArtiste().getCodeArtiste(), model);
	}
	
	@RequestMapping(value="/deleteAlbum", method= RequestMethod.GET)
	public String deleteArtiste(@ModelAttribute("codeAlbum")Integer codeAlbum, Model model){
		
		Album album = this.albumService.findAlbumById(codeAlbum);
		Integer codeArtiste = album.getArtiste().getCodeArtiste();
		this.albumService.deleteAlbum(album);
		return this.displayAlbum(codeArtiste,model);
	}

}
