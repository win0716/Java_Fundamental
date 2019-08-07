package java_20190807;

import java.io.IOException;
import java.net.ServerSocket;

public class SocketServerSanDemo {
	public static void main(String[] args) {
		ServerSocket serverSocket =null;
		
		for(int i=1; i<65356; i++) {
			try {
			serverSocket = new ServerSocket(i);
			//System.out.println(i+"번호을 사용할 수 있습니다.");
			}catch(IOException e) {
				System.out.println(i+"번호을 사용할 수 없습니다.");
			}
		}
	}

}
