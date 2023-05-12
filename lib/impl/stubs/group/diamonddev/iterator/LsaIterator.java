package group.diamonddev.iterator;


/**
 *  Abstract iterator with implemented {@code remove} method.
 * 
 *  @param <T> the type of the elements
 * 
 *  @author Diamond
 */
public abstract class LsaIterator implements java.util.Iterator {

	public LsaIterator() {
	}

	@java.lang.Override
	public void remove() {
	}

	@java.lang.Override
	public final Object next() {
	}

	public abstract Object nextIteration() {
	}
}
