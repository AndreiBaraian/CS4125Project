package computeTransaction;
/*
 * @author Lucian Epure
 */
public class UpdateMinutesState extends AccountState{
	
	@Override
	public void update(UpdateAccountContext accountContext) {	
		int minutes = accountContext.getAccount().getMinutes() - (int)accountContext.getService().getInfo();
		if(minutes < 0){
			accountContext.getAccount().setMinutes(0);
			accountContext.getService().applyCustomerPrice(Math.abs(minutes), accountContext.getRoamingTax());
		}
		else{
			accountContext.getAccount().setMinutes(minutes);
		}
		accountContext.setState(new UpdateMessagesState());
	}

}
