package group.diamonddev.function;


/**
 *  Represents a function which supply a result.
 * 
 *  @param <T> the type of the result
 * 
 *  @author Diamond
 */
public interface Supplier {

	/**
	 *  Gets a result.
	 * 
	 *  @return a result
	 */
	public Object get();
}
