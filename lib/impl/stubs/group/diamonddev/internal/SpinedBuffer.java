package group.diamonddev.internal;


/**
 *  Base class for a data structure for gathering elements into a buffer and then
 *  iterating them. Maintains an array of increasingly sized arrays, so there is
 *  no copying cost associated with growing the data structure.
 * 
 *  @author Diamond
 */
@java.lang.SuppressWarnings({"WeakerAccess", "SameParameterValue"})
public abstract class SpinedBuffer implements Iterable {

	@java.lang.Override
	public abstract java.util.Iterator iterator() {
	}

	protected abstract Object[] newArrayArray(int size) {
	}

	protected abstract Object newArray(int size) {
	}

	protected abstract int arrayLength(Object array) {
	}

	/**
	 *  Is the buffer currently empty?
	 * 
	 *  @return true, if buffer is empty
	 */
	public boolean isEmpty() {
	}

	/**
	 *  How many elements are currently in the buffer?
	 * 
	 *  @return number of elements in buffer
	 */
	public long count() {
	}

	/**
	 *  Remove all data from the buffer
	 */
	public void clear() {
	}

	public static class Of {


		public Of() {
		}

		public Of(int initialCapacity) {
		}

		@java.lang.SuppressWarnings("unchecked")
		@java.lang.Override
		protected Object[][] newArrayArray(int size) {
		}

		@java.lang.SuppressWarnings("unchecked")
		@java.lang.Override
		protected Object[] newArray(int size) {
		}

		@java.lang.Override
		protected int arrayLength(Object[] array) {
		}

		@java.lang.Override
		public void accept(Object e) {
		}

		public Object get(long index) {
		}

		@java.lang.Override
		public java.util.Iterator iterator() {
		}

		public Object[] asArray(group.diamonddev.function.IntFunction arrayFactory) {
		}
	}

	public static class OfInt {


		public OfInt() {
		}

		public OfInt(int initialCapacity) {
		}

		@java.lang.Override
		protected int[][] newArrayArray(int size) {
		}

		@java.lang.Override
		public int[] newArray(int size) {
		}

		@java.lang.Override
		protected int arrayLength(int[] array) {
		}

		@java.lang.Override
		public void accept(int i) {
		}

		public int get(long index) {
		}

		@java.lang.Override
		public group.diamonddev.iterator.PrimitiveIterator.OfInt iterator() {
		}
	}

	public static class OfLong {


		public OfLong() {
		}

		public OfLong(int initialCapacity) {
		}

		@java.lang.Override
		protected long[][] newArrayArray(int size) {
		}

		@java.lang.Override
		public long[] newArray(int size) {
		}

		@java.lang.Override
		protected int arrayLength(long[] array) {
		}

		@java.lang.Override
		public void accept(long i) {
		}

		public long get(long index) {
		}

		@java.lang.Override
		public group.diamonddev.iterator.PrimitiveIterator.OfLong iterator() {
		}
	}

	public static class OfDouble {


		public OfDouble() {
		}

		public OfDouble(int initialCapacity) {
		}

		@java.lang.Override
		protected double[][] newArrayArray(int size) {
		}

		@java.lang.Override
		public double[] newArray(int size) {
		}

		@java.lang.Override
		protected int arrayLength(double[] array) {
		}

		@java.lang.Override
		public void accept(double i) {
		}

		public double get(long index) {
		}

		@java.lang.Override
		public group.diamonddev.iterator.PrimitiveIterator.OfDouble iterator() {
		}
	}
}
