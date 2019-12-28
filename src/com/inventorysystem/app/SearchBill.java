package com.inventorysystem.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.inventorysystem.service.BillDao;
import com.inventorysystem.service.BillDaoImpl;
import com.inventorysysystem.model.Bill;

public class SearchBill extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchBill frame = new SearchBill();
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
	public SearchBill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 20, 1260, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton());
		displayBills();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Search Bill");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
			lblNewLabel.setBounds(517, 11, 228, 49);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			
			Image transactionLogo = new ImageIcon(this.getClass().getResource("/search.png")).getImage();
			lblNewLabel_1.setIcon(new ImageIcon(transactionLogo));

			lblNewLabel_1.setBounds(473, 18, 41, 42);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					
					String input = textField.getText().trim();
					BillDao bdao = new BillDaoImpl();
					List<Bill> blist = bdao.searchBill(input);
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					
					model.setRowCount(0);
					for(Bill b : blist) {
						model.addRow(new Object[] {
								b.getBillNumber(),b.getCustomerName(),b.getTotalAmount(),b.getDate()
						});
					}
				}
				
			});
			textField.setBounds(406, 90, 435, 29);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Enter name of customer or bill number.");
			lblNewLabel_2.setBounds(517, 65, 263, 14);
		}
		return lblNewLabel_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(175, 130, 911, 520);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Bill Number", "Customer Name", "Total Amount", "Date"
				}
			));
		}
		return table;
	}
	void displayBills() {
		BillDao bdao = new BillDaoImpl();
		List<Bill> blist = bdao.getAllBills();
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);
	    for(Bill b : blist) {
	    	model.addRow(new Object[] {
	    			b.getBillNumber(),b.getCustomerName(),b.getTotalAmount(),b.getDate()
	    	});
	    }
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setBackground(Color.WHITE);
			Image logOutLogo = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
			btnNewButton.setIcon(new ImageIcon(logOutLogo));
			Border emptyBorderlo = BorderFactory.createEmptyBorder();
			btnNewButton.setBorder(emptyBorderlo);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBounds(1088, 608, 41, 53);
		}
		return btnNewButton;
	}
}
