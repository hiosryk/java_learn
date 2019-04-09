package com.kitri.io;

import java.io.*;

public class FileTest {
	
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
				try {
			File infile = new File("f:\\iotest\\hello.txt");//in out io �� ��Ʈ�p�� db�� ���������� ����� �������� �ݾƶ� �ʿ��ϴ�.
			in = new FileInputStream(infile);
			long length = infile.length();
			byte b[] = new byte[(int) length];
			int x = in.read(b);
			String str = new String(b,0,x);
			System.out.println(x + "byte read!!!");
			System.out.println(str);

			File outfile = new File("f:\\iotest\\hello_copy.txt"); //���� 
			//����
			out = new FileOutputStream(outfile);
			out.write(b);//���.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(in != null) //network �̵� DB�� ��� ���ðŴ�. close �ҋ�.  ������Ʈ �ͼ���. 
				in.close();
				if(out !=null)
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
//���� ���۵帮��.