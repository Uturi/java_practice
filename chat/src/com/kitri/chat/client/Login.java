package com.kitri.chat.client;

import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Login extends JFrame implements ActionListener, Runnable, ListSelectionListener {

	Socket socket;
	String myid;
	BufferedReader in;
	OutputStream out;

	JLabel ip;
	JLabel name;
	JTextField ipTf;
	JTextField nameTf;
	JButton cancel;
	JButton ok;

	Chat chat;
	Paper paper;
	Rename rename;

	public Login() {
		super("Login!!");
		initGUI();

		chat = new Chat();
		paper = new Paper();
		rename = new Rename();

//		Loginâ event ���
		nameTf.addActionListener(this);
		cancel.addActionListener(this);
		ok.addActionListener(this);

//		Chatâ event ���
		chat.globalsend.addActionListener(this);
		chat.whomsend.addActionListener(this);
		chat.paper.addActionListener(this);
		chat.rename.addActionListener(this);
		chat.exit.addActionListener(this);
		chat.list.addListSelectionListener(this);

		chat.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				CloseProcess();
			}
		});

//		Paperâ event ���
		paper.answer.addActionListener(this);
		paper.cancel.addActionListener(this);
		paper.ok.addActionListener(this);

//		Renameâ event ���
		rename.cancel.addActionListener(this);
		rename.ok.addActionListener(this);
		rename.newname.addActionListener(this);

	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(244, 243, 242));
			{
				ip = new JLabel();
				getContentPane().add(ip);
				ip.setText("\uc544\uc774\ud53c");
				ip.setBounds(12, 12, 60, 30);
				ip.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				ip.setFocusable(false);
				ip.setRequestFocusEnabled(false);
				ip.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				name = new JLabel();
				getContentPane().add(name);
				name.setText("\ub300\ud654\uba85");
				name.setBounds(12, 47, 60, 30);
				name.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				name.setFocusable(false);
				name.setRequestFocusEnabled(false);
				name.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				ipTf = new JTextField();
				getContentPane().add(ipTf);
				ipTf.setBounds(78, 12, 209, 30);
			}
			{
				nameTf = new JTextField();
				getContentPane().add(nameTf);
				nameTf.setBounds(78, 47, 209, 30);
			}
			{
				ok = new JButton();
				getContentPane().add(ok);
				ok.setText("\ub85c\uadf8\uc778");
				ok.setBounds(83, 83, 61, 32);
				ok.setBackground(new java.awt.Color(237, 236, 233));
				ok.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
			}
			{
				cancel = new JButton();
				getContentPane().add(cancel);
				cancel.setText("\ucde8 \uc18c");
				cancel.setBounds(153, 83, 59, 32);
				cancel.setBackground(new java.awt.Color(237, 236, 233));
				cancel.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
			}
			pack();
			this.setSize(303, 150);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Login inst = new Login();
				inst.setLocationRelativeTo(null);
				inst.setResizable(false);
				inst.setVisible(true);
			}
		});

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String selName = chat.list.getSelectedValue();
		chat.whom.setText(selName);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == nameTf || ob == ok) {
			connectProcess();
		} else if (ob == cancel) {
			System.exit(0);
		} else if (ob == chat.globalsend) {
			globalsendProcess();
		} else if (ob == chat.whomsend) {
			whomsendProcess();
		} else if (ob == paper.ok) {
			paperProcess();
		} else if (ob == paper.answer) {
			paper.card.show(paper.cardp, "ok");
			paper.letter.setText("");
			paper.to.setText(paper.from.getText());
			paper.from.setText(myid);
		} else if (ob == paper.cancel) {
			paper.setVisible(false);
		} else if (ob == chat.paper) {
			String to = chat.whom.getText();
			if (to.isEmpty()) {
				JOptionPane.showMessageDialog(chat, "����ڸ� �����ϼ���.", "����ڿ���", JOptionPane.ERROR_MESSAGE);
				return;
			}

			if (to.equals(myid)) {
				JOptionPane.showMessageDialog(chat, "�ڽſ��� ������???", "����ڿ���", JOptionPane.INFORMATION_MESSAGE);
				paper.letter.setText("");
				return;
			}
			paper.card.show(paper.cardp, "ok");
			paper.to.setText(chat.whom.getText());
			paper.from.setText(myid);
			paper.setVisible(true);
		} else if (ob == chat.rename) {
			rename.oldname.setText(myid);
			rename.setVisible(true);
		} else if (ob == rename.cancel) {
			rename.setVisible(false);
		} else if (ob == rename.newname || ob == rename.ok) {
			renameProcess();
		} else if (ob == chat.exit) {
			CloseProcess();
		}

	}

	private void renameProcess() {
		String newname = rename.newname.getText();
		if (newname.isEmpty()) {
			return;
		}
		myid=newname;
		sendMessage(ChatConstance.CS_RENAME+"|"+newname);
		rename.newname.setText("");
		rename.setVisible(false);
	}

	private void paperProcess() {
		String msg = paper.letter.getText();
		if (msg.isEmpty()) {
			return;
		}

		String to = paper.to.getText();

		sendMessage(ChatConstance.CS_PAPER + "|" + to + "|" + msg);
		viewMessage("[�˸�] " + to + "���� ���� ����");

		paper.from.setText(to);
		paper.letter.setText("");
		
		paper.setVisible(false);
	}

	private void CloseProcess() {
		sendMessage(ChatConstance.CS_DISCONNECT + "|");
	}

