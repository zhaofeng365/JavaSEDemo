package com.atguigu.day07.java;

/*
 * package:����Դ�ļ����ڵİ���д�ڳ���ĵ�һ�С�
 *   ÿ��.��һ�Σ���ʾһ���ļ�Ŀ¼��
 *   ������ҪСд��
 *   
 * import:
 * 1)��ʽ����ָ�����µ����ӿ�
 * 2)д�ڰ���������Դ�ļ�֮��
 * 3)�����Ҫ���������ӿڣ���ô�Ͳ���д��
 * 4)������������java.lang���µģ��磺System String Math�ȣ��Ͳ���Ҫ��ʽ��������
 * 5)���.*�ĸ������java.util.*;
 * 6)��δ���ͬ����ĵ��롣�磺��util����sql����ͬʱ����Date�ࡣ
 * 7)import static ��ʾ����ָ�����static�����Ի򷽷�
 * 8)����java.lang.*ֻ�ܵ���lang���µ��������ӿڣ����ܵ���lang���Ӱ��µ����ӿ�
 */
//import java.util.Scanner;
//import java.util.Date;
//import java.util.List;
//import java.util.ArrayList;
import java.lang.reflect.Field;
import java.util.*;
import static java.lang.System.*;
public class TestPackageImport {
	public static void main(String[] args) {
		out.println("helloworld");
		Scanner s = new Scanner(System.in);
		s.next();
		
		Date d = new Date();
		List list = new ArrayList();
		
		java.sql.Date d1 = new java.sql.Date(522535114234L);
		
		Field f = null;
	}
}
