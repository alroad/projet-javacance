package org.jacademie.projet.controller;

import javax.ws.rs.PathParam;

import org.jacademie.projet.services.AlbumService;
import org.jacademie.projet.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@RequestMapping(value="/album", method= RequestMethod.GET)
	
	public String displayAlbum(@PathParam("id_artiste") Integer codeArtiste, Model model){
		model.addAttribute("albums",this.albumService.retrieveAlbums(codeArtiste));
		return "album";
	}

}
