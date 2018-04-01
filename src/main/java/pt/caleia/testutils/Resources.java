package pt.caleia.testutils;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;


public final class Resources {
	
	
	private Resources() {
	}
	
	
	public static String getResourceAsString( Path path ) throws IOException {
		if( path == null ) {
			throw new IllegalArgumentException( "Argument 'path' can't be null." );
		}
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		try( InputStream inputStream = classLoader.getResourceAsStream( path.toString() ) ) {
			if( inputStream == null ) {
				throw new IllegalArgumentException( String.format( "The file '%s' doesn't exist.", path.toString() ) );
			}
			
			ByteArrayOutputStream result = new ByteArrayOutputStream();
			byte[] buffer = new byte[ 1024 ];
			int length = 0;
			
			do {
				result.write( buffer, 0, length );
				length = inputStream.read( buffer );
			} while( length != -1 );
			
			return result.toString( StandardCharsets.UTF_8.name() );
		}
	}
	
	
	public static String getResourceAsString( String first, String ... more ) throws IOException {
		return getResourceAsString( Paths.get( first, more ) );
	}
	
}
