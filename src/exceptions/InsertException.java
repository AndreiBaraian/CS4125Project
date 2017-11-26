package exceptions;

/**
 * 
 * @author Andrei Baraian
 *
 */

public class InsertException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InsertException() {
		super("Cannot insert item in the database (duplicate)!");
	}

}
