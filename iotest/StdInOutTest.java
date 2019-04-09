//sys템 클래스가 가지고있는 out(표준출력) static필드 프린트스트림 데이터형식.  println 메소드 string이 가능. 
//System.out.println();		

package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {

	public static void main(String[] args) {
		try {	
//			System.out.print("입력1 : ");
//			int x= System.in.read();
//			System.out.println("x ==" + x);
//			System.out.println("x ==" + (char)x);
		
			System.out.print("입력2 : "); 
			byte b[] = new byte[100];
			int x = System.in.read(b);	 
			System.out.println("2. x ==" + x);
			int len = b.length;
			for (int i = 0; i < len; i++) {
				System.out.println(b[i]);
			}
			String s = new String(b, 0, x, -2);
			System.out.println("s ==" + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
		
		//input stream. read 
	



