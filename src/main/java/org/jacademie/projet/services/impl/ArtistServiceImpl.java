package org.jacademie.projet.services.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.jacademie.projet.domain.Artiste;
import org.jacademie.projet.services.ArtistService;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService{

	public Collection<Artiste> retrievedAllArtist(){
		Collection<Artiste> artistes = new ArrayList<Artiste>();
		Artiste artiste1= new Artiste("Garridal");
		artiste1.setCodeArtiste(1);
		artistes.add(artiste1);
		Artiste artiste2= new Artiste("Blachere");
		artiste2.setCodeArtiste(2);
		artistes.add(artiste2);
		
		return artistes;
	
	}

}
