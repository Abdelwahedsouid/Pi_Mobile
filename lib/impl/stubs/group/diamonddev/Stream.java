package group.diamonddev;


/**
 *  A sequence of elements supporting aggregate operations.
 * 
 *  @param <T> the type of the stream elements
 * 
 *  @author Diamond
 */
@java.lang.SuppressWarnings("RedundantTypeArguments")
public class Stream implements function.Closeable {

	/**
	 *  Returns an empty stream.
	 * 
	 *  @param <T> the type of the stream elements
	 * 
	 *  @return the new empty stream
	 */
	public static Stream empty() {
	}

	/**
	 *  Creates a {@code Stream} from {@code Map} entries.
	 * 
	 *  @param <K> the type of map keys
	 *  @param <V> the type of map values
	 *  @param map the map with elements to be passed to stream
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code map} is null
	 */
	public static Stream of(java.util.Map map) {
	}

	/**
	 *  Creates a {@code Stream} from any class that implements {@code Iterator} interface.
	 * 
	 *  @param <T>      the type of the stream elements
	 *  @param iterator the iterator with elements to be passed to stream
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code iterator} is null
	 */
	public static Stream of(java.util.Iterator iterator) {
	}

	/**
	 *  Creates a {@code Stream} from any class that implements {@code Iterable} interface.
	 * 
	 *  @param <T>      the type of the stream elements
	 *  @param iterable the {@code Iterable} with elements to be passed to stream
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code iterable} is null
	 */
	public static Stream of(Iterable iterable) {
	}

	/**
	 *  Creates a {@code Stream} from the specified values.
	 * 
	 *  @param <T>      the type of the stream elements
	 *  @param elements the elements to be passed to stream
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code elements} is null
	 */
	public static Stream of(Object[] elements) {
	}

	/**
	 *  If specified element is null, returns an empty {@code Stream},
	 *  otherwise returns a {@code Stream} containing a single element.
	 * 
	 *  @param <T>     the type of the stream element
	 *  @param element the element to be passed to stream if it is non-null
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	@java.lang.SuppressWarnings("unchecked")
	public static Stream ofNullable(Object element) {
	}

	/**
	 *  If specified array is null, returns an empty {@code Stream},
	 *  otherwise returns a {@code Stream} containing elements of this array.
	 * 
	 *  @param <T>   the type of the stream elements
	 *  @param array the array whose elements to be passed to stream
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public static Stream ofNullable(Object[] array) {
	}

	/**
	 *  If specified map is null, returns an empty {@code Stream},
	 *  otherwise returns a {@code Stream} containing entries of this map.
	 * 
	 *  @param <K> the type of map keys
	 *  @param <V> the type of map values
	 *  @param map the map with elements to be passed to stream
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public static Stream ofNullable(java.util.Map map) {
	}

	/**
	 *  If specified iterator is null, returns an empty {@code Stream},
	 *  otherwise returns a {@code Stream} containing entries of this iterator.
	 * 
	 *  @param <T>      the type of the stream elements
	 *  @param iterator the iterator with elements to be passed to stream
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public static Stream ofNullable(java.util.Iterator iterator) {
	}

	/**
	 *  If specified iterable is null, returns an empty {@code Stream},
	 *  otherwise returns a {@code Stream} containing elements of this iterable.
	 * 
	 *  @param <T>      the type of the stream elements
	 *  @param iterable the {@code Iterable} with elements to be passed to stream
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public static Stream ofNullable(Iterable iterable) {
	}

	/**
	 *  Creates a {@code Stream<Integer>} from not closed range
	 *  (from {@code from} inclusive to {@code to} exclusive and incremental step {@code 1}).
	 * 
	 *  @param from the initial value (inclusive)
	 *  @param to   the upper bound (exclusive)
	 * 
	 *  @return the new stream
	 *  @see IntStream#range(int, int)
	 */
	public static Stream range(int from, int to) {
	}

	/**
	 *  Creates a {@code Stream<Long>} from not closed range
	 *  (from {@code from} inclusive to {@code to} exclusive and incremental step {@code 1}).
	 * 
	 *  @param from the initial value (inclusive)
	 *  @param to   the upper bound (exclusive)
	 * 
	 *  @return the new stream
	 */
	public static Stream range(long from, long to) {
	}

	/**
	 *  Creates a {@code Stream<Integer>} from closed range
	 *  (from {@code from} inclusive to {@code to} inclusive and incremental step {@code 1}).
	 * 
	 *  @param from the initial value (inclusive)
	 *  @param to   the upper bound (inclusive)
	 * 
	 *  @return the new stream
	 *  @see IntStream#rangeClosed(int, int)
	 */
	public static Stream rangeClosed(int from, int to) {
	}

	/**
	 *  Creates a {@code Stream<Long>} from closed range
	 *  (from {@code from} inclusive to {@code to} inclusive and incremental step {@code 1}).
	 * 
	 *  @param from the initial value (inclusive)
	 *  @param to   the upper bound (inclusive)
	 * 
	 *  @return the new stream
	 */
	public static Stream rangeClosed(long from, long to) {
	}

	/**
	 *  Creates a {@code Stream} by elements that generated by {@code Supplier}.
	 * 
	 *  @param <T>      the type of the stream elements
	 *  @param supplier the {@code Supplier} of generated elements
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code supplier} is null
	 */
	public static Stream generate(function.Supplier supplier) {
	}

	/**
	 *  Creates a {@code Stream} by iterative application {@code UnaryOperator} function
	 *  to an initial element {@code seed}. Produces {@code Stream} consisting of
	 *  {@code seed}, {@code op(seed)}, {@code op(op(seed))}, etc.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  seed: 1
	 *  op: (a) -&gt; a + 5
	 *  result: [1, 6, 11, 16, ...]
	 *  </pre>
	 * 
	 *  @param <T>  the type of the stream elements
	 *  @param seed the initial value
	 *  @param op   operator to produce new element by previous one
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code op} is null
	 */
	public static Stream iterate(Object seed, function.UnaryOperator op) {
	}

	/**
	 *  Creates a {@code Stream} by iterative application {@code UnaryOperator} function
	 *  to an initial element {@code seed}, conditioned on satisfying the supplied predicate.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  seed: 0
	 *  predicate: (a) -&gt; a &lt; 20
	 *  op: (a) -&gt; a + 5
	 *  result: [0, 5, 10, 15]
	 *  </pre>
	 * 
	 *  @param <T>       the type of the stream elements
	 *  @param seed      the initial value
	 *  @param predicate a predicate to determine when the stream must terminate
	 *  @param op        operator to produce new element by previous one
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code op} is null
	 *  @since 1.0.0
	 */
	public static Stream iterate(Object seed, function.Predicate predicate, function.UnaryOperator op) {
	}

