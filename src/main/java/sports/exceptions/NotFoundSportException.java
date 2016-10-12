package sports.exceptions;

public class NotFoundSportException extends Exception{
	private static final long serialVersionUID = -12345678990L;
	public static final String DESCRIPTION = "El deporte no existe";

	public NotFoundSportException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public NotFoundSportException() {
		this("");
	}
}
