package IteratorTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-10-06
* 
*/
public class IteratorTest {

	public static void main(String[] args) {
		
		
		List l = new ArrayList();
		 l.add("aa");
		 l.add("bb");
		 l.add("cc");
//		 for (Iterator iter = l.iterator(); iter.hasNext();) {
//		     String str = (String)iter.next();
//		     System.out.println(str);
//		 }
		
		 Iterator iter = l.iterator();
		 while(iter.hasNext()){
		     String str = (String) iter.next();
		     
		     System.out.println(str);
		     iter.remove();
		     
		 }
	//	 System.out.println(l.size());
		double  a = 1.311111222354545556556;
		float b=1.234541154445655555555555566f;
		System.out.println(a);
		System.out.println(b);
		 
		
	}
	
}
