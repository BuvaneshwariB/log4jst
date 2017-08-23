package com.kgfsl.log4jst;
import java.sql.*;
class Jdbcconnection
{
    public static void main(String args[])
    {
        //Class.forName("com.mysql.jdbc.Driver");
        //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
        //Connection conn = DBConnection.getDBConnection();
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            
            String query="insert into emp values ('vani',741,100000)";
    
     Statement stmt=conn.createStatement();
     //ResultSet rs=stmt.executeQuery("select * from emp"); 
     stmt.executeUpdate(query); 
     System.out.println("executed succesfully"); 
     /*while(rs.next())  
     System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));  */
  //System.out.println("hii"); 
         
            
    } catch (Exception e) {
        System.out.println(e); 
            
    }
   try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
              
    
     Statement stmt=conn.createStatement();
     ResultSet rs=stmt.executeQuery("select * from emp"); 
     
     while(rs.next())  
     System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)); 
      System.out.println("hii"); 
        conn.close(); 
            
    } catch (Exception e) {
        System.out.println(e); 
            
        }
     
    }
}