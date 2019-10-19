package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description: Enjoy life.
 * @Author: bx
 * @Date:2019-08-11
 * 
 */
public class faJiangjin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int ans = 0;
			ArrayList<Integer> zw = new ArrayList<Integer>();
			int[] money = new int[n];
			for (int i = 0; i < n; i++) {
				zw.add(sc.nextInt());

			}
			int min = 100;
			int flag = 0;
			for (int i = 0; i < zw.size(); i++) {
				if (min <= zw.get(i)) {
					min = zw.get(i);
					flag = i;
				}
			}
			money[flag] = 100;
			for (int j = flag; j < n - 1; j++) {
				if (zw.get(j + 1) > zw.get(j))
					money[j + 1] = money[j] + 100;
				if (zw.get(j + 1) < zw.get(j))
					money[j + 1] = money[j] - 100;
				if (zw.get(j + 1) == zw.get(j))
					money[j + 1] = money[j];
			}
			for (int j = flag; j >= 1; j++) {
				if (zw.get(j - 1) > zw.get(j))
					money[j - 1] = money[j] + 100;
				if (zw.get(j - 1) < zw.get(j))
					money[j - 1] = money[j] - 100;
				if (zw.get(j - 1) == zw.get(j))
					money[j - 1] = money[j];
			}
			for (int i = 1; i < n-1; i++) {
				if(money[i]<money[i+1]&& money[i]<money[i-1])
			      money[i]=100;
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += money[i];
			}
			System.out.println(sum);
		}

	}
}