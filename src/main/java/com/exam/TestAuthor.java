package com.exam;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class TestAuthor {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	Author a = new Author(101,"Pradnesh",100000000);
    	Author a1 = new Author(102,"Pradnya",200000000);
    	Author a2 = new Author(103,"Pragya",300000000);
    	Author a3 = new Author(104,"Praithosh",400000000);
    	Author a4 = new Author(105,"Pratik",500000000);
    	
    	em.persist(a);
    	em.persist(a1);
    	em.persist(a2);
    	em.persist(a3);
    	em.persist(a4);
    	
    	
    	
    	
    	Query q10 = em.createQuery("SELECT UPPER(name) AS UppercaseStudentName FROM Author");

   	
	List<Author> list10 = q10.getResultList();

	
	Iterator<Author> itr =  list10.iterator();

    while (itr.hasNext()){
        System.out.println(itr.next());
    }
    
    em.getTransaction().commit();
    	
	}

}
