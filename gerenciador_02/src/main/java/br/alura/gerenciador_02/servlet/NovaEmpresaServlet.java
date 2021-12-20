package br.alura.gerenciador_02.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		System.out.println("Cadastrando uma nova empresa");
		String nomeEmpresa = req.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adciona(empresa);
		
		PrintWriter out = resp.getWriter();
		
		//out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso</body></html>");
		
		//Chamar o jsp
		RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresaCriada.jsp");//despachar requisi��o para o JSP
		req.setAttribute("Empresa", empresa.getNome());//joga uma atributo dentro requisi��o
		rd.forward(req, resp);
		
		
		
	}
	
	

}
