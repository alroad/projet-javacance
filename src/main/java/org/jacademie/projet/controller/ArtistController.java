package org.jacademie.projet.controller;

import org.jacademie.projet.domain.Artiste;
import org.jacademie.projet.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArtistController {

	@Autowired
	private ArtistService artisteService;

	@RequestMapping(value="/artiste", method= RequestMethod.GET)

	public String displayArtistes(Model model){
		model.addAttribute("artists",this.artisteService.retrievedAllArtist());
		return "artiste";
	}

	@RequestMapping(value="/registerArtiste", method= RequestMethod.GET)
	public String displayNewArtistes(Model model){
		return "registerArtiste";
	}
	
	@ModelAttribute("artiste")
	public Artiste getArtiste(){
		return new Artiste();
	}
	
	@RequestMapping(value="/registerArtiste", method= RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("artiste")Artiste artiste){
		return new ModelAndView("artiste-registered","artiste",artiste);
	}

}
