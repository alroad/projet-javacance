package org.jacademie.projet.controller;

import javax.ws.rs.PathParam;

import org.jacademie.projet.domain.Album;
import org.jacademie.projet.domain.Artiste;
import org.jacademie.projet.domain.Chanson;
import org.jacademie.projet.services.ChansonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChansonController {

	@Autowired
	private ChansonService chansonService;
	
	@RequestMapping(value="/chanson", method= RequestMethod.GET)
	
	public String displayChanson(@PathParam("codeAlbum") Integer codeAlbum, Model model){
		model.addAttribute("chansons",this.chansonService.retrieveChansons(codeAlbum));
		model.addAttribute("codeAlbum", codeAlbum);
		return "chanson";
	}
	
	@RequestMapping(value="/registerChanson", method= RequestMethod.GET)
	public String displayNewArtistes(Model model){
		return "registerChanson";
	}
	
	@ModelAttribute("chanson")
	public Chanson getChanson(){
		return new Chanson();
	}
	
	@RequestMapping(value="/registerChanson", method= RequestMethod.POST)
	public String submitForm(@ModelAttribute("chanson")Chanson chanson, @ModelAttribute("codeAlbum")Integer codeAlbum,Model model){
		Album album = new Album();
		album.setCodeAlbum(codeAlbum);
		chanson.setAlbum(album);
		this.chansonService.createChanson(chanson);
		return this.displayChanson(codeAlbum, model);
	}
	
	@RequestMapping(value="/deleteChanson", method= RequestMethod.GET)
	public String deleteArtiste(@ModelAttribute("id")Integer id, Model model){
		
		Chanson chanson = this.chansonService.findChansonById(id);
		Integer codeAlbum = chanson.getAlbum().getCodeAlbum();
		this.chansonService.deleteChanson(chanson);
		return this.displayChanson(codeAlbum, model);
	}

}
