package com.mycompany.app;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.opencsv.CSVReader;


public class Reader {

    public static void main(String[] args) throws IOException {

        CSVReader reader = new CSVReader(new FileReader(D:\\log4jst\\bdd-master\\src\\main\\java\\CSV2Bean\\emp.csv);

        List<Employee> emps = new ArrayList<Employee>();

        // read line by line
        String[] record = null;

        while ((record = reader.readNext()) != null) {
            Employee emp = new Employee();
            emp.setId(record[0]);
            emp.setName(record[1]);
            emp.setAge(record[2]);
            emp.setCountry(record[3]);
            emps.add(emp);
        }

        System.out.println(emps);
        
        reader.close();
    }

}
