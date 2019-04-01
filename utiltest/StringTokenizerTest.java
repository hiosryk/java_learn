package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "hello java !!!";
		StringTokenizer st = new StringTokenizer(str); //�ڸ��غ� ������.  (str, "J") ������ j���������� �ڸ���.
		int cnt = st.countTokens();
		System.out.println("��ū�� : " + cnt); //�ƹ��͵� �������ϸ� ������ �������Ѵ�.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());           //hello ��� java��� !!!��� 
		}
		
		str = "TO|��ȿ��|�ȳ��ϼ��� ���� ���ؿ�???";
		StringTokenizer st2 = new StringTokenizer(str,"|"); 
		String protocol = st2.nextToken();
		String to =st2.nextToken();
		String msg =st2.nextToken();
		System.out.println("���� : " + protocol); //�ƹ��͵� �������ϸ� ������ �������Ѵ�.
		System.out.println("�������� : " + to); //�ƹ��͵� �������ϸ� ������ �������Ѵ�.
		System.out.println("������ �޼��� : " + msg); //�ƹ��͵� �������ϸ� ������ �������Ѵ�.

		
		///////uuid
		System.out.println(UUID.randomUUID());
		
	//�����ϰ� �𷹴� ������Ŵ�. â����ž� awt �Ұ���. ���� �̷� ���� . �̰ɹ������� ������Ʈ�� �����Ұž�.	
	}
}
