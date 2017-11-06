package dao;

import service.Call;

public class CallDAO extends AbstractDAO<Call> {
	
	public CallDAO(){
		this.uniqueIdentifierFieldName = "referenceNumber";
	}

}
