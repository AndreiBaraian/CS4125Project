package computeTransaction;
/*
 * @author Lucian Epure
 */
public class UpdateInternetState extends AccountState {

	@Override
	public void update(UpdateAccountContext accountContext) {
		double mobileData = accountContext.getAccount().getMobileData() - accountContext.getService().getInfo();
		if (mobileData < 0) {
			accountContext.getAccount().setMobileData(0);
			accountContext.getService().applyCustomerPrice(Math.abs(mobileData), accountContext.getRoamingTax());
		} 
		else {
			accountContext.getAccount().setMobileData(mobileData);
		}
		accountContext.setState(new UpdateInternationalMinutesState());
	}

}
