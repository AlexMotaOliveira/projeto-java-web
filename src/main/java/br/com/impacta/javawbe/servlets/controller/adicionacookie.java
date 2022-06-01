package br.com.impacta.javawbe.servlets.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdicionaCookie", value = "/AdicionaCookie")
public class adicionacookie extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie helloCookie = new Cookie("cookie-teste", "HelloCookie");
    response.addCookie(helloCookie);
    response.getWriter().append("Cookie adicionado com sucesso");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
