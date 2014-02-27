package org.jacademie.projet.services.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.jacademie.projet.domain.Album;
import org.jacademie.projet.domain.Artiste;
import org.jacademie.projet.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Collection<Album> retrieveAlbums(Integer codeArtiste) {

		Query query = this.sessionFactory.getCurrentSession().createQuery("FROM Album WHERE CODE_ARTISTE = :param");
		query.setInteger("param", codeArtiste);

		Collection<Album> result = query.list();

		return result;
	}

	@Override
	public Album findAlbumById(Integer codeAlbum) {
		Album result = (Album) this.sessionFactory.getCurrentSession().get(Album.class, codeAlbum);
		return result;
	}

	@Override
	public void createAlbum(Album album) {
		this.sessionFactory.getCurrentSession().save(album);
		
	}

	@Override
	public void deleteAlbum(Album album) {
		this.sessionFactory.getCurrentSession().delete(album);
		
	}

	@Override
	public void updateAlbum(Album album) {
		this.sessionFactory.getCurrentSession().update("Album" ,album);
		
	}

}
