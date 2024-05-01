
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class ProductDAO {
   private String jdbcurl="jdbc:mysql://localhost:3306/shop2?useSSL=false";
   private String jdbcusername="root";
   private String jdbcpassword="";
   private static final String SELECT_ALL_PRODUCTS="select * from products";
   protected Connection getConnection(){
       Connection connection=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           connection=DriverManager.getConnection(jdbcurl,jdbcusername,jdbcpassword);
       }catch(SQLException e){
           e.printStackTrace();
       }catch(ClassNotFoundException e){  
           e.printStackTrace();
       }
       return connection;
   }
   public List<Product>selectallProducts(){
       List<Product>products=new ArrayList<>();
       Product product=null;
       try{
           Connection connection=getConnection();
           PreparedStatement prepare=connection.prepareStatement(SELECT_ALL_PRODUCTS);
           ResultSet rs=prepare.executeQuery();
           
           while (rs.next()){
           int id=rs.getInt("id");
           String name=rs.getString("name");
           String price=rs.getString("price");
           String des=rs.getString("des");
           products.add(new Product(name,price,des));
           
           
       }
       }
         catch (SQLException ex){
             
             ex.printStackTrace();
       }
       return products;
   }
}
