import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class testjdbc  {
	public static void main(String[] args){
		try {
		String URL = "jdbc:mysql://localhost:3306/prodapt"; //database url
	    String username = "root"; //database username
	    String password = "root"; //database password
		Connection con =DriverManager.getConnection(URL,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from trainee");
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			  
			//step5 close the connection object  
			con.close();  
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
}