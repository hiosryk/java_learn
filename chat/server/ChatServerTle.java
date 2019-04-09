//package com.kitri.chat.server;
//
//import java.io.BufferedReader;
//import java.io.OutputStream;
//import java.util.Vector;
//
//public class ChatServer implements Runnable {//2
//
//	Vector<ChatClient> list = new Vector<ChatServer.ChatClient>();  //6
//
//	public ChatServer() {
//
//	}
//
//	@Override//4
//	public void run() {
//
//	}
//
//	class ChatClient extends Thread {//3
//
//		String name; //7 ¥Î»≠∏Ì
//		BufferedReader in;
//		OutputStream out;
//		
//		@Override//5
//		public void run() {
//
//		}
//	}
//
//	public static void main(String[] args) {//1
//
//	}
//
//}