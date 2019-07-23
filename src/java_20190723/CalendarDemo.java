
package java_20190723;

import java.io.IOException;//ctr + shift +o
//impoty java.lang.String; 자동으로 들어있음
//impoty java.lang.*;
import java.io.BufferedReader;//ctr + shift +o
import java.io.InputStreamReader;//ctr + shift +o


public class CalendarDemo {
	public static String console() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public static void main(String[] args) throws IOException{
		Calendar c = new Calendar();
		while(true) {
		System.out.print("날짜를 입렵하세요>");
		String readLine = console();
		if(readLine.equals("exit")) break;
		//split 메서드는 공백으로 문자열을 분리시 켜배열로 반환하다.
		
		String[] data = readLine.split(" ");
		int datalength = data.length;
		if(datalength == 1 ) {
			//String syear = data[0];
			//문자열을 int로 변환하는 메서드
			int year = Integer.parseInt(data[0]);
		   // System.out.printf("입력한 값 : %d%n", year);
			c.print(year);
		
		}else if(datalength == 2) {
			//String syear = data[0];
			//String smonth = data[1];
			int year = Integer.parseInt(data[0]);
			int month = Integer.parseInt(data[1]);
			//System.out.printf("입력한 값 : %d,%d%n", year,month);
			c.print(year,month);

		}else if(datalength == 3) {
			//String syear = data[0];
			//String smonth = data[1];
			//String sday = data[2];
			int year = Integer.parseInt(data[0]);
			int month = Integer.parseInt(data[1]);
			int day = Integer.parseInt(data[2]);
			c.print(year,month,day);

			//System.out.printf("입력한 값 : %d,%d,%d%n", year,month,day);		
		}else {
			
		}
		//System.out.printf("입력한 값 : %s%n", readLine);	
		}
		
	}

}