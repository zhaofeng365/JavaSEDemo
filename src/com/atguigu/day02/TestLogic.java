package com.atguigu.day02;
//�߼��������  &  && | || ! ^
class TestLogic{
	public static void main(String[] args){
		boolean a = true;
		boolean b = false;

		System.out.println(a & b);
		System.out.println(a && b);
		System.out.println(a | b);
		System.out.println(a || b);
		System.out.println(a & !b);
		System.out.println(a^b);

		//& �� && ������&:���������true����false���Ҷ˶���������㡣
		//				   &&:�����Ϊfalseʱ���Ҷ˲��ٽ�������
		//�Ժ�ʹ��ʱ������ʹ�� &&
		int i1 = 10;
		if(b & (i1++) > 0){
			System.out.println("��������������");
		}else{
			System.out.println("�ѵ�û������");
		}
		System.out.println(i1);//11

		int i2 = 10;
		if(b && (i2++) > 0){
			System.out.println("��������������");
		}else{
			System.out.println("�ѵ�û������");
		}
		System.out.println(i2);//10


		//| �� || ������|�������Ϊtrueʱ���Ҷ����������㡣
		// ||:�����Ϊtrueʱ���Ҷ˲��ٽ������㡣
		//������ʹ��ʱ��ѡ��||
		int i3 = 10;
		if(a | i3++ > 0){
			System.out.println("��������������");
		}else{
			System.out.println("�ѵ�û������");
		}
		System.out.println(i3);//11

		int i4 = 10;
		if(a || i4++ > 0){
			System.out.println("��������������");
		}else{
			System.out.println("�ѵ�û������");
		}
		System.out.println(i4);//10

	}
}
