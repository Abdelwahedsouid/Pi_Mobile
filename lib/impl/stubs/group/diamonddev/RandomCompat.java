package group.diamonddev;


/**
 *  Back-ported stream APIs from {@link Random} class.
 * 
 *  @author Diamond
 */
@java.lang.SuppressWarnings("WeakerAccess")
public final class RandomCompat {

	/**
	 *  Constructs object, inner {@code random} created with default constructor.
	 */
	public RandomCompat() {
	}

	/**
	 *  Constructs object, inner {@code random} created with seed passed as param.
	 * 
	 *  @param seed seed to initialize {@code random} object
	 */
	public RandomCompat(long seed) {
	}

	/**
	 *  Constructs object with the given {@code Random} instance.
	 * 
	 *  @param random {@code Random} instance
	 */
	public RandomCompat(java.util.Random random) {
	}

	/**
	 *  Returns underlying {@link Random} instance.
	 * 
	 *  @return {@link Random} object instance
	 */
	public java.util.Random getRandom() {
	}

	/**
	 *  Returns a stream producing the given {@code streamSize} number of
	 *  pseudorandom {@code int} values.
	 * 
	 *  <p>A pseudorandom {@code int} value is generated as if it's the result of
	 *  calling the method {@link Random#nextInt()}
	 * 
	 *  @param streamSize the number of values to generate
	 * 
	 *  @return a stream of pseudorandom {@code int} values
	 *  @throws IllegalArgumentException if {@code streamSize} is
	 *                                   less than zero
	 */
	public IntStream ints(long streamSize) {
	}

	/**
	 *  Returns a stream producing the given {@code streamSize} number of
	 *  pseudorandom {@code long} values, each between zero (inclusive)
	 *  and one (exclusive).
	 * 
	 *  <p>A pseudorandom {@code long} value is generated as if it's the result of
	 *  calling the method {@link Random#nextLong()}
	 * 
	 *  @param streamSize the number of values to generate
	 * 
	 *  @return a stream of pseudorandom {@code long} values
	 *  @throws IllegalArgumentException if {@code streamSize} is
	 *                                   less than zero
	 */
	public LongStream longs(long streamSize) {
	}

	/**
	 *  Returns a stream producing the given {@code streamSize} number of
	 *  pseudorandom {@code double} values, each between zero (inclusive)
	 *  and one (exclusive).
	 * 
	 *  <p>A pseudorandom {@code double} value is generated as if it's the result of
	 *  calling the method {@link Random#nextDouble()}
	 * 
	 *  @param streamSize the number of values to generate
	 * 
	 *  @return a stream of pseudorandom {@code double} values
	 *  @throws IllegalArgumentException if {@code streamSize} is
	 *                                   less than zero
	 */
	public DoubleStream doubles(long streamSize) {
	}

	/**
	 *  Returns an effectively unlimited stream of pseudorandom {@code int}
	 *  values.
	 * 
	 *  <p>A pseudorandom {@code int} value is generated as if it's the result of
	 *  calling the method {@link Random#nextInt()}.
	 * 
	 *  @return a stream of pseudorandom {@code int} values
	 */
	public IntStream ints() {
	}

	/**
	 *  Returns an effectively unlimited stream of pseudorandom {@code long} values,
	 *  each between zero (inclusive) and one (exclusive).
	 * 
	 *  <p>A pseudorandom {@code long} value is generated as if it's the result of
	 *  calling the method {@link Random#nextLong()}.
	 * 
	 *  @return a stream of pseudorandom {@code long} values
	 */
	public LongStream longs() {
	}

	/**
	 *  Returns an effectively unlimited stream of pseudorandom {@code double} values,
	 *  each between zero (inclusive) and one (exclusive).
	 * 
	 *  <p>A pseudorandom {@code double} value is generated as if it's the result of
	 *  calling the method {@link Random#nextDouble()}.
	 * 
	 *  @return a stream of pseudorandom {@code double} values
	 */
	public DoubleStream doubles() {
	}

