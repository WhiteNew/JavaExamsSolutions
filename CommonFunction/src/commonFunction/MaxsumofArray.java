package commonFunction;
/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-09-19
* 
*/
public class MaxsumofArray {

	public static int maxsequence3(int a[]) 
		{
			int maxsum, maxhere;
			int len=a.length;
			maxsum = maxhere = a[0];   //初始化最大和为a【0】
			for (int i=1; i<len; i++) {
				if (maxhere <= 0)
					maxhere = a[i];  //如果前面位置最大连续子序列和小于等于0，则以当前位置i结尾的最大连续子序列和为a[i]
				else
					maxhere += a[i]; //如果前面位置最大连续子序列和大于0，则以当前位置i结尾的最大连续子序列和为它们两者之和
				if (maxhere > maxsum) {
					maxsum = maxhere;  //更新最大连续子序列和
				}
			}
			return maxsum;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,-2,3,-2, 6,-4,5};
          System.out.println(maxsequence3(a));
	}

}
