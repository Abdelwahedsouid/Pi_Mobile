package group.diamonddev;


/**
 *  A container object which may or may not contain a non-null value.
 * 
 *  @param <T> the type of the inner value
 * 
 *  @author Diamond
 */
@java.lang.SuppressWarnings("WeakerAccess")
public class Optional {

	/**
	 *  Returns an {@code Optional} with the specified present non-null value.
	 * 
	 *  @param <T>   the type of value
	 *  @param value the value to be present, must be non-null
	 * 
	 *  @return an {@code Optional}
	 *  @throws NullPointerException if value is null
	 *  @see #ofNullable(Object)
	 */
	public static Optional of(Object value) {
	}

	/**
	 *  Returns an {@code Optional} with the specified value, or empty {@code Optional} if value is null.
	 * 
	 *  @param <T>   the type of value
	 *  @param value the value which can be null
	 * 
	 *  @return an {@code Optional}
	 *  @see #of(Object)
	 */
	public static Optional ofNullable(Object value) {
	}

	/**
	 *  Returns an empty {@code Optional}.
	 * 
	 *  @param <T> the type of value
	 * 
	 *  @return an {@code Optional}
	 */
	@java.lang.SuppressWarnings("unchecked")
	public static Optional empty() {
	}

	/**
	 *  Returns an inner value if present, otherwise throws {@code NoSuchElementException}.
	 *  <p>
	 *  Since 1.2.0 prefer {@link #orElseThrow()} method as it has readable name.
	 * 
	 *  @return the inner value of {@code Optional}
	 *  @throws NoSuchElementException if value is not present
	 *  @see #orElseThrow()
	 */
	public Object get() {
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
	 *  Invokes consumer function with value if present.
	 * 
	 *  @param consumer the consumer function
	 */
	public void ifPresent(function.Consumer consumer) {
	}

	/**
	 *  If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
	 * 
	 *  @param consumer    the consumer function to be executed, if a value is present
	 *  @param emptyAction the empty-based action to be performed, if no value is present
	 * 
	 *  @throws NullPointerException if a value is present and the given consumer function is null,
	 *                               or no value is present and the given empty-based action is null.
	 */
	public void ifPresentOrElse(function.Consumer consumer, Runnable emptyAction) {
	}

	/**
	 *  Invokes consumer function with the value if present.
	 *  This method same as {@code ifPresent}, but does not breaks chaining
	 * 
	 *  @param consumer consumer function
	 * 
	 *  @return this {@code Optional}
	 *  @see #ifPresent(Consumer)
	 *  @since 1.0.0
	 */
	public Optional executeIfPresent(function.Consumer consumer) {
	}

	/**
	 *  Invokes action function if value is absent.
	 * 
	 *  @param action action that invokes if value absent
	 * 
	 *  @return this {@code Optional}
	 *  @since 1.0.0
	 */
	public Optional executeIfAbsent(Runnable action) {
	}

	/**
	 *  Applies custom operator on {@code Optional}.
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
	 *  @return this {@code Optional} if the value is present and matches predicate,
	 *  otherwise an empty {@code Optional}
	 */
	public Optional filter(function.Predicate predicate) {
	}

	/**
	 *  Performs negated filtering on inner value if it is present.
	 * 
	 *  @param predicate a predicate function
	 * 
	 *  @return this {@code Optional} if the value is present and doesn't matches predicate,
	 *  otherwise an empty {@code Optional}
	 *  @since 1.0.0
	 */
	public Optional filterNot(function.Predicate predicate) {
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
	public Optional map(function.Function mapper) {
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
	 *  @since 1.0.0
	 */
	public OptionalInt mapToInt(function.ToIntFunction mapper) {
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
	public OptionalLong mapToLong(function.ToLongFunction mapper) {
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
	public OptionalDouble mapToDouble(function.ToDoubleFunction mapper) {
	}

	/**
	 *  Invokes mapping function on inner value if present.
	 * 
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code OptionalBoolean} with transformed value if present,
	 *  otherwise an empty {@code OptionalBoolean}
	 *  @throws NullPointerException if value is present and
	 *                               {@code mapper} is {@code null}
	 */
	public OptionalBoolean mapToBoolean(function.ToBooleanFunction mapper) {
	}

	/**
	 *  Invokes mapping function with {@code Optional} result if value is present.
	 * 
	 *  @param <U>    the type of result value
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code Optional} with transformed value if present, otherwise an empty {@code Optional}
	 */
	public Optional flatMap(function.Function mapper) {
	}

	/**
	 *  Wraps a value into {@code Stream} if present, otherwise returns an empty {@code Stream}.
	 * 
	 *  @return the optional value as a {@code Stream}
	 */
	@java.lang.SuppressWarnings("unchecked")
	public Stream stream() {
	}

	/**
	 *  Keeps inner value only if is present and instance of given class.
	 * 
	 *  @param <R>   a type of instance to select.
	 *  @param clazz a class which instance should be selected
	 * 
	 *  @return an {@code Optional} with value of type class if present, otherwise an empty {@code Optional}
	 */
	@java.lang.SuppressWarnings("unchecked")
	public Optional select(Class clazz) {
	}

	/**
	 *  Returns current {@code Optional} if value is present, otherwise
	 *  returns an {@code Optional} produced by supplier function.
	 * 
	 *  @param supplier supplier function that produces an {@code Optional} to be returned
	 * 
	 *  @return this {@code Optional} if value is present, otherwise
	 *  an {@code Optional} produced by supplier function
	 *  @throws NullPointerException if value is not present and
	 *                               {@code supplier} or value produced by it is {@code null}
	 */
	public Optional or(function.Supplier supplier) {
	}

	/**
	 *  Returns inner value if present, otherwise returns {@code other}.
	 * 
	 *  @param other the value to be returned if inner value is not present
	 * 
	 *  @return inner value if present, otherwise {@code other}
	 */
	public Object orElse(Object other) {
	}

	/**
	 *  Returns inner value if present, otherwise returns value produced by supplier function.
	 * 
	 *  @param other supplier function that produces value if inner value is not present
	 * 
	 *  @return inner value if present, otherwise value produced by supplier function
	 */
	public Object orElseGet(function.Supplier other) {
	}

	/**
	 *  Returns inner value if present, otherwise throws {@code NoSuchElementException}.
	 * 
	 *  @return inner value if present
	 *  @throws NoSuchElementException if inner value is not present
	 *  @since 1.0.0
	 */
	public Object orElseThrow() {
	}

	/**
	 *  Returns inner value if present, otherwise throws the exception provided by supplier function.
	 * 
	 *  @param <X> the type of exception to be thrown
	 *  @param exc supplier function that produces an exception to be thrown
	 * 
	 *  @return inner value if present
	 *  @throws X if inner value is not present
	 */
	public Object orElseThrow(function.Supplier exc) {
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
