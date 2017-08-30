package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {

	public static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_URL="jdbc:derby:billdiary;create:true";

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		//Class.forName(DRIVER).newInstance();;
		//Connection connection= DriverManager.getConnection(JDBC_URL);
		
		
		 String userHomeDir = System.getProperty(".");
		 System.out.println(userHomeDir);
		
		/*Class.forName("org.hsqldb.jdbc.JDBCDriver");
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem:testdb;create=true", "SA", "");
		connection.createStatement().executeQuery("create table usr(id int, name int)");
		//connection.createStatement().executeQuery("insert into user values(1,gajanan,gajanan)");
		System.out.println("Tables created successfully.. and record inserted successfully");
		
		*/
		
	}

}
