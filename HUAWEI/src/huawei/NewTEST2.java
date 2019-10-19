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
public class NewTEST2 {
	
	public static Boolean judge(String str)
	{
		
		  String[] arr=str.split("\\s+");
		//   int N=arr.length;
		    int t=arr[0].length();
		    boolean flg=true;
		    for(int j=0;j<arr.length;j++)
		    {
		    	if(arr[j].length()!=(t+1)%2)
		    	{
		    		flg=false;
		    		break;
		    	}
		    	else if(arr[0].length()==arr[arr.length-1].length()&&(arr[0].length()==1||arr[0].length()==2))
		    	{
		    		if(arr[j].length()!=(arr[0].length()+1)%2)
		    		{
		    			flg=false;
		    			break;
		    			
		    		}
		    	}
		       t++;
		    }
		    return flg;
		  
		
		 }
		  

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 
		 while(sc.hasNext())
		 {
			 
			 String input=sc.next();
			// System.out.print(input+"       ");
			 String huanhang=System.getProperty("line.separator","\n");
			 String[] strArray=input.split(huanhang);
			 List<Boolean> result=new ArrayList<Boolean>();
			 for(int i=0;i<strArray.length;i++)
			 {
				 result.add(judge(strArray[i]));
			 }
		  
		 
		  
		
		 for(int i=0;i<result.size()-1;i++)
		 {
			 System.out.print(result.get(i)+" ");
		 }
		 System.out.print(result.get(result.size()-1));
		 }
	}

}
