package group.diamonddev;


/**
 *  Back-ported default and static methods from Java 8 {@link Comparator} interface.
 * 
 *  @author Diamond
 *  @since 1.0.0
 */
@java.lang.SuppressWarnings("WeakerAccess")
public final class ComparatorCompat implements java.util.Comparator {

	public ComparatorCompat(java.util.Comparator comparator) {
	}

	/**
	 *  Returns a comparator with natural order.
	 * 
	 *  @param <T> the type of the objects compared by the comparator
	 * 
	 *  @return a comparator
	 */
	@java.lang.SuppressWarnings("unchecked")
	public static ComparatorCompat naturalOrder() {
	}

	/**
	 *  Returns a comparator with reverse order.
	 * 
	 *  @param <T> the type of the objects compared by the comparator
	 * 
	 *  @return a comparator
	 *  @see Collections#reverseOrder()
	 */
	@java.lang.SuppressWarnings("unchecked")
	public static ComparatorCompat reverseOrder() {
	}

	/**
	 *  Returns a comparator that reverses the order of the specified comparator.
	 *  If the specified comparator is {@code null}, this method is equivalent
	 *  to {@link #reverseOrder()}.
	 * 
	 *  @param <T>        the type of the objects compared by the comparator
	 *  @param comparator a comparator to be reversed
	 * 
	 *  @return a comparator
	 *  @throws NullPointerException if {@code comparator} is null
	 *  @see Collections#reverseOrder(Comparator)
	 */
	public static java.util.Comparator reversed(java.util.Comparator comparator) {
	}

	/**
	 *  Returns a comparator that uses {@code c2} comparator
	 *  if {@code c1} comparator considers two elements equal.
	 * 
	 *  @param <T> the type of the objects compared by the comparators
	 *  @param c1  a first comparator
	 *  @param c2  a second comparator
	 * 
	 *  @return a comparator
	 *  @throws NullPointerException if {@code c1} or {@code c2} is null
	 */
	public static java.util.Comparator thenComparing(java.util.Comparator c1, java.util.Comparator c2) {
	}

	/**
	 *  Returns a comparator that uses a function that extracts a sort key
	 *  to be compared with the specified comparator.
	 * 
	 *  @param <T>           the type of the objects compared by the comparator
	 *  @param <U>           the type of the sort key
	 *  @param keyExtractor  the function that extracts the sort key
	 *  @param keyComparator the comparator used to compare the sort key
	 * 
	 *  @return a comparator
	 *  @throws NullPointerException if {@code keyExtractor} or {@code keyComparator} is null
	 */
	public static ComparatorCompat comparing(function.Function keyExtractor, java.util.Comparator keyComparator) {
	}

	/**
	 *  Returns a comparator that uses a function that extracts
	 *  a {@link Comparable} sort key to be compared.
	 * 
	 *  @param <T>          the type of the objects compared by the comparator
	 *  @param <U>          the type of the sort key
	 *  @param keyExtractor the function that extracts the sort key
	 * 
	 *  @return a comparator
	 *  @throws NullPointerException if {@code keyExtractor} is null
	 */
	public static ComparatorCompat comparing(function.Function keyExtractor) {
	}

	/**
	 *  Returns a comparator that uses a function that extracts
	 *  an {@code int} sort key to be compared.
	 * 
	 *  @param <T>          the type of the objects compared by the comparator
	 *  @param keyExtractor the function that extracts the sort key
	 * 
	 *  @return a comparator
	 *  @throws NullPointerException if {@code keyExtractor} is null
	 */
	public static ComparatorCompat comparingInt(function.ToIntFunction keyExtractor) {
	}

	/**
	 *  Returns a comparator that uses a function that extracts
	 *  a {@code long} sort key to be compared.
	 * 
	 *  @param <T>          the type of the objects compared by the comparator
	 *  @param keyExtractor the function that extracts the sort key
	 * 
	 *  @return a comparator
	 *  @throws NullPointerException if {@code keyExtractor} is null
	 */
	public static ComparatorCompat comparingLong(function.ToLongFunction keyExtractor) {
	}

	/**
	 *  Returns a comparator that uses a function that extracts
	 *  a {@code double} sort key to be compared.
	 * 
	 *  @param <T>          the type of the objects compared by the comparator
	 *  @param keyExtractor the function that extracts the sort key
	 * 
	 *  @return a comparator
	 *  @throws NullPointerException if {@code keyExtractor} is null
	 */
	public static ComparatorCompat comparingDouble(function.ToDoubleFunction keyExtractor) {
	}

