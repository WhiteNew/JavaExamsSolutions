package huawei;

	import java.util.ArrayList;
	import java.util.Scanner;

	/**
	* @Description: Enjoy life.
	* @Author: bx
	* @Date:2019-08-11
	* 
	*/
public class jiami {
	
	  public static int[] transfer(char[] a)
	  {
		   int leng =a.length;
		   int[] b=new int[leng];
		   for(int i=0;i<leng;i++)
		   {
			   if (a[i]=='0') b[i]=0;
			   if (a[i]=='1') b[i]=1;
		   }
		  return b;
	  }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
	        int N = sc.nextInt();
	        int K =sc.nextInt();
	        String s =sc.next();
	        StringBuffer str2 =new StringBuffer();
	        char[] arr=s.toCharArray();
	        
	        int leng=arr.length;
	        
	        int[] bl=new int[leng];
	        bl=transfer(arr);
	        int[] bs=new int[N];
	   //     char[] res= new char[N];
	        for (int i=0;i<N;i++)
	        {
	        	if(i==0) bs[i]=bl[0];
	        	else 
	        	{
	        	bs[i]=bl[i];
	            int count=0; 
	        	for(int j=i-1;j>=0 && count<K-1;j--)
	        	{
	        	bs[i]^=bs[j];
	        	count++;
	        	}
	        	}
	        	
	        }
	        for(int i=0;i<bs.length;i++)
	        {
	        	str2=str2.append(bs[i]);
	        }
	       System.out.println(str2);
	        
	    }
		}
	}