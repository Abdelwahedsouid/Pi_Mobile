package group.diamonddev.function;


/**
 *  Represents a supplier of {@code int}-valued results.  This is the
 *  {@code int}-producing primitive specialization of {@link Supplier}.
 * 
 *  <p>There is no requirement that a distinct result be returned each
 *  time the supplier is invoked.
 * 
 *  @author Diamond
 */
public interface IntSupplier {

	/**
	 *  Gets a result.
	 * 
	 *  @return a result
	 */
	public int getAsInt();
}
