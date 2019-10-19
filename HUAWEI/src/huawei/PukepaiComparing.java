package huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PukepaiComparing {
	private static Map<String, Integer> cards=new HashMap<>(13);
	
	private static int just(String cards) {
		cards=cards.replace("10", "0");
		switch (cards.length()) {
		case 1: return 1;
		case 3: return 2;    //include space
		case 5: return 3;
		case 7: return 4; //Õ¨         
		default:
			if (cards.equals("joker JOKER")) return 8;
			else return 0;  //Ë³×Ó
					
		}
		
	}
    private static String compare(String car1,String car2, int c1)
    {
    	switch(c1) {
    	case 0:
    	case 1:
    	case 2:
    	case 3:
    	case 4:return (cards.get(car1.split(" ")[0])>cards.get(car2.split(" ")[0]))? car1:car2;
    	default: return "Error";
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3;i<=10;i++) {
			cards.put(""+i, i);
		}
		cards.put("J", 11);
		cards.put("Q",12);
		cards.put("K", 13);
		cards.put("A",14);
		cards.put("2",15);
     Scanner sc=new Scanner(System.in);
     do {
    	 String[] row=sc.nextLine().split("-");
    	 String car1=row[0];
    	 String car2=row[1];
    	 int c1=just(car1),c2=just(car2);
    	 String result;
    	 if(c1==8) result=car1;
    	 else if (c2==8) result=car2;
    	 else if (c1==4&&c2<4||c2==4&&c1<4) {
    		 if(c1>4) result=car1;
    		 else result=car2;
    		 
    	 }
    	 else if(c1==c2) {
    		 result=compare(car1,car2,c1);
    	 }
    	 else {
    		 result="ERROR";
    	 }
    	 System.out.println(result);
     }while(sc.hasNext());
     
    	 
	}

}
