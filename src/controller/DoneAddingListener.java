package controller;

/*
 * @author Lucian Epure
 * 
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import account.Account;
import bll.AccountBLL;
import bll.CustomerBLL;
import bll.EnterpriseAccountBLL;
import bll.FamilyAccountBLL;
import bll.RegionBLL;
import customer.Customer;
import exceptions.InsertException;
import region.Region;
import view.AddAccount;

public class DoneAddingListener implements ActionListener {

	private JTextField firstName;
	private JTextField lastName;
	private JTextField number;
	private JTextField address;
	private JTextField age;
	private JTextField email;
	private JComboBox<String> type;
	private JComboBox<String> regionCB;
	private JTextField endDate;
	private JTable table;
	private DefaultTableModel model;
	private AccountBLL<?> accountBLL;
	private CustomerBLL customerBLL;
	private AddAccount addAccount;
	private RegionBLL regionBLL;
	
	public DoneAddingListener(JComboBox<String> type, JTextField firstName, JTextField lastName, JTextField number,
			JTextField address, JTextField age, JTextField email, JComboBox<String> regionCB, JTextField endDate,
			JTable table,AddAccount addAccount) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
		this.age = age;
		this.email = email;
		this.type = type;
		this.regionCB = regionCB;
		this.endDate = endDate;
		this.table = table;
		this.addAccount=addAccount;
		this.customerBLL = new CustomerBLL();
		this.accountBLL = getAccountBLL((String)type.getSelectedItem());
		this.regionBLL = new RegionBLL();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//control = Control.getInstance();
		Customer customer = null;
		Region region = null;
		Account account = null;
		try{
			customer = customerBLL.add(firstName.getText(), lastName.getText(), Integer.parseInt(age.getText()), address.getText(), email.getText());
			region = regionBLL.search(regionCB.getSelectedItem().toString());
			account = accountBLL.addAccount((String) type.getSelectedItem(), region, customer, number.getText(), endDate.getText());
		}catch (NumberFormatException | InsertException e) {
			e.printStackTrace();
		}
		model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[] { account.getId(), account.getCustomerName(), region.getClass().getSimpleName(), account.getClass().getSimpleName(), "0","0", "0.0" }); // change these
		addAccount.dispose();
	}
	
	private AccountBLL<?> getAccountBLL(String type) {
		AccountBLL<?> accBLL = null;
		switch (type) {
		case "Enterprise" : accBLL = new EnterpriseAccountBLL();
							break;
		case "Family" : accBLL = new FamilyAccountBLL();
							break;
		}
		return accBLL;
	}

}
