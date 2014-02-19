package org.jacademie.projet.services;

import java.util.Collection;

import org.jacademie.projet.domain.Album;
import org.jacademie.projet.domain.Artiste;

public interface AlbumService {

	Collection<Album> retrieveAlbums(Integer codeArtiste);

	public Album findAlbumById(Integer codeAlbum);
	
	public void createAlbum(Album album);
	
	public void deleteAlbum(Album album);
}
