package group.diamonddev.function;


/**
 *  Represents an operation on a single {@code double}-valued operand
 *  that produces a {@code double}-valued result.
 * 
 *  @author Diamond
 *  @see UnaryOperator
 *  @since 1.0.0
 */
public interface DoubleUnaryOperator {

	/**
	 *  Applies this operator to the given operand.
	 * 
	 *  @param operand the operand
	 * 
	 *  @return the operator result
	 */
	public double applyAsDouble(double operand);
}
