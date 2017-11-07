package dao;

/**
 * @author Andrei Baraian
 */

import service.InternetUsage;

public class InternetUsageDAO extends AbstractDAO<InternetUsage> {
	
	public InternetUsageDAO(){
		this.uniqueIdentifierFieldName = "referenceNumber";
	}

}
