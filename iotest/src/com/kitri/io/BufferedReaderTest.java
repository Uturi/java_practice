package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader fin = null;
		FileWriter fw = null;
		try {
//		InputStream is = System.in;
//		Reader r = new InputStreamReader(is); 
//		BufferedReader in = new BufferedReader(r); 		
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("파일이름 : ");
			String infile = in.readLine(); //엔터를 기준. 엔터전까지만 읽음
//			System.out.println("infile == " + infile);
			
			System.out.println("복사할 파일이름 : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));
			
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
			String str = null;
			while((str = fin.readLine()) != null) {
				System.out.println(str);
				fw.write(str+"\r\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null)
					fw.close();
				if(fin != null)
					fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
