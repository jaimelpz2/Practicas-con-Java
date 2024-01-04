/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JimmyLpz
 */
public class NewServlet extends HttpServlet {

   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int n1=Integer.parseInt(request.getParameter("datos1"));
        int n2=Integer.parseInt(request.getParameter("datos2"));
        int n3=Integer.parseInt(request.getParameter("datos3"));
        double determinante=Math.pow(n2, 2)-(4*n1*n3);
        
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            if(determinante>0){
                
                double x1=((n2*(-1))+ Math.sqrt(determinante))/(2*n1);
                double x2=((n2*(-1))- Math.sqrt(determinante))/(2*n1);
                out.println("<h1>La Formula General </h1>");
                out.println("<label>A:</label>"+n1+"<br>");
                out.println("<label>B:</label>"+n2+"<br>");
                out.println("<label>C:</label>"+n3+"<br>");
                out.println("<label>El determinante fue:</label>"+determinante+"<br>");
                out.println("<label>x1:</label>"+x1+"<br>");
                out.println("<label>x2:</label>"+x2);
            }
            else{
                out.println("El determinante salio negativo y no se puede completar el calculo");
            }
           
        }
        
    }

   
 
}
