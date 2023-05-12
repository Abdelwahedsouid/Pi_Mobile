package group.diamonddev;


/**
 *  A container object which may or may not contain a {@code int} value.
 *  If a value is present, {@code isPresent()} will return {@code true} and
 *  {@code getAsInt()} will return the value.
 * 
 *  @author Diamond
 */
public final class OptionalInt {

	/**
	 *  Returns an empty {@code OptionalInt} instance.  No value is present for this
	 *  OptionalInt.
	 * 
	 *  @return an empty {@code OptionalInt}
	 */
	public static OptionalInt empty() {
	}

	/**
	 *  Return an {@code OptionalInt} with the specified value present.
	 * 
	 *  @param value the value to be present
	 * 
	 *  @return an {@code OptionalInt} with the value present
	 */
	public static OptionalInt of(int value) {
	}

	/**
	 *  Returns an {@code OptionalInt} with the specified value, or empty {@code OptionalInt} if value is null.
	 * 
	 *  @param value the value which can be null
	 * 
	 *  @return an {@code OptionalInt}
	 *  @since 1.0.0
	 */
	public static OptionalInt ofNullable(Integer value) {
	}

	/**
	 *  If a value is present in this {@code OptionalInt}, returns the value,
	 *  otherwise throws {@code NoSuchElementException}.
	 *  <p>
	 *  Since 1.2.0 prefer {@link #orElseThrow()} method as it has readable name.
	 * 
	 *  @return the value held by this {@code OptionalInt}
	 *  @throws NoSuchElementException if there is no value present
	 *  @see OptionalInt#isPresent()
	 *  @see #orElseThrow()
	 */
	public int getAsInt() {
	}

