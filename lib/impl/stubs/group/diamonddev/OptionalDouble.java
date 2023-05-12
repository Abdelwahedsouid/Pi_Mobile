package group.diamonddev;


/**
 *  A container object which may or may not contain a {@code double} value.
 * 
 *  @author Diamond
 *  @see Optional
 *  @since 1.0.0
 */
public final class OptionalDouble {

	/**
	 *  Returns an empty {@code OptionalDouble} instance.
	 * 
	 *  @return an empty {@code OptionalDouble}
	 */
	public static OptionalDouble empty() {
	}

	/**
	 *  Returns an {@code OptionalDouble} with the specified value present.
	 * 
	 *  @param value the value to be present
	 * 
	 *  @return an {@code OptionalDouble} with the value present
	 */
	public static OptionalDouble of(double value) {
	}

	/**
	 *  Returns an {@code OptionalDouble} with the specified value, or empty {@code OptionalDouble} if value is null.
	 * 
	 *  @param value the value which can be null
	 * 
	 *  @return an {@code OptionalDouble}
	 *  @since 1.0.0
	 */
	public static OptionalDouble ofNullable(Double value) {
	}

	/**
	 *  Returns an inner value if present, otherwise throws {@code NoSuchElementException}.
	 *  <p>
	 *  Since 1.2.0 prefer {@link #orElseThrow()} method as it has readable name.
	 * 
	 *  @return the inner value of this {@code OptionalDouble}
	 *  @throws NoSuchElementException if there is no value present
	 *  @see OptionalDouble#isPresent()
	 *  @see #orElseThrow()
	 */
	public double getAsDouble() {
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
	public void ifPresent(function.DoubleConsumer consumer) {
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
	public void ifPresentOrElse(function.DoubleConsumer consumer, Runnable emptyAction) {
	}

	/**
	 *  Invokes consumer function with the value if present.
	 *  This method same as {@code ifPresent}, but does not breaks chaining
	 * 
	 *  @param consumer consumer function
	 * 
	 *  @return this {@code OptionalDouble}
	 *  @see #ifPresent(DoubleConsumer)
	 */
	public OptionalDouble executeIfPresent(function.DoubleConsumer consumer) {
	}

	/**
	 *  Invokes action function if value is absent.
	 * 
	 *  @param action action that invokes if value absent
	 * 
	 *  @return this {@code OptionalDouble}
	 */
	public OptionalDouble executeIfAbsent(Runnable action) {
	}

	/**
	 *  Applies custom operator on {@code OptionalDouble}.
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
	 *  @return this {@code OptionalDouble} if the value is present and matches predicate,
	 *  otherwise an empty {@code OptionalDouble}
	 */
	public OptionalDouble filter(function.DoublePredicate predicate) {
	}

	/**
	 *  Performs negated filtering on inner value if it is present.
	 * 
	 *  @param predicate a predicate function
	 * 
	 *  @return this {@code OptionalDouble} if the value is present and doesn't matches predicate,
	 *  otherwise an empty {@code OptionalDouble}
	 *  @since 1.0.0
	 */
	public OptionalDouble filterNot(function.DoublePredicate predicate) {
	}

	/**
	 *  Invokes the given mapping function on inner value if present.
	 * 
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code OptionalDouble} with transformed value if present,
	 *  otherwise an empty {@code OptionalDouble}
	 *  @throws NullPointerException if value is present and
	 *                               {@code mapper} is {@code null}
	 */
	public OptionalDouble map(function.DoubleUnaryOperator mapper) {
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
	public Optional mapToObj(function.DoubleFunction mapper) {
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
	public OptionalInt mapToInt(function.DoubleToIntFunction mapper) {
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
	public OptionalLong mapToLong(function.DoubleToLongFunction mapper) {
	}

	/**
	 *  Wraps a value into {@code DoubleStream} if present,
	 *  otherwise returns an empty {@code DoubleStream}.
	 * 
	 *  @return the optional value as an {@code DoubleStream}
	 */
	public DoubleStream stream() {
	}

	/**
	 *  Returns current {@code OptionalDouble} if value is present, otherwise
	 *  returns an {@code OptionalDouble} produced by supplier function.
	 * 
	 *  @param supplier supplier function that produces an {@code OptionalDouble} to be returned
	 * 
	 *  @return this {@code OptionalDouble} if value is present, otherwise
	 *  an {@code OptionalDouble} produced by supplier function
	 *  @throws NullPointerException if value is not present and
	 *                               {@code supplier} or value produced by it is {@code null}
	 */
	public OptionalDouble or(function.Supplier supplier) {
	}

	/**
	 *  Returns inner value if present, otherwise returns {@code other}.
	 * 
	 *  @param other the value to be returned if there is no value present
	 * 
	 *  @return the value, if present, otherwise {@code other}
	 */
	public double orElse(double other) {
	}

	/**
	 *  Returns the value if present, otherwise returns value produced by supplier function.
	 * 
	 *  @param other supplier function that produces value if inner value is not present
	 * 
	 *  @return the value if present otherwise the result of {@code other.getAsDouble()}
	 *  @throws NullPointerException if value is not present and {@code other} is null
	 */
	public double orElseGet(function.DoubleSupplier other) {
	}

	/**
	 *  Returns inner value if present, otherwise throws {@code NoSuchElementException}.
	 * 
	 *  @return inner value if present
	 *  @throws NoSuchElementException if inner value is not present
	 *  @since 1.0.0
	 */
	public double orElseThrow() {
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
	public double orElseThrow(function.Supplier exceptionSupplier) {
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
