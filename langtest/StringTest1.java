package com.kitri.lang;

public class StringTest1 {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
//���ͷ� ��İ� ������� ��������� ����̴ٸ���.
		if( s1 == s2 )
			System.out.println(" s1 s2�� �ּҰ��� ����.");//o ���ڿ� ����Ҿȿ� "java"���� ������. == ���ڿ� ����Ҿȿ� �ֳ�?? �ּҰ�����.
		if( s1 == s3 )
			System.out.println(" s1 s3�� �ּҰ��� ����.");//x �ȵ�θ޴ٿ� ������ �ּҰ��� 
		if( s1 == s4 )
			System.out.println(" s1 s4�� �ּҰ��� ����.");//x
		if( s2 == s3 )
			System.out.println(" s2 s3�� �ּҰ��� ����.");//x
		if( s2 == s4 )
			System.out.println(" s2 s4�� �ּҰ��� ����.");//x
		if( s3 == s4 )
			System.out.println(" s3 s4�� �ּҰ��� ����."); //x ���ε��� �ؾ ����. ������ҿ�.

		System.out.println("-----------------------------------------------------------------------");
		
		if( s1.equals(s2) )
			System.out.println(" s1 s2�� ���ڿ����� ����.");//o  ���ڿ��̰��̰���. string class�� equals��� �޼ҵ带 �������̵��ؼ�
		if( s1.equals(s3) )
			System.out.println(" s1 s3�� ���ڿ����� ����.");//o 
		if( s1.equals(s4) )
			System.out.println(" s1 s4�� ���ڿ����� ����.");//o
		if( s2.equals(s3) )
			System.out.println(" s2 s3�� ���ڿ����� ����.");//o
		if( s2.equals(s4) )
			System.out.println(" s2 s4�� ���ڿ����� ����.");//o
		if( s3.equals(s4) )
			System.out.println(" s3 s4�� ���ڿ����� ����."); //o
	
	}
	
}
//���Ϻ���.
//���ڿ��� ��ȭ��Ű������. ��������Ͱ����� ��ĥ�����վ ��ȭ�� ������. hello +java
//stringbuffer sb = new stringbuffer("hello);
//sysout (sb.append(" java"));					= hello java
//sysout (sb);                                      = hello java

//�������÷��Ͱ� �����߻����� �ƹ����𸥴�.
//ȣ���ϴ��� �ٷν�������¾ʴ´�.
//������ ���۾Ѵ����� new ���������� �޸� �Ѿ�� ��������.