	/**
	 *  Returns a stream producing the given {@code streamSize} number
	 *  of pseudorandom {@code int} values, each conforming to the given
	 *  origin (inclusive) and bound (exclusive).
	 * 
	 *  @param streamSize         the number of values to generate
	 *  @param randomNumberOrigin the origin (inclusive) of each random value
	 *  @param randomNumberBound  the bound (exclusive) if each random value
	 * 
	 *  @return a stream of pseudorandom {@code int} values,
	 *  each with the given origin (inclusive) and bound (exclusive)
	 *  @throws IllegalArgumentException if {@code streamSize} is
	 *                                   less than zero, or {@code randomNumberOrigin} is
	 *                                   greater than or equal to {@code randomNumberBound}
	 */
	public IntStream ints(long streamSize, int randomNumberOrigin, int randomNumberBound) {
	}

	/**
	 *  Returns a stream producing the given {@code streamSize} number
	 *  of pseudorandom {@code long} values, each conforming
	 *  to the given origin (inclusive) and bound (exclusive).
	 * 
	 *  @param streamSize         the number of values to generate
	 *  @param randomNumberOrigin the origin (inclusive) of each random value
	 *  @param randomNumberBound  the bound (exclusive) if each random value
	 * 
	 *  @return a stream of pseudorandom {@code long} values,
	 *  each with the given origin (inclusive) and bound (exclusive)
	 *  @throws IllegalArgumentException if {@code streamSize} is
	 *                                   less than zero, or {@code randomNumberOrigin} is
	 *                                   greater than or equal to {@code randomNumberBound}
	 */
	public LongStream longs(long streamSize, long randomNumberOrigin, long randomNumberBound) {
	}

	/**
	 *  Returns a stream producing the given {@code streamSize} number
	 *  of pseudorandom {@code double} values, each conforming
	 *  to the given origin (inclusive) and bound (exclusive).
	 * 
	 *  @param streamSize         the number of values to generate
	 *  @param randomNumberOrigin the origin (inclusive) of each random value
	 *  @param randomNumberBound  the bound (exclusive) if each random value
	 * 
	 *  @return a stream of pseudorandom {@code double} values,
	 *  each with the given origin (inclusive) and bound (exclusive)
	 *  @throws IllegalArgumentException if {@code streamSize} is
	 *                                   less than zero, or {@code randomNumberOrigin} is
	 *                                   greater than or equal to {@code randomNumberBound}
	 */
	public DoubleStream doubles(long streamSize, double randomNumberOrigin, double randomNumberBound) {
	}

	/**
	 *  Returns an effectively unlimited stream of pseudorandom {@code int}
	 *  values, each conforming to the given origin (inclusive) and bound (exclusive)
	 * 
	 *  @param randomNumberOrigin the origin (inclusive) of each random value
	 *  @param randomNumberBound  the bound (exclusive) of each random value
	 * 
	 *  @return a stream of pseudorandom {@code int} values,
	 *  each with the given origin (inclusive) and bound (exclusive)
	 *  @throws IllegalArgumentException if {@code randomNumberOrigin}
	 *                                   is greater than or equal to {@code randomNumberBound}
	 */
	public IntStream ints(int randomNumberOrigin, int randomNumberBound) {
	}

	/**
	 *  Returns an effectively unlimited stream of pseudorandom {@code long}
	 *  values, each conforming to the given origin (inclusive) and bound (exclusive)
	 * 
	 *  @param randomNumberOrigin the origin (inclusive) of each random value
	 *  @param randomNumberBound  the bound (exclusive) of each random value
	 * 
	 *  @return a stream of pseudorandom {@code long} values,
	 *  each with the given origin (inclusive) and bound (exclusive)
	 *  @throws IllegalArgumentException if {@code randomNumberOrigin}
	 *                                   is greater than or equal to {@code randomNumberBound}
	 */
	public LongStream longs(long randomNumberOrigin, long randomNumberBound) {
	}

	/**
	 *  Returns an effectively unlimited stream of pseudorandom {@code double}
	 *  values, each conforming to the given origin (inclusive) and bound (exclusive)
	 * 
	 *  @param randomNumberOrigin the origin (inclusive) of each random value
	 *  @param randomNumberBound  the bound (exclusive) of each random value
	 * 
	 *  @return a stream of pseudorandom {@code double} values,
	 *  each with the given origin (inclusive) and bound (exclusive)
	 *  @throws IllegalArgumentException if {@code randomNumberOrigin}
	 *                                   is greater than or equal to {@code randomNumberBound}
	 */
	public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) {
	}
}
