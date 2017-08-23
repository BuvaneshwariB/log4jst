package com.kgfsl.StreamTest;

import java.util.Date;
public class Employee {
private int id;
private String name;
private String team;
private  Date doj;
private String email;
private int salary;
private int month;
Employee(int id,String name,String team,Date doj,String email,int salary,int month)
{
    this.id=id;
    this.name=name;
    this.team=team;
    this.doj=doj;
    this.email=email;
    this.salary=salary;
    this.month=month;
}
public int getId()
{
    return id;
}
public String getName()
{
    return name;
}
public String getTeam()
{
    return team;
}
public Date getDoj()
{
    return doj;
}
public String getEmail()
{
    return email;
}
public int getSalary()
{
    return salary;
}
public int getMonth()
{
    return month;
}
public String toString()
{
    return "id: "+id+" \tName: "+name+ "\tteam:" +team+" \tdoj: "+doj+"\t email: "+email+" \tsalary: "+salary+" \tmonth: "+month+"\n";   
}
}



