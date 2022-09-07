//  André Heller
//	Gabriel De Antoni Santos
public class Expressao {

	private String exp;

	public Expressao(String exp) {

		this.exp = exp;
	}

	public boolean estaCorretaSintaticamente() {
		int abertos = 0, fechados = 0;
		String parens = exp;

		for (int i = 0; i < parens.length(); i++) {
			if (parens.charAt(i) == '(') {
				abertos++;
			}
			if (parens.charAt(i) == ')') {
				fechados++;
				if (abertos < fechados) {
					return false;
				}
			}
		}
		return abertos == fechados ? true : false;
	}

	public int intgetQtdeDivisores() {
		int qtdDivisores = 0;
		String divisores = exp;
		for (int i = 0; i < divisores.length(); i++) {
			if (divisores.charAt(i) == '/') {
				qtdDivisores++;
			}
		}
		return qtdDivisores;
	}

	public int getPosicaoOperador() {
		int posicao = -1;
		String operador = exp;
		for (int i = 0; i < operador.length(); i++) {
			if (operador.charAt(i) == '+' || operador.charAt(i) == '-' || operador.charAt(i) == '*'
					|| operador.charAt(i) == '/') {
				posicao = i;
				return posicao;
			}
		}
		return posicao;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

}
