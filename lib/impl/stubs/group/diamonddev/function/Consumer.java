package group.diamonddev.function;


/**
 *  Represents an operation on input argument.
 * 
 *  @param <T> the type of the input to the operation
 * 
 *  @author Diamond
 *  @see BiConsumer
 */
public interface Consumer {

	/**
	 *  Performs operation on argument.
	 * 
	 *  @param t the input argument
	 */
	public void accept(Object t);
}
