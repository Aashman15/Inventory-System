package com.inventorysystem.app;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
import java.awt.event.ActionEvent;
public class UpdateStock extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStock frame = new UpdateStock();
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
	public UpdateStock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 20, 519, 700);
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
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			
			Image img = new ImageIcon(this.getClass().getResource("/warehouse.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setBounds(104, 11, 105, 108);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Stock");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
			lblNewLabel_1.setBounds(231, 47, 172, 54);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Update Stock");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_2.setBounds(138, 139, 149, 45);
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
			btnNewButton = new JButton("Update");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					StockModel s = new StockModel();
					s.setProductId( Integer.parseInt(idTxt.getText()));
					s.setProductName(nameTxt.getText());
					s.setProductAvailable( Integer.parseInt(availableTxt.getText()));
					s.setTotalAdded(Integer.parseInt(totalTxt.getText()));
					s.setProductMrp(Double.parseDouble(mrpTxt.getText()));
					
					StockDao sdao = new StockDaoImpl();
					if(sdao.updateStock(s)) {
						JOptionPane.showMessageDialog(null, "Successfully updated");
						new Stock().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Something went wrong");
					}
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(Color.GREEN);
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton.setBounds(97, 523, 171, 38);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Cancel");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setBackground(Color.RED);
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_1.setBounds(278, 523, 137, 38);
		}
		return btnNewButton_1;
	}
	public void setData(int id) {
		StockDao sdao = new StockDaoImpl();
		StockModel s= sdao.getProductDetailsById(id);
		
		idTxt.setText(String.valueOf(s.getProductId()));
		nameTxt.setText(s.getProductName());
		availableTxt.setText(String.valueOf(s.getProductAvailable()));
		totalTxt.setText(String.valueOf(s.getTotalAdded()));
		mrpTxt.setText(String.valueOf(s.getProductMrp()));
		
	}
	
}
