package commonFunction;
/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-10-19
* 
*/
public class MultiThread {
	  //���Ʊ���
    private int flag = 0;
    //����Object����Ϊ��
    private Object lock = new Object();
    public MultiThread() {
    }
    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (lock){
            //���flag��Ϊ0����first�̵߳ȴ���whileѭ������first�߳��������ס������һֱ��while������У���ֹ������;���룬ִ������Ĵ��룬�����߳�whileѭ��ͬ��
            while( flag != 0){
                lock.wait();
            }
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            //�����Ա����Ϊ 1
            flag = 1;
            //�����������е��߳�
            lock.notifyAll();
        }
    }
    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (lock){
            //�����Ա������Ϊ1���ö��ŵȴ�
            while (flag != 1){
                lock.wait();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            //�����Ա����Ϊ 1 �������first�̸߳�ִ���꣬����ִ��second�����Ҹı��Ա����Ϊ 2
            flag = 2;
            //�����������е��߳�
            lock.notifyAll();
        }
    }
    public void third(Runnable printThird) throws InterruptedException {
        synchronized (lock){
            //���flag������2 ��һֱ���ڵȴ���״̬
            while (flag != 2){
                lock.wait();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            //�����Ա����Ϊ 2 �������second�̸߳�ִ���꣬����ִ��third�����Ҹı��Ա����Ϊ 0
            printThird.run();
            flag = 0;
            lock.notifyAll();
        }
    }
}

