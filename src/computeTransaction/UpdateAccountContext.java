package computeTransaction;
/*
 * @author Lucian Epure
 */
import account.Account;
import service.Service;

public class UpdateAccountContext {
	private AccountState accountState;
	private Account account;
	private Service service;
	private double roamingTax;
	private AccountState finalState;

	public UpdateAccountContext(AccountState state, Account account, Service service, double roamingTax) {
		this.setService(service);
		this.setAccount(account);
		accountState = state;
		this.setRoamingTax(roamingTax);
		this.finalState = new UpdatedAccount();
	}

	public Account updateAccount() {
		do{
			this.accountState.update(this);
		}
		while (this.accountState.getClass() != finalState.getClass());
		return this.account;
	}

	public void setState(AccountState state) {
		this.accountState = state;
	}

	public AccountState getState() {
		return accountState;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public double getRoamingTax() {
		return roamingTax;
	}

	public void setRoamingTax(double roamingTax) {
		this.roamingTax = roamingTax;
	}
}
