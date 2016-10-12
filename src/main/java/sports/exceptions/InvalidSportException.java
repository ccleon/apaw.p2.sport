package sports.exceptions;

public class InvalidSportException extends Exception {
	private static final long serialVersionUID = -3893110892899234744L;
	
	public static final String DESCRIPTION = "El deporte ya existe";

	public InvalidSportException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public InvalidSportException() {
		this("");
	}
}
