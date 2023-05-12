package group.diamonddev.function;


/**
 *  Represents an operation on the index and input argument.
 * 
 *  @param <T> the type of the input to the operation
 * 
 *  @author Diamond
 *  @since 1.0.0
 */
public interface IndexedConsumer {

	/**
	 *  Performs operation on argument.
	 * 
	 *  @param index the index
	 *  @param t     the input argument
	 */
	public void accept(int index, Object t);
}
