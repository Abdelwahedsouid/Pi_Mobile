package group.diamonddev;


/**
 *  Common implementations of {@code Collector} interface.
 * 
 *  @author Diamond
 *  @see Collector
 */
@java.lang.SuppressWarnings({"WeakerAccess", "unused", "RedundantTypeArguments"})
public final class Collectors {

	/**
	 *  Returns a {@code Collector} that fills new {@code Collection}, provided by {@code collectionSupplier},
	 *  with input elements.
	 * 
	 *  @param <T>                the type of the input elements
	 *  @param <R>                the type of the resulting collection
	 *  @param collectionSupplier a supplier function that provides new collection
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector toCollection(function.Supplier collectionSupplier) {
	}

	/**
	 *  Returns a {@code Collector} that fills new {@code List} with input elements.
	 * 
	 *  @param <T> the type of the input elements
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector toList() {
	}

	/**
	 *  Returns a {@code Collector} that fills new unmodifiable {@code List} with input elements.
	 *  <p>
	 *  The returned {@code Collector} disallows {@code null}s
	 *  and throws {@code NullPointerException} if it is presented with a null value.
	 * 
	 *  @param <T> the type of the input elements
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector toUnmodifiableList() {
	}

	/**
	 *  Returns a {@code Collector} that fills new {@code Set} with input elements.
	 * 
	 *  @param <T> the type of the input elements
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector toSet() {
	}

	/**
	 *  Returns a {@code Collector} that fills new unmodifiable {@code Set} with input elements.
	 *  <p>
	 *  The returned {@code Collector} disallows {@code null}s
	 *  and throws {@code NullPointerException} if it is presented with a null value.
	 *  If elements contain duplicates, an arbitrary element of the duplicates is preserved.
	 * 
	 *  @param <T> the type of the input elements
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector toUnmodifiableSet() {
	}

	/**
	 *  Returns a {@code Collector} that fills new {@code Map} with input elements.
	 *  <p>
	 *  If the mapped keys contain duplicates, an {@code IllegalStateException} is thrown.
	 *  Use {@link #toMap(Function, Function, BinaryOperator)} to handle merging of the values.
	 * 
	 *  @param <T>       the type of the input elements and the result type of value mapping function
	 *  @param <K>       the result type of key mapping function
	 *  @param keyMapper a mapping function to produce keys
	 * 
	 *  @return a {@code Collector}
	 *  @see #toMap(Function, Function, BinaryOperator)
	 *  @since 1.0.0
	 */
	public static Collector toMap(function.Function keyMapper) {
	}

	/**
	 *  Returns a {@code Collector} that fills new {@code Map} with input elements.
	 *  <p>
	 *  If the mapped keys contain duplicates, an {@code IllegalStateException} is thrown.
	 *  Use {@link #toMap(Function, Function, BinaryOperator)} to handle merging of the values.
	 * 
	 *  @param <T>         the type of the input elements
	 *  @param <K>         the result type of key mapping function
	 *  @param <V>         the result type of value mapping function
	 *  @param keyMapper   a mapping function to produce keys
	 *  @param valueMapper a mapping function to produce values
	 * 
	 *  @return a {@code Collector}
	 *  @see #toMap(Function, Function, BinaryOperator)
	 */
	public static Collector toMap(function.Function keyMapper, function.Function valueMapper) {
	}

	/**
	 *  Returns a {@code Collector} that fills new {@code Map} with input elements.
	 *  <p>
	 *  If the mapped keys contain duplicates, an {@code IllegalStateException} is thrown.
	 *  Use {@link #toMap(Function, Function, BinaryOperator, Supplier)} to handle merging of the values.
	 * 
	 *  @param <T>         the type of the input elements
	 *  @param <K>         the result type of key mapping function
	 *  @param <V>         the result type of value mapping function
	 *  @param <M>         the type of the resulting {@code Map}
	 *  @param keyMapper   a mapping function to produce keys
	 *  @param valueMapper a mapping function to produce values
	 *  @param mapFactory  a supplier function that provides new {@code Map}
	 * 
	 *  @return a {@code Collector}
	 *  @see #toMap(Function, Function, BinaryOperator, Supplier)
	 */
	public static Collector toMap(function.Function keyMapper, function.Function valueMapper, function.Supplier mapFactory) {
	}

