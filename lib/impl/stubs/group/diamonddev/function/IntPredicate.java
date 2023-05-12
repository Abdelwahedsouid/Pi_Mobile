package group.diamonddev.function;


/**
 *  Represents a predicate (function with boolean type result).
 * 
 *  @author Diamond
 */
public interface IntPredicate {

	/**
	 *  Tests the value for satisfying predicate.
	 * 
	 *  @param value the value to be tested
	 * 
	 *  @return {@code true} if the value matches the predicate, otherwise {@code false}
	 */
	public boolean test(int value);
}
