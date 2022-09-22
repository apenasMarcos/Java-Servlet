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


@WebServlet("/novaempresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		String nomeEmpresa = req.getParameter("nome");
		Empresa empresa = new Empresa(nomeEmpresa);
		try {
			Date dataAbertura = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("data"));
			empresa.setDataAbertura(dataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		Banco banco = new Banco();
		banco.adiciona(empresa);
		resp.sendRedirect("listaempresas");
	}
}
