package org.jacademie.projet.services;

import java.util.Collection;

import org.jacademie.projet.domain.Album;

public interface AlbumService {

	Collection<Album> retrieveAlbums(Integer codeArtiste);

}
