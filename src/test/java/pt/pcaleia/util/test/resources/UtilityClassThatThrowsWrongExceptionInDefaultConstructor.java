package pt.pcaleia.util.test.resources;


/**
 * @author Pedro Caleia
 */
public final class UtilityClassThatThrowsWrongExceptionInDefaultConstructor {
	
	
	private UtilityClassThatThrowsWrongExceptionInDefaultConstructor() {
		throw new IllegalArgumentException( UtilityClass.class.getSimpleName() + " class cannot be instantiated." );
	}
	
	
	public static void utilityMethod() {
		// Empty on purpose
	}

}
