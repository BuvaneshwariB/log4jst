package com.kgfsl.StreamTest;
import java.util.*;
import java.util.Arrays;
//package com.kgfsl.stream;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.lang.*;
import java.util.stream.*;
import java.util.Date;
 import java.text.DateFormatSymbols;
 import java.lang.IllegalArgumentException;
class Main_Class
{
    public static void main(String args[])throws ParseException
    {
         SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
Date dt_1 =objSDF.parse("20-03-1981");
 Date dt_2 = objSDF.parse("10-08-1981");
 Date dt_3 = objSDF.parse("20-08-1995");
 Date dt_4 = objSDF.parse("9-11-1981");
 Date dt_5 = objSDF.parse("20-11-1981");
 //Date dt_6 = objSDF.parse("20-08-1981");
        Employee e1=new Employee(100,"santhosh","NTRUST",dt_1,"santhoshkumar.a@kggroup.com",23000,4);
        Employee e2=new Employee(110,"kumar","NTRUST",dt_2,"kumarcseksr@gmail.com",30000,10);
        Employee e3=new Employee(108,"bhuvi","DOORS",dt_3,"bhuvi123@gmail.com",40000,8);
        Employee e4=new Employee(106,"subitha","Release",dt_4,"subitha12@gmal.com",34000,6);
        Employee e5=new Employee(102,"ramya","ICT",dt_5,"ramya123@gmail.com",123400,12);
        List<Employee> emp=new ArrayList<Employee>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);
        System.out.println(emp);


    }
}