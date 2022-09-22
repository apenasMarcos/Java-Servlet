package br.com.marcos.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.marcos.gerenciador.domains.Banco;

@WebServlet("/listaempresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();

		request.setAttribute("empresas", banco.getEmpresas());
		RequestDispatcher rd = request.getRequestDispatcher("/listaempresas.jsp");	
		rd.forward(request, response);
	}

}
