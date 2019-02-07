package br.com.sebastiao.junior;

public class NumeroMultiploDeTres implements Multiplos {
	
	private Integer indice;
	private Integer valor;
	
	public NumeroMultiploDeTres(Integer indice, Integer valor) {
		this.indice = indice;
		this.valor = valor;
	}
	
	@Override
	public Integer calcular() {
		return (int) Math.round((this.indice * 0.3 * this.valor));
	}
}
