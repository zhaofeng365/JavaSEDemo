package com.atguigu.day03;
class TestPrimeNumber1{
	/**�����ֳ�����,��ָ��һ������1����Ȼ���У�����1�ʹ����������⣬���ܱ�������Ȼ����������  **/
	/*public static void main(String[] args){
		//boolean flag = false;
		long start = System.currentTimeMillis();//��ȡϵͳ��ǰ�ĺ�����
		l:for(int i = 2;i <= 100000;i++){//ʵ��100���ڵ���Ȼ���ı���
			//����ж�i�Ƿ�Ϊһ������
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
		System.out.println("�����ѵ�ʱ��Ϊ��" + (end - start));
		//35535--����break��10059--ʹ��Math.sqrt():
	}*/
	/**�����ֳ�����,��ָ��һ������1����Ȼ���У�����1�ʹ����������⣬���ܱ�������Ȼ����������  **/
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
