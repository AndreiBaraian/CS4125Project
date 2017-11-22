package computeTransaction;
/*
 * @author Lucian Epure
 */

public class CreatedAccount extends AccountState{


	@Override
	public void update(UpdateAccountContext context) {	
		context.setState(new UpdateMinutesState());
	}
}
