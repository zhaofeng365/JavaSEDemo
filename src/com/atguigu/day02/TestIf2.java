package com.atguigu.day02;
/*
�Ӽ�������С������ĩ�ɼ���
���ɼ�Ϊ100��ʱ������һ��BMW��
���ɼ�Ϊ��80��99]ʱ������һ��̨iphone5s��
���ɼ�Ϊ[60,80]ʱ������һ���ο��飻
����ʱ��ʲô����Ҳû�С�

1.�����ж�֮�����Ƕ��
2. ������������֮���ǡ����⡱��ϵ����������������˳�������ɵġ�
   ������������֮����ڡ���������ϵ��Ҫ��ΧС��д�ڷ�Χ������档
*/
import java.util.Scanner;
class TestIf2{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("������С������ĩ�ɼ������֣�");
		int score = s.nextInt();
		
		if(score >100 || score < 0){
			System.out.println("���������ֵ����");
		}else{
			if(score == 100){
				System.out.println("����һ��BMW");//be my wife!  MSN!
			}else if(score > 80){
				System.out.println("����һ��̨iphone5s");
			}else if(score >= 60){
				System.out.println("����һ���ο���");
			}else{
				System.out.println("ʲôҲû��");
			}
		}

		

	}
}