	/**
	 *  Lazily concatenates two streams.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stream 1: [1, 2, 3, 4]
	 *  stream 2: [5, 6]
	 *  result:   [1, 2, 3, 4, 5, 6]
	 *  </pre>
	 * 
	 *  @param <T>     The type of stream elements
	 *  @param stream1 the first stream
	 *  @param stream2 the second stream
	 * 
	 *  @return the new concatenated stream
	 *  @throws NullPointerException if {@code stream1} or {@code stream2} is null
	 */
	public static Stream concat(Stream stream1, Stream stream2) {
	}

	/**
	 *  Lazily concatenates a {@code List} of streams.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stream 1: [1, 2, 3, 4]
	 *  stream 2: [5, 6]
	 *  stream 3: [7]
	 *  stream 4: [8, 9, 10]
	 *  result:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	 *  </pre>
	 * 
	 *  @param <T>     The type of stream elements
	 *  @param streams the list of streams
	 * 
	 *  @return the new concatenated stream
	 *  @throws NullPointerException if {@code streams} is null
	 *  @since 1.0.0
	 */
	public static Stream concat(java.util.List streams) {
	}

	/**
	 *  Concatenates two iterators to a stream.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  iterator 1: [1, 2, 3, 4]
	 *  iterator 2: [5, 6]
	 *  result:     [1, 2, 3, 4, 5, 6]
	 *  </pre>
	 * 
	 *  @param <T>       The type of iterator elements
	 *  @param iterator1 the first iterator
	 *  @param iterator2 the second iterator
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code iterator1} or {@code iterator2} is null
	 *  @since 1.0.0
	 */
	public static Stream concat(java.util.Iterator iterator1, java.util.Iterator iterator2) {
	}

	/**
	 *  Concatenates three or more iterators to a stream.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  iterator 1: [1, 2, 3, 4]
	 *  iterator 2: [5, 6]
	 *  iterator 3: [7]
	 *  iterator 4: [8, 9, 10]
	 *  result:     [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	 *  </pre>
	 * 
	 *  @param <T>       The type of iterator elements
	 *  @param iterator1 the first iterator
	 *  @param iterator2 the second iterator
	 *  @param rest      the rest iterators
	 * 
	 *  @return the new concatenated stream
	 *  @throws NullPointerException if {@code iterator1} or {@code iterator2}
	 *                               or {@code rest} is null
	 *  @since 1.0.0
	 */
	public static Stream concat(java.util.Iterator iterator1, java.util.Iterator iterator2, java.util.Iterator[] rest) {
	}

	/**
	 *  Combines two streams by applying specified combiner function to each element at same position.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  combiner: (a, b) -&gt; a + b
	 *  stream 1: [1, 2, 3, 4]
	 *  stream 2: [5, 6, 7, 8]
	 *  result:   [6, 8, 10, 12]
	 *  </pre>
	 * 
	 *  @param <F>      the type of first stream elements
	 *  @param <S>      the type of second stream elements
	 *  @param <R>      the type of elements in resulting stream
	 *  @param stream1  the first stream
	 *  @param stream2  the second stream
	 *  @param combiner the combiner function used to apply to each element
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code stream1} or {@code stream2} is null
	 */
	public static Stream zip(Stream stream1, Stream stream2, function.BiFunction combiner) {
	}

	/**
	 *  Combines two iterators to a stream by applying specified combiner function to each element at same position.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  combiner: (a, b) -&gt; a + b
	 *  stream 1: [1, 2, 3, 4]
	 *  stream 2: [5, 6, 7, 8]
	 *  result:   [6, 8, 10, 12]
	 *  </pre>
	 * 
	 *  @param <F>       the type of first iterator elements
	 *  @param <S>       the type of second iterator elements
	 *  @param <R>       the type of elements in resulting stream
	 *  @param iterator1 the first iterator
	 *  @param iterator2 the second iterator
	 *  @param combiner  the combiner function used to apply to each element
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code iterator1} or {@code iterator2} is null
	 *  @since 1.0.0
	 */
	public static Stream zip(java.util.Iterator iterator1, java.util.Iterator iterator2, function.BiFunction combiner) {
	}

	/**
	 *  Merges elements of two streams according to the supplied selector function.
	 * 
	 *  <p>Example 1 — Merge two sorted streams:
	 *  <pre>
	 *  stream1: [1, 3, 8, 10]
	 *  stream2: [2, 5, 6, 12]
	 *  selector: (a, b) -&gt; a &lt; b ? TAKE_FIRST : TAKE_SECOND
	 *  result: [1, 2, 3, 5, 6, 8, 10, 12]
	 *  </pre>
	 * 
	 *  <p>Example 2 — Concat two streams:
	 *  <pre>
	 *  stream1: [0, 3, 1]
	 *  stream2: [2, 5, 6, 1]
	 *  selector: (a, b) -&gt; TAKE_SECOND
	 *  result: [2, 5, 6, 1, 0, 3, 1]
	 *  </pre>
	 * 
	 *  @param <T>      the type of the elements
	 *  @param stream1  the first stream
	 *  @param stream2  the second stream
	 *  @param selector the selector function used to choose elements
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code stream1} or {@code stream2} is null
	 *  @since 1.0.0
	 */
	public static Stream merge(Stream stream1, Stream stream2, function.BiFunction selector) {
	}

	/**
	 *  Merges elements of two iterators according to the supplied selector function.
	 * 
	 *  <p>Example 1 — Merge two sorted iterators:
	 *  <pre>
	 *  iterator1: [1, 3, 8, 10]
	 *  iterator2: [2, 5, 6, 12]
	 *  selector: (a, b) -&gt; a &lt; b ? TAKE_FIRST : TAKE_SECOND
	 *  result: [1, 2, 3, 5, 6, 8, 10, 12]
	 *  </pre>
	 * 
	 *  <p>Example 2 — Concat two iterators:
	 *  <pre>
	 *  iterator1: [0, 3, 1]
	 *  iterator2: [2, 5, 6, 1]
	 *  selector: (a, b) -&gt; TAKE_SECOND
	 *  result: [2, 5, 6, 1, 0, 3, 1]
	 *  </pre>
	 * 
	 *  @param <T>       the type of the elements
	 *  @param iterator1 the first iterator
	 *  @param iterator2 the second iterator
	 *  @param selector  the selector function used to choose elements
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code iterator1} or {@code iterator2} is null
	 *  @since 1.0.0
	 */
	public static Stream merge(java.util.Iterator iterator1, java.util.Iterator iterator2, function.BiFunction selector) {
	}

