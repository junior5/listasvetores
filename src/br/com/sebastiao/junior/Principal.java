package br.com.sebastiao.junior;

import java.util.Scanner;

import br.com.sebastiao.junior.enuns.EResultado;
import br.com.sebastiao.junior.exception.NumeroForaIntervaloException;
import br.com.sebastiao.junior.exception.NumeroNaoMultiploExcpetion;
import br.com.sebastiao.junior.exception.OpcaoResultadoInvalidaException;

public class Principal {

	public static void main(String[] args) {
		Integer[] vetor =  new Integer[10];
		Integer valor = null;
		String opcaoResultado = null;
		CalculadoraDeMultiplos calculadora = new CalculadoraDeMultiplos();
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.print("Informe um valor de 100 até 1000 que seja multiplo de 10 (Dez): ");
			
			valor = scanner.nextInt();

			if (valor == null || valor < 100 || valor > 1000) {
				throw new NumeroForaIntervaloException("Valor informado está fora do intervalo aceito (100 até 1000)!");
			}
			
			if (!calculadora.isMultiplo(valor, 10)) {
				throw new NumeroNaoMultiploExcpetion("O valor informado não é multiplo de 10 (Dez)!");
			}
			
			System.out.print("\nDeseja somar as posições pares ou impares? ");
			
			opcaoResultado = scanner.next();
			
			if (opcaoResultado == null 
					|| !opcaoResultado.equalsIgnoreCase(EResultado.PARES.name()) 
					&& !opcaoResultado.equalsIgnoreCase(EResultado.IMPARES.name())) {
				throw new OpcaoResultadoInvalidaException("Opção de resultado inválida!");
			}
		}
		
		
		for (int indice = 1; indice <= 10; indice++) {
			vetor[indice-1] = (calculadora.indiceIsMultiploTres(indice, valor)) 
					? calculadora.calcular(new NumeroMultiploDeTres(indice, valor)) 
					: calculadora.calcular(new NumeroNaoMultiploDeTres(indice, valor));
		}
		
		System.out.println("\nTotal: "+ calculadora.somatorio(vetor, opcaoResultado.equalsIgnoreCase(EResultado.PARES.name())));
	}
}
