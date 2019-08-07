package java_20190807.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {
	private int port;

	public EchoServer2(int port) {
		this.port = port;

	}

	public void run() {
		ServerSocket serverSocket = null;
		

		try {

			serverSocket = new ServerSocket(port);

		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			System.out.println("클라이언트 접속!");
			try {

				Socket socket = serverSocket.accept();

				InetAddress i = socket.getInetAddress();
				String ip = i.getHostAddress();
				System.out.println("클라이언트가 접속! IP : " + ip);

				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				System.out.println(readLine);

				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.flush();

			} catch (IOException e) {
				e.printStackTrace();

			}
		}

	}

	public static void main(String[] args) {
		new EchoServer2(3000).run();

	}

}