	/**
	 *  Returns an internal stream iterator.
	 * 
	 *  @return internal stream iterator
	 */
	public java.util.Iterator iterator() {
	}

	/**
	 *  Applies a custom operator on a stream.
	 *  <p>
	 *  Transforming function can return {@code Stream} for intermediate operations,
	 *  or any value for terminal operation.
	 * 
	 *  <p>Operator examples:
	 *  <pre><code>
	 *      // Intermediate operator
	 *      public class Reverse&lt;T&gt; implements Function&lt;Stream&lt;T&gt;, Stream&lt;T&gt;&gt; {
	 *          &#64;Override
	 *          public Stream&lt;T&gt; apply(Stream&lt;T&gt; stream) {
	 *              final Iterator&lt;? extends T&gt; iterator = stream.iterator();
	 *              final ArrayDeque&lt;T&gt; deque = new ArrayDeque&lt;T&gt;();
	 *              while (iterator.hasNext()) {
	 *                  deque.addFirst(iterator.next());
	 *              }
	 *              return Stream.of(deque.iterator());
	 *          }
	 *      }
	 * 
	 *      // Intermediate operator based on existing stream operators
	 *      public class SkipAndLimit&lt;T&gt; implements UnaryOperator&lt;Stream&lt;T&gt;&gt; {
	 * 
	 *          private final int skip, limit;
	 * 
	 *          public SkipAndLimit(int skip, int limit) {
	 *              this.skip = skip;
	 *              this.limit = limit;
	 *          }
	 * 
	 *          &#64;Override
	 *          public Stream&lt;T&gt; apply(Stream&lt;T&gt; stream) {
	 *              return stream.skip(skip).limit(limit);
	 *          }
	 *      }
	 * 
	 *      // Terminal operator
	 *      public class Sum implements Function&lt;Stream&lt;Integer&gt;, Integer&gt; {
	 *          &#64;Override
	 *          public Integer apply(Stream&lt;Integer&gt; stream) {
	 *              return stream.reduce(0, new BinaryOperator&lt;Integer&gt;() {
	 *                  &#64;Override
	 *                  public Integer apply(Integer value1, Integer value2) {
	 *                      return value1 + value2;
	 *                  }
	 *              });
	 *          }
	 *      }
	 *  </code></pre>
	 * 
	 *  @param <R>      the type of the result
	 *  @param function a transforming function
	 * 
	 *  @return a result of the transforming function
	 *  @throws NullPointerException if {@code function} is null
	 */
	public Object custom(function.Function function) {
	}

	/**
	 *  Prepends given {@code Stream} to current and returns a new stream.
	 *  <p>
	 *  This is similar to {@code Stream.concat(stream, this)}
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  current: [1, 2, 3]
	 *  stream:  [4, 5, 6]
	 *  result:  [4, 5, 6, 1, 2, 3]
	 *  </pre>
	 * 
	 *  @param stream the stream to prepend
	 * 
	 *  @return the new stream
	 *  @see #concat(Stream, Stream)
	 *  @since 1.0.0
	 */
	public Stream prepend(Stream stream) {
	}

	/**
	 *  Appends given {@code Stream} to current and returns a new stream.
	 *  <p>
	 *  This is similar to {@code Stream.concat(this, stream)}
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  current: [1, 2, 3]
	 *  stream:  [4, 5, 6]
	 *  result:  [1, 2, 3, 4, 5, 6]
	 *  </pre>
	 * 
	 *  @param stream the stream to append
	 * 
	 *  @return the new stream
	 *  @see #concat(Stream, Stream)
	 *  @since 1.0.0
	 */
	public Stream append(Stream stream) {
	}

	/**
	 *  Returns {@code Stream} with elements that satisfy the given predicate.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (a) -&gt; a &gt; 2
	 *  stream: [1, 2, 3, 4, -8, 0, 11]
	 *  result: [3, 4, 11]
	 *  </pre>
	 * 
	 *  @param predicate the predicate used to filter elements
	 * 
	 *  @return the new stream
	 */
	public Stream filter(function.Predicate predicate) {
	}

	/**
	 *  Returns a {@code Stream} with elements that satisfy the given {@code IndexedPredicate}.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (index, value) -&gt; (index + value) &gt; 6
	 *  stream: [1, 2, 3, 4, 0, 11]
	 *  index:  [0, 1, 2, 3, 4,  5]
	 *  sum:    [1, 3, 5, 7, 4, 16]
	 *  filter: [         7,    16]
	 *  result: [4, 11]
	 *  </pre>
	 * 
	 *  @param predicate the {@code IndexedPredicate} used to filter elements
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream filterIndexed(function.IndexedPredicate predicate) {
	}

	/**
	 *  Returns a {@code Stream} with elements that satisfy the given {@code IndexedPredicate}.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  from: 4
	 *  step: 3
	 *  predicate: (index, value) -&gt; (index + value) &gt; 15
	 *  stream: [1, 2,  3,  4,  0, 11]
	 *  index:  [4, 7, 10, 13, 16, 19]
	 *  sum:    [5, 9, 13, 17, 16, 30]
	 *  filter: [          17, 16, 30]
	 *  result: [4, 0, 11]
	 *  </pre>
	 * 
	 *  @param from      the initial value of the index (inclusive)
	 *  @param step      the step of the index
	 *  @param predicate the {@code IndexedPredicate} used to filter elements
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream filterIndexed(int from, int step, function.IndexedPredicate predicate) {
	}

	/**
	 *  Returns {@code Stream} with elements that does not satisfy the given predicate.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param predicate the predicate used to filter elements
	 * 
	 *  @return the new stream
	 */
	public Stream filterNot(function.Predicate predicate) {
	}

	/**
	 *  Returns a stream consisting of the elements of this stream which are
	 *  instances of given class.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param <TT>  a type of instances to select.
	 *  @param clazz a class which instances should be selected
	 * 
	 *  @return the new stream of type passed as parameter
	 */
	@java.lang.SuppressWarnings("unchecked")
	public Stream select(Class clazz) {
	}

	/**
	 *  Returns {@code Stream} without null elements.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream withoutNulls() {
	}

	/**
	 *  Returns {@code Stream} with elements that is null only.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream nullsOnly() {
	}

	/**
	 *  Returns {@code Stream} with elements that is equality of {@code object} only.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param object object
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream equalsOnly(Object object) {
	}

	/**
	 *  Returns {@code Stream} with elements that obtained by applying the given function.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  mapper: (a) -&gt; a + 5
	 *  stream: [1, 2, 3, 4]
	 *  result: [6, 7, 8, 9]
	 *  </pre>
	 * 
	 *  @param <R>    the type of elements in resulting stream
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new stream
	 */
	public Stream map(function.Function mapper) {
	}

