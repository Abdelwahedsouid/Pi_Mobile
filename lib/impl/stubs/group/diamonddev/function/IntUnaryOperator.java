package group.diamonddev.function;


/**
 *  Represents an operation on a single int-valued operand that produces an int-valued result.
 *  This is the primitive type specialization of UnaryOperator for the int.
 * 
 *  @author Diamond
 */
public interface IntUnaryOperator {

	/**
	 *  Applies this operator to the given operand.
	 * 
	 *  @param operand the operand
	 * 
	 *  @return the operator result
	 */
	public int applyAsInt(int operand);
}
