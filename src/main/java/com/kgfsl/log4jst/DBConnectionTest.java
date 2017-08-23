package com.kgfsl.log4jst;
import java.sql.*;

//import utility.DBConnection;

public class DBConnectionTest {

    public static void main(String[] args) {
        Connection conn = DBConnection.getDBConnection();
        
        try {
           //String query1 = "INSERT INTO Student"+" VALUES('sabari',007,'BSC','maths')";
           //String query2 ="delete from Student where name='sabari'";
           String query2 ="UPDATE Student SET name = 'buvaneshwari',id=2,course='bca',designation='chemistry' WHERE name='bhuvi'";
            Statement statement1 = conn.createStatement();
            statement1.executeUpdate(query2);

           /* while (resultSet1.next()) {
                System.out.println(resultSet1.getString(1)+" "+resultSet1.getString(2)+" "+resultSet1.getString(3)+" "+resultSet1.getString(4));
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String query = "select id,name from Student";
            //String query = "select id,name from Student";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
