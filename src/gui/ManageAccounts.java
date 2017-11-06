package gui;
/**
 * @author Lucian Epure 
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import control.Control;

import javax.swing.JButton;

public class ManageAccounts extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable accounts;
	private JTable numbers;
	private JScrollPane accountsH;
	private JScrollPane numbersH;
	private Control c;
	private int selectedRow;
	private int selectedCol;
	private Object obj=null;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ManageAccounts(Control c) {
		this.c=c;
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
		
		Object[] accountsColumn = {  "Id", "Name","Region","Account Type","Minutes", "Messages","Balance" };

		final DefaultTableModel accountsModel = new DefaultTableModel(accountsColumn, 0);
		accounts = new JTable(accountsModel);
		accounts.setBounds(231, 15, 388, 246);
		accounts.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			 public void mouseClicked(java.awt.event.MouseEvent evt) {
			   selectedRow = accounts.rowAtPoint(evt.getPoint());
			   selectedCol = accounts.columnAtPoint(evt.getPoint());
			   obj=accounts.getValueAt(selectedRow,selectedCol);
			 }
			});
		accountsH = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		accountsH.setViewportView(accounts);
		accountsH.setBounds(145, 11, 651, 272);
		contentPane.add(accountsH);
		
		JButton btnApplyPromotion = new JButton("Apply Promotion");
		btnApplyPromotion.setBounds(10, 106, 118, 45);
		contentPane.add(btnApplyPromotion);
		
		btnAddAccount.addActionListener(new AddAccountListener(c,accounts));
		btnRemoveAccount.addActionListener(new RemoveAccountListener(c,accounts,selectedRow,selectedCol));
		btnReport.addActionListener(new ReportListener(accounts,selectedRow,selectedCol));
		
		btnApplyPromotion.addActionListener(new PromotionListener());
	}
}
