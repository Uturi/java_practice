package com.kitri.io;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;


public class Notepad extends JFrame implements ActionListener{
	private JPanel contentPane;
	FileDialog fs = new FileDialog(new Dialog(this),"저장",FileDialog.SAVE);
	FileDialog fl = new FileDialog(new Dialog(this),"열기",FileDialog.LOAD);
	
	JMenuBar mb = new JMenuBar();
	
	JTextArea editor = new JTextArea();
	
	JMenu file = new JMenu("파일");
	
	JScrollPane sp = new JScrollPane();

	JMenuItem open = new JMenuItem("열기");
	JMenuItem save = new JMenuItem("저장");
	JMenuItem exit = new JMenuItem("종료");
	
	JMenuItem help = new JMenuItem("도움말");
	
	String dirs = fs.getDirectory()+fs.getFile();
	String dirl = fl.getDirectory()+fl.getFile();
	
	
	public Notepad() {
		setTitle("메모장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		
		setJMenuBar(mb);
		
			
		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);

		
		mb.add(file);
		mb.add(help);
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(5, 5));
		setContentPane(contentPane);
		
		contentPane.add(editor, "Center");
		sp.setViewportView(editor);
		getContentPane().add(sp);
	
		setVisible(true);
		
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		help.addActionListener(this);
				
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		
		if(ob==exit) {
			System.exit(0);
			
		} else if(ob==open) {
			JFileChooser jfc = new JFileChooser();
			jfc.setCurrentDirectory(new File("e:\\iotest"));
			jfc.showOpenDialog(this);
			
			BufferedReader fr = null;
			File file = jfc.getSelectedFile();
			if(file != null) {
				String infile = file.getPath();				
			try {
				fr = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
				String str = null;
				while((str = fr.readLine()) != null) {
					editor.append(str+"\n");
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(fr != null)
						fr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
			
		} else if(ob==save) {
			JFileChooser jfc = new JFileChooser();
			jfc.setCurrentDirectory(new File("e:\\iotest"));
			jfc.showOpenDialog(this);
			
			String data =editor.getText();
			FileWriter fw = null;
			
			File file = jfc.getSelectedFile();
			if(file != null) {
				String outfile = file.getPath();
			try {
				fw = new FileWriter(new File(outfile));
				fw.write(data.replace("\n", "\r\n)"));
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(fw != null)
						fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
			
		} else if(ob==help) {
		
			
		}
	}//method end

	public static void main(String[] args) {
		new Notepad();
	}
}