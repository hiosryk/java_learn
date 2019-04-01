package com.kitri.lang;

public class StringBufferTest1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("hello "); //���ڿ�����. ������ �о�� ����. ���������� �׻� 16�� �ִ�.
		System.out.println("1.sb1==" + sb1);
		int cap = sb1.capacity();							
																//string buffer�� �����ϳ����� �ѴڶѴ��Ҽ��ִ�.
		System.out.println("�ʱ�ũ�� :  " + cap + "\t���ڿ� �� : " + sb1.length());
		sb1.append("java");
		System.out.println("2.sb1==" + sb1); 
		
		sb1.append(" !!!!!");
		System.out.println("3.sb1==" + sb1); 
		cap = sb1.capacity();							
		System.out.println("ũ�� : " + cap + "\t���ڿ� �� : " + sb1.length()); 
		
		sb1.append(" !!!!!!"); //�������� �Ѿ����. ��� �þ��.
		System.out.println("4.sb1==" + sb1); 
		cap = sb1.capacity();							
		System.out.println("ũ�� : " + cap + "\t���ڿ� �� : " + sb1.length()); 
		
		sb1.insert(10, "@@@"); //�־�.
		System.out.println("5. sb1 == " + sb1); 
		
		sb1.delete(10, 12);		//���� ������. ����.
		System.out.println("6. sb1 == " + sb1); 
		
		sb1.deleteCharAt(10);		//���� �ϳ��� ����.
		System.out.println("7. sb1 == " + sb1); 
		
		sb1.replace(6, 10, "�ڹ�"); //���� ������ �ٲ�.
		System.out.println("8. sb1 == " + sb1); 
		
		sb1.reverse(); //���� �ѱ� ������
		System.out.println("8. sb1 == " + sb1); 
		sb1.reverse(); //�������
		
		sb1.setCharAt(9, '@'); //���°�մ� �ϳ��� �ٲ��.
		System.out.println("10. sb1 == " + sb1); 
		
		// ���ϰ��� ���������� string class�� ������ָ���.
		String s1 = new String(sb1); //�����ϳ�������. ���� �Ʒ�����.
		String s2 = sb1.toString(); 
		
////////////////////////////////////////		����
		String str = "hello �ڹ� !!!";
//		String findStr = "�ڹ�";
		String findStr = "����Ŭ";
		String replaceStr = "java";
		
		int start = str.indexOf(findStr);
		System.out.println(start);
		if (start != -1) {
				StringBuffer sb = new StringBuffer(str);
				int end = start + findStr.length();
				sb.replace(start, end, replaceStr);
				System.out.println(sb.toString());
		}	else {
			System.out.println(findStr + "�� �����ϴ�.");
		}
		
		StringBuffer sb2 = new StringBuffer( "hello �ڹ�!!!"	 ); 
		int cap2 = sb2.capacity();
		
		
		
//		hello java !!!
//		����Ŭ�� �����ϴ�.
		
		
								//*��) �����ð� �ߴ���. �Һ�.  
		String s = "hello "; //string class�� �����̾ȴ�. ���ϸ� ���ο� ���ڰ� ������. �޸𸮳���
		s.concat("java");
		System.out.println(s);
	}
}
