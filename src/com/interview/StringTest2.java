package com.interview;

public class StringTest2 {
	public static void main(String[] args) {
		/**
		 * �龰һ���ַ����� JAVA�����(JVM)�д�����һ���ַ����أ����б����źܶ�String����; ���ҿ��Ա�����ʹ�ã�����������Ч�ʡ�
		 * ����String����final�ģ�����ֵһ�������Ͳ��ɸı䡣
		 * �ַ�������String��ά�������ǿ��Ե���intern()�����������ַ����ء�
		 */
		String s1 = "abc";
		// �� ���ַ����ش�����һ������
		String s2 = "abc";
		// �� �ַ���pool�Ѿ����ڶ���abc��(����),���Դ���0�������ۼƴ���һ������
		System.out.println("s1 == s2 : " + (s1 == s2));
		// �� true ָ��ͬһ������
		System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
		// �� true ֵ���
		// ��------------------------------------------------------over
		/**
		 * �龰��������new String("")
		 * 
		 */
		String s3 = new String("abc");
		// �� ��������������һ��������ַ������У�һ������������У�
		// �� ����һ����������s3�����ջ��
		String s4 = new String("abc");
		// �� �ַ��������Ѿ����ڡ�abc����������ֻ�ڶ��д�����һ������
		System.out.println("s3 == s4 : " + (s3 == s4));
		// ��false s3��s4ջ���ĵ�ַ��ͬ��ָ������Ĳ�ͬ��ַ��
		System.out.println("s3.equals(s4) : " + (s3.equals(s4)));
		// ��true s3��s4��ֵ��ͬ
		System.out.println("s1 == s3 : " + (s1 == s3));
		// ��false ��ŵĵ����಻ͬ��һ��ջ����һ������
		System.out.println("s1.equals(s3) : " + (s1.equals(s3)));
		// ��true ֵ��ͬ
		// ��------------------------------------------------------over
		/**
		 * �龰���� ���ڳ�����ֵ�ڱ����ʱ��ͱ�ȷ��(�Ż�)�ˡ� �����"ab"��"cd"���ǳ�������˱���str3��ֵ�ڱ���ʱ�Ϳ���ȷ����
		 * ���д��������Ч����ͬ�ڣ� String str3 = "abcd";
		 */
		String str1 = "ab" + "cd"; // 1������
		String str11 = "abcd";
		System.out.println("str1 = str11 : " + (str1 == str11));
		// ��------------------------------------------------------over
		/**
		 * �龰�ģ� �ֲ�����str2,str3�洢���Ǵ洢���������ַ�������(intern�ַ�������)�ĵ�ַ��
		 * 
		 * �����д���ԭ��(str2+str3)�� ������JVM���Ȼ��ڶ��д���һ��StringBuilder�࣬
		 * ͬʱ��str2ָ��ľ����ַ���������ɳ�ʼ���� Ȼ�����append������ɶ�str3��ָ��ľ����ַ����ĺϲ���
		 * ���ŵ���StringBuilder��toString()�����ڶ��д���һ��String����
		 * ��󽫸����ɵ�String����Ķѵ�ַ����ھֲ�����str3�С�
		 * 
		 * ��str5�洢�����ַ�������"abcd"����Ӧ�ľ����ַ�������ĵ�ַ�� str4��str5��ַ��Ȼ��һ���ˡ�
		 * 
		 * �ڴ���ʵ����������ַ������� ���������ַ�������һ��String�����һ��StringBuilder����
		 */
		String str2 = "ab"; // 1������
		String str3 = "cd"; // 1������
		String str4 = str2 + str3;
		String str5 = "abcd";
		System.out.println("str4 = str5 : " + (str4 == str5)); // false
		// ��------------------------------------------------------over
		/**
		 * �龰�壺 JAVA��������string + ��������/���� �ǵ��ɳ������ʽֱ����ֵ���Ż��ġ�
		 * �����ڵ�����string��ӣ�������µĶ���ģ��洢�ڶ�(heap)��
		 */
		String str6 = "b";
		String str7 = "a" + str6;
		String str67 = "ab";
		System.out.println("str7 = str67 : " + (str7 == str67));
		// ��str6Ϊ�������������ڲŻᱻ������
		final String str8 = "b";
		String str9 = "a" + str8;
		String str89 = "ab";
		System.out.println("str9 = str89 : " + (str9 == str89));
		// ��str8Ϊ���������������ڻᱻ�Ż�
		// ��------------------------------------------------------over
	}
}
