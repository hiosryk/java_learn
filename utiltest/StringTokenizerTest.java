package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "hello java !!!";
		StringTokenizer st = new StringTokenizer(str); //자를준비가 끝났다.  (str, "J") 넣으면 j를기준으로 자른거.
		int cnt = st.countTokens();
		System.out.println("토큰수 : " + cnt); //아무것도 지정안하면 공백을 가지고한다.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());           //hello 찍고 java찍고 !!!찍고 
		}
		
		str = "TO|안효인|안녕하세요 오늘 머해요???";
		StringTokenizer st2 = new StringTokenizer(str,"|"); 
		String protocol = st2.nextToken();
		String to =st2.nextToken();
		String msg =st2.nextToken();
		System.out.println("가능 : " + protocol); //아무것도 지정안하면 공백을 가지고한다.
		System.out.println("누구에게 : " + to); //아무것도 지정안하면 공백을 가지고한다.
		System.out.println("보내는 메세지 : " + msg); //아무것도 지정안하면 공백을 가지고한다.

		
		///////uuid
		System.out.println(UUID.randomUUID());
		
	//내일하고 모레는 재밋을거다. 창만들거야 awt 할거임. 오전 이론 수업 . 이걸바탕으로 프로젝트를 시작할거야.	
	}
}
