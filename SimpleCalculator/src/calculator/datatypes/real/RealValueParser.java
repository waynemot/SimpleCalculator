package calculator.datatypes.real;

import calculator.AbstractValue;
import calculator.AbstractValueParser;
import calculator.ParseValueException;

public class RealValueParser implements AbstractValueParser {

	@Override
	public AbstractValue parse(String value) throws ParseValueException {
		try {
			return new RealValue(Double.parseDouble(value));
		} catch (NumberFormatException exception) {
			throw new ParseValueException();
		}
	}

	@Override
	public String getDatatypeName() {
		return "Real number mode";
	}
	
    @Override
    public String getOperators() {
    	return "operators: + - * / ^";
    }


}
