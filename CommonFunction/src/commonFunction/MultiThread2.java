package commonFunction;

import java.util.concurrent.Semaphore;

/**
* @Description: Enjoy life.
* @Author: bx
* @Date:2019-10-19
* 
*/
public class MultiThread2 {
  //�������� Semaphore����
  private Semaphore spa,spb;
  public MultiThread2() {
      //��ʼ��SemaphoreΪ0��ԭ��������SemaphoreΪ�㣬�����һ�̵߳���(acquire)���Semaphore�ͻ��������������Կ���second��third�̵߳�ִ��
      spa = new Semaphore(0);
      spb = new Semaphore(0);
  }
  public void first(Runnable printFirst) throws InterruptedException {
          // printFirst.run() outputs "first". Do not change or remove this line.
          printFirst.run();
          //ֻ�е�first�߳��ͷ�Semaphore��ʹSemaphoreֵΪ1,����һ���̲߳ſ��Ե��ã�acquire��
          spa.release();
  }
  public void second(Runnable printSecond) throws InterruptedException {
          //ֻ��spaΪ1����ִ��acquire�����Ϊ0�ͻ��������
          spa.acquire();
          // printSecond.run() outputs "second". Do not change or remove this line.
          printSecond.run();
          spb.release();
  }
  public void third(Runnable printThird) throws InterruptedException {
          //ֻ��spbΪ1����ͨ�������Ϊ0�ͻ�����
          spb.acquire();
          // printThird.run() outputs "third". Do not change or remove this line.
          printThird.run();
  }
}