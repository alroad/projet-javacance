package org.jacademie.projet.services;

import java.util.Collection;

import org.jacademie.projet.domain.Album;
import org.jacademie.projet.domain.Artiste;
import org.jacademie.projet.domain.Chanson;

public interface ChansonService {


	public Collection<Chanson> retrieveChansons(Integer codeAlbum);

	public Chanson findChansonById(Integer id);

	public void createChanson(Chanson chanson);

	public void deleteChanson(Chanson chanson);

	public void updateChanson(Chanson chanson);
}
