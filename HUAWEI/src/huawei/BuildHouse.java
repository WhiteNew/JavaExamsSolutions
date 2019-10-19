package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-08-11
* 
*/
public class BuildHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     int max=0;
               Scanner sc=new Scanner(System.in);
              
               while(sc.hasNext()) {
            	   
            	   ArrayList<Integer> city=new ArrayList<Integer>();
            	   int num=sc.nextInt();
            	   for(int i=0;i<num;i++)
            	   {
            	   city.add(sc.nextInt());
            	   city.add(sc.nextInt());
            	   
            	   }
            	   max=0;
            	   for(int i=0;i<city.size();i++)
            	   {
            		   max=city.get(i)< max? max:city.get(i);
            		   
            	   }
            	   System.out.println(max*max);
               }
              
	}

}
