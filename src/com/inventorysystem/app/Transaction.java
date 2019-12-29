package com.inventorysystem.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.inventorysystem.service.BillDao;
import com.inventorysystem.service.BillDaoImpl;
import com.inventorysystem.service.StockDao;
import com.inventorysystem.service.StockDaoImpl;
import com.inventorysysystem.model.Bill;
import com.inventorysysystem.model.StockModel;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Transaction extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField totalTxt;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;

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
		contentPane.add(getTotalTxt());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getBtnNewButton());
		displayData();
		setTotal();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(457, 11, 73, 64);
			Image salesLogo = new ImageIcon(this.getClass().getResource("/banking.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(salesLogo));
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Transaction");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
			lblNewLabel_1.setBounds(523, 11, 252, 64);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(122, 90, 1012, 482);
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
					"Product Id", "Product Name", "Sold Quantity", "Earned"
				}
			));
		}
		return table;
	}
	private JTextField getTotalTxt() {
		if (totalTxt == null) {
			totalTxt = new JTextField();
			totalTxt.setBounds(882, 583, 252, 35);
			totalTxt.setColumns(10);
		}
		return totalTxt;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Total Earned : ");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_2.setBounds(748, 583, 132, 35);
		}
		return lblNewLabel_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setBackground(Color.WHITE);
			Image logOutLogo = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
			btnNewButton.setIcon(new ImageIcon(logOutLogo));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBounds(707, 577, 40, 41);
			Border emptyBorderlo = BorderFactory.createEmptyBorder();
			btnNewButton.setBorder(emptyBorderlo);
		}
		return btnNewButton;
	}
	
	void displayData(){
		StockDao sdao = new StockDaoImpl();
		List<StockModel> smList = sdao.getAllProducts();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for(StockModel sm : smList) {
			int sq = sm.getTotalAdded()-sm.getProductAvailable();
			double earned = sq*(sm.getProductMrp()-(0.1*sm.getProductMrp()));
			model.addRow(new Object [] {
					sm.getProductId(),sm.getProductName(),sq,earned
			});
		}
	};
	void setTotal() {
	double total = 0;
	DefaultTableModel model = (DefaultTableModel) table.getModel();
    int row =  model.getRowCount();
    for(int i = 0; i<row; i++) {
    	total = total + (double) model.getValueAt(i, 3);
    }
    String totalEarned = Double.toString(total);
   
    
    totalTxt.setText(totalEarned);
    totalTxt.disable();
	}
	
}
