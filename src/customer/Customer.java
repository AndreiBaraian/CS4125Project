package customer;
/*
 * @author Xiangkai Tang
 */

import java.util.Observable;
import java.util.Observer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import dao.DBRecord;

@Entity
@Table(name = "tb_customer")

public class Customer extends DBRecord implements Observer{
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "systemReference")
	private String systemReference;

	public Customer() {}
	
	public Customer(String firstName, String lastName, int age, String address, String email) {
		this.age = age;
		this.address = address;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSystemReference() {
		return systemReference;
	}

	public void setSystemReference(String systemReference) {
		this.systemReference = systemReference;
	}

	@Override
	public String getUniqueIdentifierFieldValue() {
		return systemReference;
	}


	@Override
	public void update(Observable o, Object newBalance) {
		Object message = new Object();
		message = "Mr/Mrs "+this.getFirstName()+" "+this.getLastName()+" Your new account balance is:"+newBalance;
		JOptionPane pane = new JOptionPane(message,JOptionPane.INFORMATION_MESSAGE);
		JDialog dialog = pane.createDialog(null, "Title");
        dialog.setModal(false);
        dialog.setVisible(true);
		//JOptionPane.showConfirmDialog(null, message, "Balance",JOptionPane.OK_OPTION);
	}




	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", email=" + email + ", systemReference=" + systemReference + ", id=" + id + "]";
	}
	
}
