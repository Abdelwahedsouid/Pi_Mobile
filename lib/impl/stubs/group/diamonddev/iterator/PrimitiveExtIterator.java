package group.diamonddev.iterator;


/**
 *  Extended PrimitiveIterator for common purposes.
 * 
 *  @author Diamond
 */
public final class PrimitiveExtIterator {

	public abstract static class OfInt {


		protected int next;

		protected boolean hasNext;

		protected boolean isInit;

		public OfInt() {
		}

		@java.lang.Override
		public boolean hasNext() {
		}

		@java.lang.SuppressWarnings("ResultOfMethodCallIgnored")
		@java.lang.Override
		public int nextInt() {
		}

		protected abstract void nextIteration() {
		}
	}

	public abstract static class OfLong {


		protected long next;

		protected boolean hasNext;

		protected boolean isInit;

		public OfLong() {
		}

		@java.lang.Override
		public boolean hasNext() {
		}

		@java.lang.Override
		public long nextLong() {
		}

		protected abstract void nextIteration() {
		}
	}

	public abstract static class OfDouble {


		protected double next;

		protected boolean hasNext;

		protected boolean isInit;

		public OfDouble() {
		}

		@java.lang.Override
		public boolean hasNext() {
		}

		@java.lang.Override
		public double nextDouble() {
		}

		protected abstract void nextIteration() {
		}
	}
}
