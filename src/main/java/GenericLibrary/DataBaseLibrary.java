package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseLibrary {
	
	Driver driverRef;
	Connection con;
	
	/*
	 * This method will help us to connect to mysql db
	 * @author sujana
	 * @throws SQL Exception
	 */
	public void connectToDB() throws SQLException 
	{
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection(Iconstants.DBUrl,Iconstants.DBUsername,Iconstants.DBPassword);
	}
	
	/*
	 * This methods will close the DB connection
	 * @author sujana
	 * @throws SQLException
	 */
	public void closeDB() throws SQLException
	{
		con.close();
	}
	
	public String readDataFromDBAndValidate(String Query, int columnIndex, String expData) throws SQLException
	{
		boolean flag=false;
		ResultSet result=con.createStatement().executeQuery(Query);
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
		
		{
			flag=true;
			break;
		}
		}
		if(flag)
		{
			System.out.println("verified");
			return expData;
		}else
		{
			System.out.println("Data not verified");
		     return " "; 
		}
	}
	
	
	

}
