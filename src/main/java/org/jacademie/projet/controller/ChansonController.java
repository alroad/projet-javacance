package org.jacademie.projet.controller;

import javax.ws.rs.PathParam;

import org.jacademie.projet.services.ChansonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChansonController {

	@Autowired
	private ChansonService chansonService;
	
	@RequestMapping(value="/chanson", method= RequestMethod.GET)
	
	public String displayChanson(@PathParam("codeAlbum") Integer codeAlbum, Model model){
		model.addAttribute("chansons",this.chansonService.retrieveChansons(codeAlbum));
		return "chanson";
	}
}
