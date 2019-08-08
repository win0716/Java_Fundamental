package java_20190808.multicast.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class MulticastServerThread implements Runnable {

	private Socket socket;
	private ArrayList<MulticastServerThread> list;
	BufferedWriter bw;

	public MulticastServerThread(Socket socket, ArrayList<MulticastServerThread> list) {
		this.socket = socket;

		this.list = list;
	}

	public MulticastServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;

	}

	@Override
	public void run() {

		BufferedReader br = null;

		// TODO Auto-generated method stub
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			boolean isStop = false;

			while (!isStop) {
				// 정상메세지 => id : message
				// 종료메세지 => shutdown
				String readLine = br.readLine();
				System.out.println(readLine);
				if (readLine.equals("shutdown")) {
					bw.write("이만갑니다\n");
					bw.flush();
					isStop = true;
				} else {
					broadCast(readLine + "\n");
				}

			}
			list.remove(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("비정삭적으로 종료하셨습니다.");
			list.remove(this);
		} finally {
			try {
				if (bw != null)
					bw.close();

				if (br != null)
					br.close();
			} catch (IOException e2) {
				// TODO Auto-generated catch block

			}
		}

	}// end run

	public void broadCast(String msg) throws IOException {
		for (MulticastServerThread mst : list) {
			mst.sendMessage(msg);
		}
	}

	private void sendMessage(String msg) throws IOException {
		bw.write(msg);
		bw.flush();

	}

}
