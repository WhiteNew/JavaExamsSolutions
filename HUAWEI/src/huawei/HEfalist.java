package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-09-18
* 
*/
public class HEfalist {
	
	
	public static boolean judge(List list)
	{
		
		int  leng=list.size();
		boolean flag= false;
		int count1=0;
		int count2=0;
		if((int)list.get(0)<10)
		{
		for(int i=0;i<leng;i++)
		{  
		
			
			if(i%2==0 && (int)list.get(i)<10)
			{
				count1++;
			}
			if(i%2==1&&(int)list.get(i)>=10)
			{
				count2++;
			}
		}
		if(list.size()%2==0) 
		{
			if(count1==count2) return true;
		
		}
		if(list.size()%2==1) {
			if(count1==count2+1) return true;
			
		} 
		}
		if(((int)list.get(0)>=10)&&((int)list.get(leng-1)>=10))
		{
			 
			for(int i=1;i<leng-1;i++)
			{
				if((int)list.get(i)>=10) 
				{
					
					return false;
				}
				
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext())
		 {
		   String str=sc.nextLine();
		   String[] a=str.split("\\s+");
		   int N=a.length;
		   List<Integer> list=new ArrayList<Integer>();
		   for(int i=0;i<a.length;i++)
		   {
			   list.add(Integer.parseInt(a[i]));
		   }
		   
		   
		  
			 
		 }
	}

}
