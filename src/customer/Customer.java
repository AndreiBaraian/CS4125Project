package customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import dao.DBRecord;

@Entity
@Table(name = "tb_customer")
public class Customer extends DBRecord {
	
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
	
}