	/**
	 *  Returns a {@code Collector} that fills new unmodifiable {@code Map} with input elements.
	 *  <p>
	 *  The returned {@code Collector} disallows {@code null} keys and values.
	 *  If the mapped keys contain duplicates, an {@code IllegalStateException} is thrown,
	 *  see {@link #toUnmodifiableMap(Function, Function, BinaryOperator)}.
	 * 
	 *  @param <T>         the type of the input elements
	 *  @param <K>         the result type of key mapping function
	 *  @param <V>         the result type of value mapping function
	 *  @param keyMapper   a mapping function to produce keys
	 *  @param valueMapper a mapping function to produce values
	 * 
	 *  @return a {@code Collector}
	 *  @see #toUnmodifiableMap(Function, Function, BinaryOperator)
	 *  @since 1.0.0
	 */
	public static Collector toUnmodifiableMap(function.Function keyMapper, function.Function valueMapper) {
	}

	/**
	 *  Returns a {@code Collector} that fills new {@code Map} with input elements.
	 *  <p>
	 *  If the mapped keys contain duplicates, the value mapping function is applied
	 *  to each equal element, and the results are merged using the provided merging function.
	 * 
	 *  @param <T>           the type of the input elements
	 *  @param <K>           the result type of key mapping function
	 *  @param <V>           the result type of value mapping function
	 *  @param keyMapper     a mapping function to produce keys
	 *  @param valueMapper   a mapping function to produce values
	 *  @param mergeFunction a merge function, used to resolve collisions between
	 *                       values associated with the same key
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector toMap(function.Function keyMapper, function.Function valueMapper, function.BinaryOperator mergeFunction) {
	}

	/**
	 *  Returns a {@code Collector} that fills new {@code Map} with input elements.
	 *  <p>
	 *  If the mapped keys contain duplicates, the value mapping function is applied
	 *  to each equal element, and the results are merged using the provided merging function.
	 * 
	 *  @param <T>           the type of the input elements
	 *  @param <K>           the result type of key mapping function
	 *  @param <V>           the result type of value mapping function
	 *  @param <M>           the type of the resulting {@code Map}
	 *  @param keyMapper     a mapping function to produce keys
	 *  @param valueMapper   a mapping function to produce values
	 *  @param mergeFunction a merge function, used to resolve collisions between
	 *                       values associated with the same key
	 *  @param mapFactory    a supplier function that provides new {@code Map}
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector toMap(function.Function keyMapper, function.Function valueMapper, function.BinaryOperator mergeFunction, function.Supplier mapFactory) {
	}

	/**
	 *  Returns a {@code Collector} that fills new unmodifiable {@code Map} with input elements.
	 *  <p>
	 *  The returned {@code Collector} disallows {@code null} keys and values.
	 * 
	 *  @param <T>           the type of the input elements
	 *  @param <K>           the result type of key mapping function
	 *  @param <V>           the result type of value mapping function
	 *  @param keyMapper     a mapping function to produce keys
	 *  @param valueMapper   a mapping function to produce values
	 *  @param mergeFunction a merge function, used to resolve collisions between
	 *                       values associated with the same key
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector toUnmodifiableMap(function.Function keyMapper, function.Function valueMapper, function.BinaryOperator mergeFunction) {
	}

	/**
	 *  Returns a {@code Collector} that concatenates input elements into new string.
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector joining() {
	}

	/**
	 *  Returns a {@code Collector} that concatenates input elements into new string.
	 * 
	 *  @param delimiter the delimiter between each element
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector joining(CharSequence delimiter) {
	}

	/**
	 *  Returns a {@code Collector} that concatenates input elements into new string.
	 * 
	 *  @param delimiter the delimiter between each element
	 *  @param prefix    the prefix of result
	 *  @param suffix    the suffix of result
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix) {
	}

	/**
	 *  Returns a {@code Collector} that concatenates input elements into new string.
	 * 
	 *  @param delimiter  the delimiter between each element
	 *  @param prefix     the prefix of result
	 *  @param suffix     the suffix of result
	 *  @param emptyValue the string which replaces empty element if exists
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix, String emptyValue) {
	}

	/**
	 *  Returns a {@code Collector} that calculates average of input elements.
	 * 
	 *  @param <T>    the type of the input elements
	 *  @param mapper the mapping function which extracts value from an element to calculate result
	 * 
	 *  @return a {@code Collector}
	 *  @deprecated As of release 1.1.3, replaced by
	 *  {@link #averagingDouble(ToDoubleFunction)}
	 */
	@java.lang.Deprecated
	public static Collector averaging(function.Function mapper) {
	}

