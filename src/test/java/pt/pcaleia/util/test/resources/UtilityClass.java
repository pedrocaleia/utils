package pt.pcaleia.util.test.resources;


/**
 * @author Pedro Caleia
 */
public final class UtilityClass {
	
	
	private UtilityClass() {
		throw new AssertionError( UtilityClass.class.getSimpleName() + " class cannot be instantiated." );
	}
	
	
	public static void utilityMethod() {
		// Empty on purpose
	}

}
