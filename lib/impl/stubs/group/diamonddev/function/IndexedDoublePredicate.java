package group.diamonddev.function;


/**
 *  Represents a predicate (function with boolean type result) with additional index argument.
 * 
 *  @author Diamond
 *  @since 1.0.0
 */
public interface IndexedDoublePredicate {

	/**
	 *  Tests the value for satisfying predicate.
	 * 
	 *  @param index the index
	 *  @param value the value to be tested
	 * 
	 *  @return {@code true} if the value matches the predicate, otherwise {@code false}
	 */
	public boolean test(int index, double value);
}
