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
