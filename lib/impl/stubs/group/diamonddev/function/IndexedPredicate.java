package group.diamonddev.function;


/**
 *  Represents a predicate (function with boolean type result) with additional index argument.
 * 
 *  @param <T> the type of the input to the function
 * 
 *  @author Diamond
 *  @since 1.0.0
 */
public interface IndexedPredicate {

	/**
	 *  Tests the value for satisfying predicate.
	 * 
	 *  @param index the index
	 *  @param value the value to be tested
	 * 
	 *  @return {@code true} if the value matches the predicate, otherwise {@code false}
	 */
	public boolean test(int index, Object value);
}
