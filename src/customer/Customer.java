package customer;

//@Entity
//@Table(name = "tb_customer")
public class Customer {
	
	//@Id
	//@GeneratedValue
	//@Column(name = "id")
	private String id;
	
	//@Column(name = "name")
	private String name;
	
	//@Column(name = "age")
	private int age;
	
	//@Column(name = "address")
	private String address;
	
	//@Column(name = "email")
	private String email;
	
	public Customer(String id, String name, int age, String address, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
}
