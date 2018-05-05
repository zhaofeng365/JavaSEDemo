package com.interview;

import java.io.BufferedReader;
import java.io.FileReader;

public class Numeric2ChineseStr {

	public static void main(String[] args) throws Exception {
		String fileName = "c:\\input.txt";

		// ��λ����
		String[] units = new String[] { "ʮ", "��", "ǧ", "��", "ʮ", "��", "ǧ", "��" };

		// ���Ĵ�д��������
		String[] numeric = new String[] { "��", "Ҽ", "��", "��", "��", "��", "½","��", "��", "��" };

		// ���ļ�
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String temp = null;
		temp = br.readLine();//��ȡһ��
		String res = "";

		while (null != temp) {
			// ����һ������������
			for (int k = -1; temp.length() > 0; k++) {
				// �������һλ
				int j = Integer.parseInt(temp.substring(temp.length() - 1, temp.length()));
				String rtemp = numeric[j];

				// ��ֵ����0�Ҳ��Ǹ�λ ��������λ��������λ ��ȥȡ��λ
				if (j != 0 && k != -1 || k % 8 == 3 || k % 8 == 7) {
					rtemp += units[k % 8];
				}

				// ƴ��֮ǰ��ǰ��
				res = rtemp + res;

				// ȥ�����һλ
				temp = temp.substring(0, temp.length() - 1);
			}

			// ȥ����������������..
			while (res.endsWith(numeric[0])) {
				res = res.substring(0, res.lastIndexOf(numeric[0]));
			}

			// �������滻����
			while (res.indexOf(numeric[0] + numeric[0]) != -1) {
				res = res.replaceAll(numeric[0] + numeric[0], numeric[0]);
			}

			// �� ��+ĳ����λ �����Ĵ��滻�� �õ�λ ȥ����λǰ�����
			for (int m = 1; m < units.length; m++) {
				res = res.replaceAll(numeric[0] + units[m], units[m]);
			}

			// �����ӡһ�� ���Ըĳ�д�ļ�
			System.out.println(res);

			// ��ȡ��һ����
			res = "";
			temp = br.readLine();
		}
	}
}
