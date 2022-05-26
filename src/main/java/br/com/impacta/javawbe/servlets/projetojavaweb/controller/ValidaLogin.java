package br.com.impacta.javawbe.servlets.projetojavaweb.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidaLogin", value = "/ValidaLogin")
public class ValidaLogin extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String login = request.getParameter("login");
    String senha = request.getParameter("senha");

    if (login != null && senha != null) {
      if ("alex".equals(login) && "123456".equals(senha)) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/sistema");
        dispatcher.forward(request, response);
      }
    }
    PrintWriter out = response.getWriter();
    out.println("erro: Senha ou Login invalidos");
  }
}
