package dao;

/**
 * @author Andrei Baraian
 */

import service.Call;

public class CallDAO extends AbstractDAO<Call> {
	
	public CallDAO(){
		this.uniqueIdentifierFieldName = "referenceNumber";
	}

}
