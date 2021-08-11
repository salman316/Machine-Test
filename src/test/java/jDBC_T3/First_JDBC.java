package jDBC_T3;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;

public class First_JDBC {
 
   public static void main(String[] args) {
	
  try {
	  //load the  driver
	  DriverManager.registerDriver(new OracleDriver());
	  System.out.println("Driver loaded Sucessfully");
	  
	  //creat the connection
	 
	  String url="jdbc:oracle:thin:@localhost:1521:xe";
	  String username ="syste";
	  String password ="syste";
	  
	  Connection con = DriverManager.getConnection(url,username,password);
      //verify jdbc connection
	  if(con.isClosed()) {
	
	  System.out.println("connection is failed");
	  }
	  else {		
	  System.out.println("connection is created succefully");
	  }     
}
	 catch (Exception e){
	 System.out.println("Some problem in connecton");
	 e.printStackTrace();
	 }	
   }
}
