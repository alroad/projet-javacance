package org.jacademie.projet.services;

import java.util.Collection;

import org.jacademie.projet.domain.Chanson;

public interface ChansonService {


	public Collection<Chanson> retrieveChansons(Integer codeAlbum);

}
