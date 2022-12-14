import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exerc2Lista5 {
public static void main(String[] args) {
	JFileChooser ch = new JFileChooser();
	int ops = ch.showOpenDialog(null);
	
	if(ops == JFileChooser.APPROVE_OPTION ) {
		File arquivoEntrada = ch.getSelectedFile();
		String nomeSaida = arquivoEntrada.getAbsolutePath()+"-saida";
		 FileReader entrada = null;
		 FileWriter saida = null;
		 int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite valor da chave 0a100"));
		try {
			entrada = new FileReader(arquivoEntrada);
			saida = new FileWriter(nomeSaida);
			
			int lido = entrada.read();
			int convertido;
			
			while (lido != -1) {
				convertido = converte(lido,chave);
				saida.write(convertido);
				
				lido = entrada.read();
				
			}
			entrada.close();
			saida.close();
		}catch (FileNotFoundException e) {
				e.printStackTrace();
				} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

private static int converte(int lido, int chave) {
	int valor = lido + chave;
	if(valor> 255) {
		valor = valor - 256;
	}
	return valor;
}
}
