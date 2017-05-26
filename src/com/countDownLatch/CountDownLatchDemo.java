package com.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
    private static final CountDownLatch countDownLatch = new CountDownLatch(5);
    private static final ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws InterruptedException {
    	System.out.println("��ʼ���߳��� "+countDownLatch.toString());
        //ѭ������5�������߳�
        for( int ix = 0; ix != 5; ix++ ){
            new Thread(new Runnable() {
                public void run() {
                    try{
                        System.out.println( Thread.currentThread().getName() + " start" );
                        Thread.sleep(1000);
                        countDownLatch.countDown();
                        System.out.println( Thread.currentThread().getName() + " stop" );
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
}