	/**
	 *  Returns a {@code Stream} with elements that obtained by applying the given {@code IndexedFunction}.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (index, value) -&gt; (index * value)
	 *  stream: [1, 2, 3,  4]
	 *  index:  [0, 1, 2,  3]
	 *  result: [0, 2, 6, 12]
	 *  </pre>
	 * 
	 *  @param <R>    the type of elements in resulting stream
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream mapIndexed(function.IndexedFunction mapper) {
	}

	/**
	 *  Returns a {@code Stream} with elements that obtained by applying the given {@code IndexedFunction}.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  from: -2
	 *  step: 2
	 *  predicate: (index, value) -&gt; (index * value)
	 *  stream: [ 1, 2, 3,  4]
	 *  index:  [-2, 0, 2,  4]
	 *  result: [-2, 0, 6, 16]
	 *  </pre>
	 * 
	 *  @param <R>    the type of elements in resulting stream
	 *  @param from   the initial value of the index (inclusive)
	 *  @param step   the step of the index
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream mapIndexed(int from, int step, function.IndexedFunction mapper) {
	}

	/**
	 *  Returns {@code IntStream} with elements that obtained by applying the given function.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new {@code IntStream}
	 *  @see #map(Function)
	 */
	public IntStream mapToInt(function.ToIntFunction mapper) {
	}

	/**
	 *  Returns {@code LongStream} with elements that obtained by applying the given function.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new {@code LongStream}
	 *  @see #map(Function)
	 *  @since 1.0.0
	 */
	public LongStream mapToLong(function.ToLongFunction mapper) {
	}

	/**
	 *  Returns {@code DoubleStream} with elements that obtained by applying the given function.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new {@code DoubleStream}
	 *  @see #map(Function)
	 *  @since 1.0.0
	 */
	public DoubleStream mapToDouble(function.ToDoubleFunction mapper) {
	}

	/**
	 *  Returns a stream consisting of the results of replacing each element of
	 *  this stream with the contents of a mapped stream produced by applying
	 *  the provided mapping function to each element.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  mapper: (a) -&gt; [a, a + 5]
	 *  stream: [1, 2, 3, 4]
	 *  result: [1, 6, 2, 7, 3, 8, 4, 9]
	 *  </pre>
	 * 
	 *  @param <R>    the type of elements in resulting stream
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new stream
	 */
	public Stream flatMap(function.Function mapper) {
	}

	/**
	 *  Returns a stream consisting of the results of replacing each element of
	 *  this stream with the contents of a mapped stream produced by applying
	 *  the provided mapping function to each element.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new {@code IntStream}
	 *  @see #flatMap(Function)
	 */
	public IntStream flatMapToInt(function.Function mapper) {
	}

	/**
	 *  Returns a stream consisting of the results of replacing each element of
	 *  this stream with the contents of a mapped stream produced by applying
	 *  the provided mapping function to each element.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new {@code LongStream}
	 *  @see #flatMap(Function)
	 */
	public LongStream flatMapToLong(function.Function mapper) {
	}

	/**
	 *  Returns a stream consisting of the results of replacing each element of
	 *  this stream with the contents of a mapped stream produced by applying
	 *  the provided mapping function to each element.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param mapper the mapper function used to apply to each element
	 * 
	 *  @return the new {@code DoubleStream}
	 *  @see #flatMap(Function)
	 */
	public DoubleStream flatMapToDouble(function.Function mapper) {
	}

	/**
	 *  Returns a stream consisting of the results of replacing each element of
	 *  this stream with zero or more elements,
	 *  that passed to the provided consumer function.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stream: [1, 2, 3, 4]
	 *  mapper: (a, consumer) -&gt; {
	 *    consumer.accept(a);
	 *    consumer.accept(-a);
	 *  }
	 *  result: [1, -1, 2, -2, 3, -3, 4, -4]
	 * 
	 *  stream: [1, 2, 3, 4]
	 *  mapper: (a, consumer) -&gt; {
	 *    if (a % 2 == 0)
	 *      consumer.accept(a * 2);
	 *  }
	 *  result: [4, 8]
	 *  </pre>
	 * 
	 *  @param <R>    the type of elements in resulting stream
	 *  @param mapper the mapper function used to apply to each element for producing replacing elements
	 * 
	 *  @return the new stream
	 *  @see #flatMap(group.diamonddev.function.Function)
	 *  @since 1.0.1
	 */
	public Stream mapMulti(function.BiConsumer mapper) {
	}

	/**
	 *  Returns a stream consisting of the results of replacing each element of
	 *  this stream with zero or more elements,
	 *  that passed to the provided consumer function.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param mapper the mapper function used to apply to each element for producing replacing elements
	 * 
	 *  @return the new stream
	 *  @see #mapMulti(group.diamonddev.function.BiConsumer)
	 *  @see #flatMapToInt(group.diamonddev.function.Function)
	 *  @since 1.0.1
	 */
	public IntStream mapMultiToInt(function.BiConsumer mapper) {
	}

	/**
	 *  Returns a stream consisting of the results of replacing each element of
	 *  this stream with zero or more elements,
	 *  that passed to the provided consumer function.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param mapper the mapper function used to apply to each element for producing replacing elements
	 * 
	 *  @return the new stream
	 *  @see #mapMulti(group.diamonddev.function.BiConsumer)
	 *  @see #flatMapToLong(group.diamonddev.function.Function)
	 *  @since 1.0.1
	 */
	public LongStream mapMultiToLong(function.BiConsumer mapper) {
	}

	/**
	 *  Returns a stream consisting of the results of replacing each element of
	 *  this stream with zero or more elements,
	 *  that passed to the provided consumer function.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param mapper the mapper function used to apply to each element for producing replacing elements
	 * 
	 *  @return the new stream
	 *  @see #mapMulti(group.diamonddev.function.BiConsumer)
	 *  @see #flatMapToDouble(group.diamonddev.function.Function)
	 *  @since 1.0.1
	 */
	public DoubleStream mapMultiToDouble(function.BiConsumer mapper) {
	}

	/**
	 *  Returns {@code Stream} with indexed elements.
	 *  Indexing starts from 0 with step 1.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stream: ["a", "b", "c"]
	 *  result: [(0, "a"), (1, "b"), (2, "c")]
	 *  </pre>
	 * 
	 *  @return the new {@code IntPair} stream
	 *  @since 1.0.0
	 */
	public Stream indexed() {
	}

	/**
	 *  Returns {@code Stream} with indexed elements.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  from: 5, step: 10
	 *  stream: ["a", "b", "c"]
	 *  result: [(5, "a"), (15, "b"), (25, "c")]
	 *  </pre>
	 * 
	 *  @param from the initial value (inclusive)
	 *  @param step the step
	 * 
	 *  @return the new {@code IntPair} stream
	 *  @since 1.0.0
	 */
	public Stream indexed(int from, int step) {
	}

