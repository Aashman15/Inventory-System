package com.inventorysystem.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

import com.inventorysystem.service.AdminDao;
import com.inventorysystem.service.AdminDaoImpl;
import com.inventorysysystem.model.Admin;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;

public class SignUpAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JTextField emailtxt;
	private JTextField usernametxt;
	private JTextField adresstxt;
	private JTextField phonetxt;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpAdmin frame = new SignUpAdmin();
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
	public SignUpAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 612);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(100, 86, 90, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sign Up Here !!!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(142, 11, 266, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(100, 126, 90, 14);
		contentPane.add(lblNewLabel_2);
		
		fnametxt = new JTextField();
		fnametxt.setBounds(193, 83, 215, 20);
		contentPane.add(fnametxt);
		fnametxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(100, 167, 67, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Username");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(100, 205, 83, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(100, 244, 83, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Birthday");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(100, 281, 67, 20);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Adress");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(100, 322, 67, 20);
		contentPane.add(lblNewLabel_7);
		
		lnametxt = new JTextField();
		lnametxt.setBounds(193, 123, 215, 20);
		contentPane.add(lnametxt);
		lnametxt.setColumns(10);
		
		emailtxt = new JTextField();
		emailtxt.setBounds(193, 164, 215, 20);
		contentPane.add(emailtxt);
		emailtxt.setColumns(10);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(193, 202, 215, 20);
		contentPane.add(usernametxt);
		usernametxt.setColumns(10);
		
		adresstxt = new JTextField();
		adresstxt.setBounds(193, 325, 215, 20);
		contentPane.add(adresstxt);
		adresstxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminDao adao = new AdminDaoImpl();
				Admin admin = new Admin();
				admin.setAdminFirstName(fnametxt.getText());
				admin.setAdminLastName(lnametxt.getText());
				admin.setAdminEmail(emailtxt.getText());
				admin.setAdminUsername(usernametxt.getText());
				admin.setAdminPassword(passwordField.getText());
				
				//admin.setAdminBirthday(new Date(dateChooser.getDate().getTime()));
				admin.setAdminBirthday(null);
				admin.setAdminAdress(adresstxt.getText());
				admin.setPhone(phonetxt.getText());
			if(fnametxt.getText().isEmpty()&&lnametxt.getText().isEmpty()&&emailtxt.getText().isEmpty() && usernametxt.getText().isEmpty()
					&&passwordField.getText().isEmpty()&&/*birthday is empty*/ adresstxt.getText().isEmpty()&&phonetxt.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Fill all the boxes!!!");
			}else {
		             	if(adao.signUpAdmin(admin)) {
			             JOptionPane.showMessageDialog(null, "You are admin from now!!!");
		            	}else {
				        JOptionPane.showMessageDialog(null, "Something went wrong");
		          	}
			   }
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(247, 407, 161, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInForm lf = new LogInForm();
				lf.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(126, 407, 111, 46);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("Click here to log in. Dear admin !!!");
		lblNewLabel_8.setBounds(193, 464, 202, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_2 = new JButton("Log In");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			LogInForm lf = new LogInForm();
			lf.setVisible(true);
			dispose();
			}
		});
		btnNewButton_2.setBounds(223, 489, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/quick bill.jpg")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img2));
		
		lblNewLabel_9.setBounds(453, 128, 225, 214);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Phone");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(100, 370, 83, 14);
		contentPane.add(lblNewLabel_10);
		
		phonetxt = new JTextField();
		phonetxt.setBounds(193, 369, 215, 20);
		contentPane.add(phonetxt);
		phonetxt.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(193, 243, 215, 20);
		contentPane.add(passwordField);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(193, 281, 215, 20);
		contentPane.add(dateChooser);
	}
}
