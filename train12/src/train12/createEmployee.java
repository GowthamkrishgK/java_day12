package train12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class createEmployee {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306/prodapt";
	String user="root";
	String pass="root";
	String createTable="create table prodapt_employee (emp_id int,"
			+ "name varchar(40),"
			+ "mail varchar(50),"
			+ "PRIMARY KEY (emp_id));";
	
      String tablestring="Creating  prodapt_employee Table ";
      List<Integer> arr=new ArrayList<>();
	try {
		   Connection c=DriverManager.getConnection(url,user,pass);
		   Statement st=c.createStatement();
			System.out.println(tablestring);
			Boolean c1=false;
			
			if(c1)
			{
				st.execute(createTable);
				 c1=true;
				 tablestring="table created";
				
			}else {
				System.out.println("table already exist");
			}
			System.out.println("tdo you want to enter values : yes or no");
			String s=sc.next();
			if(s.equalsIgnoreCase("yes")) {
		System.out.println("enter the number of values to enter");
			int n=sc.nextInt();
			while(n>0) {
				
			System.out.println("inserting values into table");
			System.out.println("enter Employee Id: ");
			int id=sc.nextInt();
			arr.add(id);
			if(!arr.contains(id))
			{
				System.out.print("id must be unique");
				break;
			}
			System.out.println("enter Employee name: ");
			String name=sc.next();
			System.out.println("enter Employee e-mail ");
			String mail=sc.next();

PreparedStatement pt=c.prepareStatement("insert into prodapt_employee values(?,?,?);"); 
			pt.setInt(1, id);//1 is first parameter in query
			pt.setString(2, name);
			pt.setString(3, mail);
		 int i=  pt.executeUpdate();
		 System.out.println(i+"rows inserted");
			n--;
			}
			}
			System.out.println("displaying table");
			ResultSet rs=st.executeQuery("select * from prodapt_employee;");
			while(rs.next()) {
				System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" ");
			}
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
