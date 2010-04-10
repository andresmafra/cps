package br.iteratorsystems.cps.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public abstract class HibernateConfig {

	private static SessionFactory sessionFactory;
	private static Session session;

	protected static Session getSession() {
		if (session == null || !session.isOpen()) {
			rebuildSession();
			session = sessionFactory.openSession();
		}
		return session;
	}

	private static void rebuildSession() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		// configuração padrão do hibernate
		configuration.setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5432/cps");
		configuration.setProperty("hibernate.connection.driver_class","org.postgresql.Driver");
		configuration.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
		configuration.setProperty("hibernate.connection.username", "cps");
		configuration.setProperty("hibernate.connection.password", "cps2010");
		configuration.setProperty("hibernate.c3p0.min_size", "2");
		configuration.setProperty("hibernate.c3p0.max_size", "10");
		configuration.setProperty("hibernate.c3p0.timeout", "200");
		configuration.setProperty("hibernate.c3p0.idle_test_period", "100");
		// método para adicionar as entidades
		addMappedEntities(configuration);
		// da um build na sessionfactory
		sessionFactory = configuration.buildSessionFactory();
	}

	private static void addMappedEntities(AnnotationConfiguration configuration) {
		configuration.addAnnotatedClass(br.iteratorsystems.cps.entities.REDE.class);
	}

	protected static void closeSession() {
		if (session != null || session.isOpen()) {
			session.close();
		}
	}
}
