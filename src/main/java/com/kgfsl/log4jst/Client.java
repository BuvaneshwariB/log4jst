package com.kgfsl.log4jst;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
 
public class Client {
 
  static Logger l = Logger.getLogger("welcome to log4j");
 
  public static void main(String[] args) {	  
 
	  /*Layout l1 = new SimpleLayout();
	  Appender a;
	  //Appender a = new ConsoleAppender(l1);
	  try
	  {
	  a = new FileAppender(l1,"my.txt", false);
 
	  // 3rd parameter is true by default
	  // true = Appends the data into my.txt
	  // false = delete previous data and re-write
 
	  l.addAppender(a);
	  }
	  catch(Exception e) {}	  
 
	  
	  System.out.println("Your logic executed successfully....");*/
l.fatal("This is the fatal message..");
l.info("This is the info message..");
  l.warn("This is the warn message..");
    l.debug("This is the debug message..");   
l.error("This is the error message..");    
}
}