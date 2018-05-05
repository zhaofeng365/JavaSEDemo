package com.atguigu.day02.sort;


public class TestTime {
	
	/*private String var = "aaaa";
	private TestTime() {
		
	}
	private void doSomeThing(final String some){
		final String inner = "adsf";
		new Thread(new Runnable() {
			public void run() {
				System.out.println(some);
				System.out.println(inner);
			}
		}).start();
	}
	 
	public class InnerClass{
		public String getOutVar(){
			
			return var;
		}
	}
	
	public static void main(String[] args) {
		String sys = new TestTime().new InnerClass().getOutVar();
		System.out.println(sys);
	}
	*/
	
	public static void main(String[] args){

        // 初始化Bean1

       TestTime.Bean1 bean1 =  new TestTime().new Bean1();

        bean1.I++;

        // 初始化Bean2

        TestTime.Bean2 bean2 =  new TestTime.Bean2();

        bean2.J++;

        //初始化Bean3

        Bean.Bean3 bean3 = new Bean().new Bean3();

        bean3.k++;

 }

 class Bean1{

        public int I = 0;

 }

 static class Bean2{

        public int J = 0;

 }
}

class Bean{

    class Bean3{

           public int k = 0;

    }

}