//	1.�����, �޼��� get(��ȿ�� �˻� �����, �ڽ�, �޼���)
//	2.������ �޼��� ����
	private void whomsendProcess() {
		String msg = chat.whomsend.getText().trim();
		chat.whomsend.setText("");
		if (msg.isEmpty()) {
			return;
		}

		String to = chat.whom.getText();
		if (to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "����ڸ� �����ϼ���.", "����ڿ���", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "�ڽſ��� �ӼӸ���???", "����ڿ���", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		sendMessage(ChatConstance.CS_TO + "|" + to + "|" + msg);
		viewMessage("��" + to + "��" + msg);
	}

//		1.�޼��� get (��ȿ���˻�)
//		2.������ �޼��� ����.
	private void globalsendProcess() {
		String msg = chat.globalsend.getText().trim();
		chat.globalsend.setText("");
		if (msg.isEmpty()) {
			return;
		}
		sendMessage(ChatConstance.CS_ALL + "|" + msg);

	}

//	1. ip, ��ȭ�� get(��ȿ���˻�(��ȭ�� 3���̻�.))
//	2. 1�� ip�� �̿��ؼ� Socket����.
//	3. IO(BufferedReader, OutputStream)����.
//	4. loginâ �ݰ� , chatâ ����.
//	5. Server�� �޼��� ����.()
//	6. Thread����
	private void connectProcess() {
		String ip = ipTf.getText().trim();
		myid = nameTf.getText().trim();
		if (myid.length() < 3) {
			JOptionPane.showMessageDialog(this, "��ȭ���� 3�� �̻��Դϴ�.", "��ȭ�����", JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			socket = new Socket(ip, ChatConstance.PORT);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = socket.getOutputStream();
			this.setVisible(false);
			chat.setVisible(true);
			sendMessage(ChatConstance.CS_CONNENCT + "|" + myid);
			new Thread(this).start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void sendMessage(String msg) {
		try {
			out.write((msg + "\n").getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		boolean flag = true;
		while (flag) {
			try {
				String msg = in.readLine();
				System.out.println("������ ���� �޼��� : " + msg);// protocol|�޼�������
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());

				switch (protocol) {
				case ChatConstance.SC_CONNENCT: {
//					100|�����ڴ�ȭ��.
					String tmp = st.nextToken();
					viewMessage("[�˸�] " + tmp + " ���� �����Ͽ����ϴ�.");
					chat.listData.add(tmp);
					chat.list.setListData(chat.listData);
				}
					break;

				case ChatConstance.SC_MESSAGE: {
//					200|[������]�ȳ��ϼ���
					String tmp = st.nextToken();// [������]�ȳ��ϼ���
					viewMessage(tmp);
//					chat.area.setCaretPosition(chat.area.getDocument().getLength());
				}
					break;

				case ChatConstance.SC_PAPER: {
					
					String from = st.nextToken();
					String tmp = st.nextToken();

					paper.card.show(paper.cardp, "answer"); 
					paper.from.setText(from);
					paper.to.setText(myid);
					paper.letter.setText(tmp);
					paper.setVisible(true);
				}
					break;
				case ChatConstance.SC_RENAME: {
					String oldname = st.nextToken();
					String newname = st.nextToken();
					chat.listData.setElementAt(newname, chat.listData.indexOf(oldname));
					chat.list.setListData(chat.listData);
					viewMessage("[�˸�] " + oldname + " ���� "+newname+"���� ��ȭ���� �مf���ϴ�.");
				}
					break;
				case ChatConstance.SC_DISCONNECT: {
//					900|�����»��
					String tmp = st.nextToken();// �����»��
					if (!tmp.equals(myid)) {
						viewMessage("[�˸�] " + tmp + "���� ������ �����Ͽ����ϴ�.");
						chat.listData.remove(tmp);
						chat.list.setListData(chat.listData);
					} else {
						flag = false;
						in.close();
						out.close();
						socket.close();
						System.out.println("�� ������");
						System.exit(0);
					}
				}
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void viewMessage(String msg) {
		chat.area.append(msg + "\n");
		chat.area.setCaretPosition(chat.area.getDocument().getLength());
	}

}
