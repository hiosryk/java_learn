package com.kitri.io;

import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		try {
			in = new InputStreamReader(System.in);// Sysyem.in �ܼ�â���� //���ʹ� ��������N(�����γ�������)��������R(ù��°��)
			char c[] = new char[100];
			System.out.print("�Է� : ");
			int x = in.read(c);
			System.out.println("x ==" + x);
		
			//��¥�� ĳ���͹迭�ȿ� ������ ������ 
			int len = c.length;
			for (int i = 0; i < len; i++) {
				System.out.println(c[i]);
			}
			//���ϱ� ����ִ� ���������� ���� ���� 
			
			String str = new String(c, 0, x - 2);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
//�������� reader ��°͵��� ĳ���� ��Ʈ���̶� ǥ���Ѵ�. 
//�ֿܼ��ٰ� ����ض�. ���Ͽ� �߷��� ���Ͽ����õȰ� �������.
//��ü����� ��Ʈ���� ����ض�. �ٵ� ������ �Է¹����� String�� ����. 
//��ǲ�迭�߿��� �о���ϋ����ڿ��� �о���̴°� ã�ƺ���. �ٸ��Ŵ� �� ��������. �̰� ���� buffered reader