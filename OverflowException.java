package practiceQuestions;

public class OverflowException extends Exception {
	
	private String message;
	
	public OverflowException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "OverflowException [message=" + message + "]";
	}

	
}
