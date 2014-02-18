package org.jacademie.projet.services.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.jacademie.projet.domain.Album;
import org.jacademie.projet.domain.Chanson;
import org.jacademie.projet.services.ChansonService;
import org.springframework.stereotype.Service;

@Service
public class ChansonServiceImpl implements ChansonService {

	@Override
	public Collection<Chanson> retrieveChansons(Integer codeAlbum) {
		Collection<Chanson> chansons = new ArrayList<Chanson>();
		Chanson chanson1= new Chanson("PLoup sing1");
		chansons.add(chanson1);
		Chanson chanson2= new Chanson("LLLLLLLLL sing1");
		chansons.add(chanson2);

		return chansons;
	}

}
