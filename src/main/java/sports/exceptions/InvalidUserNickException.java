package sports.exceptions;

public class InvalidUserNickException extends Exception{
	private static final long serialVersionUID = -642045799876625537L;
	public static final String DESCRIPTION = "Ese nick ya está en uso";

	public InvalidUserNickException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public InvalidUserNickException() {
		this("");
	}
}
