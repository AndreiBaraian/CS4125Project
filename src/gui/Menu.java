package gui;
/**
 * @author Lucian Epure 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import control.Control;

import javax.swing.JButton;

public class Menu {

	private JFrame frmMainMenu;
	private ProcessBills processBills;
	private ManageAccounts manageAccounts;

	private Control c;
	/**
	 * Create the application.
	 * @param c 
	 */
	public Menu(Control c) {
		this.c= c;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrmMainMenu(new JFrame());
		getFrmMainMenu().setTitle("Main Menu");
		getFrmMainMenu().setBounds(100, 100, 395, 248);
		getFrmMainMenu().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrmMainMenu().getContentPane().setLayout(null);
		
		JButton btnProcessBills = new JButton("Process Bills");
		btnProcessBills.setBounds(79, 50, 231, 23);
		getFrmMainMenu().getContentPane().add(btnProcessBills);
		btnProcessBills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				processBills = new ProcessBills(c);
				processBills.setVisible(true);
			}
		});
		
		JButton btnManageAccounts = new JButton("Manage Accounts");
		btnManageAccounts.setBounds(79, 108, 231, 23);
		getFrmMainMenu().getContentPane().add(btnManageAccounts);
		btnManageAccounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				manageAccounts = new ManageAccounts(c);
				manageAccounts.setVisible(true);
			}
		});
	}
	
	
	
	
	/**
	 * Launch the application.
	 */
	

	public JFrame getFrmMainMenu() {
		return frmMainMenu;
	}

	public void setFrmMainMenu(JFrame frmMainMenu) {
		this.frmMainMenu = frmMainMenu;
	}
}
