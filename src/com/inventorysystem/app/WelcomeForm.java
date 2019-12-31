package com.inventorysystem.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.inventorysystem.database.Db;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WelcomeForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeForm frame = new WelcomeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public WelcomeForm(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 612);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wellcome To Supermarket Billing System!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(22, 11, 665, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/quick bill.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(35, 117, 249, 278);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Admin LogIn\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(0, 255, 0));
		Image img1 = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInForm lf = new LogInForm();
				lf.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(290, 143, 196, 102);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cashier LogIn\r\n");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.GREEN);
		
		//Inserting Image
		Image img2 = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img2));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInFormForCashier clf = new LogInFormForCashier();
				clf.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(290, 268, 196, 102);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Admin logIn Here.");
		lblNewLabel_2.setBounds(496, 187, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cashier LogIn Here.");
		lblNewLabel_3.setBounds(496, 312, 150, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Developed By Aashman Thing.");
		lblNewLabel_4.setBounds(182, 478, 280, 14);
		contentPane.add(lblNewLabel_4);
	}
}
