package computeTransaction;

public class UpdateMessagesState extends AccountState {

	@Override
	public void update(UpdateAccountContext accountContext) {
		int messages = accountContext.getAccount().getMessages() - (int) accountContext.getService().getInfo();
		if (messages < 0) {
			accountContext.getAccount().setMessages(0);
			accountContext.getService().applyCustomerPrice(Math.abs(messages), accountContext.getRoamingTax());
		} else {
			accountContext.getAccount().setMessages(messages);
		}
		accountContext.setState(new UpdateInternetState());
	}

}
