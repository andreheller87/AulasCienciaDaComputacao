import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lista6Exer1 {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("BBB4198","fusca",1999, "Carlos");
		Veiculo v2 = new Veiculo("AAA6585","gol",2000, "Maria");
		Veiculo v3 = new Veiculo("FFF5385","marea",2010, "Enzo");
		Veiculo v4 = new Veiculo("CCC6070","omega",2021, "Joao");
		Veiculo v5 = new Veiculo("EEE7060","chevet",2010, "Gabriel");
		Veiculo v6 = new Veiculo("DDD8859","palio",2018, "Paulo");
		Veiculo v7 = new Veiculo("III9040","combe",2003, "Joana");
		Veiculo v8 = new Veiculo("HHH1337","gol quadrado",2005, "Andre");
		Veiculo v9 = new Veiculo("JJJ2822","celta",2016, "Pedro");
		Veiculo v10 = new Veiculo("VVV3010","corsa",2013, "Joaquim");
		
		LinkedList<Veiculo> veiculo = new LinkedList<>();
		veiculo.add(v1);veiculo.add(v2);veiculo.add(v3);veiculo.add(v4);
		veiculo.add(v5);veiculo.add(v6);veiculo.add(v7);veiculo.add(v8);
		veiculo.add(v9);veiculo.add(v10);
		
		
		
		veiculo.remove(v6);
		veiculo.remove(6);
		ListIterator<Veiculo> li = veiculo.listIterator(veiculo.size() -2);
		Veiculo vli = li.previous();
		li.remove();
		
		Collections.shuffle(veiculo); //embaralhar
	
		//Collections.sort(veiculo); // collections.sort tem que ter compareTo na classe
		//ComparaAnoPlaca com = new ComparaAnoPlaca();
		//Collections.sort(veiculo,com);
		
		//ComparaModelo modelo = new ComparaModelo();
	//	Collections.sort(veiculo,modelo);
		
		for (Veiculo v : veiculo) {
			
			System.out.println(v.toString());
		}
	
		
		
		
		
		
	}

}
