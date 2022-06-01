package br.com.impacta.javawbe.servlets.controller;

import br.com.impacta.javawbe.servlets.model.Usuario;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/sistema"})
public class LogadoSistemaFilter implements Filter {


  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    Usuario usuario = (Usuario) httpServletRequest.getSession().getAttribute("usuario");

    if (usuario == null) {
      ((HttpServletResponse) response).sendRedirect("/login.html");
    } else {
      chain.doFilter(request, response);
    }
  }
}
