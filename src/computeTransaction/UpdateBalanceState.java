package computeTransaction;
/*
 * @author Lucian Epure
 */
public class UpdateBalanceState extends AccountState{

	@Override
	public void update(UpdateAccountContext accountContext) {
		accountContext.getAccount().setBalance(accountContext.getAccount().getBalance()-accountContext.getService().getCustomerCost());
		accountContext.setState(new UpdatedAccount());
	}
}
