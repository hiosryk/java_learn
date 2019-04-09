package com.kitri.exception.runtime;//rumtime exception 들

import java.util.Random;

public class ArithMeticTest {

	public static void main(String[] args) {
		Random random = new Random();
		int x = 30;
//		Runtime exption은 로직으로 처리해야합니다  이걸로하지마세요.
//		try {
//		int z = x / y ;
//		System.out.println(x + " / " + y + " = " + z);   여기서 이미오류가 나버림. 
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌수 없습니다.");
//		}
//		1. 프로그램상 에러가 안나게만들자. 0이 아니라면. 나누고 0이라면 나눌수없다 메세지 출력
		int y = random.nextInt(5);
		if(y !=0) {
		int z = x / y ;
		System.out.println(x + " / " + y + " = " + z);
		} else {System.out.println("0으로 나눌수 없습니다.");
	
//		2. 제일좋은방법.
//		int y = random.nextInt(4)+ 1;
//		int z = x / y ;
//		System.out.println(x + " / " + y + " = " + z);
	
		}

	}
}