package com.kitri.io;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) {
		// 파일읽고 쓰고.
		// 어제는 바이트단위 오늘은 캐릭터단위
		FileReader fr = null;
		FileWriter fw = null;
		try {
			File infile = new File("f:\\iotest\\hello.txt");
			fr = new FileReader(infile);
			long length = infile.length();
			char c[] = new char[(int) length];
			int x = fr.read(c);
			System.out.println(x + "characters read!!!");
			String str = new String(c);
			System.out.println(c);

			File outfile = new File("f:\\iotest\\hello_copy2.txt");
			fw = new FileWriter(outfile);
			fw.write(str);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //무조건 열려있는것을 닫아줘야지 대ㅔㄴ다. 메모리상에 올라만가잇지 저장이안댄다. 
			try {
				if (fw != null)
					fw.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
