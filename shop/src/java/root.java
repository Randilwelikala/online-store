/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet("/root")
public class root extends HttpServlet {
    private ProductDAO productDAO;
    public root(){
    this.productDAO=new ProductDAO();
    }
            
            

  protected void doGet(HttpServletRequest req,HttpServletResponse res)
          throws ServletException,IOException{
     
      String action=req.getRequestURI();
      String[] urlpartns=action.split("/");
      String url="";
      if (urlpartns.length>3){
          url=urlpartns[3];
          
      }else{
          url="defaul Value";
      }
      System.out.println(url);
      switch(url){
          case "new":
              System.out.println("new route");
              break;
          default:
              show_homepage(req,res);
              break;
              
          }
      }
  
   protected void doPost(HttpServletRequest req,HttpServletResponse res)
          throws ServletException,IOException{
       this.doGet(req, res);
   }
    private void show_homepage(HttpServletRequest req,HttpServletResponse res)
          throws ServletException,IOException{
        try{
            List<Product>allproducts=productDAO.selectallProducts();
            RequestDispatcher dispatcher=req.getRequestDispatcher("/index.jsp");
            req.setAttribute("allproduct", allproducts);
            dispatcher.forward(req, res);
        } catch(IOException | ServletException e){
            e.printStackTrace();
        }
    }

    
}
