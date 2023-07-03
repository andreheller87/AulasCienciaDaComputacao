package lineares;

public class TestMap {

	public static void main(String[] args) {
		MapaDispersao<String,Veiculo> veiculo = new MapaDispersao<>(10);
		
		Veiculo v = new Veiculo();
		v.setPlaca("AAA-0123");
		v.setModelo("Hyundai Creta");
		v.setAno(2017);
		v.setProprietario("João da Silva");
		
		
		veiculo.inserir(v.getPlaca(), v);
		System.out.println(veiculo.toString());
		


	}

}
