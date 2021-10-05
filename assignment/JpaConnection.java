package com.te.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class JpaConnection {
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY;
	private static EntityManager entityManager;

	public static EntityManager getEntityManager() {
		ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("emp");
		return entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
	}

	public static void closeConn() {
		if (entityManager != null) {
			entityManager.close();
		}
		if (ENTITY_MANAGER_FACTORY != null) {
			ENTITY_MANAGER_FACTORY.close();
		}
	}

}
