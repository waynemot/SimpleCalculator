package calculator;

@SuppressWarnings("serial")
public class ParseValueException extends Exception {
	public ParseValueException() {
		super("Parse value exception");
	}
	public ParseValueException(String details) {
		super("Parse value exception: " + details);
	}
}
