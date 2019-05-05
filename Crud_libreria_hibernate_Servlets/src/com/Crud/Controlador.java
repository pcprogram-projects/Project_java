package com.Crud;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Controlador
 * @param <Precios>
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String op=request.getParameter("action");
	if (op.equals("alta")) {

			Integer Precios;

			Servicio sc = new Servicio();
			String isbn = request.getParameter("isbn");
			String titulo = request.getParameter("titulo");
			int Precio = Integer.parseInt(request.getParameter("precio"));

			sc.DarAltaLibro(isbn, titulo, Precio);

			request.setAttribute("libro", sc);

		}
	if (op.equals("Modificar")) {
		Integer Precios;

		Servicio sc = new Servicio();
		int id = Integer.parseInt(request.getParameter("id"));
		String isbn = request.getParameter("isbn");
		String titulo = request.getParameter("titulo");
		int Precio = Integer.parseInt(request.getParameter("precio"));

			sc.ModificarLibro(id, isbn, titulo, Precio);
		}
	if (op.equals("borrar")) {
			Servicio sc = new Servicio();
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			sc.BorrarLibro(id);
			response.getWriter().append("respuesta " + id);
		}
	if (op.equals("consulta")) {
		Servicio sc = new Servicio();
		List<Libro> libros =  sc.getListLibro();
    	request.setAttribute("libros", libros);
		request.getRequestDispatcher("vista.jsp").forward(request, response);

		

	}
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
