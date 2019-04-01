package com.kitri.lang;

public class StringBufferTest1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("hello "); //문자열조작. 공간이 넓어야 좋다. 여유공간이 항상 16개 있다.
		System.out.println("1.sb1==" + sb1);
		int cap = sb1.capacity();							
																//string buffer는 공간하나에서 뚜닥뚜닥할수있다.
		System.out.println("초기크기 :  " + cap + "\t문자열 수 : " + sb1.length());
		sb1.append("java");
		System.out.println("2.sb1==" + sb1); 
		
		sb1.append(" !!!!!");
		System.out.println("3.sb1==" + sb1); 
		cap = sb1.capacity();							
		System.out.println("크기 : " + cap + "\t문자열 수 : " + sb1.length()); 
		
		sb1.append(" !!!!!!"); //여유공간 넘어섯을때. 계속 늘어난다.
		System.out.println("4.sb1==" + sb1); 
		cap = sb1.capacity();							
		System.out.println("크기 : " + cap + "\t문자열 수 : " + sb1.length()); 
		
		sb1.insert(10, "@@@"); //넣어.
		System.out.println("5. sb1 == " + sb1); 
		
		sb1.delete(10, 12);		//부터 전까지. 지워.
		System.out.println("6. sb1 == " + sb1); 
		
		sb1.deleteCharAt(10);		//여기 하나만 지워.
		System.out.println("7. sb1 == " + sb1); 
		
		sb1.replace(6, 10, "자바"); //부터 전까지 바꿔.
		System.out.println("8. sb1 == " + sb1); 
		
		sb1.reverse(); //영문 한글 다해줌
		System.out.println("8. sb1 == " + sb1); 
		sb1.reverse(); //원래대로
		
		sb1.setCharAt(9, '@'); //몇번째잇는 하나만 바꿔라.
		System.out.println("10. sb1 == " + sb1); 
		
		// 다하고나서 최종적으로 string class를 만들어주면댄다.
		String s1 = new String(sb1); //둘중하나쓰면댄다. 보통 아래꺼씀.
		String s2 = sb1.toString(); 
		
////////////////////////////////////////		예제
		String str = "hello 자바 !!!";
//		String findStr = "자바";
		String findStr = "오라클";
		String replaceStr = "java";
		
		int start = str.indexOf(findStr);
		System.out.println(start);
		if (start != -1) {
				StringBuffer sb = new StringBuffer(str);
				int end = start + findStr.length();
				sb.replace(start, end, replaceStr);
				System.out.println(sb.toString());
		}	else {
			System.out.println(findStr + "은 없습니다.");
		}
		
		StringBuffer sb2 = new StringBuffer( "hello 자바!!!"	 ); 
		int cap2 = sb2.capacity();
		
		
		
//		hello java !!!
//		오라클은 없습니다.
		
		
								//*외) 지난시간 했던거. 불변.  
		String s = "hello "; //string class는 조작이안대. 더하면 새로운 문자가 만들어졋어. 메모리낭비
		s.concat("java");
		System.out.println(s);
	}
}
