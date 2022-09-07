
public class Principal {

	public static void main(String[] args) {
		Expressao exp1 = new Expressao("(a+10)/(23*(10.5-b)-2.59/(b*a))");
		Expressao exp2 = new Expressao("(a10((23(10.5b)2.59(ba))");

		System.out.println(exp1.estaCorretaSintaticamente());
		System.out.println(exp1.intgetQtdeDivisores());
		System.out.println(exp1.getPosicaoOperador());
		
		
		System.out.println(exp2.estaCorretaSintaticamente());
		System.out.println(exp2.intgetQtdeDivisores());
		System.out.println(exp2.getPosicaoOperador());
	}

}
