package com.kitri.io;

import java.io.*;

public class FileTest {
	
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
				try {
			File infile = new File("f:\\iotest\\hello.txt");//in out io 도 네트웤도 db도 연결했으면 끊어라가 열었으면 닫아라가 필요하다.
			in = new FileInputStream(infile);
			long length = infile.length();
			byte b[] = new byte[(int) length];
			int x = in.read(b);
			String str = new String(b,0,x);
			System.out.println(x + "byte read!!!");
			System.out.println(str);

			File outfile = new File("f:\\iotest\\hello_copy.txt"); //복사 
			//쓰기
			out = new FileOutputStream(outfile);
			out.write(b);//써라.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(in != null) //network 이든 DB는 계속 나올거다. close 할떄.  널포인트 익셉션. 
				in.close();
				if(out !=null)
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
//내일 버퍼드리드.