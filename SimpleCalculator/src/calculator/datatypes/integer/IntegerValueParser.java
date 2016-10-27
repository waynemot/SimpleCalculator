package calculator.datatypes.integer;

import calculator.AbstractValue;
import calculator.AbstractValueParser;
import calculator.ParseValueException;

public class IntegerValueParser implements AbstractValueParser {

	@Override
	public AbstractValue parse(String value) throws ParseValueException {
		try {
			return new IntegerValue(Integer.parseInt(value));
		} catch (NumberFormatException exception) {
			throw new ParseValueException();
		}
	}

	@Override
	public String getDatatypeName() {
		return "Integer mode";
	}
	
	@Override
	public String getOperators() {
		return "operators are: + - * / % ^";
	}

}
