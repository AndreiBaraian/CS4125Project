package computeTransaction;
/*
 * @author Lucian Epure
 */
public class UpdatedAccount extends AccountState{

	@Override
	public void update(UpdateAccountContext context) {
		System.out.println("Account updated motherfucker!!!");	
	}
}
