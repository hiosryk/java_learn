package com.kitri.io;

import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		try {
			in = new InputStreamReader(System.in);// Sysyem.in 콘솔창에서 //엔터는 역슬래시N(밑으로내려가라)역슬래쉬R(첫번째로)
			char c[] = new char[100];
			System.out.print("입력 : ");
			int x = in.read(c);
			System.out.println("x ==" + x);
		
			//진짜로 캐릭터배열안에 들어갓는지 보려면 
			int len = c.length;
			for (int i = 0; i < len; i++) {
				System.out.println(c[i]);
			}
			//보니까 비어있는 쓸데공간이 많이 들어갓네 
			
			String str = new String(c, 0, x - 2);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
//무슨무슨 reader 라는것들을 캐릭터 스트림이라 표현한다. 
//콘솔에다가 출력해라. 파일에 추력은 파일에과련된거 만들면댄다.
//객체만들고 스트링을 출력해라. 근데 문제는 입력받을때 String은 없어. 
//인풋계열중에서 읽어들일떄문자열을 읽어들이는것 찾아보자. 다른거는 다 쓰지말래. 이거 쓰레 buffered reader