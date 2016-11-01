package calculator.datatypes.real;

import calculator.AbstractValue;
import calculator.DivisionByZeroException;
import calculator.OperationNotSupportedException;

public class RealValue extends AbstractValue {

	private final double value;

	public RealValue(double value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return Double.toString(value);
	}

	@Override
	public AbstractValue add(AbstractValue operand) {
		return new RealValue(value + ((RealValue) operand).value);
	}

	@Override
	public AbstractValue sub(AbstractValue operand) {
		return new RealValue(value - ((RealValue) operand).value);
	}

	@Override
	public AbstractValue mul(AbstractValue operand) {
		return new RealValue(value * ((RealValue) operand).value);
	}

	@Override
	public AbstractValue div(AbstractValue operand)
			throws DivisionByZeroException {
		double realValue = ((RealValue) operand).value;
		if (realValue == 0.0)
			throw new DivisionByZeroException();
		return new RealValue(value / realValue);
	}
	
	@Override
	public AbstractValue mod(AbstractValue operand)
	        throws OperationNotSupportedException {
		throw new OperationNotSupportedException
		    ("modulo invalid on Real number");
	}
	
	@Override
	public AbstractValue pow(AbstractValue operand) {
		return (new RealValue(Math.pow(value, (double)((RealValue)operand).value)));
	}

}