	/**
	 *  Returns a {@code Collector} that calculates average of integer-valued input elements.
	 * 
	 *  @param <T>    the type of the input elements
	 *  @param mapper the mapping function which extracts value from an element to calculate result
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector averagingInt(function.ToIntFunction mapper) {
	}

	/**
	 *  Returns a {@code Collector} that calculates average of long-valued input elements.
	 * 
	 *  @param <T>    the type of the input elements
	 *  @param mapper the mapping function which extracts value from an element to calculate result
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector averagingLong(function.ToLongFunction mapper) {
	}

	/**
	 *  Returns a {@code Collector} that calculates average of double-valued input elements.
	 * 
	 *  @param <T>    the type of the input elements
	 *  @param mapper the mapping function which extracts value from an element to calculate result
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector averagingDouble(function.ToDoubleFunction mapper) {
	}

	/**
	 *  Returns a {@code Collector} that summing integer-valued input elements.
	 * 
	 *  @param <T>    the type of the input elements
	 *  @param mapper the mapping function which extracts value from an element to calculate result
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector summingInt(function.ToIntFunction mapper) {
	}

	/**
	 *  Returns a {@code Collector} that summing long-valued input elements.
	 * 
	 *  @param <T>    the type of the input elements
	 *  @param mapper the mapping function which extracts value from an element to calculate result
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector summingLong(function.ToLongFunction mapper) {
	}

	/**
	 *  Returns a {@code Collector} that summing double-valued input elements.
	 * 
	 *  @param <T>    the type of the input elements
	 *  @param mapper the mapping function which extracts value from an element to calculate result
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector summingDouble(function.ToDoubleFunction mapper) {
	}

	/**
	 *  Returns a {@code Collector} that counts the number of input elements.
	 * 
	 *  @param <T> the type of the input elements
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector counting() {
	}

	/**
	 *  Returns a {@code Collector} that reduces input elements.
	 * 
	 *  @param <T>      the type of the input elements
	 *  @param identity the initial value
	 *  @param op       the operator to reduce elements
	 * 
	 *  @return a {@code Collector}
	 *  @see #reducing(Object, Function, BinaryOperator)
	 */
	public static Collector reducing(Object identity, function.BinaryOperator op) {
	}

	/**
	 *  Returns a {@code Collector} that reduces input elements.
	 * 
	 *  @param <T>      the type of the input elements
	 *  @param <R>      the type of the output elements
	 *  @param identity the initial value
	 *  @param mapper   the mapping function
	 *  @param op       the operator to reduce elements
	 * 
	 *  @return a {@code Collector}
	 *  @see #reducing(Object, BinaryOperator)
	 */
	public static Collector reducing(Object identity, function.Function mapper, function.BinaryOperator op) {
	}

	/**
	 *  Returns a {@code Collector} that filters input elements.
	 * 
	 *  @param <T>        the type of the input elements
	 *  @param <A>        the accumulation type
	 *  @param <R>        the type of the output elements
	 *  @param predicate  a predicate used to filter elements
	 *  @param downstream the collector of filtered elements
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector filtering(function.Predicate predicate, Collector downstream) {
	}

	/**
	 *  Returns a {@code Collector} that performs mapping before accumulation.
	 * 
	 *  @param <T>        the type of the input elements
	 *  @param <U>        the result type of mapping function
	 *  @param <A>        the accumulation type
	 *  @param <R>        the result type of collector
	 *  @param mapper     a function that performs mapping to input elements
	 *  @param downstream the collector of mapped elements
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector mapping(function.Function mapper, Collector downstream) {
	}

	/**
	 *  Returns a {@code Collector} that performs flat-mapping before accumulation.
	 * 
	 *  @param <T>        the type of the input elements
	 *  @param <U>        the result type of flat-mapping function
	 *  @param <A>        the accumulation type
	 *  @param <R>        the result type of collector
	 *  @param mapper     a function that performs flat-mapping to input elements
	 *  @param downstream the collector of flat-mapped elements
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector flatMapping(function.Function mapper, Collector downstream) {
	}

	/**
	 *  Returns a {@code Collector} that performs additional transformation.
	 * 
	 *  @param <T>      the type of the input elements
	 *  @param <A>      the accumulation type
	 *  @param <IR>     the input type of the transformation function
	 *  @param <OR>     the output type of the transformation function
	 *  @param c        the input {@code Collector}
	 *  @param finisher the final transformation function
	 * 
	 *  @return a {@code Collector}
	 */
	public static Collector collectingAndThen(Collector c, function.Function finisher) {
	}

