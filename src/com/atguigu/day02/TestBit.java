package com.atguigu.day02;
//位运算符：<<  >>   >>>  | & ~ ^
class TestBit{
	public static void main(String[] args){
		int i1 = 31;
		
		System.out.println(i1<<3);//248 左移  低位补0
		System.out.println(i1<<28);
		
		System.out.println(i1>>2);//7 右移 高位补符号位
		System.out.println(i1>>>2);//7  无符号右移( >>> ) 高位补0

		int i2 = -31;
		System.out.println(i2>>2);//-8 
		System.out.println(i2>>>2);//1073741816
		
		System.out.println(12 & 5);//4 与运算符 只有两个位都是1，结果才是1
		System.out.println(12 | 5);//13 或运算符 两个位只要有一个为1，那么结果就是1，否则就为0
		System.out.println(12 ^ 5);//9 异或运算符 两个操作数的位中，相同则结果为0，不同则结果为1
		System.out.println(~12);//-13 非运算符 如果位为0，结果是1，如果位为1，结果是0
		
	}
	 
}
