package group.diamonddev.iterator;


/**
 *  Iterator wrapper that supports indexing.
 * 
 *  @param <T> the type of the iterator elements
 * 
 *  @author Diamond
 *  @since 1.0.0
 */
@java.lang.SuppressWarnings("WeakerAccess")
public class IndexedIterator implements java.util.Iterator {

	public IndexedIterator(java.util.Iterator iterator) {
	}

	public IndexedIterator(int start, int step, java.util.Iterator iterator) {
	}

	public int getIndex() {
	}

	@java.lang.Override
	public boolean hasNext() {
	}

	@java.lang.Override
	public Object next() {
	}

	@java.lang.Override
	public void remove() {
	}
}
