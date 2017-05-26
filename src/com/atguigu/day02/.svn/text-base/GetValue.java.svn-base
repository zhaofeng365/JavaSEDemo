package com.atguigu.day02;

//赋值运算符：=  +=  -=  *=  /=  %=
class GetValue{
	public static void main(String[] args) {
		
		int i1 = 10;
		i1 += 3;//i1 = i1 + 3;

		short s = 10;
		//s = s + 3;//编译不通过
		s = (short)(s + 1);//不建议如此实现
		s += 1;//既可以实现运算，又不会更改s的数据类型。自动完成强型转换

		int i2 = 12;
		i2 %= 5;//i2 = i2 % 5;
		
		System.out.println(i1);
		System.out.println(s);
		System.out.println(i2);//2

		boolean b1 = false;
        //区分好==和=的区别。
        if(b1=true)
			System.out.println("结果为真");
        else
			System.out.println("结果为假");

		int i = 1;
		i *= 0.1;
		System.out.println(i);//0

		int m=90,n=70;
		    /*m=m+n;
		    n=m-n;
		    m=m-n;
		    System.out.println(m+"  "+n);*/
		m = m^n;
		n = m^n;
		m = m^n;
		System.out.println(m+"  "+n);
	 
	}
}
