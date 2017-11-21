package computeTransaction;

import account.Account;
import service.Service;

public abstract class  AccountState {

	public abstract void update(UpdateAccountContext context);
	
}
