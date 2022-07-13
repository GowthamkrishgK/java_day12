package train12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbctest  {
	public static void main(String[] args){
		try {
		String URL = "jdbc:mysql://localhost:3306/prodapt"; //database url
	    String username = "root"; //database username
	    String password = "root"; //database password
	    String select="select * from trainee;";
	    String create="create table java_trainee(emp_id int,"
	    		+ "name varchar(30),"
	    		+ "branch varchar(30));";
	    String insertjava="insert into trainee(emp_id,name,branch) values(11,'vinesh','townhall');";
		String insert="insert into trainee(id,name,city) values(11,'vinesh','townhall');";
	    Connection con =DriverManager.getConnection(URL,username,password);
		Statement st=con.createStatement();
//		st.execute(create);
		st.execute(insertjava);
		
//		ResultSet rs=st.executeQuery(select);
//		while(rs.next())  
//			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3))  ;
//			  
			//step5 close the connection object  
			con.close();  
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
}
