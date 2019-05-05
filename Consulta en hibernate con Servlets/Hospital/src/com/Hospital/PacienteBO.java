package com.Hospital;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;




public class PacienteBO extends Paciente {
	
public void DarAltaPaciente(String nombre,String apellido, Date fecha) throws ParseException {
	
	SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
    
	Paciente p=new Paciente();
	p.setNombre(nombre);
	p.setApellidos(apellido);
    p.setFecha_alta(fecha);
	session.save(p);
	transaction.commit();
	session.close();

	
}


public void borrarRegistro(Integer idi) {

	Session session = HibernateUtil.getSessionFactory().openSession();
	
    Paciente myp=session.get(Paciente.class, idi);
	
	session.delete(myp);
    
   Transaction transaction = session.beginTransaction();
			transaction.commit();
	session.close();
}

public void ActualizarPaciente(int id, String nombre,String apellido, Date fecha ) {
	

Session session = HibernateUtil.getSessionFactory().openSession();


Transaction transaction = session.beginTransaction();

Paciente pa=new Paciente();
pa.setId(id);
pa.setNombre(nombre);
pa.setApellidos(apellido);
pa.setFecha_alta(fecha);
session.saveOrUpdate(pa);

transaction.commit();
session.close();

}
public void ConsultarPaciente(Paciente pa) {
	
Session session = HibernateUtil.getSessionFactory().openSession();

Query hqlQuery = session.createQuery("SELECT p.nombre from paciente p");
Transaction transaction = session.beginTransaction();
List<Paciente> result = hqlQuery.list();
Iterator<Paciente> it = result.iterator();
while (it.hasNext()) {
	Paciente p = it.next();
	
	System.out.println("nombre: " +p.getNombre());
	
}

transaction.commit();
session.close();



	
}


}
