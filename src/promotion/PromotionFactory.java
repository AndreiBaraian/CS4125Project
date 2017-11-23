package promotion;

/**
 * @author Andrei Baraian
 */

import account.Account;
import account.EnterpriseAccount;
import account.FamilyAccount;

public class PromotionFactory {
	
	public static Account applyPromotion(String type,Account account){
		Account decoratedAccount = null;
		if("Friend".equalsIgnoreCase(type)){
			decoratedAccount = new FriendPromotion(account).getAccount();
		}
		else if("Surfer".equalsIgnoreCase(type)){
			decoratedAccount = new SurferPromotion(account).getAccount();
		}
		else {
			decoratedAccount = new TravelerPromotion(account).getAccount();
		}
		return decoratedAccount;
	}
	
}
