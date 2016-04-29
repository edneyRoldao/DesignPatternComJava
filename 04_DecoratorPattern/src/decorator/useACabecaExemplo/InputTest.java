package decorator.useACabecaExemplo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Para o teste funcionar, é preciso criar um arquivo de texto e adicionar ao objeto do tipo File.
 * 
 * @author Edney Roldão
 *
 */
public class InputTest {
	public static void main(String[] args) throws IOException {
		
		int c;
		
		try {
			
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("texto.txt")));
			while((c = in.read()) >= 0) {
				System.out.println((char) c);
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
