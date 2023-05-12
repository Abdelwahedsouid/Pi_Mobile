package group.diamonddev.function;


/**
 *  Represents an operation on the index and input argument.
 * 
 *  @author Diamond
 *  @since 1.0.0
 */
public interface IndexedDoubleConsumer {

	/**
	 *  Performs operation on argument.
	 * 
	 *  @param index the index
	 *  @param value the input argument
	 */
	public void accept(int index, double value);
}
