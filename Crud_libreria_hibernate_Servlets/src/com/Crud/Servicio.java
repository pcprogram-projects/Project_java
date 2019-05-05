package com.Crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Servicio {
	
	public void DarAltaLibro(String isbn, String titulo, int precio) {

		Session  session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		Libro lib = new Libro();
		
		lib.setIsbn(isbn);
		lib.setTitulo(titulo);
		lib.setPrecio(precio);
				
		session.save(lib);
		transaction.commit();
		session.close();
	

	}
	public void ModificarLibro(int id,String isbn, String titulo, int precio) {

		Session  session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		Libro lib = new Libro();
		lib.setId(id);
		lib.setIsbn(isbn);
		lib.setTitulo(titulo);
		lib.setPrecio(precio);
				
		session.saveOrUpdate(lib);
		transaction.commit();
		session.close();
	

	}
	
	
	
	
	
	
	
	public void BorrarLibro (int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
	
		Libro Borrar = (Libro) session.load(Libro.class, id);
		session.delete(Borrar);
	    transaction.commit();
		session.close();
		
	
		
	}
	
	
	public List<Libro> getListLibro() {
    	
		Session session = HibernateUtil.getSessionFactory().openSession();
      
        Query hqlQuery = session.createQuery("from Libro");
        List<Libro> result = hqlQuery.getResultList();
      
        session.close();
		return result;
	
	}
        
		
     
		
		

    	}

