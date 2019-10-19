package huawei;

import java.util.ArrayList;

/**
* @description:I love coding
* @author: Bai Xin
* @version:2019-07-19 ÉÏÎç9:29:03
* 
*/
public class Qiuhe {
	public static int SumSolution(int n) {
		int sum=n;
		boolean f=(n>0)&&(sum+=SumSolution(n-1))>0;
		return sum;
		
	}
	 public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	        ArrayList<Integer> l=new ArrayList<>();
	        System.out.println(l.size());
	        int i,j;
	        int mult=0;
	        for(i=0,j=array.length-1;i<j;) {
	        	if(array[i]+array[j]==sum) 
	        	{   int flag=l.size();
	        		int temp=mult;
	        		mult=array[i]*array[j];
	        		if(flag==0) 
	        		{
	        			l.add(array[i]);
		        		l.add(array[j]);
	        		}
	        		if(flag!=0 && mult<temp) {
	        			l.clear();
	        			l.add(array[i]);
		        		l.add(array[j]);
	        		}
	        		i++;j--;
	        	
	        	}
	        	if(array[i]+array[j]<sum)
	        	{
	        		i++;
	        		
	        	}
	        	if(array[i]+array[j]>sum)
	        	{
	        		j--;
	        		
	        	}
	        	
	        }
	        System.out.println(l.get(0));
	        System.out.println(l.get(1));
	        
			return l;
	    }
	public static void main(String args[]) {
//	     int test= SumSolution(5);
//	      System.out.println(test);
		int a[]= {1,2,4,7,11,14};
		int sum=15;
		FindNumbersWithSum(a,sum);
	}
}
