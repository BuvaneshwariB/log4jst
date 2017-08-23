package com.kgfsl.log4jst;
import java.util.*;
import java.io.*;
import java.sql.*;
class ImportCsv
{

public static void main(String args[])
{
read();
upload();
}


static void upload()
{
Connection conn=DBConnection.getDBConnection();
try
{
    //C:\Users\buvaneshwari.b\Downloads
String loadQuery = "LOAD DATA LOCAL INFILE " + "C://Users//buvaneshwari.b//Downloads//college.csv" + "' INTO TABLE student FIELDS TERMINATED BY ','" + " LINES TERMINATED BY '\n' (uname, id, rollno,place) ";
System.out.println(loadQuery);
Statement stmt = conn.createStatement();
stmt.execute(loadQuery);
System.out.println("Upload successfully");
}
catch (Exception e)
{
e.printStackTrace();
}
}
static public void read()
{
try
{
Scanner scanner = new Scanner(new File("C:\\Users\\nirmalkumar.m\\Downloads\\bank.csv"));
scanner.useDelimiter(",");
while(scanner.hasNext()){
System.out.print(scanner.next()+"-");
}
scanner.close();
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}
