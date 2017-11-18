package promotion;

import account.Account;
import account.EnterpriseAccount;
import account.FamilyAccount;

public class PromotionFactory {
	
	public static Account applyPromotion(String type,Account account){
		Account decoratedAccount = null;
		if("Friend".equalsIgnoreCase(type)){
			decoratedAccount = new FriendPromotion(account);
			decoratedAccount = castAccount(decoratedAccount, account.getClass().getSimpleName());
		}
		else if("Surfer".equalsIgnoreCase(type)){
			decoratedAccount = new SurferPromotion(account);
			decoratedAccount = castAccount(decoratedAccount, account.getClass().getSimpleName());
		}
		else {
			decoratedAccount = new TravelerPromotion(account);
			decoratedAccount = castAccount(decoratedAccount, account.getClass().getSimpleName());
		}
		return decoratedAccount;
	}
	
	private static Account castAccount(Account decoratedAccount, String type){
		
		Account newAccount = null;
		if(type.equals("EnterpriseAccount")){
			newAccount = new EnterpriseAccount();
		}
		if(type.equals("FamilyAccount"))
			newAccount = new FamilyAccount();
		
		newAccount.setBalance(decoratedAccount.getBalance());
		newAccount.setCustomer(decoratedAccount.getCustomer());
		newAccount.setCustomerName(decoratedAccount.getCustomerName());
		newAccount.setCustomerSystemReference(decoratedAccount.getCustomerSystemReference());
		newAccount.setDifferentProviderMinutes(decoratedAccount.getDifferentProviderMinutes());
		newAccount.setDuration(decoratedAccount.getDuration());
		newAccount.setHomeregion(decoratedAccount.getHomeregion());
		newAccount.setHomeRegionString(decoratedAccount.getHomeRegionString());
		newAccount.setId(decoratedAccount.getId());
		newAccount.setInternationalMinutes(decoratedAccount.getInternationalMinutes());
		newAccount.setMessages(decoratedAccount.getMessages());
		newAccount.setMinutes(decoratedAccount.getMinutes());
		newAccount.setMobileData(decoratedAccount.getMobileData());
		
		return newAccount;
	}
	
}
