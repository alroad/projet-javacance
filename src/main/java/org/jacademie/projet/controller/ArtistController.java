package org.jacademie.projet.controller;

import org.apache.log4j.Logger;
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

	private static Logger logger = Logger.getLogger(ArtistController.class);
	
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
	public String submitForm(@ModelAttribute("artiste")Artiste artiste,Model model){
		this.artisteService.createArtist(artiste);
		return this.displayArtistes(model);
	}
	
	@RequestMapping(value="/deleteArtiste", method= RequestMethod.GET)
	public String deleteArtiste(@ModelAttribute("codeArtiste")Integer codeArtiste, Model model){
		
		Artiste artiste = this.artisteService.findArtistById(codeArtiste);
		this.artisteService.deleteArtist(artiste);
		return this.displayArtistes(model);
	}
	
	@RequestMapping(value="/updateArtiste", method= RequestMethod.GET)
	public String updateArtist(@ModelAttribute("codeArtiste")Integer codeArtiste, Model model){
		model.addAttribute("codeArtiste", codeArtiste);
		return "updateArtiste";
	}
	
	@RequestMapping(value="/updateArtiste", method= RequestMethod.POST)
	public String formUpdate(@ModelAttribute("artiste")Artiste artiste,Model model){
		Artiste oldArtiste = this.artisteService.findArtistById(artiste.getCodeArtiste());
		oldArtiste = artiste;
		this.artisteService.updateArtist(oldArtiste);
		return this.displayArtistes(model);
	}
}
