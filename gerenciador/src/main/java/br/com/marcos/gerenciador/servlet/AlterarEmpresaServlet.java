package br.com.marcos.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.marcos.gerenciador.domains.Banco;
import br.com.marcos.gerenciador.domains.Empresa;

@WebServlet("/alterarempresa")
public class AlterarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		Empresa empresa = new Banco().getEmpresa(id);
		if (request.getParameter("data") != "") {
			try {

				Date dataAbertura = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data"));
				empresa.setDataAbertura(dataAbertura);
			} catch (ParseException e) {
				throw new ServletException(e);
			}
		}
		if (request.getParameter("nome") != "")
			empresa.setNome(request.getParameter("nome"));
		response.sendRedirect("listaempresas");
	}

}
