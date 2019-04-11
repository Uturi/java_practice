package com.kitri.pos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.CardLayout;

public class template extends JFrame {

	private JPanel contentPane;
	private JTextField notice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					template frame = new template();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public template() {
		setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		setTitle("Force.pos");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1326, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pStatusBar = new JPanel();
		pStatusBar.setBackground(new Color(0, 0, 128));
		pStatusBar.setBounds(0, 0, 1308, 51);
		contentPane.add(pStatusBar);
		pStatusBar.setLayout(null);
		
		JLabel titleLabel = new JLabel("Force. pos");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setBackground(new Color(0, 0, 128));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		titleLabel.setBounds(14, 8, 241, 31);
		pStatusBar.add(titleLabel);
		
		notice = new JTextField();
		notice.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		notice.setText("\uC0C1\uD488\uBA85(..)\uB294 \uC720\uD1B5\uAE30\uD55C\uC774 \uC9C0\uB0AC\uC2B5\uB2C8\uB2E4.");
		notice.setHorizontalAlignment(SwingConstants.CENTER);
		notice.setBounds(258, 8, 726, 31);
		pStatusBar.add(notice);
		notice.setColumns(10);
		
		JLabel dateLabel = new JLabel("2019-04-01 \uC624\uD6C4 5:01");
		dateLabel.setBackground(new Color(0, 0, 128));
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel.setForeground(new Color(255, 255, 255));
		dateLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		dateLabel.setBounds(1016, 8, 278, 31);
		pStatusBar.add(dateLabel);
		
		JPanel pMainBtn = new JPanel();
		pMainBtn.setBackground(new Color(255, 255, 255));
		pMainBtn.setBounds(0, 585, 1144, 120);
		contentPane.add(pMainBtn);
		pMainBtn.setLayout(null);
		
		JLabel idLabel = new JLabel("\uAD00\uB9AC\uC790");
		idLabel.setBackground(new Color(105, 105, 105));
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		idLabel.setBounds(860, 0, 201, 120);
		pMainBtn.add(idLabel);
		
		JButton mBtnInven = new JButton("\uC7AC\uACE0");
		mBtnInven.setBackground(new Color(28, 94, 94));
		mBtnInven.setForeground(new Color(255, 255, 255));
		mBtnInven.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		mBtnInven.setBounds(0, 0, 157, 120);
		pMainBtn.add(mBtnInven);
		
		JButton mBtnSale = new JButton("\uD310\uB9E4");
		mBtnSale.setBackground(new Color(99, 166, 166));
		mBtnSale.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		mBtnSale.setForeground(new Color(255, 255, 255));
		mBtnSale.setBounds(156, 0, 157, 120);
		pMainBtn.add(mBtnSale);
		
		JButton mBtnCalc = new JButton("\uC815\uC0B0");
		mBtnCalc.setBackground(new Color(28, 94, 94));
		mBtnCalc.setForeground(new Color(255, 255, 255));
		mBtnCalc.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		mBtnCalc.setBounds(313, 0, 157, 120);
		pMainBtn.add(mBtnCalc);
		
		JButton mBtnStat = new JButton("\uD1B5\uACC4");
		mBtnStat.setBackground(new Color(99, 166, 166));
		mBtnStat.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		mBtnStat.setForeground(new Color(255, 255, 255));
		mBtnStat.setBounds(470, 0, 157, 120);
		pMainBtn.add(mBtnStat);
		
		JButton mBtnAccount = new JButton("\uACC4\uC815");
		mBtnAccount.setBackground(new Color(28, 94, 94));
		mBtnAccount.setForeground(new Color(255, 255, 255));
		mBtnAccount.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		mBtnAccount.setBounds(626, 0, 157, 120);
		pMainBtn.add(mBtnAccount);
		
		JPanel pSellFunction = new JPanel();
		pSellFunction.setBackground(new Color(0, 0, 128));
		pSellFunction.setBounds(1144, 50, 164, 655);
		contentPane.add(pSellFunction);
		pSellFunction.setLayout(null);
		
		JButton sBtnCustomer = new JButton("\uACE0\uAC1D\uAD00\uB9AC");
		sBtnCustomer.setForeground(new Color(255, 255, 255));
		sBtnCustomer.setBackground(new Color(0, 0, 128));
		sBtnCustomer.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		sBtnCustomer.setBounds(0, 0, 164, 80);
		pSellFunction.add(sBtnCustomer);
		
		JButton sBtnDisuse = new JButton("\uD3D0\uAE30\uAD00\uB9AC");
		sBtnDisuse.setBackground(new Color(100, 149, 237));
		sBtnDisuse.setForeground(new Color(255, 255, 255));
		sBtnDisuse.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		sBtnDisuse.setBounds(0, 80, 164, 80);
		pSellFunction.add(sBtnDisuse);
		
		JButton sBtnPdInput = new JButton("\uC0C1\uD488\uB4F1\uB85D");
		sBtnPdInput.setBackground(new Color(0, 0, 128));
		sBtnPdInput.setForeground(new Color(255, 255, 255));
		sBtnPdInput.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		sBtnPdInput.setBounds(0, 160, 164, 80);
		pSellFunction.add(sBtnPdInput);
		
		JButton sBtnPdChange = new JButton("\uC0C1\uD488\uC218\uC815");
		sBtnPdChange.setBackground(new Color(100, 149, 237));
		sBtnPdChange.setForeground(new Color(255, 255, 255));
		sBtnPdChange.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		sBtnPdChange.setBounds(0, 240, 164, 80);
		pSellFunction.add(sBtnPdChange);
		
		JButton sBtnPdCancel = new JButton("\uC0C1\uD488\uCDE8\uC18C");
		sBtnPdCancel.setBackground(new Color(0, 0, 128));
		sBtnPdCancel.setForeground(new Color(255, 255, 255));
		sBtnPdCancel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		sBtnPdCancel.setBounds(0, 320, 164, 80);
		pSellFunction.add(sBtnPdCancel);
		
		JButton sBtnPdHold = new JButton("\uC0C1\uD488\uBCF4\uB958");
		sBtnPdHold.setBackground(new Color(100, 149, 237));
		sBtnPdHold.setForeground(new Color(255, 255, 255));
		sBtnPdHold.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		sBtnPdHold.setBounds(0, 400, 164, 80);
		pSellFunction.add(sBtnPdHold);
		
		JButton sBtnPay = new JButton("\uACB0  \uC81C");
		sBtnPay.setBackground(new Color(255, 0, 0));
		sBtnPay.setForeground(new Color(255, 255, 255));
		sBtnPay.setBounds(0, 480, 164, 87);
		pSellFunction.add(sBtnPay);
		sBtnPay.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		
		JButton sBtnCancel = new JButton("\uAC70\uB798\uCDE8\uC18C");
		sBtnCancel.setBackground(new Color(160, 82, 45));
		sBtnCancel.setForeground(new Color(255, 255, 255));
		sBtnCancel.setBounds(0, 568, 164, 87);
		pSellFunction.add(sBtnCancel);
		sBtnCancel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		
		JPanel pMonitor = new JPanel();
		pMonitor.setBackground(new Color(255, 255, 255));
		pMonitor.setBounds(0, 50, 1144, 535);
		contentPane.add(pMonitor);
		pMonitor.setLayout(new CardLayout(0, 0));
	}
}
