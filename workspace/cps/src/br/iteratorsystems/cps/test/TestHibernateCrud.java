<<<<<<< HEAD
<<<<<<< HEAD
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
=======
package br.iteratorsystems.cps.test;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.iteratorsystems.cps.config.HibernateConfig;
import br.iteratorsystems.cps.entities.LOJA;
import br.iteratorsystems.cps.entities.REDE;

public class TestHibernateCrud extends HibernateConfig{

	public void get(){
		Session s = getSession();
		Criteria c = s.createCriteria(REDE.class);
		REDE l = (REDE) c.uniqueResult();
		System.out.println(l);
		
		Collection<LOJA> lojas = l.getLojas();
		for(LOJA lo : lojas){
			System.out.println(lo.toString());
		}
	}
	
	public static void main(String[] args) {
		new TestHibernateCrud().get();
	}
}
>>>>>>> 5718741821530aa28f5caf47ea20c09ffa0912af
=======
package br.iteratorsystems.cps.test;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.iteratorsystems.cps.config.HibernateConfig;
import br.iteratorsystems.cps.entities.LOJA;
import br.iteratorsystems.cps.entities.REDE;

public class TestHibernateCrud extends HibernateConfig{

	public void get(){
		
		Session s = getSession();
		Criteria c = s.createCriteria(REDE.class);
		REDE l = (REDE) c.uniqueResult();
		System.out.println(l);
		
		Collection<LOJA> lojas = l.getLojas();
		for(LOJA lo : lojas){
			System.out.println(lo.toString());
		}
	}
	
	public static void main(String[] args) {
		new TestHibernateCrud().get();
	}
}
>>>>>>> d20b13492e6d2ae3901e20b62f50be566db96acb
