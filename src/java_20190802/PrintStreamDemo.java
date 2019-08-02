package java_20190802;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		
		try {
			
			ps = System.out; //모니터로 출력
			ps.println("Hello World!!!");
			
			
			fis = new FileInputStream("C:\\dev\\test\\java-pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\dev\\test\\java-pdf-clone.zip");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos,true);//true => auto flush
			
			
			int readByte = 0 ;
			while((readByte = bis.read()) != -1) {
				ps.write(readByte);
			}
			
			//bos.flush();
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis !=null) fis.close();
				if(fos !=null) fos.close();
				if(bis !=null) bis.close();
				if(ps !=null) ps.close();
				if(bos !=null) bos.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
