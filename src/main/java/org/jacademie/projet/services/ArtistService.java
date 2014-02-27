package org.jacademie.projet.services;

import java.util.Collection;

import org.jacademie.projet.domain.Artiste;

public interface ArtistService {
	
	public Collection<Artiste> retrievedAllArtist();
	
	public Artiste findArtistById(Integer codeArtiste);
	
	public void createArtist(Artiste artiste);
	
	public void deleteArtist(Artiste artiste);

	public void updateArtist(Artiste artiste);
}
