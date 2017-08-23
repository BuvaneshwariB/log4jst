package com.kgfsl.log4jst;
import java.sql.*;
class Employee
{
    public static void main(String args[])
    {
       /* try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            Statement stmt=conn.createStatement();
            stmt.executeUpdate("Alter table emp add address varchar(20)");
            System.out.println("Executed successfully");
            conn.close();
           // stmt.addBatch("UPDATE emp SET address ='13/12,Gandhi Nagar' WHERE name= 'vani'");
        }
        catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }*/
        try
        { Class.forName("com.mysql.jdbc.Driver");
            Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            Statement stmt1=conn1.createStatement();
            stmt1.executeUpdate("update emp set name='bhuvi',id=4561,salary=50000 where address='14523' ");
            System.out.println("query executed");
           ResultSet rs=stmt1.executeQuery("select * from emp");
            System.out.println("Executed successfully");
            while(rs.next())
            System.out.println(rs.getString(1)+ " "+ rs.getInt(2)+ " " +rs.getInt(3)+" "+rs.getString(4));
            conn1.close();

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}