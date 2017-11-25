package view;
/**
 * @author Lucian Epure 
 */

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import account.Account;
import controller.AddAccountListener;
import controller.AddNumberListener;
import controller.PromotionListener;
import controller.RemoveAccountListener;
import controller.ReportListener;

public class ManageAccounts extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable accounts;
	private JScrollPane accountsH;
	private int selectedRow;
	private int selectedCol;
	private List<Account> allAccounts;
	
	public ManageAccounts(List<Account> allAccounts) {
		this.allAccounts=allAccounts;
		setTitle("Manage Accounts");
		setBounds(100, 100, 846, 350);
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
		
		Object[] accountsColumn = {  "Id", "Name","Region","Account Type","Numbers", "Messages","Balance" };

		final DefaultTableModel accountsModel = new DefaultTableModel(accountsColumn, 0);
		accounts = new JTable(accountsModel);
		accounts.setBounds(231, 15, 388, 246);
		for(Account account:allAccounts){
			accountsModel.addRow(new Object[]{account.getId(),account.getCustomerName(),account.getHomeRegionString(),account.getClass().getSimpleName(),account.getMinutes(),account.getMessages(),account.getBalance()});
		}	
		accounts.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			 public void mouseClicked(java.awt.event.MouseEvent evt) {
			   selectedRow = accounts.rowAtPoint(evt.getPoint());
			   selectedCol = accounts.columnAtPoint(evt.getPoint());
			 }
			});
		accountsH = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		accountsH.setViewportView(accounts);
		accountsH.setBounds(145, 11, 651, 272);
		contentPane.add(accountsH);
		
		JButton btnApplyPromotion = new JButton("Apply Promotion");
		btnApplyPromotion.setBounds(10, 106, 118, 45);
		contentPane.add(btnApplyPromotion);
		
		btnAddAccount.addActionListener(new AddAccountListener(accounts));
		btnRemoveAccount.addActionListener(new RemoveAccountListener(accounts,selectedRow,selectedCol));
		btnReport.addActionListener(new ReportListener(accounts,selectedRow,selectedCol));
		btnApplyPromotion.addActionListener(new PromotionListener(accounts,selectedRow,selectedCol));
		btnAddNumber.addActionListener(new AddNumberListener(accounts,selectedRow,selectedCol));
	}
}