	/**
	 *  Returns {@code Stream} with distinct elements (as determined by {@code hashCode} and {@code equals} methods).
	 * 
	 *  <p>This is a stateful intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stream: [1, 4, 2, 3, 3, 4, 1]
	 *  result: [1, 4, 2, 3]
	 *  </pre>
	 * 
	 *  @return the new stream
	 */
	public Stream distinct() {
	}

	/**
	 *  Returns {@code Stream} with distinct elements (as determined by {@code hashCode}
	 *  and {@code equals} methods) according to the given classifier function.
	 * 
	 *  <p>This is a stateful intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  classifier: (str) -&gt; str.length()
	 *  stream: ["a", "bc", "d", "ef", "ghij"]
	 *  result: ["a", "bc", "ghij"]
	 *  </pre>
	 * 
	 *  @param <K>        the type of the result of classifier function
	 *  @param classifier the classifier function
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream distinctBy(function.Function classifier) {
	}

	/**
	 *  Returns {@code Stream} with sorted elements (as determined by {@link Comparable} interface).
	 * 
	 *  <p>This is a stateful intermediate operation.
	 *  <p>If the elements of this stream are not {@link Comparable},
	 *  a {@code java.lang.ClassCastException} may be thrown when the terminal operation is executed.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stream: [3, 4, 1, 2]
	 *  result: [1, 2, 3, 4]
	 *  </pre>
	 * 
	 *  @return the new stream
	 */
	public Stream sorted() {
	}

	/**
	 *  Returns {@code Stream} with sorted elements (as determined by the provided {@code Comparator}).
	 * 
	 *  <p>This is a stateful intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  comparator: (a, b) -&gt; -a.compareTo(b)
	 *  stream: [1, 2, 3, 4]
	 *  result: [4, 3, 2, 1]
	 *  </pre>
	 * 
	 *  @param comparator the {@code Comparator} to compare elements
	 * 
	 *  @return the new stream
	 */
	public Stream sorted(java.util.Comparator comparator) {
	}

	/**
	 *  Returns {@code Stream} with sorted elements (as determined by {@code Comparable} interface).
	 *  Each element transformed by given function {@code f} before comparing.
	 * 
	 *  <p>This is a stateful intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  f: (a) -&gt; -a
	 *  stream: [1, 2, 3, 4]
	 *  result: [4, 3, 2, 1]
	 *  </pre>
	 * 
	 *  @param <R> the type of the result of transforming function
	 *  @param f   the transformation function
	 * 
	 *  @return the new stream
	 */
	public Stream sortBy(function.Function f) {
	}

	/**
	 *  Partitions {@code Stream} into {@code Map} entries according to the given classifier function.
	 * 
	 *  <p>This is a stateful intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  classifier: (str) -&gt; str.length()
	 *  stream: ["a", "bc", "d", "ef", "ghij"]
	 *  result: [{1: ["a", "d"]}, {2: ["bc", "ef"]}, {4: ["ghij"]}]
	 *  </pre>
	 * 
	 *  @param <K>        the type of the keys, which are result of the classifier function
	 *  @param classifier the classifier function
	 * 
	 *  @return the new stream
	 */
	public Stream groupBy(function.Function classifier) {
	}

	/**
	 *  Partitions {@code Stream} into {@code List}s according to the given classifier function. In contrast
	 *  to {@link #groupBy(Function)}, this method assumes that the elements of the stream are sorted.
	 *  Because of this assumption, it does not need to first collect all elements and then partition them.
	 *  Instead, it can emit a {@code List} of elements when it reaches the first element that does not
	 *  belong to the same chunk as the previous elements.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  classifier: (a) -&gt; a % 5 == 0
	 *  stream: [1, 2, 5, 6, 7, 9, 10, 12, 14]
	 *  result: [[1, 2], [5], [6, 7, 9], [10], [12, 14]]
	 *  </pre>
	 * 
	 *  @param <K>        the type of the keys, which are the result of the classifier function
	 *  @param classifier the classifier function
	 * 
	 *  @return the new stream
	 */
	public Stream chunkBy(function.Function classifier) {
	}

	/**
	 *  Samples the {@code Stream} by emitting every n-th element.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stepWidth: 3
	 *  stream: [1, 2, 3, 4, 5, 6, 7, 8]
	 *  result: [1, 4, 7]
	 *  </pre>
	 * 
	 *  @param stepWidth step width
	 * 
	 *  @return the new stream
	 *  @throws IllegalArgumentException if {@code stepWidth} is zero or negative
	 */
	public Stream sample(int stepWidth) {
	}

	/**
	 *  Partitions {@code Stream} into {@code List}s of fixed size by sliding over the elements of the stream.
	 *  It starts with the first element and in each iteration moves by 1. This method yields the same results
	 *  as calling {@link #slidingWindow(int, int)} with a {@code stepWidth} of 1.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  windowSize: 3
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: [[1, 2, 3], [2, 3, 4], [3, 4, 5]]
	 *  </pre>
	 * 
	 *  @param windowSize number of elements that will be emitted together in a list
	 * 
	 *  @return the new stream
	 *  @see #slidingWindow(int, int)
	 */
	public Stream slidingWindow(int windowSize) {
	}

	/**
	 *  Partitions {@code Stream} into {@code List}s of fixed size by sliding over the elements of the stream.
	 *  It starts with the first element and in each iteration moves by the given step width. This method
	 *  allows, for example, to partition the elements into batches of {@code windowSize} elements (by using a
	 *  step width equal to the specified window size) or to sample every n-th element (by using a window size
	 *  of 1 and a step width of n).
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  windowSize: 3, stepWidth: 3
	 *  stream: [1, 1, 1, 2, 2, 2, 3, 3, 3]
	 *  result: [[1, 1, 1], [2, 2, 2] [3, 3, 3]]
	 * 
	 *  windowSize: 2, stepWidth: 3
	 *  stream: [1, 2, 3, 1, 2, 3, 1, 2, 3]
	 *  result: [[1, 2], [1, 2], [1, 2]]
	 * 
	 *  windowSize: 3, stepWidth: 1
	 *  stream: [1, 2, 3, 4, 5, 6]
	 *  result: [[1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5, 6]]
	 *  </pre>
	 * 
	 *  @param windowSize number of elements that will be emitted together in a list
	 *  @param stepWidth  step width
	 * 
	 *  @return the new stream
	 *  @throws IllegalArgumentException if {@code windowSize} is zero or negative
	 *  @throws IllegalArgumentException if {@code stepWidth} is zero or negative
	 */
	public Stream slidingWindow(int windowSize, int stepWidth) {
	}

