package com.kitri.io;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) {
		// �����а� ����.
		// ������ ����Ʈ���� ������ ĳ���ʹ���
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
		} finally { //������ �����ִ°��� �ݾ������ ��Ĥ���. �޸𸮻� �ö󸸰����� �����̾ȴ���. 
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