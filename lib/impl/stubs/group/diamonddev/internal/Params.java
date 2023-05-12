package group.diamonddev.internal;


/**
 *  Parameters for streams.
 * 
 *  @author Diamond
 */
public final class Params {

	public Runnable closeHandler;

	public Params() {
	}

	public static Params wrapWithCloseHandler(Params params, Runnable closeHandler) {
	}
}
