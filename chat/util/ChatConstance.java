package com.kitri.chat.util;

public class ChatConstance {
	
	public static final int PORT = 9876; //상수 9

	
//	Protocol 정의
//	client(나) >> server
//	접속				100|대화명
//	모든사람메세지		200|메세지 			//자기만의 쓰레드가생김.그래서 메세지만보내면댐
//	특정사람메세지		250|대상자|메세지
//	쪽지보내기			300|대상자|메세지
//	대화명변경			400|변경할대화명
//	접속종료			900|				//토큰나이저는 |로 구분하고 분리가될거아니야. | 가져가야지요
	public static final int CS_CONNECT = 100; //
	public static final int CS_ALL = 200; //
	public static final int CS_TO = 250; //
	public static final int CS_PAPER = 300; //
	public static final int CS_RENAME = 400; //
	public static final int CS_DISCONNECT = 900; //
	
	
//	server >> client(상대방창) 
//	접속				100|접속자대화명
//	메세지(전체)		200|[보낸사람대화명]메세지	// 보낸사람대화명가지고 할거있나? 없지 하나의토큰만받아서 메세지만 보내면끝나자나 vector다뒤져서
//	메세지(특정)		200|☆보낸사람대화명☆메세지 얘는 vector안에서 위에만가지고 할거야. 두개똑같은데 200 250 나눌필요가없지
//	쪽지보내기			300|보낸사람대화명|메세지 //얘는 구분해야지. 메세지 찍어내야대니까
//	대화명변경			400|변경전대화명|변경할대화명 //A>>B로 변경했습니다 뿌려줘야겟죠. list에서 A찾아서B바꿔야대니까 기능나눠야지.
//	접속종료			900|접종자대화명	//누구누구님이 나갔습니다. 이것도 list에서 빼서 해야지
	public static final int SC_CONNECT = 100; //
	public static final int SC_MESSAGE = 200; //
	public static final int SC_PAPER = 300; //
	public static final int SC_RENAME = 400; //
	public static final int SC_DISCONNECT = 900; //
	
}
