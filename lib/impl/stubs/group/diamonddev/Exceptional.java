package group.diamonddev;


/**
 *  A container for values which provided by {@code ThrowableSupplier}.
 *  <p>
 *  Stores value which provided by {@link ThrowableSupplier} or an exception which were thrown.
 * 
 *  <pre><code>
 *      Exceptional.of(new ThrowableSupplier&lt;String, Throwable&gt;() {
 *           &#64;Override
 *           public String get() throws Throwable {
 *               return IOUtils.read(inputStream);
 *           }
 *       }).ifExceptionIs(IOException.class, new Consumer&lt;IOException&gt;() {
 *           &#64;Override
 *           public void accept(IOException exception) {
 *               logger.log(Level.WARNING, "read file", exception);
 *           }
 *       }).getOrElse("default string");
 * 
 *       Exceptional.of(() -&gt; IOUtils.readBytes(inputStream)).getOrElse(new byte[0]);
 *  </code></pre>
 * 
 *  @param <T> the type of the inner value
 * 
 *  @author Diamond
 */
@java.lang.SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
public class Exceptional {

	/**
	 *  Returns an {@code Exceptional} with value provided by given {@code ThrowableSupplier} function.
	 * 
	 *  @param <T>      the type of value
	 *  @param supplier a supplier function
	 * 
	 *  @return an {@code Exceptional}
	 *  @throws NullPointerException if {@code supplier} is null
	 */
	public static Exceptional of(function.ThrowableSupplier supplier) {
	}

	/**
	 *  Returns an {@code Exceptional} with throwable already set.
	 * 
	 *  @param <T>       the type of value
	 *  @param throwable throwable instance
	 * 
	 *  @return an {@code Exceptional}
	 */
	public static Exceptional of(Throwable throwable) {
	}

	/**
	 *  Returns inner value.
	 * 
	 *  @return inner value.
	 */
	public Object get() {
	}

	/**
	 *  Checks value present (i.e. there were no exceptions).
	 * 
	 *  @return {@code true} if a value present, {@code false} otherwise
	 */
	public boolean isPresent() {
	}

	/**
	 *  Returns inner value if there were no exceptions, otherwise returns {@code other}.
	 * 
	 *  @param other the value to be returned if there were any exception
	 * 
	 *  @return inner value if there were no exceptions, otherwise {@code other}
	 */
	public Object getOrElse(Object other) {
	}

	/**
	 *  Returns inner value if there were no exceptions, otherwise returns value produced by supplier function.
	 * 
	 *  @param other the supplier function that produces value if there were any exception
	 * 
	 *  @return inner value if there were no exceptions, otherwise value produced by supplier function
	 *  @since 1.0.0
	 */
	public Object getOrElse(function.Supplier other) {
	}

	/**
	 *  Wraps inner value with {@code Optional} container
	 * 
	 *  @return an {@code Optional}
	 */
	public Optional getOptional() {
	}

	/**
	 *  Returns exception.
	 * 
	 *  @return exception
	 */
	public Throwable getException() {
	}

	/**
	 *  Returns inner value if there were no exceptions, otherwise throws an exception.
	 * 
	 *  @return inner value if there were no exceptions
	 *  @throws Throwable that was thrown in supplier function
	 */
	public Object getOrThrow() {
	}

	/**
	 *  Returns inner value if there were no exceptions, otherwise throws {@code RuntimeException}.
	 * 
	 *  @return inner value if there were no exceptions
	 *  @throws RuntimeException with wrapped exception which was thrown in supplier function
	 */
	public Object getOrThrowRuntimeException() {
	}

	/**
	 *  Returns inner value if there were no exceptions, otherwise throws the given {@code exception}.
	 * 
	 *  @param <E>       the type of exception
	 *  @param exception an exception to be thrown
	 * 
	 *  @return inner value if there were no exceptions
	 *  @throws E if there were exceptions in supplier function
	 */
	public Object getOrThrow(Throwable exception) {
	}

	/**
	 *  Returns current {@code Exceptional} if there were no exceptions, otherwise
	 *  returns an {@code Exceptional} produced by supplier function.
	 * 
	 *  @param supplier supplier function that produced an {@code Exceptional} to be returned
	 * 
	 *  @return this {@code Exceptional} if there were no exceptions, otherwise
	 *  an {@code Exceptional} produced by supplier function
	 *  @throws NullPointerException if {@code supplier} or its result is null
	 */
	public Exceptional or(function.Supplier supplier) {
	}

	/**
	 *  Applies custom operator on {@code Exceptional}.
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
	 *  Invokes mapping function on inner value if there were no exceptions.
	 * 
	 *  @param <U>    the type of result value
	 *  @param mapper mapping function
	 * 
	 *  @return an {@code Exceptional} with transformed value if there were no exceptions
	 *  @throws NullPointerException if {@code mapper} is null
	 */
	public Exceptional map(function.ThrowableFunction mapper) {
	}

	/**
	 *  Invokes consumer function with value if present.
	 * 
	 *  @param consumer a consumer function
	 * 
	 *  @return this {@code Exceptional}
	 *  @since 1.0.0
	 */
	public Exceptional ifPresent(function.Consumer consumer) {
	}

	/**
	 *  Invokes consumer function if there were any exception.
	 * 
	 *  @param consumer a consumer function
	 * 
	 *  @return an {@code Exceptional}
	 */
	public Exceptional ifException(function.Consumer consumer) {
	}

	/**
	 *  Invokes consumer function if exception class matches {@code throwableClass}.
	 * 
	 *  @param <E>            the type of exception
	 *  @param throwableClass the class of an exception to be compared
	 *  @param consumer       a consumer function
	 * 
	 *  @return an {@code Exceptional}
	 */
	@java.lang.SuppressWarnings("unchecked")
	public Exceptional ifExceptionIs(Class throwableClass, function.Consumer consumer) {
	}

	/**
	 *  Returns current {@code Exceptional} if there were no exceptions, otherwise
	 *  calls {@code function} and wraps produced result with an {@code Exceptional}.
	 * 
	 *  @param function recovering function
	 * 
	 *  @return this {@code Exceptional} if there were no exceptions, otherwise
	 *  an {@code Exceptional} with wrapped recovering function result
	 *  @throws NullPointerException if {@code function} is null
	 *  @since 1.0.0
	 */
	public Exceptional recover(function.ThrowableFunction function) {
	}

	/**
	 *  Returns current {@code Exceptional} if there were no exceptions, otherwise
	 *  returns an {@code Exceptional} produced by {@code function}.
	 * 
	 *  @param function recovering function
	 * 
	 *  @return this {@code Exceptional} if there were no exceptions, otherwise
	 *  an {@code Exceptional} produced by recovering function
	 *  @throws NullPointerException if {@code function} or produced result is null
	 *  @since 1.0.0
	 */
	public Exceptional recoverWith(function.Function function) {
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
