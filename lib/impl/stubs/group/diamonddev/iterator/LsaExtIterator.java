package group.diamonddev.iterator;


/**
 *  Extended iterator for common purposes.
 * 
 *  @param <T> the type of the inner value
 * 
 *  @author Diamond
 */
public abstract class LsaExtIterator implements java.util.Iterator {

	protected Object next;

	protected boolean hasNext;

	protected boolean isInit;

	public LsaExtIterator() {
	}

	@java.lang.Override
	public boolean hasNext() {
	}

	@java.lang.SuppressWarnings("ResultOfMethodCallIgnored")
	@java.lang.Override
	public Object next() {
	}

	protected abstract void nextIteration() {
	}

	@java.lang.Override
	public void remove() {
	}
}
