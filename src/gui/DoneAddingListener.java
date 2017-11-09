package gui;
/*
 * @author Lucian Epure
 * 
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
	private DefaultTableModel model;
	private Control c;
	public static Customer customer; //get Customer
	public static String endate;     //get endate
	public static String custo_number;  //get number in account
	public DoneAddingListener(JComboBox<String> type,  JTextField firstName, JTextField lastName, JTextField number,JTextField address, JTextField age,JTextField email, JComboBox<String> region, JTextField endDate,JTable table)
	{
		
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
        c=Control.getInstance();
        model= (DefaultTableModel) table.getModel();
        
    	model.addRow(new Object[]{firstName.getText(),lastName.getText(),c.search(this.region.getSelectedItem().toString()),(String)type.getSelectedItem(),"0","0","0.0"}); //change these
    	
    	//get value for applying promotion
    	customer = new Customer(firstName.getText(),lastName.getText(),Integer.parseInt(age.getText()),address.getText(),email.getText());
    	endate = endDate.getText();
    	custo_number = number.getText();
	}


}
