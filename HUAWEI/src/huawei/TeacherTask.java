package huawei;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     do {
    	 System.out.println("������ѧ�������Ͳ�����Ŀ");
    	 int[] data=new int[2];
    	 data[0]=sc.nextInt();
    	 data[1]=sc.nextInt();
    	 System.out.println("������ѧ���ɼ�");
    	 ArrayList<Integer> a=new ArrayList<Integer>();
    	 for(int i=0;i<data[0];i++)
    	 {
    		 a.add(sc.nextInt());
    	 }
    	 int time=0;
    	 char sign;
    	 int b,c;
    	 while(time<data[1])
    	 {
    		 System.out.println("���������");
    		 sign=sc.next().charAt(0);
    		 b=sc.nextInt();
    		 c=sc.nextInt();
    		 if(sign=='Q') 
    		 {
    			 int start,end;
    			 if (b<c) {
    				 start=b-1;
    				 end=c-1;
    				 
    			 }else {
    				 start=c-1;
    				 end=b-1;
    				 
    			 }
    			 int max=a.get(start);
    			 for(int i=start;i<=end;i++)
    			 {
    				 if(max<a.get(i))
    				{
    					 max=a.get(i);
    				 }
    			 }
    			 System.out.println(+max);
    			 max=0;
    		 }
    		 if(sign=='U') {
    			 int index=b-1;
    			 int newvalue=c;
    			 a.set(index, newvalue);
    			 
    		 }
    		 time++;
    	 }
     }while(sc.hasNext());
     sc.close();
	}
	
}


