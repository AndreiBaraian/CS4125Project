package promotion;

import account.Account;

public class PromotionFactory {
	public static Account applyPromotion(String type,Account account){
		if("Friend".equalsIgnoreCase(type)){
			return new FriendPromotion(account);
		}
		else if("Surfer".equalsIgnoreCase(type)){
			return new SurferPromotion(account);
		}
		else 
			return new TravelerPromotion(account);
}
}
