/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos;

import edu.uniandes.ecos.datos.Prueba1_PSP11;
import edu.uniandes.ecos.modelos.RangoTamano;
import edu.uniandes.ecos.psp.MetodoPROBE;
import edu.uniandes.ecos.views.ConsolaView;
import edu.uniandes.ecos.views.WebView;
import java.io.IOException;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 *
 * @author Administrator
 */
public class Main extends HttpServlet {
  
    public static void main(String[] args) 
            throws Exception {
    //Server server = new Server(8080);
    Server server = new Server(Integer.valueOf(System.getenv("PORT")));
    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/");
    server.setHandler(context);
    context.addServlet(new ServletHolder(new Main()),"/*");
    server.start();
    server.join();
  }
    
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
        
      WebView vista = new WebView();
        
        MetodoPROBE metodoProbe = new MetodoPROBE();
        
        //Calcula los datos de la prueba 1 y los muestra
        RangoTamano tamanos = metodoProbe.CalcularTamanos(Prueba1_PSP11.Prueba1());
        String html = vista.MostrarRangoTamanos(Prueba1_PSP11.Prueba1(), tamanos);
        
        //Calcula los datos de la prueba 2
        tamanos = metodoProbe.CalcularTamanos(Prueba1_PSP11.Prueba2());
        html += vista.MostrarRangoTamanos(Prueba1_PSP11.Prueba2(), tamanos);
      
      
        resp.getWriter().print( html);
  }
}
