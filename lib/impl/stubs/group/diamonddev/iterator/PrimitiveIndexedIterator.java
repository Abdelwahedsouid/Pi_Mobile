package group.diamonddev.iterator;


/**
 *  PrimitiveIterator wrapper that supports indexing.
 * 
 *  @author Diamond
 *  @since 1.0.0
 */
public final class PrimitiveIndexedIterator {

	public static class OfInt {


		public OfInt(PrimitiveIterator.OfInt iterator) {
		}

		public OfInt(int start, int step, PrimitiveIterator.OfInt iterator) {
		}

		public int getIndex() {
		}

		@java.lang.Override
		public boolean hasNext() {
		}

		@java.lang.Override
		public int nextInt() {
		}
	}

	public static class OfLong {


		public OfLong(PrimitiveIterator.OfLong iterator) {
		}

		public OfLong(int start, int step, PrimitiveIterator.OfLong iterator) {
		}

		public int getIndex() {
		}

		@java.lang.Override
		public boolean hasNext() {
		}

		@java.lang.Override
		public long nextLong() {
		}
	}

	public static class OfDouble {


		public OfDouble(PrimitiveIterator.OfDouble iterator) {
		}

		public OfDouble(int start, int step, PrimitiveIterator.OfDouble iterator) {
		}

		public int getIndex() {
		}

		@java.lang.Override
		public boolean hasNext() {
		}

		@java.lang.Override
		public double nextDouble() {
		}
	}
}