	/**
	 *  Return {@code true} if there is a value present, otherwise {@code false}.
	 * 
	 *  @return {@code true} if there is a value present, otherwise {@code false}
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
	 *  @param consumer block to be executed if a value is present
	 * 
	 *  @throws NullPointerException if value is present and {@code consumer} is
	 *                               null
	 */
	public void ifPresent(function.IntConsumer consumer) {
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
	 *  @since 1.0.0
	 */
	public void ifPresentOrElse(function.IntConsumer consumer, Runnable emptyAction) {
	}

	/**
	 *  Invokes consumer function with value if present.
	 *  This method same as {@code ifPresent}, but does not break chaining
	 * 
	 *  @param consumer consumer function
	 * 
	 *  @return this {@code OptionalInt}
	 *  @see #ifPresent(IntConsumer)
	 *  @since 1.0.0
	 */
	public OptionalInt executeIfPresent(function.IntConsumer consumer) {
	}

	/**
	 *  Invokes action function if value is absent.
	 * 
	 *  @param action action that invokes if value absent
	 * 
	 *  @return this {@code OptionalInt}
	 *  @since 1.0.0
	 */
	public OptionalInt executeIfAbsent(Runnable action) {
	}

	/**
	 *  Applies custom operator on {@code OptionalInt}.
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
	 *  @return this {@code OptionalInt} if the value is present and matches predicate,
	 *  otherwise an empty {@code OptionalInt}
	 *  @since 1.0.0
	 */
	public OptionalInt filter(function.IntPredicate predicate) {
	}

	/**
	 *  Performs negated filtering on inner value if it is present.
	 * 
	 *  @param predicate a predicate function
	 * 
	 *  @return this {@code OptionalInt} if the value is present and doesn't matches predicate,
	 *  otherwise an empty {@code OptionalInt}
	 *  @since 1.0.0
	 */
	public OptionalInt filterNot(function.IntPredicate predicate) {
	}

	/**
	 *  Invokes mapping function on inner value if present.
	 * 
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code OptionalInt} with transformed value if present,
	 *  otherwise an empty {@code OptionalInt}
	 *  @throws NullPointerException if value is present and
	 *                               {@code mapper} is {@code null}
	 *  @since 1.0.0
	 */
	public OptionalInt map(function.IntUnaryOperator mapper) {
	}

	/**
	 *  Invokes mapping function on inner value if present.
	 * 
	 *  @param <U>    the type of result value
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code Optional} with transformed value if present,
	 *  otherwise an empty {@code Optional}
	 *  @throws NullPointerException if value is present and
	 *                               {@code mapper} is {@code null}
	 *  @since 1.0.0
	 */
	public Optional mapToObj(function.IntFunction mapper) {
	}

	/**
	 *  Invokes mapping function on inner value if present.
	 * 
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code OptionalLong} with transformed value if present,
	 *  otherwise an empty {@code OptionalLong}
	 *  @throws NullPointerException if value is present and
	 *                               {@code mapper} is {@code null}
	 *  @since 1.0.0
	 */
	public OptionalLong mapToLong(function.IntToLongFunction mapper) {
	}

	/**
	 *  Invokes mapping function on inner value if present.
	 * 
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code OptionalDouble} with transformed value if present,
	 *  otherwise an empty {@code OptionalDouble}
	 *  @throws NullPointerException if value is present and
	 *                               {@code mapper} is {@code null}
	 *  @since 1.0.0
	 */
	public OptionalDouble mapToDouble(function.IntToDoubleFunction mapper) {
	}

	/**
	 *  Wraps a value into {@code IntStream} if present, otherwise returns an empty {@code IntStream}.
	 * 
	 *  @return the optional value as an {@code IntStream}
	 */
	public IntStream stream() {
	}

	/**
	 *  Returns current {@code OptionalInt} if value is present, otherwise
	 *  returns an {@code OptionalInt} produced by supplier function.
	 * 
	 *  @param supplier supplier function that produces an {@code OptionalInt} to be returned
	 * 
	 *  @return this {@code OptionalInt} if value is present, otherwise
	 *  an {@code OptionalInt} produced by supplier function
	 *  @throws NullPointerException if value is not present and
	 *                               {@code supplier} or value produced by it is {@code null}
	 */
	public OptionalInt or(function.Supplier supplier) {
	}

	/**
	 *  Returns the value if present, otherwise returns {@code other}.
	 * 
	 *  @param other the value to be returned if there is no value present
	 * 
	 *  @return the value, if present, otherwise {@code other}
	 */
	public int orElse(int other) {
	}

	/**
	 *  Returns the value if present, otherwise invokes {@code other} and returns
	 *  the result of that invocation.
	 * 
	 *  @param other a {@code IntSupplier} whose result is returned if no value
	 *               is present
	 * 
	 *  @return the value if present otherwise the result of {@code other.getAsInt()}
	 *  @throws NullPointerException if value is not present and {@code other} is
	 *                               null
	 */
	public int orElseGet(function.IntSupplier other) {
	}

	/**
	 *  Returns inner value if present, otherwise throws {@code NoSuchElementException}.
	 * 
	 *  @return inner value if present
	 *  @throws NoSuchElementException if inner value is not present
	 *  @since 1.0.0
	 */
	public int orElseThrow() {
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
	public int orElseThrow(function.Supplier exceptionSupplier) {
	}

	/**
	 *  Indicates whether some other object is "equal to" this OptionalInt. The
	 *  other object is considered equal if:
	 *  <ul>
	 *     <li> it is also an {@code OptionalInt} and;
	 *     <li> both instances have no value present or;
	 *     <li> the present values are "equal to" each other via {@code ==}.
	 *  </ul>
	 * 
	 *  @param obj an object to be tested for equality
	 * 
	 *  @return {@code true} if the other object is "equal to" this object
	 *  otherwise {@code false}
	 */
	@java.lang.Override
	public boolean equals(Object obj) {
	}

	/**
	 *  Returns the hash code value of the present value, if any, or 0 (zero) if
	 *  no value is present.
	 * 
	 *  @return hash code value of the present value or 0 if no value is present
	 */
	@java.lang.Override
	public int hashCode() {
	}

	/**
	 *  Returns a non-empty string representation of this object suitable for
	 *  debugging.
	 * 
	 *  @return the string representation of this instance
	 */
	@java.lang.Override
	public String toString() {
	}
}
