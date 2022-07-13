package train12;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;


public class methodref {
      public static void main(String[] args) throws SQLException {
         
          sort_arr.sort(Arrays.asList("gk","vinesh","ram","tarun"));
		List<Integer> a=new ArrayList<>();
		a.add(12);
		a.add(13);
		a.add(8);
		a.add(3);
//		using normal method
//		a.sort(new Comparator <Integer>() {
//			    public int compare(Integer a,Integer b) {
//			    	return a.compareTo(b);
//			    }  
//		});
//		using lambda expression
//		a.sort((a1,a2)->a1.compareTo(a2));
//		using method reference
		a.sort(Integer::compareTo);
		System.out.println(a);
	
		}
}

