package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class ReverseTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		String str = "!!! avaj olleH";
		String str = "!!! ���� ���";
//		Hello Java !!! �ּ� 3���� (����� 10������ ������ִ�.)
		String result = ""; // ������ٰ� �����ž�.
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			result += str.charAt(i); // result���ٰ� ��� �߰��� ��´�.
		}

//		e�� 2��°�ֽ��ϴ�. 
		System.out.println("\ne�� " + (result.indexOf('e') + 1) + "��°�ֽ��ϴ�.");

		byte b1[] = str.getBytes();
		len = b1.length;
		byte b2[] = new byte[len];
		int x = 0;
		for (int i = len - 1; i >= 0; i--) {
			b2[x++] = b1[i];
		}
		result = new String(b2);
		System.out.println(result);
		System.out.println("e�� " + (result.indexOf('e') + 1) + "��°�ֽ��ϴ�.");

		char c1[] = str.toCharArray(); // �ѱ۵� ������
		len = c1.length;
		char c2[] = new char[len];
		x = 0;
		for (int i = len - 1; i >= 0; i--) {
			c2[x++] = c1[i];
		}
		result = new String(c2);
		System.out.println(result);
		System.out.println("e�� " + (result.indexOf('e') + 1) + "��°�ֽ��ϴ�.");

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}