	/**
	 *  Performs provided action on each element.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param action the action to be performed on each element
	 * 
	 *  @return the new stream
	 */
	public Stream peek(function.Consumer action) {
	}

	/**
	 *  Returns a {@code Stream} produced by iterative application of an accumulation function
	 *  to reduction value and next element of the current stream.
	 *  Produces a {@code Stream} consisting of {@code value1}, {@code acc(value1, value2)},
	 *  {@code acc(acc(value1, value2), value3)}, etc.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  accumulator: (a, b) -&gt; a + b
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: [1, 3, 6, 10, 15]
	 *  </pre>
	 * 
	 *  @param accumulator the accumulation function
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code accumulator} is null
	 *  @since 1.0.0
	 */
	public Stream scan(function.BiFunction accumulator) {
	}

	/**
	 *  Returns a {@code Stream} produced by iterative application of an accumulation function
	 *  to an initial element {@code identity} and next element of the current stream.
	 *  Produces a {@code Stream} consisting of {@code identity}, {@code acc(identity, value1)},
	 *  {@code acc(acc(identity, value1), value2)}, etc.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  identity: 0
	 *  accumulator: (a, b) -&gt; a + b
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: [0, 1, 3, 6, 10, 15]
	 *  </pre>
	 * 
	 *  @param <R>         the type of the result
	 *  @param identity    the initial value
	 *  @param accumulator the accumulation function
	 * 
	 *  @return the new stream
	 *  @throws NullPointerException if {@code accumulator} is null
	 *  @since 1.0.0
	 */
	public Stream scan(Object identity, function.BiFunction accumulator) {
	}

	/**
	 *  Takes elements while the predicate returns {@code true}.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (a) -&gt; a &lt; 3
	 *  stream: [1, 2, 3, 4, 1, 2, 3, 4]
	 *  result: [1, 2]
	 *  </pre>
	 * 
	 *  @param predicate the predicate used to take elements
	 * 
	 *  @return the new stream
	 */
	public Stream takeWhile(function.Predicate predicate) {
	}

	/**
	 *  Takes elements while the {@code IndexedPredicate} returns {@code true}.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (index, value) -&gt; (index + value) &lt; 5
	 *  stream: [1, 2, 3,  4, -5, -6, -7]
	 *  index:  [0, 1, 2,  3,  4,  5,  6]
	 *  sum:    [1, 3, 5,  7, -1, -1, -1]
	 *  result: [1, 2]
	 *  </pre>
	 * 
	 *  @param predicate the {@code IndexedPredicate} used to take elements
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream takeWhileIndexed(function.IndexedPredicate predicate) {
	}

	/**
	 *  Takes elements while the {@code IndexedPredicate} returns {@code true}.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  from: 2
	 *  step: 2
	 *  predicate: (index, value) -&gt; (index + value) &lt; 8
	 *  stream: [1, 2, 3,  4, -5, -6, -7]
	 *  index:  [2, 4, 6,  8, 10, 12, 14]
	 *  sum:    [3, 6, 9, 12,  5,  6,  7]
	 *  result: [1, 2]
	 *  </pre>
	 * 
	 *  @param from      the initial value of the index (inclusive)
	 *  @param step      the step of the index
	 *  @param predicate the {@code IndexedPredicate} used to take elements
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream takeWhileIndexed(int from, int step, function.IndexedPredicate predicate) {
	}

	/**
	 *  Takes elements while the predicate returns {@code false}.
	 *  Once predicate condition is satisfied by an element, the stream
	 *  finishes with this element.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stopPredicate: (a) -&gt; a &gt; 2
	 *  stream: [1, 2, 3, 4, 1, 2, 3, 4]
	 *  result: [1, 2, 3]
	 *  </pre>
	 * 
	 *  @param stopPredicate the predicate used to take elements
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream takeUntil(function.Predicate stopPredicate) {
	}

	/**
	 *  Takes elements while the {@code IndexedPredicate} returns {@code false}.
	 *  Once predicate condition is satisfied by an element, the stream
	 *  finishes with this element.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stopPredicate: (index, value) -&gt; (index + value) &gt; 4
	 *  stream: [1, 2, 3, 4, 0, 1, 2]
	 *  index:  [0, 1, 2, 3, 4, 5, 6]
	 *  sum:    [1, 3, 5, 7, 4, 6, 8]
	 *  result: [1, 2, 3]
	 *  </pre>
	 * 
	 *  @param stopPredicate the {@code IndexedPredicate} used to take elements
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream takeUntilIndexed(function.IndexedPredicate stopPredicate) {
	}

	/**
	 *  Takes elements while the {@code IndexedPredicate} returns {@code false}.
	 *  Once predicate condition is satisfied by an element, the stream
	 *  finishes with this element.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  from: 2
	 *  step: 2
	 *  stopPredicate: (index, value) -&gt; (index + value) &gt; 8
	 *  stream: [1, 2, 3,  4,  0,  1,  2]
	 *  index:  [2, 4, 6,  8, 10, 11, 14]
	 *  sum:    [3, 6, 9, 12, 10, 12, 16]
	 *  result: [1, 2, 3]
	 *  </pre>
	 * 
	 *  @param from          the initial value of the index (inclusive)
	 *  @param step          the step of the index
	 *  @param stopPredicate the {@code IndexedPredicate} used to take elements
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream takeUntilIndexed(int from, int step, function.IndexedPredicate stopPredicate) {
	}

	/**
	 *  Drops elements while the predicate is true, then returns the rest.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (a) -&gt; a &lt; 3
	 *  stream: [1, 2, 3, 4, 1, 2, 3, 4]
	 *  result: [3, 4, 1, 2, 3, 4]
	 *  </pre>
	 * 
	 *  @param predicate the predicate used to drop elements
	 * 
	 *  @return the new stream
	 */
	public Stream dropWhile(function.Predicate predicate) {
	}

