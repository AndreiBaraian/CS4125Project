package bll;

/**
 * @author Andrei Baraian
 */

import dao.CallDAO;
import service.Call;

public class CallBLL extends ServiceBLL<Call> {
	
	public CallBLL() {
		super(new CallDAO());
	}

}
