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

import com.inventorysystem.service.StockDao;
import com.inventorysystem.service.StockDaoImpl;
import com.inventorysysystem.model.StockModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Stock extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField idTxt;
	private JLabel lblNewLabel_4;
	private JTextField nameTxt;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField availableTxt;
	private JTextField totalTxt;
	private JTextField mrpTxt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
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
					Stock frame = new Stock();
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
	public Stock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 20, 1260, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getIdTxt());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getNameTxt());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getAvailableTxt());
		contentPane.add(getTotalTxt());
		contentPane.add(getMrpTxt());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getScrollPane());
		displayData();
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			
			Image img = new ImageIcon(this.getClass().getResource("/warehouse.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setBounds(513, -3, 105, 108);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Stock");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
			lblNewLabel_1.setBounds(637, 39, 172, 54);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Add Stock");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_2.setBounds(138, 139, 117, 45);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Product Id :");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_3.setBounds(97, 195, 88, 30);
		}
		return lblNewLabel_3;
	}
	private JTextField getIdTxt() {
		if (idTxt == null) {
			idTxt = new JTextField();
			idTxt.setBounds(243, 189, 172, 38);
			idTxt.setColumns(10);
		}
		return idTxt;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Product Name : ");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_4.setBounds(97, 254, 125, 30);
		}
		return lblNewLabel_4;
	}
	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(243, 248, 172, 38);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Quantity Available : ");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_5.setBounds(97, 315, 145, 30);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Quantity Added :");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_6.setBounds(97, 370, 158, 30);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("MRP : ($)");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_7.setBounds(97, 434, 80, 30);
		}
		return lblNewLabel_7;
	}
	private JTextField getAvailableTxt() {
		if (availableTxt == null) {
			availableTxt = new JTextField();
			availableTxt.setBounds(243, 307, 172, 38);
			availableTxt.setColumns(10);
		}
		return availableTxt;
	}
	private JTextField getTotalTxt() {
		if (totalTxt == null) {
			totalTxt = new JTextField();
			totalTxt.setBounds(243, 370, 172, 38);
			totalTxt.setColumns(10);
		}
		return totalTxt;
	}
	private JTextField getMrpTxt() {
		if (mrpTxt == null) {
			mrpTxt = new JTextField();
			mrpTxt.setBounds(243, 429, 172, 38);
			mrpTxt.setColumns(10);
		}
		return mrpTxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					StockModel s = new StockModel();
					
					s.setProductId( Integer.parseInt(idTxt.getText()));
					s.setProductName(nameTxt.getText());
					s.setProductAvailable(Integer.parseInt(availableTxt.getText()));
					s.setTotalAdded(Integer.parseInt(totalTxt.getText()));
					s.setProductMrp(Double.parseDouble(mrpTxt.getText()));
					
					StockDao sdao = new StockDaoImpl();
					if(sdao.addStock(s)) {
						JOptionPane.showMessageDialog(null, "New product has been added");
					}else {
						JOptionPane.showMessageDialog(null, "Something went wrong");
					}
					displayData();
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(Color.GREEN);
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
			Image addLogo = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
			btnNewButton.setIcon(new ImageIcon(addLogo));
			btnNewButton.setBounds(97, 523, 158, 38);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Update");
			btnNewButton_1.setForeground(Color.WHITE);
			Image updateLogo = new ImageIcon(this.getClass().getResource("/update.png")).getImage();
			btnNewButton_1.setIcon(new ImageIcon(updateLogo));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int row = table.getSelectedRow();
					if(row < 0) {
						JOptionPane.showMessageDialog(null, "Select any row");
					}else {
						int id = (int)table.getModel().getValueAt(row, 0);
						UpdateStock us = new UpdateStock();
						us.setData(id);
						us.setVisible(true);
						dispose();
						}
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_1.setBackground(Color.BLUE);
			btnNewButton_1.setBounds(265, 523, 149, 38);
		}
		return btnNewButton_1;
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
			btnNewButton_2.setBounds(1150, 599, 50, 40);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(474, 139, 666, 500);
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
