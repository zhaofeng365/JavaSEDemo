package com.atguigu.day01;

//�����������������ͣ�8���� vs �����������ͣ��ࡢ�ӿڡ����飩
//1.java�еı�������ĸ�ʽ����������  ������ = ��ʼ��ֵ
class TestVeriable {
	public static void main(String[] args) {
		//2.�������ȶ��壬��ʹ��
		int myInt1 = 10;
		double d = 12.3;
		
		System.out.println(myInt1);
		System.out.println(myInt1 + d);
		//i1�����������õķ�Χ������ʹ�á�
		//System.out.println(i1);

		//3.���ͣ�byte(-128~+127)  short  int��Ĭ�����ͣ� long
		byte b1 = 12;
		//byte b2 = 128;
		short s1 = 128;
		int i1 = 12;
		//����long�ͱ�����ֵ��ĩβ�ӡ�L����l��
		long l1 = 2134123351345325L;
		System.out.println(l1);

		//4.�����ͣ���С�������ֵ����float   double��Ĭ�����ͣ�
		double d1 = 12.3;
		//����float���͵ĸ��������ݣ�ĩβҪ�ӡ�F�����ߡ�f��
		float f1 = 12.3F;
		System.out.println(f1);

		//5.�ַ��ͣ�=�����ֽڣ���char ֻ�ܱ�ʾһ���ַ�(Ӣ�ġ����ġ������š����ġ�������)
		char c1 = 'a';
		//char c2 = 'ab';
		String str = "ab";
		char c3 = '��';
		String str1 = "�й�";
		//���Ա�ʾת���ַ�
		char c4 = '\t';
		char c5 = '\n';
		System.out.println("abc" + c5 + "def");
		//�˽�
		char c6 = '\u1234';
		System.out.println(c6);

		//6.�������ͣ�boolean  ֻ�ܹ�ȡֵΪtrue �� false ������ȡֵnull
		boolean bool1 = true;
		if(bool1){
			System.out.println("١��ʦ�Ǹ�\"˧\"��");
		}else{
			System.out.println("����˵�ѣ�");
		}

	}

	public void method1(){
		int i1 = 10;
		System.out.println(i1);
	}
}
