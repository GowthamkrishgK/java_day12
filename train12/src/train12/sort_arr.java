package train12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sort_arr {
         List<String> arr=new ArrayList<>();
         public static List<String> sort(List<String >a ) {
        	
        	 a.sort((a1,b1)->a1.compareTo(b1));
        	 a.forEach(System.out::println);
        	return a;

         }
         }
