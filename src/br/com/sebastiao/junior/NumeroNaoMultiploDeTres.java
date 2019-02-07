package br.com.sebastiao.junior;

public class NumeroNaoMultiploDeTres implements Multiplos {

	private Integer indice;
	private Integer valor;
	
	public NumeroNaoMultiploDeTres(Integer indice, Integer valor) {
		this.indice = indice;
		this.valor = valor;
	}
	
	@Override
	public Integer calcular() {
		return (int) Math.round((this.indice * 0.1 * this.valor));
	}
}
