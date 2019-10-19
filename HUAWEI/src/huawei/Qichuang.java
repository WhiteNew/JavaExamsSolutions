package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-08-11
* 
*/
public class Qichuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  while (sc.hasNextInt()) {
        int n = sc.nextInt();
        int ans = 0;
        ArrayList<Integer> clock=new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
             int h=sc.nextInt();
             int m=sc.nextInt();
        	clock.add(h*60+m);
        } 
     
        	 
        
      
        int timeNeed=sc.nextInt();
        int bh=sc.nextInt();
        int bm=sc.nextInt();
        int btime=bh*60+bm;
        int lasttime=btime-timeNeed;
        for(int i=0;i<clock.size();i++)
        {
        	if (lasttime<clock.get(i))
        	{
        		if(i==0) {ans=clock.get(0); break;}
        		else 
        			ans=clock.get(i-1);
        		System.out.println(ans);
        		break;
        	}
        	if (lasttime==clock.get(i))
        	{
        		ans=clock.get(i); break;
        	}
        	
        }
        System.out.println(ans/60+" "+ans%60);
        System.out.println(clock);
        System.out.println(btime+" "+lasttime );
    }
	}
}