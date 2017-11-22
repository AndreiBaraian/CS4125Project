package computeTransaction;
/*
 * @author Lucian Epure
 */

public class UpdateInternationalMinutesState extends AccountState{

	@Override
	public void update(UpdateAccountContext accountContext) {
		
		int internationalMinutes = accountContext.getAccount().getMinutes() - (int)accountContext.getService().getInfo();
		if(accountContext.getService().getInternational() == true){
			if(internationalMinutes < 0){
				accountContext.getAccount().setMinutes(0);
				accountContext.getService().applyCustomerPrice(Math.abs(internationalMinutes), accountContext.getRoamingTax());
			}
			else{
				accountContext.getAccount().setInternationalMinutes(internationalMinutes);
			}
		}
		accountContext.setState(new UpdateBalanceState());
	}

}
