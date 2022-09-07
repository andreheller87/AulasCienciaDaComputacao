
public class PassageirosHora {

	private int[][][] matriz = new int[12][30][24];

	// item A

	public void adiciona(int dia, int mes, int horas) {
		this.matriz[mes - 1][dia - 1][horas]++;

	}

	public int quantosPassageiros(int dia, int mes) {
		int total = 0;
		int d = dia - 1;
		int m = mes - 1;

		for (int i = 0; i <= matriz[m][d].length; i++) {

			total += matriz[m][d][i];
		}
		return total;
	}

	public int mesMenorFluxo() {

		int mesMenor = 1;
		int qtdeMenor = this.quantosPassageiros(1);
		for (int mes = 2; mes <= 12; mes++) {
			int qtde = this.quantosPassageiros(mes);
			if (qtde < qtdeMenor) {
				qtdeMenor = qtde;
				mesMenor = mes;
			}
		}

		return mesMenor;
	}

	public int quantosPassageiros(int mes) {
		int total = 0;

		for (int dia = 1; dia < 31; dia++) {
			total += this.quantosPassageiros(dia, mes);
		}
		return total;
	}

	public int[] picoTransporte() {
		int diaM, mesM, horaM, qtdeM;
		diaM = mesM = horaM = qtdeM = 0;

		for (int m = 0; m < matriz.length; m++) {
			for (int d = 0; d < matriz.length; d++) {
				for (int h = 0; h < matriz.length; h++) {
					if (matriz[m][d][h] > qtdeM)
						qtdeM = matriz[m][d][h];
					mesM = m + 1;
					diaM = d + 1;
					horaM = h;
				}
			}
		}
		int[] retorno = { diaM, mesM, horaM, qtdeM };
		return retorno;

	}
}
