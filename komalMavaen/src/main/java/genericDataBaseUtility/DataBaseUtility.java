package genericDataBaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.comcast.crm.genericutility.FileUtility;
import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	Connection conn;
	   public void getConnection() throws Throwable {
		   try {
			   FileUtility fu=new FileUtility();
			   String DBURL= fu.getdatafrompropertyfile("dburl");
			   String DBUN= fu.getdatafrompropertyfile("dbun");
			   String DBPWD= fu.getdatafrompropertyfile("dbpwd");
		   Driver driver=new Driver();
		   DriverManager.registerDriver(driver);
	      Connection conn = DriverManager.getConnection(DBURL,DBUN,DBPWD);	   
	   }catch(Exception e) {
	   }
	   }

	 

	public void getdbConnection() {
		try{

		 Driver driver=new Driver();
		 DriverManager.registerDriver(driver);
		 DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
	}catch(Exception e) {	
	}
	}

	public ResultSet getExecuteSelectquery(String query) {
		ResultSet result=null;
		try {
			Statement stat = conn.createStatement();
			result = stat.executeQuery(query);
			}catch(Exception e) {
		}
				return result;

	}



	public int getExecuteNonSelectquery(String query) {
		int result=0;
		try {
		Statement stat = conn.createStatement();
		result = stat.executeUpdate(query);
		}catch(Exception e) {
		}
		return result;
	}


	public void getCloseConnection() {
		try {
			conn.close();
		}catch(Exception e) {
	}
}
}
