package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @description:I love coding
* @author: Bai Xin
* @version:2019-07-24 ÉÏÎç10:14:53
* 
*/
public class Quehun {
	public static int judge(List l, int position) {
	  //  int f=l.indexOf(Qt);
		if((int)l.get(position)==(int)l.get(position+1))
		{
			l.remove(position+1);
			l.remove(position);
		}
		for(int i=0;i<l.size()-2;i++)
		{
			int a=(int) l.get(0);
			
			if((int)l.get(0)==(int)l.get(1)&&(int)l.get(0)==(int)l.get(2)) {
			   l.remove(2);
			   l.remove(1);
			   l.remove(0);
			}
			if((int)l.get(0) + 1==(int)l.get(1)&&(int)l.get(0)+2==(int)l.get(2)) {
				   l.remove(2);
				   l.remove(1);
				   l.remove(0);
				}
		}
		if(l.size()>2)  return -1;
		if(l.size()==1) return (int)l.get(0);
		if(l.size()==2) 
		{
			if((int)l.get(0)==(int)l.get(1))   return (int) (l.get(0));
			if((int)l.get(0)+2==(int)l.get(1))  return (int)l.get(0)+1;
			if((int)l.get(0)+1==(int)l.get(1)) 
			{
			  if((int)l.get(0)==1)	return 3;
			  if ((int)l.get(1)==9) return 7;
			}
		  return -1;
		}
		
		return -1;
		

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            //   int[] a=new int[13];
               ArrayList<Integer> a=new ArrayList<Integer>();
               ArrayList<Integer> result=new ArrayList<Integer>();
//               Scanner sc=new Scanner(System.in);
//               while(sc.hasNext()) {
//            	   for(int j=0;j<13;j++)
//            	   a.add(sc.nextInt());
//               }
               a.add(1);
               a.add(1);
               a.add(1);
               a.add(2);
               a.add(2);
               a.add(2);
               a.add(3);
               a.add(3);
               a.add(3);
               a.add(6);
               a.add(6);
               a.add(6);
               a.add(9);
               int previous=0;
               for(int i=0;i<a.size()-1;i++) {
            	   if((int)a.get(i)!=previous) {
            	   ArrayList<Integer> b=new ArrayList<Integer>();
            	   b=a;
            	   result.add(judge(b,b.get(i)));
               }
            	   else i++;
               }
              for(int j=0;j<result.size();j++)
              {
            	System.out.println((int)result.get(j));
            	 
              }
	}

}
