package com.inventorysystem.app;

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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.inventorysystem.service.BillDaoImpl;
import com.inventorysystem.service.StockDao;
import com.inventorysystem.service.StockDaoImpl;
import com.inventorysystem.service.BillDao;
import com.inventorysysystem.model.Bill;
import com.inventorysysystem.model.Goods;
import com.inventorysysystem.model.StockModel;
import com.toedter.calendar.JDateChooser;

public class CashierHomeCreateBillPg extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField customerNameTxt;
	private JLabel lblNewLabel_2;
	private JTextField productIdTxt;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField productNameTxt;
	private JTextField productMrpTxt;
	private JTextField productQuantityTxt;
	private JTextField discountTxt;
	private JTextField billNoTxt;
	private JButton btnNewButton_4;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_8;
	private JDateChooser dateChooser;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton_5;
	private JTextField totalTxt;
	private JTable table;
	private JButton btnNewButton_6;
	private JButton btnNewButton_8;


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
				JOptionPane.showMessageDialog(null, "This page belongs to create bill.");
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
				new SearchBill().setVisible(true);
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

				new ProductInformation().setVisible(true);

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
		btnNewButton_7.setBounds(1266, 632, 34, 35);
		Border emptyBorderlo = BorderFactory.createEmptyBorder();
		btnNewButton_7.setBorder(emptyBorderlo);
		contentPane.add(btnNewButton_7);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getCustomerNameTxt());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getProductIdTxt());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getProductNameTxt());
		contentPane.add(getProductMrpTxt());
		contentPane.add(getProductQuantityTxt());
		contentPane.add(getDiscountTxt());
		contentPane.add(getBillNoTxt());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getDateChooser());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getBtnNewButton_5());
		contentPane.add(getTotalTxt());
		contentPane.add(getBtnNewButton_6());
		contentPane.add(getBtnNewButton_8());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Create New Bill Here !!!");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(335, 103, 240, 35);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Customer : ");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(267, 181, 102, 25);
		}
		return lblNewLabel_1;
	}

	private JTextField getCustomerNameTxt() {
		if (customerNameTxt == null) {
			customerNameTxt = new JTextField();
			customerNameTxt.setBounds(370, 171, 191, 35);
			customerNameTxt.setColumns(10);
		}
		return customerNameTxt;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Product Id : ");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(267, 243, 90, 25);
		}
		return lblNewLabel_2;
	}

	private JTextField getProductIdTxt() {
		if (productIdTxt == null) {
			productIdTxt = new JTextField();
			productIdTxt.setBounds(370, 233, 191, 35);
			productIdTxt.setColumns(10);
		}
		return productIdTxt;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Prod. Name :");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_3.setBounds(267, 310, 111, 25);
		}
		return lblNewLabel_3;
	}

	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("MRP : ");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_4.setBounds(267, 370, 90, 25);
		}
		return lblNewLabel_4;
	}

	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Quantity : ");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_5.setBounds(267, 436, 90, 25);
		}
		return lblNewLabel_5;
	}

	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Discount (%) :");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_6.setBounds(267, 498, 102, 25);
		}
		return lblNewLabel_6;
	}

	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Bill No : ");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_7.setBounds(267, 563, 90, 25);
		}
		return lblNewLabel_7;
	}

	private JTextField getProductNameTxt() {
		if (productNameTxt == null) {
			productNameTxt = new JTextField();
			productNameTxt.setBounds(370, 300, 191, 35);
			productNameTxt.setColumns(10);
		}
		return productNameTxt;
	}

	private JTextField getProductMrpTxt() {
		if (productMrpTxt == null) {
			productMrpTxt = new JTextField();
			productMrpTxt.setBounds(370, 360, 191, 35);
			productMrpTxt.setColumns(10);
		}
		return productMrpTxt;
	}

	private JTextField getProductQuantityTxt() {
		if (productQuantityTxt == null) {
			productQuantityTxt = new JTextField();
			productQuantityTxt.setBounds(370, 426, 191, 35);
			productQuantityTxt.setColumns(10);
		}
		return productQuantityTxt;
	}

	private JTextField getDiscountTxt() {
		if (discountTxt == null) {
			discountTxt = new JTextField();
			discountTxt.setBounds(370, 488, 191, 35);
			discountTxt.setColumns(10);
		}
		return discountTxt;
	}

	private JTextField getBillNoTxt() {
		if (billNoTxt == null) {
			billNoTxt = new JTextField();
			billNoTxt.setBounds(370, 553, 191, 35);
			billNoTxt.setColumns(10);
		}
		return billNoTxt;
	}

	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("Add");
			btnNewButton_4.setBackground(Color.WHITE);
			btnNewButton_4.setForeground(Color.GREEN);
			Image addLogo = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
			btnNewButton_4.setIcon(new ImageIcon(addLogo));
			Border emptyBorderlo = BorderFactory.createEmptyBorder();
			btnNewButton_4.setBorder(emptyBorderlo);
			btnNewButton_4.addActionListener(new ActionListener() {
				int count = 0;

				public void actionPerformed(ActionEvent e) {

					Goods goods = new Goods();
					goods.setGoodsQuantity(Integer.parseInt(productQuantityTxt.getText()));
					goods.setGoodsName(productNameTxt.getText());
					goods.setGoodsMrp(Double.parseDouble(productMrpTxt.getText()));

					goods.setDiscount(Integer.parseInt(discountTxt.getText()));

					double mrp = Double.parseDouble(productMrpTxt.getText());
					double discountPercent = Integer.parseInt(discountTxt.getText());
					double priceAfterDiscount = mrp - (discountPercent / 100) * mrp;
					double finalPrice = priceAfterDiscount * Integer.parseInt(productQuantityTxt.getText());

					goods.setGoodsPrice(finalPrice);
					displayData(goods);

					count++;

					double totalAmount = 0;
					for (int i = 0; i < count; i++) {
						double total = (double) table.getModel().getValueAt(i, 3);
						totalAmount = totalAmount + total;
						String amount = Double.toString(totalAmount);
						totalTxt.setText(amount);
					}
				}
			});
			btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_4.setBounds(418, 619, 143, 48);
		}
		return btnNewButton_4;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(633, 144, 612, 482);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Date : ");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_8.setBounds(849, 108, 75, 25);
		}
		return lblNewLabel_8;
	}

	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(934, 108, 206, 25);
		}
		return dateChooser;
	}

	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Total : ");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_9.setBounds(732, 637, 75, 30);
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
					JOptionPane.showMessageDialog(null, "Sorry printing is not available yet!");
				}
			});
			btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_5.setBounds(1100, 637, 124, 30);
		}
		return btnNewButton_5;
	}

	private JTextField getTotalTxt() {
		if (totalTxt == null) {
			totalTxt = new JTextField();
			totalTxt.setBounds(817, 637, 273, 30);
			totalTxt.setColumns(10);
		}
		return totalTxt;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(
					new DefaultTableModel(new Object[][] {}, new String[] { "Quantity", "Name", "Mrp", "Price" }));
		}
		return table;
	}

	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("Remove");
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if (table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "Select any row!!!");
					}
				}
			});
			Image salesLogo = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
			btnNewButton_6.setIcon(new ImageIcon(salesLogo));
			Border emptyBorderlo = BorderFactory.createEmptyBorder();
			btnNewButton_6.setBorder(emptyBorderlo);
			btnNewButton_6.setForeground(Color.RED);
			btnNewButton_6.setBackground(Color.WHITE);
			btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton_6.setBounds(235, 619, 173, 48);
		}
		return btnNewButton_6;
	}

	private void displayData(Goods goods) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[] { goods.getGoodsQuantity(), goods.getGoodsName(), goods.getGoodsMrp(),
				goods.getGoodsPrice() });

	}

	private JButton getBtnNewButton_8() {
		if (btnNewButton_8 == null) {
			btnNewButton_8 = new JButton("");
			btnNewButton_8.setToolTipText("Save bill");
			btnNewButton_8.setBackground(Color.WHITE);
			Image salesLogo = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
			btnNewButton_8.setIcon(new ImageIcon(salesLogo));
			Border emptyBorderlo = BorderFactory.createEmptyBorder();
			btnNewButton_8.setBorder(emptyBorderlo);
			btnNewButton_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Bill bill = new Bill();
					bill.setBillNumber(Integer.parseInt(billNoTxt.getText()));
					bill.setCustomerName(customerNameTxt.getText());
					String date = dateChooser.getDate().toString();
					bill.setDate(date);
					bill.setTotalAmount(Double.parseDouble(totalTxt.getText()));

					StockDao sdao = new StockDaoImpl();
					int productId = Integer.parseInt(productIdTxt.getText());
					StockModel s = sdao.getProductDetailsById(productId);
					int total = s.getTotalAdded();
					System.out.println("Total : " + total);
					int available = s.getProductAvailable();
					System.out.println("Available : " + available);
					int quantity = Integer.parseInt(productQuantityTxt.getText());
					int leftQuantity = available - quantity;
              
					System.out.println(leftQuantity);

					sdao.updateAvailableNumber(productId, leftQuantity);

					BillDao bdao = new BillDaoImpl();
					if (bdao.addBill(bill)) {
						JOptionPane.showMessageDialog(null, "Bill added to the list of bills.");
					}

				}
			});
			btnNewButton_8.setBounds(633, 628, 89, 57);
		}
		return btnNewButton_8;
	}
}