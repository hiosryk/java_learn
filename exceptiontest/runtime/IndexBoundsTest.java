package com.kitri.exception.runtime;//runtime exception 들.

public class IndexBoundsTest {

		public static void main(String[] args) {
			String s[] = {"1","2","3","4"};
//			for (int i = 0; i <= 4; i++) { //에러
//				System.out.println(s[i]);
//			}
			int len = s.length; //배열의 길이를 length 로 쓰는게 좋은이유 
			for (int i = 0; i < len; i++) {
				System.out.println(s[i]);
			}
			
			String str = "hello";
//			for(int i=0;i<5;i++) {
//				System.out.println(str.charAt(i));
//			}
			len = str.length();
			for (int i = 0; i < len; i++) {
				System.out.println(str.charAt(i));
			}
		}
}
