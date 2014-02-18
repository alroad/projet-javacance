package org.jacademie.projet.controller;

import org.jacademie.projet.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ArtistController {

	@Autowired
	private ArtistService artisteService;
	
	@RequestMapping(value="/artiste", method= RequestMethod.GET)
	
	public String displayArtistes(Model model){
		model.addAttribute("artists",this.artisteService.retrievedAllArtist());
		return "artiste";
	}
	
}
