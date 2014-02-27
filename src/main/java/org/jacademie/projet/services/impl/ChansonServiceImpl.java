package org.jacademie.projet.services.impl;

import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.jacademie.projet.domain.Artiste;
import org.jacademie.projet.domain.Chanson;
import org.jacademie.projet.services.ChansonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChansonServiceImpl implements ChansonService {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Collection<Chanson> retrieveChansons(Integer codeAlbum) {
		
		Query query = this.sessionFactory.getCurrentSession().createQuery("FROM Chanson WHERE CODE_ALBUM = :param");
		query.setInteger("param", codeAlbum);

		Collection<Chanson> result = query.list();

		return result;
	}

	@Override
	public Chanson findChansonById(Integer id) {
		Chanson result = (Chanson) this.sessionFactory.getCurrentSession().get(Chanson.class, id);
		return result;
	}

	@Override
	public void createChanson(Chanson chanson) {
		this.sessionFactory.getCurrentSession().save(chanson);
		
	}

	@Override
	public void deleteChanson(Chanson chanson) {
		this.sessionFactory.getCurrentSession().delete(chanson);
		
	}

	@Override
	public void updateChanson(Chanson chanson) {
		this.sessionFactory.getCurrentSession().merge("Chanson", chanson);
		
	}

	

}
