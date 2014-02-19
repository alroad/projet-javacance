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
		
		//this.sessionFactory.getCurrentSession().cre
//		Collection<Artiste> artistes = new ArrayList<Artiste>();
//		Artiste artiste1= new Artiste("Garridal");
//		artiste1.setCodeArtiste(1);
//		artistes.add(artiste1);
//		Artiste artiste2= new Artiste("Blachere");
//		artiste2.setCodeArtiste(2);
//		artistes.add(artiste2);
		
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
