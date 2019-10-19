package huawei;
/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-07-25
* 
*/
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description
 * @auther lx
 * @create 2019-06-28 11:00
 */
public class QiuhunGame {
    //�ж��Ƿ����
    public static boolean isHe(int[] cardList) {
        int length = cardList.length;
        if (length == 0)
            return true;
        Arrays.sort(cardList);//����������
        int count0 = count(cardList);

        //��һ�������û����ȸͷ���ҵ�һ�����ֳ��ֵĴ��� >= 2,��ȥ��ȸͷʣ�µ�������ɺ���
        if (length % 3 != 0 && count0 >= 2 && isHe(Arrays.copyOfRange(cardList, 2, length)) == true)
            return true;
        //�ڶ�������������һ�����ֳ��ִ��� >= 3����ȥ��������Ӻ�ʣ�µ��ܺ���
        if (count0 >= 3 && isHe(Arrays.copyOfRange(cardList, 3, length)) == true)
            return true;
        //������������������˳�ӣ����Ƴ�˳�Ӻ�ʣ�µ��ܺ���
        if (contains(cardList, cardList[0] + 1) && contains(cardList, cardList[0] + 2)) {
            int[] c_cardList = Arrays.copyOfRange(cardList, 1, length);
            int[] last = remove(c_cardList, cardList[0] + 1, cardList[0] + 2);
            if (isHe(last) == true)
                return true;
        }
        return false;
    }

    //�Ƴ������ڸ�����������
    private static int[] remove(int[] cardList, int i, int i2) {
        int[] res = new int[cardList.length - 2];
        int x = 0, times1 = 0, times2 = 0;
        for (int j = 0; j < cardList.length; j++) {
            if (cardList[j] == i && times1 == 0) {
                times1++;
                continue;
            } else if (cardList[j] == i2 && times2 == 0) {
                times2++;
                continue;
            }

            res[x++] = cardList[j];
        }
        return res;
    }

    //�ж��������Ƿ���ڸ���
    private static boolean contains(int[] cardList, int i) {
        for (int j = 0; j < cardList.length; j++) {
            if (cardList[j] == i)
                return true;
        }
        return false;
    }

    //ͳ�������ڵ�һ�������ֵĴ���
    private static int count(int[] cardList) {
        int res = 1;
        for (int i = 1; i < cardList.length; i++) {
            if (cardList[i] == cardList[0])
                res++;
            else
                continue;
        }
        return res;
    }

    //ͳ��������ĳ�����ֵĴ���
    private static int timesOfI(int[] a2, int i) {
        int res = 0;
        for (int j = 0; j < a2.length; j++) {
            if (a2[j] == i)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] a = {1,1,1,1,2,2,3,3,5,6,7,8,9};
//        int[] a = {1,1,1,2,2,2,5,5,5,6,6,6,9};
//        int[] a = {1,1,1,1,2,2,2,5,5,5,7,7,7};
        int[] a = {1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 7, 7, 9};
        ArrayList<Integer> res = new ArrayList<>();
        int[] a2 = new int[a.length + 1];

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < a.length; j++) {
                a2[j] = a[j];
            }
            if (timesOfI(a2, i) == 4) {//������Ƴ������ĴΣ�����Ӹ���
                continue;
            }
            a2[a.length] = i;

            if (isHe(a2) == true)
                res.add(i);
        }

        System.out.println(res.size());
    }
}

