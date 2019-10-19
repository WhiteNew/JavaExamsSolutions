package huawei;

import java.util.ArrayList;

/**
* @description:I love coding
* @author: Bai Xin
* @version:2019-07-24 ионГ10:34:52
* 
*/
public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> l=new ArrayList<>();
		 l.add(1);
		 l.add(1);
		 l.add(2);
		 l.remove((Integer)1);
		 l.remove((Integer)1);
		 System.out.println(l.get(0));
		 System.out.println(l.size());
		// System.out.println(l.get(1));
		 
	}

}
