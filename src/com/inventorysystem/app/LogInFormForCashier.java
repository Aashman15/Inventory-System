package com.inventorysystem.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.inventorysystem.service.CashierDao;
import com.inventorysystem.service.CashierDaoImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LogInFormForCashier extends JFrame {

	private JPanel contentPane;
	private JTextField emailtxt;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInForm frame = new LogInForm();
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
	public LogInFormForCashier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 612);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Log In Here!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(233, 11, 254, 62);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Email : ");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(153, 108, 128, 25);
		contentPane.add(lblNewLabel_1);

		emailtxt = new JTextField();
		emailtxt.setBounds(291, 108, 301, 33);
		contentPane.add(emailtxt);
		emailtxt.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(153, 185, 128, 25);
		contentPane.add(lblNewLabel_2);

		passwordField = new JPasswordField();
		passwordField.setBounds(291, 185, 301, 33);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomeForm wf = new WelcomeForm();
					wf.setVisible(true);
					dispose();
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(264, 254, 114, 54);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CashierDao cdao = new CashierDaoImpl();
				String email = emailtxt.getText();	
				String password = passwordField.getText();
				if(email.isEmpty() && password.isEmpty()) {
					JOptionPane.showMessageDialog(null, "You can not go in with out email and password!");
				}else if(email.isEmpty()) {
					JOptionPane.showMessageDialog(null, "You forgot to enter your email!");
				}else if (password.isEmpty()){
					JOptionPane.showMessageDialog(null, "You forgot to enter your password!");
				}else if (cdao.cashierExist(email, password)) {
					new CashierHomeCreateBillPg().setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Something went wrong! Make sure you entered right email and password!");
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(388, 254, 204, 54);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_3 = new JLabel(
				"If you don't have account yet. \r\nContact with your admin.\r\nThank you!!!");
		lblNewLabel_3.setBounds(264, 348, 378, 33);
		contentPane.add(lblNewLabel_3);
	}
}
