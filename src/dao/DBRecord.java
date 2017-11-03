package dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class DBRecord {

	@Id
	@GeneratedValue
	@Column(name = "id")
	protected int id;
	
	@Transient
	protected String uniqueIdentifierFieldName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUniqueIdentifierFieldName() {
		return uniqueIdentifierFieldName;
	}

	public abstract void setUniqueIdentifierFieldName();
	
	public abstract String getReferenceNumber();

}
