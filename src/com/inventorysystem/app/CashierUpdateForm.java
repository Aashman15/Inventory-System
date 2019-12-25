package com.inventorysystem.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.inventorysystem.service.CashierDao;
import com.inventorysystem.service.CashierDaoImpl;
import com.inventorysysystem.model.Cashier;

public class CashierUpdateForm extends JFrame {

	private JPanel contentPane;
	private JTextField idTxt;
	private JTextField fnameTxt;
	private JTextField lnameTxt;
	private JTextField adresstxt;
	private JTextField numberTxt;
	private JPasswordField passwordField;
	private JTextField emailTxt;
	private JRadioButton malerdbtn;
	private JRadioButton femalerdbtn;
	int uid = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierUpdateForm frame = new CashierUpdateForm();
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
	public CashierUpdateForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 852, 735);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelforqbl = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/quickbill for nav.png")).getImage();
		labelforqbl.setIcon(new ImageIcon(img));

		labelforqbl.setBounds(105, 11, 206, 57);
		contentPane.add(labelforqbl);
		Image cashierLogo = new ImageIcon(this.getClass().getResource("/CASHIER-icon.png")).getImage();
		Border emptyBorder = BorderFactory.createEmptyBorder();
		Image transactionLogo = new ImageIcon(this.getClass().getResource("/transaction.png")).getImage();
		Border emptyBorder2 = BorderFactory.createEmptyBorder();
		Image stockLogo = new ImageIcon(this.getClass().getResource("/stock.png")).getImage();
		Border emptyBorder3 = BorderFactory.createEmptyBorder();
		Image salesLogo = new ImageIcon(this.getClass().getResource("/sales.png")).getImage();
		Border emptyBorder4 = BorderFactory.createEmptyBorder();

		JLabel lblNewLabel = new JLabel("Update by filling boxes again!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(369, 59, 304, 22);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cashier Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(285, 124, 88, 22);
		contentPane.add(lblNewLabel_1);

		idTxt = new JTextField();
		idTxt.setBounds(407, 120, 252, 35);
		contentPane.add(idTxt);
		idTxt.setColumns(10);

		fnameTxt = new JTextField();
		fnameTxt.setBounds(407, 178, 252, 35);
		contentPane.add(fnameTxt);
		fnameTxt.setColumns(10);

		lnameTxt = new JTextField();
		lnameTxt.setBounds(407, 236, 252, 35);
		contentPane.add(lnameTxt);
		lnameTxt.setColumns(10);

		adresstxt = new JTextField();
		adresstxt.setBounds(407, 293, 252, 35);
		contentPane.add(adresstxt);
		adresstxt.setColumns(10);

		numberTxt = new JTextField();
		numberTxt.setBounds(407, 351, 252, 35);
		contentPane.add(numberTxt);
		numberTxt.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(407, 466, 252, 35);
		contentPane.add(passwordField);

		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(285, 178, 112, 35);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Last Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(285, 236, 112, 35);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Adress");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(285, 293, 88, 35);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Number");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(285, 351, 88, 35);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(285, 408, 100, 35);
		contentPane.add(lblNewLabel_6);

		JButton btnNewButton_5 = new JButton("Update");
		Image updateLogo = new ImageIcon(this.getClass().getResource("/update.png")).getImage();
		btnNewButton_5.setIcon(new ImageIcon(updateLogo));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cashier c = new Cashier();
				c.setCashierFirstName(fnameTxt.getText());
				c.setCashierLastName(lnameTxt.getText());
				c.setCashierAdress(adresstxt.getText());
				c.setCashierNumber(numberTxt.getText());
				c.setCashierEmail(emailTxt.getText());
				c.setCashierPassword(passwordField.getText());
				if(malerdbtn.isSelected()) {
					c.setCashierGender("male");
				}else {
					c.setCashierGender("female");
				}
				c.setCashierId(Integer.parseInt(idTxt.getText()));
				
				int row = new AdminHomeCashierPg().getTable().getSelectedRow();
				int id = (int) new AdminHomeCashierPg().getTable().getModel().getValueAt(row, 0);
				if(new CashierDaoImpl().updateCashierById(c,id)) {
					JOptionPane.showMessageDialog(null, "Successfully updated");
				}else {
					JOptionPane.showMessageDialog(null, "Something went wrong ! please try again");
				}
				new AdminHomeCashierPg().setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBackground(Color.BLUE);
		btnNewButton_5.setBounds(436, 609, 166, 44);
		contentPane.add(btnNewButton_5);

		malerdbtn = new JRadioButton("Male");
		malerdbtn.setBackground(Color.WHITE);
		malerdbtn.setBounds(407, 539, 109, 23);
		contentPane.add(malerdbtn);

		femalerdbtn = new JRadioButton("Female");
		femalerdbtn.setBackground(Color.WHITE);
		femalerdbtn.setBounds(518, 539, 109, 23);
		contentPane.add(femalerdbtn);
		Image addLogo = new ImageIcon(this.getClass().getResource("/add.png")).getImage();

		emailTxt = new JTextField();
		emailTxt.setBounds(407, 408, 252, 35);
		contentPane.add(emailTxt);
		emailTxt.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Password");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(285, 466, 88, 35);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Gender");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(285, 534, 106, 28);
		contentPane.add(lblNewLabel_8);
		Image deleteLogo = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Log Out");
		btnNewButton_7.setBackground(Color.WHITE);
		Image logOutLogo = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnNewButton_7.setIcon(new ImageIcon(logOutLogo));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInForm lf = new LogInForm();
				lf.setVisible(true);
				dispose();
			}
		});
		btnNewButton_7.setBounds(1266, 661, 34, 35);
		Border emptyBorderlo = BorderFactory.createEmptyBorder();
		btnNewButton_7.setBorder(emptyBorderlo);
		contentPane.add(btnNewButton_7);

	}

	public void setData(int id) {
		CashierDao cdao = new CashierDaoImpl();
		Cashier c = cdao.getCashierDetailsById(id);
		idTxt.setText(String.valueOf(c.getCashierId()));
		fnameTxt.setText(c.getCashierFirstName());
		lnameTxt.setText(c.getCashierLastName());
		adresstxt.setText(c.getCashierAdress());
		numberTxt.setText(c.getCashierNumber());
		emailTxt.setText(c.getCashierEmail());
		passwordField.setText(c.getCashierPassword());
		if (c.getCashierGender().equalsIgnoreCase("male")) {
			malerdbtn.setSelected(true);
		} else {
			femalerdbtn.setSelected(true);
		}

	}

}
