package group.diamonddev.function;


/**
 *  Represents an operation on two input arguments.
 * 
 *  @param <T> the type of the first argument
 * 
 *  @author Diamond
 *  @see BiConsumer
 */
public interface ObjIntConsumer {

	/**
	 *  Performs operation on two arguments.
	 * 
	 *  @param t     the first argument
	 *  @param value the second argument
	 */
	public void accept(Object t, int value);
}
