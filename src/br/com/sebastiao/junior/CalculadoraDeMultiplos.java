package br.com.sebastiao.junior;

public class CalculadoraDeMultiplos {

	public Integer calcular(Multiplos multiplos) {
		return multiplos.calcular();
	}
	
	public Boolean isMultiplo(Integer valor, Integer multiplo) {
		return (valor % multiplo == 0);
	}
	
	public Boolean indiceIsMultiploTres(Integer indice, Integer valor) {
		return ((valor * indice) % 3 == 0);
	}
	
	public Boolean isNumeroPar(Integer indice) {
		return ((indice + 1) % 2 == 0);
	}
	
	public Integer somatorio(Integer[] vetor, Boolean indicesPares) {
		Integer total = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (indicesPares && isNumeroPar(i) || !indicesPares && !isNumeroPar(i)) {
				total += vetor[i];
			}
		}
		
		return total;
	}
}
