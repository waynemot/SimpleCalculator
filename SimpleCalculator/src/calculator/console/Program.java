package calculator.console;

import java.util.Scanner;

import calculator.AbstractValueParser;
import calculator.Calculator;
import calculator.datatypes.integer.IntegerValueParser;
import calculator.datatypes.real.RealValueParser;

public class Program {

	private final Scanner scanner;

	private final Calculator calc;

	private AbstractValueParser[] valueParsers;

	public Program() {
		scanner = new Scanner(System.in);
		valueParsers = new AbstractValueParser[] { new IntegerValueParser(),
				new RealValueParser() };
		AbstractValueParser parser = inputValueParser();
		System.out.println("Calculator operating in '" + parser.getDatatypeName()
				+ "' "+parser.getOperators());
		calc = new Calculator(parser);
	}

	private AbstractValueParser inputValueParser() {
		showChoises();
		int choice = scanner.nextInt();
		if (choice >= 1 && choice <= valueParsers.length)
			return valueParsers[choice - 1];
		else {
			System.out.println("Enter a valid selection!");
			return inputValueParser();
		}
	}

	private void showChoises() {
		System.out.println("Select a numeric operator mode:");
		for (int i = 0; i < valueParsers.length; i++)
			System.out.println("  " + (i + 1) + ". "
					+ valueParsers[i].getDatatypeName());
	}

	public static void main(String args[]) {
		try {
			Program instance = new Program();
			instance.run(args);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	private void run(String[] args) {
		while (true) {
			String arg1 = scanner.next();
			if (arg1.equals("exit") || arg1.equals("quit"))
				break;
			String op = scanner.next();
			String arg2 = scanner.next();
			try {
				System.out.println(" = " + calc.calculate(arg1, op, arg2));

			} catch (Exception exception) {
				System.out.println(exception.getLocalizedMessage());
			}
		}
	}

}
