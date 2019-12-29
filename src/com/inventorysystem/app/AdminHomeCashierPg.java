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

public class AdminHomeCashierPg extends JFrame {

	private JPanel contentPane;
	private JTextField idTxt;
	private JTextField fnameTxt;
	private JTextField lnameTxt;
	private JTextField adresstxt;
	private JTextField numberTxt;
	private JPasswordField passwordField;
	private JTextField emailTxt;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomeCashierPg frame = new AdminHomeCashierPg();
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
	public AdminHomeCashierPg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 735);
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

		JButton btnNewButton = new JButton("Cashier");
		Image cashierLogo = new ImageIcon(this.getClass().getResource("/CASHIER-icon.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(cashierLogo));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are already in transaction page");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(496, 11, 163, 57);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnNewButton.setBorder(emptyBorder);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Transaction");
		Image transactionLogo = new ImageIcon(this.getClass().getResource("/transaction.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(transactionLogo));

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    new Transaction().setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(717, 11, 163, 57);
		Border emptyBorder2 = BorderFactory.createEmptyBorder();
		btnNewButton_1.setBorder(emptyBorder2);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Stock");
		Image stockLogo = new ImageIcon(this.getClass().getResource("/stock.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(stockLogo));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stock stockPage = new Stock();
				stockPage.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(932, 11, 163, 57);
		Border emptyBorder3 = BorderFactory.createEmptyBorder();
		btnNewButton_2.setBorder(emptyBorder3);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Sales");
		Image salesLogo = new ImageIcon(this.getClass().getResource("/sales.png")).getImage();
		btnNewButton_3.setIcon(new ImageIcon(salesLogo));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(1122, 11, 134, 57);
		Border emptyBorder4 = BorderFactory.createEmptyBorder();
		btnNewButton_3.setBorder(emptyBorder4);
		contentPane.add(btnNewButton_3);

		JLabel lblNewLabel = new JLabel("Add Cashier Details!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(436, 79, 223, 22);
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
				if (table.getSelectedRow() < 0) {
					JOptionPane.showMessageDialog(null, "Select any row!!!");
					return;
				}
				int row = table.getSelectedRow();
				int id = (int) table.getModel().getValueAt(row, 0);
				CashierUpdateForm cuf = new CashierUpdateForm();
				cuf.setData(id);
				cuf.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBackground(Color.BLUE);
		btnNewButton_5.setBounds(380, 610, 142, 44);
		contentPane.add(btnNewButton_5);

		JRadioButton malerdbtn = new JRadioButton("Male");
		malerdbtn.setBackground(Color.WHITE);
		malerdbtn.setBounds(407, 539, 109, 23);
		contentPane.add(malerdbtn);

		JRadioButton femalerdbtn = new JRadioButton("Female");
		femalerdbtn.setBackground(Color.WHITE);
		femalerdbtn.setBounds(518, 539, 109, 23);
		contentPane.add(femalerdbtn);

		JButton btnNewButton_6 = new JButton("Add");
		Image addLogo = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
		btnNewButton_6.setIcon(new ImageIcon(addLogo));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cashier cashier = new Cashier();
				CashierDao cdao = new CashierDaoImpl();

				if (idTxt.getText().isEmpty() || fnameTxt.getText().isEmpty() || lnameTxt.getText().isEmpty()
						|| adresstxt.getText().isEmpty() || numberTxt.getText().isEmpty()
						|| emailTxt.getText().isEmpty() || passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Fill all the boxes !!!");
					return;
				}

				if (malerdbtn.isSelected() == false && femalerdbtn.isSelected() == false) {
					JOptionPane.showMessageDialog(null, "Select Gender");
					return;
				}
				if (malerdbtn.isSelected() && femalerdbtn.isSelected()) {
					JOptionPane.showMessageDialog(null, "Select only one gender");
					return;
				}

				if (malerdbtn.isSelected()) {
					cashier.setCashierGender("Male");
				} else {
					cashier.setCashierGender("Female");
				}
				cashier.setCashierId(Integer.parseInt(idTxt.getText()));
				cashier.setCashierFirstName(fnameTxt.getText());
				cashier.setCashierLastName(lnameTxt.getText());
				cashier.setCashierAdress(adresstxt.getText());
				cashier.setCashierNumber(numberTxt.getText());
				cashier.setCashierEmail(emailTxt.getText());
				cashier.setCashierPassword(passwordField.getText());  
				if(cdao.addCashier(cashier)) {
				JOptionPane.showMessageDialog(null, "Cashier added!!!");
				displayCashierDetails();
				}else
					JOptionPane.showMessageDialog(null, "Something went wrong !!! Please try again !!!");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(Color.GREEN);
		btnNewButton_6.setBounds(258, 610, 112, 44);
		contentPane.add(btnNewButton_6);

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

		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (table.getSelectedRow() < 0) {
					JOptionPane.showMessageDialog(null, "Select any row to delete");
					return;
				}

				int row = table.getSelectedRow();
				int id = (int) table.getModel().getValueAt(row, 0);
				if (new CashierDaoImpl().deleteCashier(id)) {
					JOptionPane.showMessageDialog(null, "Deleted");
					displayCashierDetails();
				} else {
					JOptionPane.showMessageDialog(null, "Not deleted");
				}

			}
		});
		Image deleteLogo = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
		btnNewButton_4.setIcon(new ImageIcon(deleteLogo));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.setBounds(532, 610, 134, 44);
		contentPane.add(btnNewButton_4);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(700, 84, 556, 612);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "First Name", "Last Name", "Adress", "Number", "Email", "Password", "Gender" }));
		scrollPane.setViewportView(table);

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

		displayCashierDetails();
	}

	private void displayCashierDetails() {
		CashierDao cdao = new CashierDaoImpl();
		List<Cashier> clist = cdao.viewAllCashiers();
		DefaultTableModel mymodel = (DefaultTableModel) table.getModel();
		mymodel.setRowCount(0);
		for (Cashier c : clist) {
			mymodel.addRow(new Object[] { c.getCashierId(), c.getCashierFirstName(), c.getCashierLastName(),
					c.getCashierAdress(), c.getCashierNumber(), c.getCashierEmail(), c.getCashierPassword(),
					c.getCashierGender() });
		}
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
}