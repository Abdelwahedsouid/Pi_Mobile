package group.diamonddev;


/**
 *  A container object which may or may not contain a {@code long} value.
 * 
 *  @author Diamond
 *  @see Optional
 *  @since 1.0.0
 */
public final class OptionalLong {

	/**
	 *  Returns an empty {@code OptionalLong} instance.
	 * 
	 *  @return an empty {@code OptionalLong}
	 */
	public static OptionalLong empty() {
	}

	/**
	 *  Returns an {@code OptionalLong} with the specified value present.
	 * 
	 *  @param value the value to be present
	 * 
	 *  @return an {@code OptionalLong} with the value present
	 */
	public static OptionalLong of(long value) {
	}

	/**
	 *  Returns an {@code OptionalLong} with the specified value, or empty {@code OptionalLong} if value is null.
	 * 
	 *  @param value the value which can be null
	 * 
	 *  @return an {@code OptionalLong}
	 *  @since 1.0.0
	 */
	public static OptionalLong ofNullable(Long value) {
	}

	/**
	 *  Returns an inner value if present, otherwise throws {@code NoSuchElementException}.
	 *  <p>
	 *  Since 1.2.0 prefer {@link #orElseThrow()} method as it has readable name.
	 * 
	 *  @return the inner value of this {@code OptionalLong}
	 *  @throws NoSuchElementException if there is no value present
	 *  @see OptionalLong#isPresent()
	 *  @see #orElseThrow()
	 */
	public long getAsLong() {
	}

	/**
	 *  Checks value present.
	 * 
	 *  @return {@code true} if a value present, {@code false} otherwise
	 */
	public boolean isPresent() {
	}

	/**
	 *  Checks the value is not present.
	 * 
	 *  @return {@code true} if a value is not present, {@code false} otherwise
	 *  @since 1.0.0
	 */
	public boolean isEmpty() {
	}

	/**
	 *  Invokes consumer function with value if present, otherwise does nothing.
	 * 
	 *  @param consumer the consumer function to be executed if a value is present
	 * 
	 *  @throws NullPointerException if value is present and {@code consumer} is null
	 */
	public void ifPresent(function.LongConsumer consumer) {
	}

	/**
	 *  If a value is present, performs the given action with the value,
	 *  otherwise performs the empty-based action.
	 * 
	 *  @param consumer    the consumer function to be executed, if a value is present
	 *  @param emptyAction the empty-based action to be performed, if no value is present
	 * 
	 *  @throws NullPointerException if a value is present and the given consumer function is null,
	 *                               or no value is present and the given empty-based action is null.
	 */
	public void ifPresentOrElse(function.LongConsumer consumer, Runnable emptyAction) {
	}

	/**
	 *  Invokes consumer function with the value if present.
	 *  This method same as {@code ifPresent}, but does not breaks chaining
	 * 
	 *  @param consumer consumer function
	 * 
	 *  @return this {@code OptionalLong}
	 *  @see #ifPresent(LongConsumer)
	 */
	public OptionalLong executeIfPresent(function.LongConsumer consumer) {
	}

	/**
	 *  Invokes action function if value is absent.
	 * 
	 *  @param action action that invokes if value absent
	 * 
	 *  @return this {@code OptionalLong}
	 */
	public OptionalLong executeIfAbsent(Runnable action) {
	}

	/**
	 *  Applies custom operator on {@code OptionalLong}.
	 * 
	 *  @param <R>      the type of the result
	 *  @param function a transforming function
	 * 
	 *  @return a result of the transforming function
	 *  @throws NullPointerException if {@code function} is null
	 *  @since 1.0.0
	 */
	public Object custom(function.Function function) {
	}

	/**
	 *  Performs filtering on inner value if it is present.
	 * 
	 *  @param predicate a predicate function
	 * 
	 *  @return this {@code OptionalLong} if the value is present and matches predicate,
	 *  otherwise an empty {@code OptionalLong}
	 */
	public OptionalLong filter(function.LongPredicate predicate) {
	}

