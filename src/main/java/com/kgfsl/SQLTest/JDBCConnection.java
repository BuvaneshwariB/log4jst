package com.kgfsl.SQLTest;
import java.sql.*;
public class JDBCConnection
{
    public static void main(String args[])
    {
        //Class.forName("com.mysql.jdbc.Driver");
        //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
        //Connection conn = DBConnection.getDBConnection();
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            
            String query="insert into employee values (110,'bhuvaneshwari','DBL','2016-06-01','buvaneshwari.b@kggroup.com',100000)";
    
     Statement stmt=conn.createStatement();
     //ResultSet rs=stmt.executeQuery("select * from emp"); 
     stmt.executeUpdate(query); 
     System.out.println("executed succesfully"); 
     /*while(rs.next())  
     System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));  */
  //System.out.println("hii"); 
         
            
    } catch(Exception e) {
        System.out.println(e); 
            
    }





    
    
    /*try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            
            //String query="insert into employee values (110,'bhuvaneshwari','DBL','2016-06-01','buvaneshwari.b@kggroup.com',100000)";
             Statement stmt=conn.createStatement();
           ResultSet rs=stmt.executeQuery("select * from employee");
    
     //Statement stmt=conn.createStatement();
     //ResultSet rs=stmt.executeQuery("select * from emp"); 
     //stmt.executeQuery(query); 
     while(rs.next())  
     System.out.println( rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getInt(6)); 
     System.out.println("executed succesfully"); 
    }
    catch(Exception e) {
        System.out.println(e); 
            
    }*/









 /*try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            
            //String query="insert into employee values (110,'bhuvaneshwari','DBL','2016-06-01','buvaneshwari.b@kggroup.com',100000)";
             Statement stmt=conn.createStatement();
           //ResultSet rs=stmt.executeQuery("select * from employee");
     ResultSet rs=stmt.executeQuery("select * from employee LEFT JOIN project_employee on employee.id=project_employee.id where team='NTRUST'"); 
     //Statement stmt=conn.createStatement();
     //ResultSet rs=stmt.executeQuery("select * from emp"); 
     //stmt.executeQuery(query); 
     while(rs.next())  
     System.out.println( rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getInt(6)); 
     System.out.println("executed succesfully"); 
    }
    catch(Exception e) {
        System.out.println(e); 
            
    }*/











/*try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            
            //String query="insert into employee values (110,'bhuvaneshwari','DBL','2016-06-01','buvaneshwari.b@kggroup.com',100000)";
             Statement stmt=conn.createStatement();
             ResultSet rs=stmt.executeQuery("SELECT * FROM employee where salary BETWEEN 20000 and 35000");
           //ResultSet rs=stmt.executeQuery("select * from employee");
     //ResultSet rs=stmt.executeQuery("select * from employee LEFT JOIN project_employee on employee.id=project_employee.id where team='NTRUST'"); 
     //Statement stmt=conn.createStatement();
     //ResultSet rs=stmt.executeQuery("select * from emp"); 
     //stmt.executeQuery(query); 
     while(rs.next())  
     System.out.println( rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getInt(6)); 
     System.out.println("executed succesfully"); 
    }
    catch(Exception e) {
        System.out.println(e); 
            
    }*/

      
      
      
      
      
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            
            Statement stmt=conn.createStatement();
           ResultSet rs1=stmt.executeQuery("select * from employee");
           while(rs1.next())  
     System.out.println( rs1.getInt(1)+" "+rs1.getString(2)+"  "+rs1.getString(3)+" "+rs1.getDate(4)+" "+rs1.getString(5)+" "+rs1.getInt(6)); 
      //System.out.println("hii");
       Statement stmt1=conn.createStatement();
       System.out.println("\n\njoin");
           ResultSet rs12=stmt1.executeQuery("select * from employee INNER JOIN project_employee on employee.id=project_employee.id ");
           while(rs12.next())  
     System.out.println( rs12.getInt(1)+" "+rs12.getString(2)+"  "+rs12.getString(3)+" "+rs12.getDate(4)+" "+rs12.getString(5)+" "+rs12.getInt(6)); 
            //ResultSet rs=stmt.executeQuery("select * from employee LEFT JOIN project_employee on employee.id=project_employee.id where team='NTRUST'"); 
      Statement stmt2=conn.createStatement();
      System.out.println("\n\nrange between");
           ResultSet rs123=stmt2.executeQuery("SELECT * FROM employee where salary BETWEEN 20000 and 35000");
           while(rs123.next())  
     System.out.println( rs123.getInt(1)+" "+rs123.getString(2)+"  "+rs123.getString(3)+" "+rs123.getDate(4)+" "+rs123.getString(5)+" "+rs123.getInt(6)); 
 //ResultSet rs=stmt.executeQuery("SELECT * FROM employee where salary BETWEEN 20000 and 35000"); 
 Statement stmt3=conn.createStatement();
     ResultSet rs=stmt3.executeQuery("SELECT * FROM `employee` WHERE MONTH(DOJ)='06'");
     while(rs.next())  
     System.out.println( "\n"+rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getInt(6)); 
      System.out.println("hii");
      conn.close();

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
        

        
            
  /*  } catch (Exception e) {
        System.out.println(e); 
            
        }
        finally{
            conn.close(); 
        }*/
     
}