import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.IllegalPathStateException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Random;

import org.junit.jupiter.api.Test;

class Exerc3Lista5Test {

	@Test
	void testHistograma() throws IOException{
		FileOutputStream fos = new FileOutputStream("ArquivoTesteHistograma.tst");
		
		Random r = new Random();
		int Linhas = 400;
		int colunas = 400;
		int valor;
		int esperado[] = new int [256];
		for (int i = 0;i<Linhas;i++) {
			for(int j =0;j<colunas;j++) {
				valor = r.nextInt(256);
				esperado[valor]++;
				fos.write(valor);
			}
			
			
		}
		fos.close();
		Exerc3Lista5 ex = new Exerc3Lista5();
		Path p = Paths.get("ArquivoTesteHistograma.tst");
		int v[] = ex.histograma(p);
		
		assertArrayEquals(esperado, v);
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