	/**
	 *  Drops elements while the {@code IndexedPredicate} is true, then returns the rest.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (index, value) -&gt; (index + value) &lt; 5
	 *  stream: [1, 2, 3, 4, 0, 1, 2]
	 *  index:  [0, 1, 2, 3, 4, 5, 6]
	 *  sum:    [1, 3, 5, 7, 4, 6, 8]
	 *  result: [3, 4, 0, 1, 2]
	 *  </pre>
	 * 
	 *  @param predicate the {@code IndexedPredicate} used to drop elements
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream dropWhileIndexed(function.IndexedPredicate predicate) {
	}

	/**
	 *  Drops elements while the {@code IndexedPredicate} is true, then returns the rest.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  from: 2
	 *  step: 2
	 *  predicate: (index, value) -&gt; (index + value) &lt; 10
	 *  stream: [1, 2, 3,  4, -5, -6, -7]
	 *  index:  [2, 4, 6,  8, 10, 12, 14]
	 *  sum:    [3, 6, 9, 12,  5,  6,  7]
	 *  result: [4, -5, -6, -7]
	 *  </pre>
	 * 
	 *  @param from      the initial value of the index (inclusive)
	 *  @param step      the step of the index
	 *  @param predicate the {@code IndexedPredicate} used to drop elements
	 * 
	 *  @return the new stream
	 *  @since 1.0.0
	 */
	public Stream dropWhileIndexed(int from, int step, function.IndexedPredicate predicate) {
	}

	/**
	 *  Returns {@code Stream} with first {@code maxSize} elements.
	 * 
	 *  <p>This is a short-circuiting stateful intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  maxSize: 3
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: [1, 2, 3]
	 * 
	 *  maxSize: 10
	 *  stream: [1, 2]
	 *  result: [1, 2]
	 *  </pre>
	 * 
	 *  @param maxSize the number of elements to limit
	 * 
	 *  @return the new stream
	 *  @throws IllegalArgumentException if {@code maxSize} is negative
	 */
	public Stream limit(long maxSize) {
	}

	/**
	 *  Skips first {@code n} elements and returns {@code Stream} with remaining elements.
	 *  If stream contains fewer than {@code n} elements, then an empty stream will be returned.
	 * 
	 *  <p>This is a stateful intermediate operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  n: 3
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: [4, 5]
	 * 
	 *  n: 10
	 *  stream: [1, 2]
	 *  result: []
	 *  </pre>
	 * 
	 *  @param n the number of elements to skip
	 * 
	 *  @return the new stream
	 *  @throws IllegalArgumentException if {@code n} is negative
	 */
	public Stream skip(long n) {
	}

	/**
	 *  Performs the given action on each element.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @param action the action to be performed on each element
	 */
	public void forEach(function.Consumer action) {
	}

	/**
	 *  Performs the given indexed action on each element.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @param action the action to be performed on each element
	 * 
	 *  @since 1.0.0
	 */
	public void forEachIndexed(function.IndexedConsumer action) {
	}

	/**
	 *  Performs the given indexed action on each element.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @param from   the initial value of the index (inclusive)
	 *  @param step   the step of the index
	 *  @param action the action to be performed on each element
	 * 
	 *  @since 1.0.0
	 */
	public void forEachIndexed(int from, int step, function.IndexedConsumer action) {
	}

	/**
	 *  Reduces the elements using provided identity value, and the associative accumulation function.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  identity: 0
	 *  accumulator: (a, b) -&gt; a + b
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: 15
	 *  </pre>
	 * 
	 *  @param <R>         the type of the result
	 *  @param identity    the initial value
	 *  @param accumulator the accumulation function
	 * 
	 *  @return the result of the reduction
	 */
	public Object reduce(Object identity, function.BiFunction accumulator) {
	}

	/**
	 *  Reduces the elements using provided identity value, and
	 *  the associative accumulation the indexed function.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  identity: 10
	 *  accumulator: (index, a, b) -&gt; index + a + b
	 *  stream: [1, 2, 3, 4, 5]
	 *  index:  [0, 1, 2, 3, 4]
	 *  result: 10 + 1 + 3 + 5 + 7 + 9 = 35
	 *  </pre>
	 * 
	 *  @param <R>         the type of the result
	 *  @param identity    the initial value
	 *  @param accumulator the accumulation function
	 * 
	 *  @return the result of the reduction
	 *  @since 1.0.0
	 */
	public Object reduceIndexed(Object identity, function.IndexedBiFunction accumulator) {
	}

	/**
	 *  Reduces the elements using provided identity value, and
	 *  the associative accumulation the indexed function.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  from: 1
	 *  step: 2
	 *  identity: 10
	 *  accumulator: (index, a, b) -&gt; index + a + b
	 *  stream: [1, 2, 3, 4, 5]
	 *  index:  [1, 3, 5, 7, 9]
	 *  result: 10 + 2 + 5 + 8 + 11 + 14 = 50
	 *  </pre>
	 * 
	 *  @param <R>         the type of the result
	 *  @param from        the initial value of the index (inclusive)
	 *  @param step        the step of the index
	 *  @param identity    the initial value
	 *  @param accumulator the accumulation function
	 * 
	 *  @return the result of the reduction
	 *  @since 1.0.0
	 */
	public Object reduceIndexed(int from, int step, Object identity, function.IndexedBiFunction accumulator) {
	}

	/**
	 *  Reduces the elements using provided associative accumulation function.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @param accumulator the accumulation function
	 * 
	 *  @return the result of the reduction
	 *  @see #reduce(Object, BiFunction)
	 */
	public Optional reduce(function.BiFunction accumulator) {
	}

	/**
	 *  Collects elements to an array.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @return the result of collect elements
	 *  @see #toArray(IntFunction)
	 */
	public Object[] toArray() {
	}

	/**
	 *  Collects elements to an array, the {@code generator} constructor of provided.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @param <R>       the type of the result
	 *  @param generator the array constructor reference that accommodates a future array of assigned size
	 * 
	 *  @return the result of collect elements
	 */
	public Object[] toArray(function.IntFunction generator) {
	}

	/**
	 *  Collects elements to a new {@code List}.
	 * 
	 *  <p>This implementation <strong>does not</strong> call {@code collect(Collectors.toList())}, so
	 *  it can be faster by reducing method calls.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @return a new {@code List}
	 *  @see Collectors#toList()
	 *  @since 1.0.0
	 */
	public java.util.List toList() {
	}

	/**
	 *  Collects elements to {@code supplier} provided container by applying the given accumulation function.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @param <R>         the type of the result
	 *  @param supplier    the supplier function that provides container
	 *  @param accumulator the accumulation function
	 * 
	 *  @return the result of collect elements
	 *  @see #collect(Collector)
	 */
	public Object collect(function.Supplier supplier, function.BiConsumer accumulator) {
	}

	/**
	 *  Collects elements with {@code collector} that encapsulates supplier, accumulator and combiner functions.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @param <R>       the type of result
	 *  @param <A>       the intermediate used by {@code Collector}
	 *  @param collector the {@code Collector}
	 * 
	 *  @return the result of collect elements
	 *  @see #collect(Supplier, BiConsumer)
	 */
	public Object collect(Collector collector) {
	}

