import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Vector;

public class Exerc3Lista5 {
	public int[] histograma(Path p) {
		int vetor[]  = new int [256];
		try(FileInputStream fis = new FileInputStream(p.toString())) {
			
			int lido = fis.read();
			while(lido != -1) {
				vetor[lido]++;
				lido = fis.read();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return vetor;
		
	}

}
