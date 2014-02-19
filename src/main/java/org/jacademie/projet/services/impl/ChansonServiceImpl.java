package org.jacademie.projet.services.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.jacademie.projet.domain.Album;
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

}
