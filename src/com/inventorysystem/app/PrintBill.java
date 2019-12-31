package com.inventorysystem.app;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.inventorysysystem.model.Bill;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PrintBill extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField billNoTxt;
	private JTextField cnameTxt;
	private JTextField goodsTxt;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField totalTxt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintBill frame = new PrintBill();
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
	public PrintBill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 510, 296);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getBillNoTxt());
		contentPane.add(getCnameTxt());
		contentPane.add(getGoodsTxt());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getTotalTxt());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Bill No :");
			lblNewLabel.setBounds(22, 11, 46, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Customer Name : ");
			lblNewLabel_1.setBounds(22, 36, 108, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Thank you for buying from us.\r\nPlease visit again!");
			lblNewLabel_2.setBounds(22, 175, 274, 14);
		}
		return lblNewLabel_2;
	}
	
	
	private JTextField getBillNoTxt() {
		if (billNoTxt == null) {
			billNoTxt = new JTextField();
			billNoTxt.setBounds(80, 8, 115, 20);
			billNoTxt.setBorder(null);
			billNoTxt.setColumns(10);
			billNoTxt.disable();
		}
		return billNoTxt;
	}
	private JTextField getCnameTxt() {
		if (cnameTxt == null) {
			cnameTxt = new JTextField();
			cnameTxt.setBounds(140, 33, 254, 20);
			cnameTxt.setBorder(null);
			cnameTxt.setColumns(10);
			cnameTxt.disable();
		}
		return cnameTxt;
	}
	
	
	private JTextField getGoodsTxt() {
		if (goodsTxt == null) {
			goodsTxt = new JTextField();
			goodsTxt.setBounds(22, 85, 462, 20);
			goodsTxt.setBorder(null);
			goodsTxt.setColumns(10);
			goodsTxt.disable();
		}
		return goodsTxt;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Your goods : ");
			lblNewLabel_3.setBounds(22, 61, 77, 14);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Total Amount :");
			lblNewLabel_4.setBounds(22, 119, 85, 14);
		}
		return lblNewLabel_4;
	}
	private JTextField getTotalTxt() {
		if (totalTxt == null) {
			totalTxt = new JTextField();
			totalTxt.setBounds(22, 144, 158, 20);
			totalTxt.setBorder(null);
			totalTxt.setColumns(10);
			totalTxt.disable();
		}
		return totalTxt;
	}
	void setData(Bill b) {
		billNoTxt.setText(Integer.toString(b.getBillNumber()));
		cnameTxt.setText(b.getCustomerName());
		goodsTxt.setText(b.getProducts());
		totalTxt.setText("$" + Double.toString(b.getTotalAmount()));
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Print\r\n");
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setForeground(Color.BLACK);
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
			Image salesLogo = new ImageIcon(this.getClass().getResource("/printer.png")).getImage();
			btnNewButton.setIcon(new ImageIcon(salesLogo));
			Border emptyBorder = BorderFactory.createEmptyBorder();
			btnNewButton.setBorder(emptyBorder);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Printing is not available for now!");
				}
			});
			btnNewButton.setBounds(78, 200, 102, 46);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("");
			btnNewButton_1.setBackground(Color.WHITE);
			Image salesLogo = new ImageIcon(this.getClass().getResource("/remove.png")).getImage();
			btnNewButton_1.setIcon(new ImageIcon(salesLogo));
			Border emptyBorder = BorderFactory.createEmptyBorder();
			btnNewButton_1.setBorder(emptyBorder);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setBounds(22, 200, 46, 46);
		}
		return btnNewButton_1;
	}
}
