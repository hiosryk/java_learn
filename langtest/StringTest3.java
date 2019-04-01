package com.kitri.lang;

public class StringTest3 {

	public static void main(String[] args) {
		String str = "hello java !!!!";
		char c = str.charAt(4);
		System.out.println("c==" + c);

//		for (int i=0;i<len;i++)  예를들어 이럴때 쓴다. 야구게임할떄 4자리든 6자리든 다 받아올수잇겟다. 상당히많이쓴다.
//		my[i] = myNum.chatAt(i);
//		my[0] = str.charAt(0); //'1'
	
//				예)2
		str= "123";
		int x=str.charAt(0) -48;
		System.out.println("x=="+x);
		

//	숫자가아닌거를 입력했을때 		
		str= "1a3";
		int len=str.length();
		System.out.println("length=="+len);
		System.out.println(str + "은" ); //한번에 ? ㄴㄴ 제일앞에가 숫자냐 두번째가 숫자냐 세번쨰가 숫자냐. 
		String result = ("숫자입니다.");
		for(int i = 0;i<len;i++) {
			int num = str.charAt(i) - 48;
			if (num < 0 || num > 9 ) {
				result = "숫자가 아닙니다.";
				break;
			}
		}
		System.out.println(str + "은" + result);
		
		String str1 = "hello";
		String str2 = "java";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2)); //잘안씀
		
		str = "hello java !!!";
		if(str.startsWith("he"))
			System.out.println(str + "은 he로 시작한다.	");
		
		if(str.endsWith("!!"))
			System.out.println(str + "은 !!로 끝난다.	");
	
		String s1 = "jAva";
		String s2 = "JavA";
		System.out.println("s1.toUpperCase() == "+ s1.toUpperCase());
		System.out.println("s2.toLowerCase() == "+ s2.toLowerCase());
		if(s1.equals(s2))
			System.out.println(s1 + "과" + s2 + "는 같은문자열이다.");
		else
			System.out.println(s1 + "과" + s2 + "는 다른문자열이다.");
		
		if(s1.toUpperCase().equals(s2.toUpperCase()))
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 같은문자열이다.");
		else
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 다른문자열이다.");
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 같은문자열이다.");
		else
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 다른문자열이다.");
	
	}

}
