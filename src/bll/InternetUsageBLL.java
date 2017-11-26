package bll;

/**
 * @author Andrei Baraian
 */

import dao.InternetUsageDAO;
import service.InternetUsage;

public class InternetUsageBLL extends ServiceBLL<InternetUsage> {
	
	public InternetUsageBLL(){
		super(new InternetUsageDAO());
	}

}
