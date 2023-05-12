package group.diamonddev.function;


/**
 *  Represents an operation on the index and input {@code long}-valued operand
 *  that produces a {@code long}-valued result.
 * 
 *  @author Diamond
 *  @see LongUnaryOperator
 *  @since 1.0.0
 */
public interface IndexedLongUnaryOperator {

	/**
	 *  Applies this operator to the given operand.
	 * 
	 *  @param index   the index
	 *  @param operand the operand
	 * 
	 *  @return the operator result
	 */
	public long applyAsLong(int index, long operand);
}
