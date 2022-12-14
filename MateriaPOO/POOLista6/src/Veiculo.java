
public class Veiculo implements Comparable<Veiculo>{
	private String placa;
	private String modelo;
	private int ano;
	private String proprietario;
	
	
	public Veiculo(String placa, String modelo, int ano, String proprietario) {
		
		this.setPlaca(placa);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setProprietario(proprietario);
		
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if(placa!=null && !placa.isBlank()) {
		this.placa = placa;
		} else {
		 throw new IllegalArgumentException("placa invalida");
		}
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo!=null && !modelo.isBlank()) {
		this.modelo = modelo;
	} else {
		 throw new IllegalArgumentException("Modelo invalida");
		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(ano>0) {
		this.ano = ano;
		}else {
			throw new IllegalArgumentException("ano invalido");
		}
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		if(proprietario!=null && !proprietario.isBlank()) {
		this.proprietario = proprietario;
		
	}else {
		throw new IllegalArgumentException("proprietario invalido");
		}
	}


	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + ", proprietario=" + proprietario
				+ "]";
	}


	@Override
	public int compareTo(Veiculo outro) {
		return (this.getPlaca().compareTo(outro.getPlaca())) ;
		
	}
	

	
	
	
	

}
