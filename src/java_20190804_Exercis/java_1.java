package java_20190804_Exercis;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class java_1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:");
			fos = new FileOutputStream("c:");
			
			int readByteCount = 0;
			byte[] b = new byte[1024*30];
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(b)) != -1) {
				fos.write(b,0,readByteCount);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("경과시간 : " + (end - start));;
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
