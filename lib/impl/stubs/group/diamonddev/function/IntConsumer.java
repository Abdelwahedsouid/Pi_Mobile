package group.diamonddev.function;


/**
 *  Represents an operation that accepts a single {@code int}-valued argument and
 *  returns no result.  This is the primitive type specialization of
 *  {@link Consumer} for {@code int}.  Unlike most other
 *  functional interfaces, {@code IntConsumer} is expected to operate via side effects.
 * 
 *  <p>This is a functional interface whose functional method is {@link #accept(int)}
 * 
 *  @author Diamond
 *  @see Consumer
 */
public interface IntConsumer {

	/**
	 *  Performs this operation on the given argument.
	 * 
	 *  @param value the input argument
	 */
	public void accept(int value);
}
