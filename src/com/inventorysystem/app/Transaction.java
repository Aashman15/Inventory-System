package com.inventorysystem.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.inventorysystem.service.BillDao;
import com.inventorysystem.service.BillDaoImpl;
import com.inventorysystem.service.StockDao;
import com.inventorysystem.service.StockDaoImpl;
import com.inventorysysystem.model.Bill;
import com.inventorysysystem.model.StockModel;

public class Transaction extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction();
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
	public Transaction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 20, 1260, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getScrollPane());
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Log Out");
		btnNewButton_7.setBackground(Color.WHITE);
		Image logOutLogo = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnNewButton_7.setIcon(new ImageIcon(logOutLogo));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_7.setBounds(1200, 615, 34, 35);
		Border emptyBorderlo = BorderFactory.createEmptyBorder();
		btnNewButton_7.setBorder(emptyBorderlo);
		contentPane.add(btnNewButton_7);
		displayData();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Transaction");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
			lblNewLabel.setBounds(577, 11, 261, 58);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			Image salesLogo = new ImageIcon(this.getClass().getResource("/banking.png")).getImage();
			lblNewLabel_1.setIcon(new ImageIcon(salesLogo));
			lblNewLabel_1.setBounds(511, 0, 64, 69);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(52, 80, 1146, 570);
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
					"Sold Products", " Total Received Amount", "Bought By", "Date"
				}
			));
		}
		return table;
	}
	void displayData(){
		BillDao bdao = new BillDaoImpl();
		List<Bill> blist = bdao.getAllBills();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		
		for(Bill b : blist) {
			model.addRow(new Object[] {
					b.getProducts(),b.getTotalAmount(),b.getCustomerName(),b.getDate()
			});
		}
			
		
		
	};
}
