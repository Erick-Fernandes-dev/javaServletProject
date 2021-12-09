package br.alura.gerenciador_02.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Cadastrando uma nova empresa");
		String nomeEmpresa = req.getParameter("nome");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso</body></html>");
		
		
		
	}
	
	

}
