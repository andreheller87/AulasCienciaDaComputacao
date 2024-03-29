import java.util.Comparator;

public class ComparaModelo implements Comparator<Veiculo> {

	@Override
	public int compare(Veiculo v1, Veiculo v2) {
		int resultado = v1.getModelo().compareTo(v2.getModelo());
		if(resultado != 0) {
		return resultado;
		}
		ComparaAnoPlaca comparador = new ComparaAnoPlaca();
		return comparador.compare(v1, v2);
	}

}