	/**
	 *  Returns a {@code Collector} that performs grouping operation by given classifier.
	 * 
	 *  @param <T>        the type of the input elements
	 *  @param <K>        the type of the keys
	 *  @param classifier the classifier function
	 * 
	 *  @return a {@code Collector}
	 *  @see #groupingBy(Function, Collector)
	 *  @see #groupingBy(Function, Supplier, Collector)
	 */
	public static Collector groupingBy(function.Function classifier) {
	}

	/**
	 *  Returns a {@code Collector} that performs grouping operation by given classifier.
	 * 
	 *  @param <T>        the type of the input elements
	 *  @param <K>        the type of the keys
	 *  @param <A>        the accumulation type
	 *  @param <D>        the result type of downstream reduction
	 *  @param classifier the classifier function
	 *  @param downstream the collector of mapped elements
	 * 
	 *  @return a {@code Collector}
	 *  @see #groupingBy(Function)
	 *  @see #groupingBy(Function, Supplier, Collector)
	 */
	public static Collector groupingBy(function.Function classifier, Collector downstream) {
	}

	/**
	 *  Returns a {@code Collector} that performs grouping operation by given classifier.
	 * 
	 *  @param <T>        the type of the input elements
	 *  @param <K>        the type of the keys
	 *  @param <A>        the accumulation type
	 *  @param <D>        the result type of downstream reduction
	 *  @param <M>        the type of the resulting {@code Map}
	 *  @param classifier the classifier function
	 *  @param mapFactory a supplier function that provides new {@code Map}
	 *  @param downstream the collector of mapped elements
	 * 
	 *  @return a {@code Collector}
	 *  @see #groupingBy(Function)
	 *  @see #groupingBy(Function, Collector)
	 */
	public static Collector groupingBy(function.Function classifier, function.Supplier mapFactory, Collector downstream) {
	}

	/**
	 *  Returns a {@code Collector} that performs partitioning operation according to a predicate.
	 *  The returned {@code Map} always contains mappings for both {@code false} and {@code true} keys.
	 * 
	 *  @param <T>       the type of the input elements
	 *  @param predicate a predicate used for classifying input elements
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector partitioningBy(function.Predicate predicate) {
	}

	/**
	 *  Returns a {@code Collector} that performs partitioning operation according to a predicate.
	 *  The returned {@code Map} always contains mappings for both {@code false} and {@code true} keys.
	 * 
	 *  @param <T>        the type of the input elements
	 *  @param <D>        the result type of downstream reduction
	 *  @param <A>        the accumulation type
	 *  @param predicate  a predicate used for classifying input elements
	 *  @param downstream the collector of partitioned elements
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector partitioningBy(function.Predicate predicate, Collector downstream) {
	}

	/**
	 *  Returns a {@code Collector} that composites two collectors.
	 *  Each element is processed by two specified collectors,
	 *  then their results are merged using the merge function into the final result.
	 * 
	 *  @param <T>         the type of the input elements
	 *  @param <R1>        the result type of the first collector
	 *  @param <R2>        the result type of the second collector
	 *  @param <R>         the type of the final result
	 *  @param downstream1 the first collector
	 *  @param downstream2 the second collector
	 *  @param merger      the function which merges two results into the single one
	 * 
	 *  @return a {@code Collector}
	 *  @since 1.0.0
	 */
	public static Collector teeing(Collector downstream1, Collector downstream2, function.BiFunction merger) {
	}
}
