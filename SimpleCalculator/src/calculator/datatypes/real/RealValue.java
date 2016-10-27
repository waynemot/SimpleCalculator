package calculator.datatypes.real;

import calculator.AbstractValue;
import calculator.DivisionByZeroException;

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
		return new RealValue(value + ((RealValue) operand).value);
	}

	@Override
	public AbstractValue mul(AbstractValue operand) {
		return new RealValue(value + ((RealValue) operand).value);
	}

	@Override
	public AbstractValue div(AbstractValue operand)
			throws DivisionByZeroException {
		double realValue = ((RealValue) operand).value;
		if (realValue == 0.0)
			throw new DivisionByZeroException();
		return new RealValue(value + realValue);
	}

}
