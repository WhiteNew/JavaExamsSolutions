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
			maxsum = maxhere = a[0];   //��ʼ������Ϊa��0��
			for (int i=1; i<len; i++) {
				if (maxhere <= 0)
					maxhere = a[i];  //���ǰ��λ��������������к�С�ڵ���0�����Ե�ǰλ��i��β��������������к�Ϊa[i]
				else
					maxhere += a[i]; //���ǰ��λ��������������кʹ���0�����Ե�ǰλ��i��β��������������к�Ϊ��������֮��
				if (maxhere > maxsum) {
					maxsum = maxhere;  //����������������к�
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
