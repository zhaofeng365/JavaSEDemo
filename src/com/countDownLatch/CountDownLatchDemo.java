package com.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CountDownLatchDemo {
	
    private static final CountDownLatch countDownLatch = new CountDownLatch(6);
    
    private static final ExecutorService executorService = Executors.newFixedThreadPool(10);
    
    public static void main(String[] args) throws InterruptedException {
    	System.out.println("��ʼ���߳��� "+countDownLatch.getCount());
        //ѭ������5�������߳�
        for( int ix = 0; ix != 6; ix++ ){
            new Thread(new Runnable() {
                public void run() {
                    try{
                        System.out.println( Thread.currentThread().getName() + " start" );
                       int sum = sum(100);
                       System.out.println(Thread.currentThread().getName() +"��ֵ�� ��"+sum);
                        countDownLatch.countDown();
                        System.out.println( Thread.currentThread().getName() + " stop" );
                        //throw new RuntimeException();
                    } catch ( InterruptedException ex ){
                    	System.out.println("ddddddd");
                    }
                }
            }, "Task-Thread-" + ix ).start();

        }
      //���̵߳ȴ������������
       countDownLatch.await();
        System.out.println("All task has completed.");
    }
    
    public static int sum(int len) throws InterruptedException {
    	int sum = 0;
    	for (int i = 0; i < len; i++) {
    		Thread.sleep(500);
			sum+= i;
		}
    	return sum;
    }
}
