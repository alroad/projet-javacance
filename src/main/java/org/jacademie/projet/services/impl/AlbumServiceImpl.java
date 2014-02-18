package org.jacademie.projet.services.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.jacademie.projet.domain.Album;
import org.jacademie.projet.domain.Artiste;
import org.jacademie.projet.services.AlbumService;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Override
	public Collection<Album> retrieveAlbums(Integer codeArtiste) {

		Collection<Album> albums = new ArrayList<Album>();
		Album album1= new Album("PLoup");
		album1.setCodeAlbum(1);
		albums.add(album1);
		Album album2= new Album("LLLLLLLLL");
		album2.setCodeAlbum(2);
		albums.add(album2);

		return albums;
	}

}
