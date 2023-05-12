package group.diamonddev.iterator;


/**
 *  A base type for primitive specializations of {@link Iterator}.
 *  Specialized subtypes are provided for {@link OfInt int},
 *  {@link OfLong long} and {@link OfDouble double} values.
 * 
 *  @author Diamond
 */
public final class PrimitiveIterator {

	public abstract static class OfInt {


		public OfInt() {
		}

		public abstract int nextInt() {
		}

		@java.lang.Override
		public Integer next() {
		}

		@java.lang.Override
		public void remove() {
		}
	}

	public abstract static class OfLong {


		public OfLong() {
		}

		public abstract long nextLong() {
		}

		@java.lang.Override
		public Long next() {
		}

		@java.lang.Override
		public void remove() {
		}
	}

	public abstract static class OfDouble {


		public OfDouble() {
		}

		public abstract double nextDouble() {
		}

		@java.lang.Override
		public Double next() {
		}

		@java.lang.Override
		public void remove() {
		}
	}
}
