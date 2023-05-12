package group.diamonddev.function;


/**
 *  Represents an operation on the index and input {@code double}-valued operand
 *  that produces a {@code double}-valued result.
 * 
 *  @author Diamond
 *  @see DoubleUnaryOperator
 *  @since 1.0.0
 */
public interface IndexedDoubleUnaryOperator {

	/**
	 *  Applies this operator to the given operand.
	 * 
	 *  @param index   the index
	 *  @param operand the operand
	 * 
	 *  @return the operator result
	 */
	public double applyAsDouble(int index, double operand);
}
