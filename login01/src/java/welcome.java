/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class welcome extends HttpServlet {

    public void doPost(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException{
    res.setContentType("text/html");
    PrintWriter out=res.getWriter(); 
    String n=req.getParameter("userName");
    out.println("welcome " + n);
    
    
    
       }
   
    
}
