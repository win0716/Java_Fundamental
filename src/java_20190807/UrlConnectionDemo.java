package java_20190807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://sports.news.naver.com/wbaseball/index.nhn");
		URLConnection urlCon = url.openConnection();
		
		
		String cacheControl = urlCon.getHeaderField("cache-control");
		System.out.println("cacheControl : " + cacheControl );
		
		String contentType = urlCon.getHeaderField("content-type");
		System.out.println("contentType : " + contentType );
		
		String date = urlCon.getHeaderField("date");
		System.out.println("date : " + date);
		
		InputStream is = urlCon.getInputStream();
		
	
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
		
	}

	
}