	/**
	 *  Finds the minimum element according to the given comparator.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  comparator: (a, b) -&gt; a.compareTo(b)
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: 1
	 *  </pre>
	 * 
	 *  @param comparator the {@code Comparator} to compare elements
	 * 
	 *  @return the minimum element
	 */
	public Optional min(java.util.Comparator comparator) {
	}

	/**
	 *  Finds the maximum element according to the given comparator.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  comparator: (a, b) -&gt; a.compareTo(b)
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: 5
	 *  </pre>
	 * 
	 *  @param comparator the {@code Comparator} to compare elements
	 * 
	 *  @return the maximum element
	 */
	public Optional max(java.util.Comparator comparator) {
	}

	/**
	 *  Returns the count of elements in this stream.
	 * 
	 *  <p>This is a terminal operation.
	 * 
	 *  @return the count of elements
	 */
	public long count() {
	}

	/**
	 *  Tests whether any elements match the given predicate.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (a) -&gt; a == 5
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: true
	 * 
	 *  predicate: (a) -&gt; a == 5
	 *  stream: [5, 5, 5]
	 *  result: true
	 *  </pre>
	 * 
	 *  @param predicate the predicate used to match elements
	 * 
	 *  @return {@code true} if any elements match the given predicate, otherwise {@code false}
	 */
	public boolean anyMatch(function.Predicate predicate) {
	}

	/**
	 *  Tests whether all elements match the given predicate.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (a) -&gt; a == 5
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: false
	 * 
	 *  predicate: (a) -&gt; a == 5
	 *  stream: [5, 5, 5]
	 *  result: true
	 *  </pre>
	 * 
	 *  @param predicate the predicate used to match elements
	 * 
	 *  @return {@code true} if all elements match the given predicate, otherwise {@code false}
	 */
	public boolean allMatch(function.Predicate predicate) {
	}

	/**
	 *  Tests whether no elements match the given predicate.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (a) -&gt; a == 5
	 *  stream: [1, 2, 3, 4, 5]
	 *  result: false
	 * 
	 *  predicate: (a) -&gt; a == 5
	 *  stream: [1, 2, 3]
	 *  result: true
	 *  </pre>
	 * 
	 *  @param predicate the predicate used to match elements
	 * 
	 *  @return {@code true} if no elements match the given predicate, otherwise {@code false}
	 */
	public boolean noneMatch(function.Predicate predicate) {
	}

	/**
	 *  Finds the first element and its index that matches the given predicate.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  predicate: (index, value) -&gt; index + value == 7
	 *  stream: [1, 2, 3, 4, 5, 2, 0]
	 *  index:  [0, 1, 2, 3, 4, 5, 6]
	 *  result: Optional.of(IntPair(3, 4))
	 *  </pre>
	 * 
	 *  @param predicate the predicate to find value
	 * 
	 *  @return an {@code Optional} with {@code IntPair}
	 *  or {@code Optional.empty()} if stream is empty or no value was found.
	 *  @since 1.0.0
	 */
	public Optional findIndexed(function.IndexedPredicate predicate) {
	}

	/**
	 *  Finds the first element and its index that matches the given predicate.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  from: 0
	 *  step: 10
	 *  predicate: (index, value) -&gt; index + value == 42
	 *  stream: [1, 11, 22, 12, 40]
	 *  index:  [0, 10, 20, 30, 40]
	 *  result: Optional.of(IntPair(20, 22))
	 *  </pre>
	 * 
	 *  @param from      the initial value of the index (inclusive)
	 *  @param step      the step of the index
	 *  @param predicate the predicate to find value
	 * 
	 *  @return an {@code Optional} with {@code IntPair}
	 *  or {@code Optional.empty()} if stream is empty or no value was found.
	 *  @since 1.0.0
	 */
	public Optional findIndexed(int from, int step, function.IndexedPredicate predicate) {
	}

	/**
	 *  Returns the first element wrapped by {@code Optional} class.
	 *  If stream is empty, returns {@code Optional.empty()}.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  @return an {@code Optional} with the first element
	 *  or {@code Optional.empty()} if stream is empty
	 */
	public Optional findFirst() {
	}

	/**
	 *  Returns the first element if stream is not empty,
	 *  otherwise returns {@code other}.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  @param other the other element to return if stream is empty
	 * 
	 *  @return first element or {@code other} if stream is empty
	 *  @since 1.0.0
	 */
	public Object findFirstOrElse(Object other) {
	}

	/**
	 *  Returns the last element wrapped by {@code Optional} class.
	 *  If stream is empty, returns {@code Optional.empty()}.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  @return an {@code Optional} with the last element
	 *  or {@code Optional.empty()} if the stream is empty
	 *  @since 1.0.0
	 */
	public Optional findLast() {
	}

	/**
	 *  Returns the single element of stream.
	 *  If stream is empty, throws {@code NoSuchElementException}.
	 *  If stream contains more than one element, throws {@code IllegalStateException}.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stream: []
	 *  result: NoSuchElementException
	 * 
	 *  stream: [1]
	 *  result: 1
	 * 
	 *  stream: [1, 2, 3]
	 *  result: IllegalStateException
	 *  </pre>
	 * 
	 *  @return single element of stream
	 *  @throws NoSuchElementException if stream is empty
	 *  @throws IllegalStateException  if stream contains more than one element
	 *  @since 1.0.0
	 */
	public Object single() {
	}

	/**
	 *  Returns the single element wrapped by {@code Optional} class.
	 *  If stream is empty, returns {@code Optional.empty()}.
	 *  If stream contains more than one element, throws {@code IllegalStateException}.
	 * 
	 *  <p>This is a short-circuiting terminal operation.
	 * 
	 *  <p>Example:
	 *  <pre>
	 *  stream: []
	 *  result: Optional.empty()
	 * 
	 *  stream: [1]
	 *  result: Optional.of(1)
	 * 
	 *  stream: [1, 2, 3]
	 *  result: IllegalStateException
	 *  </pre>
	 * 
	 *  @return an {@code Optional} with single element or {@code Optional.empty()} if stream is empty
	 *  @throws IllegalStateException if stream contains more than one element
	 *  @since 1.0.0
	 */
	public Optional findSingle() {
	}

	/**
	 *  Adds close handler to the current stream.
	 * 
	 *  <p>This is an intermediate operation.
	 * 
	 *  @param closeHandler an action to execute when the stream is closed
	 * 
	 *  @return the new stream with the close handler
	 *  @since 1.0.0
	 */
	public Stream onClose(Runnable closeHandler) {
	}

	/**
	 *  Causes close handler to be invoked if it exists.
	 *  Since most of the stream providers are lists or arrays,
	 *  it is not necessary to close the stream.
	 * 
	 *  @since 1.0.0
	 */
	@java.lang.Override
	public void close() {
	}
}
