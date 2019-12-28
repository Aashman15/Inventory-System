package com.inventorysystem.app;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class BillPrint extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_8;
	private JDateChooser dateChooser;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton_5;
	private JTextField textField_7;
	private JTable table;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillPrint frame = new BillPrint();
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
	public BillPrint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 0, 518, 735);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getDateChooser());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getBtnNewButton_5());
		contentPane.add(getTextField_7());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton());

	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 130, 484, 420);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Date : ");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_8.setBounds(205, 94, 75, 25);
		}
		return lblNewLabel_8;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(283, 94, 211, 25);
		}
		return dateChooser;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Total : ");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_9.setBounds(58, 571, 75, 30);
		}
		return lblNewLabel_9;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("Print");
			btnNewButton_5.setToolTipText("Clicking here will save bill and let you print the bill.");
			btnNewButton_5.setBackground(Color.WHITE);
			Image salesLogo = new ImageIcon(this.getClass().getResource("/printer.png")).getImage();
			btnNewButton_5.setIcon(new ImageIcon(salesLogo));
			Border emptyBorder = BorderFactory.createEmptyBorder();
			btnNewButton_5.setBorder(emptyBorder);
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_5.setBounds(195, 634, 124, 41);
		}
		return btnNewButton_5;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setBounds(143, 575, 273, 30);
			textField_7.setColumns(10);
		}
		return textField_7;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Quantity", "Name", "Mrp", "Price"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Bill No : ");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(10, 94, 84, 25);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(98, 94, 85, 25);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Customer : ");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_1.setBounds(81, 34, 115, 25);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(205, 30, 211, 29);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setBackground(Color.WHITE);
			Image cashierLogo = new ImageIcon(this.getClass().getResource("/remove.png")).getImage();
			btnNewButton.setIcon(new ImageIcon(cashierLogo));
			Border emptyBorder = BorderFactory.createEmptyBorder();
			btnNewButton.setBorder(emptyBorder);
			
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBounds(152, 634, 44, 41);
		}
		return btnNewButton;
	}
}