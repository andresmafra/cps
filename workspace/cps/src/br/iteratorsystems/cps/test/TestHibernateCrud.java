package br.iteratorsystems.cps.test;

import org.hibernate.Session;

import br.iteratorsystems.cps.config.HibernateConfig;
import br.iteratorsystems.cps.entities.REDE;

public class TestHibernateCrud extends HibernateConfig{

	public void save(){
		Session s = getSession();
		REDE r = (REDE) s.get(REDE.class,1);
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		new TestHibernateCrud().save();
	}
}
