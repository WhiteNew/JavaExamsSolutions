package huawei;

import java.util.Scanner;

/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-09-18
* 
*/
public class ZuidalianxuZixulie {
	
	public static int getMax(int[] a)
	{
		int start=0;
		int end=0;
		int maxsum=0;
		for(int i=0;i<a.length;i++)
		{
			int tempsum=0;
			for(int k=i;k<a.length;k++)
			{
				tempsum+=a[i];
				if(maxsum<tempsum)
				{   
					maxsum=tempsum;
				}
			}
		}
		return maxsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		 
		 while(sc.hasNext())
		 {
		 String s=sc.nextLine();
		 String input=s.substring(1, s.length()-1);
		 System.out.println(input);
		  String[] snum=input.split(",");
		   int[] num=new int[snum.length];
		   for(int i=0;i<snum.length;i++)
		   {
			   if(i==0) { num[i]=Integer.parseInt(snum[i]);}
			   if(i>0)
			   {
				   String temp=snum[i].substring(1);
			   
			   num[i]=Integer.parseInt(temp);
			   }
			   
		   }
		  int max=getMax(num);
		  System.out.println(max);
		 }
	}

}
