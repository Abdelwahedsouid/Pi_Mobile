package group.diamonddev;


/**
 *  The Collector of stream data.
 * 
 *  @param <T> the type of input elements to the reduction operation
 *  @param <A> the mutable accumulation type of the reduction operation
 *  @param <R> the result type of the reduction operation
 * 
 *  @author Diamond
 *  @see Stream#collect(Collector)
 */
public interface Collector {

	/**
	 *  Function provides new containers.
	 * 
	 *  @return {@code Supplier}
	 */
	public function.Supplier supplier();

	/**
	 *  Function folds elements into a container.
	 * 
	 *  @return {@code BiConsumer}
	 */
	public function.BiConsumer accumulator();

	/**
	 *  Function produces result by transforming intermediate type.
	 * 
	 *  @return {@code Function}
	 */
	public function.Function finisher();
}
