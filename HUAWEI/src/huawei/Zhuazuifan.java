package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
* @description:I love coding
* @author: Bai Xin
* @version:2019-07-24 ионГ9:37:33
* 
*/
public class Zhuazuifan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N,D;
			N=sc.nextInt();
			D=sc.nextInt();
			ArrayList<Integer> a=new ArrayList<Integer>();
			 for(int i=0;i<N;i++) {
				 a.add(sc.nextInt());
				 
			 }
			 int count=0;
			 for(int j=0;j<N-2;j++)
				 for(int k=j+1;k<N;k++)
					for(int l=k+1;l<N;l++)
			 {
				 if(Math.abs(a.get(k)-a.get(j))<=D&&Math.abs(a.get(l)-a.get(k))<=D&&Math.abs(a.get(l)-a.get(j))<=D) {
					 count++;
				 }
			 }
			 System.out.println(count%99997867);
			 
		}
	}

}
