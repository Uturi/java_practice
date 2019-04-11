package com.kitri.chat.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.StringTokenizer;
import java.util.Vector;

import com.kitri.chat.client.Chat;
import com.kitri.chat.client.ChatConstance;

public class ChatServer implements Runnable {

	ServerSocket ss;
	Vector<ChatClient> list = new Vector<ChatServer.ChatClient>();

	public ChatServer() {
		try {
			ss = new ServerSocket(ChatConstance.PORT);
			System.out.println("클라이언트 접속 대기중..........");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {// 접속처리
		while (true) {
			try {
				Socket socket = ss.accept();
				System.out.println("클라이언트 접속 성공 :: " + socket);
				new ChatClient(socket).start();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	class ChatClient extends Thread {

		String name;
		BufferedReader in;
		OutputStream out;
		Socket socket;

		public ChatClient(Socket socket) {
			try {
				this.socket = socket;
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = socket.getOutputStream();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {// 메세지처리
			boolean flag = true;
			while (flag) {
				try {
					String msg = in.readLine();
					System.out.println("클라이언트가 보낸 메세지 : " + msg);// protocol|메세지형식
					StringTokenizer st = new StringTokenizer(msg, "|");
					int protocol = Integer.parseInt(st.nextToken());
					switch (protocol) {
					case ChatConstance.CS_CONNENCT: {
//						100|이종영
						name = st.nextToken();// 이종영
//						int size = list.size();
//						for (int i = 0; i < size; i++) {
//							ChatClient cc = list.get(i);							
//						}
						// 위에거랑 똑같은내용임 size로 하는거 jdk후반부에 생긴거
						// 향상된 for문
						multicast(ChatConstance.SC_CONNENCT + "|" + name);
					}
						list.add(this);
						for (ChatClient cc : list) {
							unicast(ChatConstance.SC_CONNENCT + "|" + cc.name);
						}
						break;
					case ChatConstance.CS_ALL: {
//						200|안녕하세요
						String tmp = st.nextToken();// 안녕하세요

						multicast(ChatConstance.SC_MESSAGE + "|[" + name + "]" + tmp);

					}
						break;
					case ChatConstance.CS_TO: {
//						250|홍길동|안녕??
						String to = st.nextToken();// 홍길동
						String tmp = st.nextToken();// 안녕???
						for (ChatClient cc : list) {
							if (cc.name.equals(to)) {
								cc.unicast(ChatConstance.SC_MESSAGE + "|☆" + name + "☆" + tmp);
								break;
							}
						}
					}
						break;
					case ChatConstance.CS_PAPER: {
//						300|홍길동|안녕쪽지
						String to = st.nextToken();
						String tmp = st.nextToken();
						for (ChatClient cc : list) {
							if (cc.name.equals(to)) {
									cc.unicast(ChatConstance.SC_PAPER + "|" + name + "|" + tmp);
							}
						}
					}
						break;
					case ChatConstance.CS_RENAME: {
//						400|홍길동|길동홍
						String newname = st.nextToken();
						multicast(ChatConstance.SC_RENAME + "|" + name+"|"+newname);
						name = newname;
					}
						break;
					case ChatConstance.CS_DISCONNECT: {
//						900|
						multicast(ChatConstance.SC_DISCONNECT + "|" + name);// 누가 나갓다고 뿌림
						list.remove(this);// 나 지움 리스트에서
						flag = false;// 스레드종료
						in.close();
						out.close();
						socket.close();
					}
						break;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		private void multicast(String msg) {
			for (ChatClient cc : list) {
				cc.unicast(msg);
			}
		}

		private void unicast(String msg) {
			try {
				out.write((msg + "\n").getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
//		ChatServer cs = new ChatServer();
//		Thread t = new Thread();
//		t.start();
		new Thread(new ChatServer()).start();

	}

}
