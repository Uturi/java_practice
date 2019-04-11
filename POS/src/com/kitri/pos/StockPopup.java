package com.kitri.pos;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;

public class StockPopup extends JFrame {

	JPanel contentPane;
	JTextField ChgCountTf;
	JTextField PcodeTf;
	JTextField IndateTf;
	JTextField PcntTf;
	JTextField SearchCode;
	JTextField SearchName;
	JTextField SearchDate;
	CardLayout card = new CardLayout();
	JPanel 		pSearch = new JPanel();
	JLabel searchCodeL;
	JLabel searchNameL;
	JLabel searchDateL;
	JButton searchOk;
	JButton searchCancel;
	JButton sCbtn;
	JButton sNbtn;
	JButton sDbtn;
	JLabel search;
	JPanel pIn;
	JLabel pcodeL;
	JLabel indateL;
	JLabel pcntL;
	JLabel pinResult;
	JLabel pcodeResult;
	JLabel indateResult;
	JLabel pcntResult;
	JButton pcodeInput;
	JButton indateInput;
	JButton pcntInput;
	JButton inOk;
	JButton inCancel;
	JPanel pChg;
	JLabel selecItem;
	JLabel chgCountL;
	JButton chgOk;
	JButton chgCancel;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					StockPopup frame = new StockPopup();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public StockPopup() {

		setTitle("\uC7AC\uACE0 \uAD00\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(card);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		
		pSearch.setLayout(null);
		
		searchCodeL = new JLabel("\uC870\uD68C\uD560 \uC0C1\uD488 \uCF54\uB4DC");
		searchCodeL.setBackground(new Color(0, 250, 154));
		searchCodeL.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		searchCodeL.setHorizontalAlignment(SwingConstants.CENTER);
		searchCodeL.setBounds(12, 10, 190, 80);
		searchCodeL.setOpaque(true);
		pSearch.add(searchCodeL);
		
		searchNameL = new JLabel("\uC870\uD68C\uD560 \uC0C1\uD488\uBA85");
		searchNameL.setBackground(new Color(0, 250, 154));
		searchNameL.setHorizontalAlignment(SwingConstants.CENTER);
		searchNameL.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		searchNameL.setBounds(12, 100, 190, 80);
		searchNameL.setOpaque(true);
		pSearch.add(searchNameL);
		
		searchDateL = new JLabel("\uC870\uD68C\uD560 \uC785\uACE0\uB0A0\uC9DC");
		searchDateL.setBackground(new Color(0, 250, 154));
		searchDateL.setHorizontalAlignment(SwingConstants.CENTER);
		searchDateL.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		searchDateL.setBounds(12, 190, 190, 80);
		searchDateL.setOpaque(true);
		pSearch.add(searchDateL);
		
		SearchCode = new JTextField();
		SearchCode.setBounds(214, 10, 293, 80);
		pSearch.add(SearchCode);
		SearchCode.setColumns(10);
		
		SearchName = new JTextField();
		SearchName.setColumns(10);
		SearchName.setBounds(214, 100, 293, 80);
		pSearch.add(SearchName);
		
		SearchDate = new JTextField();
		SearchDate.setColumns(10);
		SearchDate.setBounds(214, 190, 293, 80);
		pSearch.add(SearchDate);
		
		searchOk = new JButton("\uC870\uD68C\uD558\uAE30");
		searchOk.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		searchOk.setBounds(188, 380, 131, 63);
		pSearch.add(searchOk);
		
		searchCancel = new JButton("\uCDE8 \uC18C");
		searchCancel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		searchCancel.setBounds(343, 380, 131, 63);
		pSearch.add(searchCancel);
		
		sCbtn = new JButton("\uC0C1\uD488\uCF54\uB4DC\uB85C \uC870\uD68C");
		sCbtn.setBounds(519, 10, 153, 80);
		pSearch.add(sCbtn);
		
		sNbtn = new JButton("\uC0C1\uD488\uBA85\uC73C\uB85C \uC870\uD68C");
		sNbtn.setBounds(519, 100, 153, 80);
		pSearch.add(sNbtn);
		
		sDbtn = new JButton("\uC785\uACE0\uC77C\uB85C \uC870\uD68C");
		sDbtn.setBounds(519, 190, 153, 80);
		pSearch.add(sDbtn);
		
		search = new JLabel("\uAC80\uC0C9\uD560 \uB0B4\uC6A9");
		search.setBackground(new Color(64, 224, 208));
		search.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		search.setHorizontalAlignment(SwingConstants.CENTER);
		search.setBounds(145, 280, 362, 63);
		search.setOpaque(true);
		pSearch.add(search);
		
		pIn = new JPanel();
		contentPane.add(pIn, "pIn");
		pIn.setLayout(null);
		
		pcodeL = new JLabel("\uC0C1\uD488 \uCF54\uB4DC");
		pcodeL.setBackground(new Color(255, 165, 0));
		pcodeL.setHorizontalAlignment(SwingConstants.CENTER);
		pcodeL.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pcodeL.setBounds(12, 10, 120, 60);
		pcodeL.setOpaque(true);
		pIn.add(pcodeL);
		
		indateL = new JLabel("\uC785\uACE0\uC77C\uC790");
		indateL.setBackground(new Color(255, 165, 0));
		indateL.setHorizontalAlignment(SwingConstants.CENTER);
		indateL.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		indateL.setBounds(12, 80, 120, 60);
		indateL.setOpaque(true);
		pIn.add(indateL);
		
		pcntL = new JLabel("\uC218\uB7C9");
		pcntL.setBackground(new Color(255, 165, 0));
		pcntL.setHorizontalAlignment(SwingConstants.CENTER);
		pcntL.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pcntL.setBounds(12, 150, 120, 60);
		pcntL.setOpaque(true);
		pIn.add(pcntL);
		
		PcodeTf = new JTextField();
		PcodeTf.setHorizontalAlignment(SwingConstants.CENTER);
		PcodeTf.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		PcodeTf.setBounds(144, 10, 230, 60);
		pIn.add(PcodeTf);
		PcodeTf.setColumns(10);
		
		IndateTf = new JTextField();
		IndateTf.setHorizontalAlignment(SwingConstants.CENTER);
		IndateTf.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		IndateTf.setColumns(10);
		IndateTf.setBounds(144, 80, 230, 60);
		pIn.add(IndateTf);
		
		PcntTf = new JTextField();
		PcntTf.setHorizontalAlignment(SwingConstants.CENTER);
		PcntTf.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		PcntTf.setColumns(10);
		PcntTf.setBounds(144, 150, 230, 60);
		pIn.add(PcntTf);
		
		pinResult = new JLabel("\uC785\uB825\uD55C \uCF54\uB4DC\uC758 \uC0C1\uD488\uC815\uBCF4");
		pinResult.setBackground(Color.ORANGE);
		pinResult.setHorizontalAlignment(SwingConstants.CENTER);
		pinResult.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pinResult.setBounds(12, 244, 660, 94);
		pinResult.setOpaque(true);
		pIn.add(pinResult);
		
		pcodeResult = new JLabel("\uC785\uB825\uB41C \uC0C1\uD488\uCF54\uB4DC");
		pcodeResult.setBackground(Color.LIGHT_GRAY);
		pcodeResult.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pcodeResult.setHorizontalAlignment(SwingConstants.CENTER);
		pcodeResult.setBounds(495, 10, 177, 60);
		pcodeResult.setOpaque(true);
		pIn.add(pcodeResult);
		
		indateResult = new JLabel("\uC785\uB825\uB41C \uC785\uACE0\uC77C\uC790");
		indateResult.setBackground(Color.LIGHT_GRAY);
		indateResult.setHorizontalAlignment(SwingConstants.CENTER);
		indateResult.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		indateResult.setBounds(495, 80, 177, 60);
		indateResult.setOpaque(true);
		pIn.add(indateResult);
		
		pcntResult = new JLabel("\uC785\uB825\uB41C \uC218\uB7C9");
		pcntResult.setBackground(Color.LIGHT_GRAY);
		pcntResult.setHorizontalAlignment(SwingConstants.CENTER);
		pcntResult.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pcntResult.setBounds(495, 150, 177, 60);
		pcntResult.setOpaque(true);
		pIn.add(pcntResult);
		
		pcodeInput = new JButton("\uC785\uB825");
		pcodeInput.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pcodeInput.setBounds(386, 10, 97, 60);
		pIn.add(pcodeInput);
		
		indateInput = new JButton("\uC785\uB825");
		indateInput.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		indateInput.setBounds(386, 80, 97, 60);
		pIn.add(indateInput);
		
		pcntInput = new JButton("\uC785\uB825");
		pcntInput.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pcntInput.setBounds(386, 150, 97, 60);
		pIn.add(pcntInput);
		
		inOk = new JButton("\uB4F1 \uB85D");
		inOk.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		inOk.setBounds(210, 373, 120, 60);
		pIn.add(inOk);
		
		inCancel = new JButton("\uCDE8 \uC18C");
		inCancel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		inCancel.setBounds(342, 373, 120, 60);
		pIn.add(inCancel);
		
		pChg = new JPanel();
		contentPane.add(pChg, "pChg");
		pChg.setLayout(null);
		
		selecItem = new JLabel("\uC120\uD0DD\uD55C \uD589\uC758 \uC0C1\uD488\uC815\uBCF4");
		selecItem.setBackground(new Color(221, 160, 221));
		selecItem.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		selecItem.setBounds(12, 48, 660, 100);
		selecItem.setOpaque(true);
		pChg.add(selecItem);
		
		chgCountL = new JLabel("\uC218\uC815\uD560 \uC218\uB7C9");
		chgCountL.setBackground(new Color(221, 160, 221));
		chgCountL.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		chgCountL.setHorizontalAlignment(SwingConstants.CENTER);
		chgCountL.setBounds(115, 206, 140, 60);
		chgCountL.setOpaque(true);
		pChg.add(chgCountL);
		
		ChgCountTf = new JTextField();
		ChgCountTf.setHorizontalAlignment(SwingConstants.CENTER);
		ChgCountTf.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		ChgCountTf.setBounds(267, 206, 300, 60);
		pChg.add(ChgCountTf);
		ChgCountTf.setColumns(10);
		
		chgOk = new JButton("\uC644 \uB8CC");
		chgOk.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		chgOk.setBounds(212, 362, 120, 60);
		pChg.add(chgOk);
		
		chgCancel = new JButton("\uCDE8 \uC18C");
		chgCancel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		chgCancel.setBounds(344, 362, 120, 60);
		pChg.add(chgCancel);
		
		contentPane.add(pSearch, "pSearch");

	}
}