	/**
	 *  Returns a comparator that considers {@code null} to be
	 *  less than non-null and all non-null values to be equal.
	 * 
	 *  @param <T> the type of the objects compared by the comparator
	 * 
	 *  @return a comparator
	 */
	public static ComparatorCompat nullsFirst() {
	}

	/**
	 *  Returns a comparator that considers {@code null} to be less than non-null.
	 *  If the specified comparator is {@code null}, then the returned
	 *  comparator considers all non-null values to be equal.
	 * 
	 *  @param <T>        the type of the objects compared by the comparator
	 *  @param comparator a comparator for comparing non-null values
	 * 
	 *  @return a comparator
	 */
	public static ComparatorCompat nullsFirst(java.util.Comparator comparator) {
	}

	/**
	 *  Returns a comparator that considers {@code null} to be
	 *  greater than non-null and all non-null values to be equal.
	 * 
	 *  @param <T> the type of the objects compared by the comparator
	 * 
	 *  @return a comparator
	 */
	public static ComparatorCompat nullsLast() {
	}

	/**
	 *  Returns a comparator that considers {@code null} to be greater than non-null.
	 *  If the specified comparator is {@code null}, then the returned
	 *  comparator considers all non-null values to be equal.
	 * 
	 *  @param <T>        the type of the objects compared by the comparator
	 *  @param comparator a comparator for comparing non-null values
	 * 
	 *  @return a comparator
	 */
	public static ComparatorCompat nullsLast(java.util.Comparator comparator) {
	}

	/**
	 *  Allows to build comparators with method chaining.
	 * 
	 *  @param <T>        the type of the objects compared by the comparator
	 *  @param comparator the comparator to be chained
	 * 
	 *  @return a {@code ComparatorCompat} instance
	 */
	public static ComparatorCompat chain(java.util.Comparator comparator) {
	}

	/**
	 *  Reverses the order of comparator.
	 * 
	 *  @return the new {@code ComparatorCompat} instance
	 *  @see ComparatorCompat#reverseOrder()
	 */
	public ComparatorCompat reversed() {
	}

	/**
	 *  Adds the given comparator to the chain.
	 * 
	 *  @param other the other comparator to be used when chained
	 *               comparator compares two objects that are equal
	 * 
	 *  @return the new {@code ComparatorCompat} instance
	 */
	public ComparatorCompat thenComparing(java.util.Comparator other) {
	}

	/**
	 *  Adds the comparator, that uses a function for extract
	 *  a sort key, to the chain.
	 * 
	 *  @param <U>           the type of the sort key
	 *  @param keyExtractor  the function that extracts the sort key
	 *  @param keyComparator the comparator used to compare the sort key
	 * 
	 *  @return the new {@code ComparatorCompat} instance
	 */
	public ComparatorCompat thenComparing(function.Function keyExtractor, java.util.Comparator keyComparator) {
	}

	/**
	 *  Adds the comparator, that uses a function for extract
	 *  a {@link Comparable} sort key, to the chain.
	 * 
	 *  @param <U>          the type of the sort key
	 *  @param keyExtractor the function that extracts the sort key
	 * 
	 *  @return the new {@code ComparatorCompat} instance
	 */
	public ComparatorCompat thenComparing(function.Function keyExtractor) {
	}

	/**
	 *  Adds the comparator, that uses a function for extract
	 *  an {@code int} sort key, to the chain.
	 * 
	 *  @param keyExtractor the function that extracts the sort key
	 * 
	 *  @return the new {@code ComparatorCompat} instance
	 */
	public ComparatorCompat thenComparingInt(function.ToIntFunction keyExtractor) {
	}

	/**
	 *  Adds the comparator, that uses a function for extract
	 *  a {@code long} sort key, to the chain.
	 * 
	 *  @param keyExtractor the function that extracts the sort key
	 * 
	 *  @return the new {@code ComparatorCompat} instance
	 */
	public ComparatorCompat thenComparingLong(function.ToLongFunction keyExtractor) {
	}

	/**
	 *  Adds the comparator, that uses a function for extract
	 *  a {@code double} sort key, to the chain.
	 * 
	 *  @param keyExtractor the function that extracts the sort key
	 * 
	 *  @return the new {@code ComparatorCompat} instance
	 */
	public ComparatorCompat thenComparingDouble(function.ToDoubleFunction keyExtractor) {
	}

	/**
	 *  Returns a chained {@code Comparator}.
	 * 
	 *  @return a comparator
	 *  @deprecated As of release 1.1.7, it is unnecessary to call this method.
	 */
	@java.lang.SuppressWarnings("unchecked")
	public java.util.Comparator comparator() {
	}

	@java.lang.Override
	public int compare(Object o1, Object o2) {
	}
}