	/**
	 *  Performs negated filtering on inner value if it is present.
	 * 
	 *  @param predicate a predicate function
	 * 
	 *  @return this {@code OptionalLong} if the value is present and doesn't matches predicate,
	 *  otherwise an empty {@code OptionalLong}
	 *  @since 1.0.0
	 */
	public OptionalLong filterNot(function.LongPredicate predicate) {
	}

	/**
	 *  Invokes the given mapping function on inner value if present.
	 * 
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code OptionalLong} with transformed value if present,
	 *  otherwise an empty {@code OptionalLong}
	 *  @throws NullPointerException if value is present and
	 *                               {@code mapper} is {@code null}
	 */
	public OptionalLong map(function.LongUnaryOperator mapper) {
	}

	/**
	 *  Invokes the given mapping function on inner value if present.
	 * 
	 *  @param <U>    the type of result value
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code Optional} with transformed value if present,
	 *  otherwise an empty {@code Optional}
	 *  @throws NullPointerException if value is present and
	 *                               {@code mapper} is {@code null}
	 */
	public Optional mapToObj(function.LongFunction mapper) {
	}

	/**
	 *  Invokes the given mapping function on inner value if present.
	 * 
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code OptionalInt} with transformed value if present,
	 *  otherwise an empty {@code OptionalInt}
	 *  @throws NullPointerException if value is present and
	 *                               {@code mapper} is {@code null}
	 */
	public OptionalInt mapToInt(function.LongToIntFunction mapper) {
	}

	/**
	 *  Wraps a value into {@code LongStream} if present,
	 *  otherwise returns an empty {@code LongStream}.
	 * 
	 *  @return the optional value as an {@code LongStream}
	 */
	public LongStream stream() {
	}

	/**
	 *  Returns current {@code OptionalLong} if value is present, otherwise
	 *  returns an {@code OptionalLong} produced by supplier function.
	 * 
	 *  @param supplier supplier function that produces an {@code OptionalLong} to be returned
	 * 
	 *  @return this {@code OptionalLong} if value is present, otherwise
	 *  an {@code OptionalLong} produced by supplier function
	 *  @throws NullPointerException if value is not present and
	 *                               {@code supplier} or value produced by it is {@code null}
	 */
	public OptionalLong or(function.Supplier supplier) {
	}

	/**
	 *  Returns inner value if present, otherwise returns {@code other}.
	 * 
	 *  @param other the value to be returned if there is no value present
	 * 
	 *  @return the value, if present, otherwise {@code other}
	 */
	public long orElse(long other) {
	}

	/**
	 *  Returns the value if present, otherwise returns value produced by supplier function.
	 * 
	 *  @param other supplier function that produces value if inner value is not present
	 * 
	 *  @return the value if present otherwise the result of {@code other.getAsLong()}
	 *  @throws NullPointerException if value is not present and {@code other} is null
	 */
	public long orElseGet(function.LongSupplier other) {
	}

	/**
	 *  Returns inner value if present, otherwise throws {@code NoSuchElementException}.
	 * 
	 *  @return inner value if present
	 *  @throws NoSuchElementException if inner value is not present
	 *  @since 1.0.0
	 */
	public long orElseThrow() {
	}

	/**
	 *  Returns the value if present, otherwise throws an exception provided by supplier function.
	 * 
	 *  @param <X>               the type of exception to be thrown
	 *  @param exceptionSupplier supplier function that produces an exception to be thrown
	 * 
	 *  @return inner value if present
	 *  @throws X if inner value is not present
	 */
	public long orElseThrow(function.Supplier exceptionSupplier) {
	}

	@java.lang.Override
	public boolean equals(Object obj) {
	}

	@java.lang.Override
	public int hashCode() {
	}

	@java.lang.Override
	public String toString() {
	}
}
