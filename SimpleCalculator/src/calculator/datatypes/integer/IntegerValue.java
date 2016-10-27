package calculator.datatypes.integer;

import calculator.AbstractValue;
import calculator.DivisionByZeroException;
import calculator.RemainderByZeroException;

public class IntegerValue extends AbstractValue {
	private final int value;

	public IntegerValue(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return Integer.toString(value);
	}

	@Override
	public AbstractValue add(AbstractValue operand) {
		return new IntegerValue(value + ((IntegerValue) operand).value);
	}

	@Override
	public AbstractValue sub(AbstractValue operand) {
		return new IntegerValue(value - ((IntegerValue) operand).value);
	}

	@Override
	public AbstractValue mul(AbstractValue operand) {
		return new IntegerValue(value * ((IntegerValue) operand).value);
	}

	@Override
	public AbstractValue div(AbstractValue operand)
			throws DivisionByZeroException {
		int intValue = ((IntegerValue) operand).value;
		if (intValue == 0)
			throw new DivisionByZeroException();
		return new IntegerValue(value / intValue);
	}
	@Override
	public AbstractValue mod(AbstractValue operand) 
	        throws RemainderByZeroException {
		int intValue = ((IntegerValue) operand).value;
		if(intValue == 0)
			throw new RemainderByZeroException();
		return new IntegerValue(value / intValue);
	}
	
	@Override
	public AbstractValue pow(AbstractValue operand) {
		int rval = 0;
		int intValue = ((IntegerValue) operand).value;
		double dret = Math.pow((double)value, (double)intValue);
		long lval = Math.round(dret);
		if(lval > Integer.MAX_VALUE) rval = Integer.MAX_VALUE;
		else rval = (int)lval;
		return (new IntegerValue(rval));
	}

}
