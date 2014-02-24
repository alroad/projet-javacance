package org.jacademie.projet.services.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.SessionFactory;
import org.jacademie.projet.domain.Artiste;
import org.jacademie.projet.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArtistServiceImpl implements ArtistService{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Collection<Artiste> retrievedAllArtist(){
		
		return this.sessionFactory.getCurrentSession().createCriteria(Artiste.class).list();
	
	}

	@Override
	public Artiste findArtistById(Integer codeArtiste) {
		Artiste result = (Artiste) this.sessionFactory.getCurrentSession().get(Artiste.class, codeArtiste);
		return result;
	}

	@Override
	public void createArtist(Artiste artiste) {
		this.sessionFactory.getCurrentSession().save(artiste);
		
	}

	@Override
	public void deleteArtist(Artiste artiste) {
		this.sessionFactory.getCurrentSession().delete(artiste);
		
	}
}
