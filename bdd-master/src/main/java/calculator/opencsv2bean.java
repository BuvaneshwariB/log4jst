package com.kgfsl.opencsvapp;

import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

class OpenCSVParse2BeanColumnPositionMapping {
public static void main(String[] args) throws IOException {
CSVReader reader = new CSVReader(new FileReader("emps.csv"), ',');

ColumnPositionMappingStrategy<Employee> beanStrategy = new ColumnPositionMappingStrategy<Employee>();
beanStrategy.setType(Employee.class);
beanStrategy.setColumnMapping(new String[] { "id", "name", "age", "country" });

CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();

List<Employee> emps = csvToBean.parse(beanStrategy, reader);

System.out.println(emps);

}
}
