package com.arrive.corey.barr.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//This is the abstractDAO, it creates a constant connection that methods call on to access the database.
public class AbstractDao {


	private final static String PERSISTENCEUNITNAME = "arrivePersist";
	protected static EntityManagerFactory emf = null;
	protected static EntityManager em = null;

	protected static void connect() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCEUNITNAME);
		em = emf.createEntityManager();
	}

	protected static void dispose() {
		em.close();
		emf.close();
	}
}
