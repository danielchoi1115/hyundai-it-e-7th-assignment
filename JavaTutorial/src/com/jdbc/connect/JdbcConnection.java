package com.jdbc.connect;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import lombok.Data;
import oracle.jdbc.pool.OracleDataSource;

public class JdbcConnection {
	public void connectThinSetMethod() throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@localhost:1521/xepdb1");
		ods.setUser("ace");
		ods.setPassword("ace");
		Connection conn1 = ods.getConnection();
		DatabaseMetaData meta = conn1.getMetaData();
		System.out.println("JDBC driver version is " + meta.getDriverVersion());
	}
	public void connectThinUrl() throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:ace/ace@localhost:1521/xepdb1");
		Connection conn = ods.getConnection();
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("JDBC driver version is " + meta.getDriverVersion());
	}
	
	public void connectOciSetMethod() throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:oci8:@mydb");
		ods.setUser("ace");
		ods.setPassword("ace");
		Connection conn = ods.getConnection();
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("JDBC driver version is " + meta.getDriverVersion());
	}
	
	public void connectOciUrl() throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:oci8:ace/ace@mydb");
		Connection conn = ods.getConnection();
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("JDBC driver version is " + meta.getDriverVersion());
	}
	public static void main(String[] args) throws SQLException {
		JdbcConnection jdbc = new JdbcConnection();
		/* Thin driver */
		// 1
		jdbc.connectThinSetMethod();
		// 2
		jdbc.connectThinUrl();
		
		/* Oracle Call Interface (OCI) driver */
		// 1
		jdbc.connectOciSetMethod();
		// 2
		jdbc.connectOciUrl();
		
	}	
}
