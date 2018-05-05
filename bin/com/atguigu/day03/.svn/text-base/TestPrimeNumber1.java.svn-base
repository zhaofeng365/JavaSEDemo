package com.atguigu.day03;
class TestPrimeNumber1{
	/**质数又称素数,是指在一个大于1的自然数中，除了1和此整数自身外，不能被其他自然数整除的数  **/
	/*public static void main(String[] args){
		//boolean flag = false;
		long start = System.currentTimeMillis();//获取系统当前的毫秒数
		l:for(int i = 2;i <= 100000;i++){//实现100以内的自然数的遍历
			//如何判断i是否为一个质数
			for(int j = 2;j <= Math.sqrt(i);j++){
				if(i % j == 0){
					//flag = true;
					//break;
					continue l;
				}
			}
			//if(!flag){//if(flag == false){
				System.out.println(i);
			//}
			//flag = false;
		}
		long end = System.currentTimeMillis();
		System.out.println("所花费的时间为：" + (end - start));
		//35535--加上break：10059--使用Math.sqrt():
	}*/
	/**质数又称素数,是指在一个大于1的自然数中，除了1和此整数自身外，不能被其他自然数整除的数  **/
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			boolean mb = isPrime(i);
			if(i>=2 && mb){
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int n){
	    for(int i=2;i<=n/2;i++){
	         if(n%i == 0)
	              return false; 
	    }
	    return true; 
	}
}
