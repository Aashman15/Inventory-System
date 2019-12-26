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

public class CashierHomeCreateBillPg extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierHomeCreateBillPg frame = new CashierHomeCreateBillPg();
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
	public CashierHomeCreateBillPg() {
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

		JButton btnNewButton = new JButton("Create Bill");
		Image cashierLogo = new ImageIcon(this.getClass().getResource("/bill.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(cashierLogo));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(496, 11, 163, 57);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnNewButton.setBorder(emptyBorder);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Search Bill");
		Image transactionLogo = new ImageIcon(this.getClass().getResource("/search.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(transactionLogo));

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(691, 11, 163, 57);
		Border emptyBorder2 = BorderFactory.createEmptyBorder();
		btnNewButton_1.setBorder(emptyBorder2);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Product Information");
		Image stockLogo = new ImageIcon(this.getClass().getResource("/stock.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(stockLogo));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(890, 11, 266, 57);
		Border emptyBorder3 = BorderFactory.createEmptyBorder();
		btnNewButton_2.setBorder(emptyBorder3);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Sales");
		Image salesLogo = new ImageIcon(this.getClass().getResource("/sales.png")).getImage();
		btnNewButton_3.setIcon(new ImageIcon(salesLogo));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(1166, 11, 134, 57);
		Border emptyBorder4 = BorderFactory.createEmptyBorder();
		btnNewButton_3.setBorder(emptyBorder4);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Log Out");
		btnNewButton_7.setBackground(Color.WHITE);
		Image logOutLogo = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnNewButton_7.setIcon(new ImageIcon(logOutLogo));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInFormForCashier lfc = new LogInFormForCashier();
				lfc.setVisible(true);
				dispose();
			}
		});
		btnNewButton_7.setBounds(1266, 661, 34, 35);
		Border emptyBorderlo = BorderFactory.createEmptyBorder();
		btnNewButton_7.setBorder(emptyBorderlo);
		contentPane.add(btnNewButton_7);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTextField_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getTextField_6());
		contentPane.add(getBtnNewButton_4());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Create New Bill Here !!!");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(348, 79, 240, 35);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Customer : ");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(267, 154, 102, 25);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(370, 144, 191, 35);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Product Id : ");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(267, 219, 90, 25);
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(370, 209, 191, 35);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Name :");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_3.setBounds(267, 285, 90, 25);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("MRP : ");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_4.setBounds(267, 347, 90, 25);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Quantity : ");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_5.setBounds(267, 414, 90, 25);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Discount");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_6.setBounds(267, 475, 90, 25);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Bill No : ");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_7.setBounds(267, 532, 90, 25);
		}
		return lblNewLabel_7;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(370, 275, 191, 35);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(370, 337, 191, 35);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(370, 404, 191, 35);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(370, 465, 191, 35);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setBounds(370, 522, 191, 35);
			textField_6.setColumns(10);
		}
		return textField_6;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("Create");
			btnNewButton_4.setBackground(Color.GREEN);
			Image addLogo = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
			btnNewButton_4.setIcon(new ImageIcon(addLogo));
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_4.setBounds(418, 591, 143, 35);
		}
		return btnNewButton_4;
	}
}