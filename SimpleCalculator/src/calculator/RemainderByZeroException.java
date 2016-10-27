package calculator;

public class RemainderByZeroException extends Exception {

	public RemainderByZeroException() {
		super("Remainder by zero exception");
	}
	public RemainderByZeroException(String s) {
		super("Remainder by zero exception "+s);
	}
}
