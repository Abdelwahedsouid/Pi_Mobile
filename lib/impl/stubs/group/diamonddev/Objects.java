package group.diamonddev;


/**
 *  Common operations with Object.
 * 
 *  @author Diamond
 */
@java.lang.SuppressWarnings("WeakerAccess")
public final class Objects {

	/**
	 *  Checks equality of two objects.
	 * 
	 *  @param a an object
	 *  @param b an object
	 * 
	 *  @return {@code true} if objects are equals, {@code false} otherwise
	 */
	public static boolean equals(Object a, Object b) {
	}

	/**
	 *  Checks deep equality of two objects.
	 * 
	 *  @param a an object
	 *  @param b an object
	 * 
	 *  @return {@code true} if objects are deeply equals, {@code false} otherwise
	 *  @see Arrays#deepEquals(Object[], Object[])
	 *  @see Objects#equals(Object, Object)
	 *  @since 1.0.0
	 */
	public static boolean deepEquals(Object a, Object b) {
	}

	/**
	 *  Returns the hash code of object.
	 * 
	 *  @param o an object
	 * 
	 *  @return the hash code
	 */
	public static int hashCode(Object o) {
	}

	/**
	 *  Returns the hash code for the objects.
	 * 
	 *  @param values the values
	 * 
	 *  @return the hash code
	 */
	public static int hash(Object[] values) {
	}

	/**
	 *  Returns result of calling {@code toString} on object or {@code nullDefault} if object is null.
	 * 
	 *  @param o           an object
	 *  @param nullDefault a string to return if object is null
	 * 
	 *  @return a result of calling {@code toString} on object or {@code nullDefault} if object is null.
	 */
	public static String toString(Object o, String nullDefault) {
	}

	/**
	 *  Compares two objects with provided comparator.
	 * 
	 *  @param <T> the type of the arguments
	 *  @param a   an object
	 *  @param b   an object
	 *  @param c   the comparator
	 * 
	 *  @return comparing result
	 */
	public static int compare(Object a, Object b, java.util.Comparator c) {
	}

	/**
	 *  Compares two {@code int} values.
	 * 
	 *  @param x the first {@code int} value
	 *  @param y the second {@code int} value
	 * 
	 *  @return comparing result
	 *  @since 1.0.0
	 */
	public static int compareInt(int x, int y) {
	}

	/**
	 *  Compares two {@code long} values.
	 * 
	 *  @param x the first {@code long} value
	 *  @param y the second {@code long} value
	 * 
	 *  @return comparing result
	 *  @since 1.0.0
	 */
	public static int compareLong(long x, long y) {
	}

	/**
	 *  Checks that object reference is not {@code null}.
	 * 
	 *  @param <T> the type of the object
	 *  @param obj an object
	 * 
	 *  @return a source object if it is not {@code null}
	 *  @throws NullPointerException if object is {@code null}
	 *  @see #requireNonNull(Object, String)
	 */
	public static Object requireNonNull(Object obj) {
	}

	/**
	 *  Checks that object reference is not {@code null}.
	 * 
	 *  @param <T>     the type of the object
	 *  @param obj     an object
	 *  @param message a message to be used as exception details
	 * 
	 *  @return a source object if it is not {@code null}
	 *  @throws NullPointerException if object is {@code null}
	 *  @see #requireNonNull(Object)
	 */
	public static Object requireNonNull(Object obj, String message) {
	}

	/**
	 *  Checks that object reference is not {@code null}.
	 * 
	 *  @param <T>             the type of the object
	 *  @param obj             an object
	 *  @param messageSupplier a supplier of the detail message
	 *                         for {@code NullPointerException}.
	 * 
	 *  @return a source object if it is not {@code null}
	 *  @throws NullPointerException if object is {@code null}
	 *  @see #requireNonNull(Object)
	 *  @since 1.0.0
	 */
	public static Object requireNonNull(Object obj, function.Supplier messageSupplier) {
	}

	/**
	 *  Returns the first object if it is non-{@code null},
	 *  returns the non-{@code null} second object otherwise.
	 * 
	 *  @param <T>        the type of the objects
	 *  @param obj        an object
	 *  @param defaultObj a non-{@code null} object to return
	 *                    if the first object is {@code null}
	 * 
	 *  @return the first object if it is non-{@code null},
	 *  the non-{@code null} second object otherwise.
	 *  @since 1.0.0
	 */
	public static Object requireNonNullElse(Object obj, Object defaultObj) {
	}

	/**
	 *  Returns the first object if it is non-{@code null},
	 *  returns the non-{@code null} supplier's result otherwise.
	 * 
	 *  @param <T>      the type of the first object and return type
	 *  @param obj      an object
	 *  @param supplier a supplier to return non-{@code null} object
	 *                  if first object is {@code null}
	 * 
	 *  @return the first object if it is non-{@code null},
	 *  the non-{@code null} supplier's result otherwise
	 *  @since 1.0.0
	 */
	public static Object requireNonNullElseGet(Object obj, function.Supplier supplier) {
	}

	/**
	 *  Checks that collection and its elements are non-{@code null}.
	 * 
	 *  @param <T>        the type of the objects in the collection
	 *  @param collection a collection to be checked for non-{@code null} elements
	 * 
	 *  @return a collection
	 *  @throws NullPointerException if collection or its elements are {@code null}
	 *  @since 1.0.0
	 */
	public static java.util.Collection requireNonNullElements(java.util.Collection collection) {
	}

	/**
	 *  Checks that object reference is {@code null}.
	 * 
	 *  @param obj an object
	 * 
	 *  @return {@code true} if the object reference is {@code null}, {@code false} otherwise
	 *  @see Predicate
	 *  @since 1.0.0
	 */
	public static boolean isNull(Object obj) {
	}

	/**
	 *  Checks that object reference is not {@code null}.
	 * 
	 *  @param obj an object
	 * 
	 *  @return {@code false} if the object reference is {@code null}, {@code true} otherwise
	 *  @see Predicate
	 *  @see Predicate.Util#notNull()
	 *  @since 1.0.0
	 */
	public static boolean nonNull(Object obj) {
	}
}
