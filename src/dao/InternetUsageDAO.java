package dao;

import service.InternetUsage;

public class InternetUsageDAO extends AbstractDAO<InternetUsage> {
	
	public InternetUsageDAO(){
		this.uniqueIdentifierFieldName = "referenceNumber";
	}

}
