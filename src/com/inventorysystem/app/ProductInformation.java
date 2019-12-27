package com.inventorysystem.app;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.inventorysystem.service.StockDao;
import com.inventorysystem.service.StockDaoImpl;
import com.inventorysysystem.model.StockModel;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductInformation extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInformation frame = new ProductInformation();
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
	public ProductInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(240, 20, 876, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getScrollPane());
		displayData();
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			
			Image img = new ImageIcon(this.getClass().getResource("/warehouse.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setBounds(216, 11, 105, 108);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Stock");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
			lblNewLabel_1.setBounds(349, 47, 172, 54);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("");
			btnNewButton_2.setBackground(Color.white);
			Image logOutLogo = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
			btnNewButton_2.setIcon(new ImageIcon(logOutLogo));
			Border emptyBorder = BorderFactory.createEmptyBorder();
			btnNewButton_2.setBorder(emptyBorder);
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_2.setBounds(773, 599, 50, 40);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(97, 130, 666, 509);
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
					"Product Id", "Product Name", "Available", "Total Added", "Mrp ($)"
				}
			));
		}
		return table;
	}
	
	public void displayData(){
		StockDao sdao = new StockDaoImpl();
        List<StockModel> slist = sdao.getAllProducts();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
	   for(StockModel s : slist) {
		   model.addRow(new Object[] {
			   s.getProductId(),s.getProductName(),s.getProductAvailable(),s.getTotalAdded(),s.getProductMrp()
		   });
	   }
	}
	
}
