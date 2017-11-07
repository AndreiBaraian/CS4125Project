package gui;
/*
 * @author Lucian Epure
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import account.Account;
import account.AccountFactory;
import control.Control;
import customer.Customer;
import region.Region;



public class DoneAddingListener implements ActionListener {

	private JTextField firstName;
	private JTextField lastName;
	private JTextField number;
	private JTextField address;
	private JTextField age;
	private JTextField email; 
	private JComboBox<String> type;
	private JComboBox<String> region;
	private JTextField endDate;
	private JTable table;
	Control c;
	public DoneAddingListener(Control c,JComboBox<String> type,  JTextField firstName, JTextField lastName, JTextField number,JTextField address, JTextField age,JTextField email, JComboBox<String> region, JTextField endDate,JTable table)
	{
		this.c=c;
		this.firstName=firstName;
		this.lastName=lastName;
		this.number=number;
		this.address=address;
		this.age=age;
		this.email=email;
		this.type=type;
		this.region=region;
		this.endDate=endDate;
		this.table=table;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("hei");
		UUID id = UUID.randomUUID();
        String randomUUIDString = id.toString();
        Customer cust= new Customer(firstName.getText(),lastName.getText(),Integer.parseInt(age.getText()),address.getText(),email.getText());
        Account a= AccountFactory.getAccount((String)type.getSelectedItem(), 0.0, c.search(this.region.getSelectedItem().toString()), cust, number.getText(), endDate.getText());
        //*******************************************************************************************
        // Andrei add a to the data base
        //********************************************************************************************
        DefaultTableModel model= (DefaultTableModel) table.getModel();
   
        	model.addRow(new Object[]{a.getCustomer().getId(),a.getCustomer().getFirstName(),a.getHomeregion().getRegionName(),(String)type.getSelectedItem(),"0","0",a.getBalance()}); 
      
        
	}


}
