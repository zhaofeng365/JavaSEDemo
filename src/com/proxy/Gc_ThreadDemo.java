package com.proxy;

public class Gc_ThreadDemo extends Thread{
    //重写父类的垃圾回收方法
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
     
    //默认extends Object
    @Override 
    public void finalize(){
        System.out.println(Thread.currentThread().getName()+"....垃圾回收方法运行");
    }
     
    //主方法
    public static void main(String[] args){
        Gc_ThreadDemo gc = new Gc_ThreadDemo();
        for(int i = 0; i < 10; i++){
            new Gc_ThreadDemo();//制造匿名对象,好让JVM执行垃圾回收方法。
            System.gc();//通知JVM执行垃圾回收
        }
        gc.start();
        System.out.println(Thread.currentThread().getName());
    }
}
 
//我们正常编译：javac -d classes Gc_ThreadDemo.java
//如果要看到JVM线程回收情况，我们可以使用：java -verbose:gc -cp classes Gc_ThreadDemo