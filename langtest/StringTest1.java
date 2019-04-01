package com.kitri.lang;

public class StringTest1 {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
//리터럴 방식과 뉴방식은 만들어지는 방식이다르다.
		if( s1 == s2 )
			System.out.println(" s1 s2는 주소값이 같다.");//o 문자열 저장소안에 "java"없네 만들자. == 문자열 저장소안에 있네?? 주소값참조.
		if( s1 == s3 )
			System.out.println(" s1 s3는 주소값이 같다.");//x 안드로메다와 지구의 주소값비교 
		if( s1 == s4 )
			System.out.println(" s1 s4는 주소값이 같다.");//x
		if( s2 == s3 )
			System.out.println(" s2 s3는 주소값이 같다.");//x
		if( s2 == s4 )
			System.out.println(" s2 s4는 주소값이 같다.");//x
		if( s3 == s4 )
			System.out.println(" s3 s4는 주소값이 같다."); //x 따로따로 붕어빵 만듬. 힙저장소에.

		System.out.println("-----------------------------------------------------------------------");
		
		if( s1.equals(s2) )
			System.out.println(" s1 s2는 문자열값이 같다.");//o  문자열이값이같다. string class가 equals라는 메소드를 오버라이드해서
		if( s1.equals(s3) )
			System.out.println(" s1 s3는 문자열값이 같다.");//o 
		if( s1.equals(s4) )
			System.out.println(" s1 s4는 문자열값이 같다.");//o
		if( s2.equals(s3) )
			System.out.println(" s2 s3는 문자열값이 같다.");//o
		if( s2.equals(s4) )
			System.out.println(" s2 s4는 문자열값이 같다.");//o
		if( s3.equals(s4) )
			System.out.println(" s3 s4는 문자열값이 같다."); //o
	
	}
	
}
//내일볼거.
//문자열을 변화시키지못함. 만들어진것가지고 합칠수는잇어도 변화는 못시켜. hello +java
//stringbuffer sb = new stringbuffer("hello);
//sysout (sb.append(" java"));					= hello java
//sysout (sb);                                      = hello java

//가비지컬렉터가 언제발생댈지 아무도모른다.
//호출하덜라도 바로실행대지는않는다.
//예전에 램작앗던시절 new 만번돌리면 메모리 넘어섯다 오류나옴.