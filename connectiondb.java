package dbopen;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class connectiondb 
{
	static private String user = "root";
	static private String password = "1234";
	private Connection con=null;
	private PreparedStatement ps = null; 
	private ResultSet rs = null;
	public static Connection getConnection()
	{
		String DBURL="jdbc:mysql://localhost:3306/bookdb";
		String DBDRIVER="com.mysql.jdbc.Driver";
		
	
	    Connection con = null;
	    try
	    {
	    	Class.forName(DBDRIVER);
	    	con = DriverManager.getConnection(DBURL,user,password);	
	    }catch(ClassNotFoundException e){
			System.err.println(e.getMessage());
			System.exit(1);
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}
		return con;
	}
	public void close(){
		try{
			
			if(ps != null)
			{
				ps.close();
				ps = null;
			}
			if(rs != null)
			{
				rs.close();
				rs = null;
			}
			if(con != null)
			{
				con.close();
				con = null;
			}
		}
		
		catch(Exception ex)
		{
			System.err.println("close error :"+ex.getMessage());
		}
	}
	public static void Close(Connection con,Statement stmt)
	{
        if(stmt!=null)
        {
        	try
        	{
    			stmt.close();
    			}
        	catch(SQLException e){}
    		}
    	    if(con!=null)
    	    {
    		    try
    		 {
    			con.close();
    		    }
    		    catch(SQLException e){}
    		 }
    	}  
}
