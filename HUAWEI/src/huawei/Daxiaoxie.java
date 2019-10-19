package huawei;

import java.util.Scanner;

/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-09-18
* 
*/
public class Daxiaoxie {
	
	public static void reverseAndChange(String str)
	{
		 char[] ch=str.toCharArray();
		 StringBuffer strbuf=new StringBuffer();
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]>='A'&&ch[i]<='Z')
			 {
				 strbuf.append(String.valueOf(ch[i]).toLowerCase());
				 
			 }
			 else  if(ch[i]==' '){
				 strbuf.append('0');
			 }
			 else {
				 strbuf.append(ch[i]);
			 }
		 }
		 String result=strbuf.reverse().toString();
		 System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext())
		 {
		   String str=sc.nextLine();
		   
		    reverseAndChange(str);
		   
		 }
	}

}
