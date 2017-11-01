package exceptions;

public class InsertException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InsertException() {
		super("Cannot insert item in the database (duplicate)!");
	}

}
