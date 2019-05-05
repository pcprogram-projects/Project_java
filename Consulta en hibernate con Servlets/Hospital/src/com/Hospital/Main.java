package com.Hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		PacienteBO p = new PacienteBO();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce 1 si quieres introducir paciente "+"\n"+ "introduce 2 si quieres eliminar paciente"+"\n"+"intoduce 3 si quiere actualizar el registro"+"\n");
		int op = sc.nextInt();
		if (op==1) {
			
			System.out.println("introduce el nombre del paciente");
			String nombre = sc.next();
			System.out.println("introduce el apellido del paciente");
			String apellido = sc.next();
			System.out.println("introduce la fecha YYY-MM-DD");
			String fecha = sc.next();
			Date fe = s.parse(fecha);
             
			p.DarAltaPaciente(nombre, apellido, fe);
		}else if (op==2) {
			
			System.out.println("introduce el id ");
			Integer identificador= sc.nextInt();
			p.borrarRegistro(identificador);
		}else if (op==3) {
			System.out.println("introduce el nombre del paciente que quieres modificar");
			int idmo = sc.nextInt();
			System.out.println("introduce el nombre del paciente");
			String nombreac = sc.next();
			System.out.println("introduce el apellido del paciente");
			String apellidoac = sc.next();
			System.out.println("introduce la fecha YYY-MM-DD");
			String fechaac = sc.next();
			Date fe = s.parse(fechaac);
			
	       
			p.ActualizarPaciente(idmo, nombreac,apellidoac,fe);
	
	}else if (op==4) {
		
	Paciente pa=new Paciente();
	
	     p.ConsultarPaciente(pa);
	}
		
	
	
	
	
	
	
	
	
	
	
	
	}}

