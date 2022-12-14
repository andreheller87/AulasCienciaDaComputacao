import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exerc1Lista5 {
public static void main(String[] args) {
	
	try(FileWriter fw = new FileWriter("Arq.txt")){
		fw.write("12345");
		fw.close();
		
		FileOutputStream fis = new FileOutputStream("Arq.dat") ;
		DataOutputStream dos = new DataOutputStream(fis);
		dos.writeInt(123456);
		fis.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try(BufferedReader br =new  BufferedReader(new FileReader("Arq.txt"))){
		
		String str = br.readLine();
		System.out.println("Arquivo txt leitura txt: " + str);
		br.close();
		
		BufferedReader br2 =new  BufferedReader(new FileReader("Arq.dat"));
		String str2 = br2.readLine();
		System.out.println("Arquivo dat leitura txt: " + str2);
		br2.close();
		
		FileInputStream fis = new FileInputStream("Arq.txt");
		DataInputStream dis = new DataInputStream(fis);
		int nu = dis.readInt();
		System.out.println("Arquivo txt leitura em dat: "+nu);
		dis.close();
		
		FileInputStream fis2 = new FileInputStream("Arq.dat");
		DataInputStream dis2 = new DataInputStream(fis2);
		int nu2 = dis2.readInt();
		System.out.println("Arquivo dat leitura em dat: "+nu2);
		dis2.close();
		
	}catch(EOFException e) {
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
