package java_20190805;


import java.util.Scanner;

import bonus.Utility;

public class APIExanmCaptchaDemo {
	public static String console(String msg) {
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
		
	}
	public static void main(String[] args) {
		String id ="Q35Vn7t8Afs9PZaK9ClT";
		String secret = "7Z55II2om8";
		String key = Utility.getCaptchaKey(id,secret);
		
		boolean isSuccess = Utility.isCaptchaImage(id,secret,key);
		if(isSuccess) {
		String value = console("이미지결과값을 입력하세요>");
			boolean result = Utility.getCaptchaResult(id, secret, key, value);
			if(result) {
			System.out.println("성공");
			}else { 
				System.out.println("실패");
			}
		}else {
			System.out.println("다시 확인해");
			
		}
		
	}

}
