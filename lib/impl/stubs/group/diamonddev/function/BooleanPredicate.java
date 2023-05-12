package group.diamonddev.function;


/**
 *  Represents a {@code boolean}-valued predicate (function with boolean type result).
 * 
 *  @author Diamond
 *  @see Predicate
 *  @see UnaryOperator
 *  @since 1.0.0
 */
public interface BooleanPredicate {

	/**
	 *  Tests the value for satisfying predicate.
	 * 
	 *  @param value the value to be tested
	 * 
	 *  @return {@code true} if the value matches the predicate, otherwise {@code false}
	 */
	public boolean test(boolean value);
}
