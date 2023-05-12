package group.diamonddev.function;


/**
 *  Represents an operation on two input arguments.
 * 
 *  @param <T> the type of the first argument
 *  @param <U> the type of the second argument
 * 
 *  @author Diamond
 *  @see Consumer
 */
public interface BiConsumer {

	/**
	 *  Performs operation on two arguments.
	 * 
	 *  @param value1 the first argument
	 *  @param value2 the second argument
	 */
	public void accept(Object value1, Object value2);
}
