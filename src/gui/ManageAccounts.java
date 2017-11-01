package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class ManageAccounts extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable accounts;
	private JTable numbers;
	private JScrollPane accountsH;
	private JScrollPane numbersH;
	private ApplyPromotion applyPromotionFrame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ManageAccounts() {
		setTitle("Manage Accounts");
		setBounds(100, 100, 683, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddAccount = new JButton("Add Account");
		btnAddAccount.setBounds(10, 27, 118, 23);
		contentPane.add(btnAddAccount);
		
		JButton btnRemoveAccount = new JButton("Remove Account");
		btnRemoveAccount.setBounds(10, 61, 118, 23);
		contentPane.add(btnRemoveAccount);
		
		JButton btnAddNumber = new JButton("Add number");
		btnAddNumber.setBounds(10, 170, 118, 23);
		contentPane.add(btnAddNumber);
		
		JButton btnRemoveNumber = new JButton("Remove number");
		btnRemoveNumber.setBounds(10, 204, 118, 23);
		contentPane.add(btnRemoveNumber);
		
		JButton btnReport = new JButton("Report");
		btnReport.setBounds(10, 238, 118, 45);
		contentPane.add(btnReport);
		
		Object[] accountsColumn = {  "Customer", "Numbers quant" };

		final DefaultTableModel accountsModel = new DefaultTableModel(accountsColumn, 0);
		accounts = new JTable(accountsModel);
		accounts.setBounds(231, 15, 388, 246);
		
		accountsH = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		accountsH.setViewportView(accounts);
		accountsH.setBounds(145, 11, 207, 272);
		contentPane.add(accountsH);
		
		
		Object[] numbersColumn = {  "Number", "Minutes", "Messages","Cost" };

		final DefaultTableModel numbersModel = new DefaultTableModel(numbersColumn, 0);
		numbers = new JTable(numbersModel);
		numbers.setBounds(231, 15, 388, 246);
		
		numbersH = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		numbersH.setViewportView(numbers);
		numbersH.setBounds(362, 11, 295, 272);
		contentPane.add(numbersH);
		
		JButton btnApplyPromotion = new JButton("Apply Promotion");
		btnApplyPromotion.setBounds(10, 106, 118, 45);
		contentPane.add(btnApplyPromotion);
		btnApplyPromotion.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				applyPromotionFrame = new ApplyPromotion();
				applyPromotionFrame.setVisible(true);
				
				
			}
			
			
		});
	}
}
