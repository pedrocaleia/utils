package pt.pcaleia.testutils;


import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * @author Pedro Caleia
 */
public final class Resources {
	
	
	private Resources() {
		throw new AssertionError( Resources.class.getSimpleName() + " class cannot be instantiated." );
	}
	
	
	public static byte[] getResource( Path path ) throws IOException {
		if( path == null ) {
			throw new IllegalArgumentException( "Argument 'path' can't be null." );
		}
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		try( InputStream inputStream = classLoader.getResourceAsStream( path.toString() ) ) {
			if( inputStream == null ) {
				throw new IllegalArgumentException( String.format( "The file '%s' doesn't exist.", path.toString() ) );
			}
			
			byte[] data = inputStream.readAllBytes();
			
			return data;
		}
	}
	
	
	public static byte[] getResource( String first, String ... more ) throws IOException {
		return getResource( Paths.get( first, more ) );
	}
	
	
	public static String getResourceAsString( Path path ) throws IOException {
		byte[] data = getResource( path );
		
		return new String( data, StandardCharsets.UTF_8 );
	}
	
	
	public static String getResourceAsString( String first, String ... more ) throws IOException {
		byte[] data = getResource( Paths.get( first, more ) );
		
		return new String( data, StandardCharsets.UTF_8 );
	}
	
}
