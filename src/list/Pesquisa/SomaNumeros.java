package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	public int calcularSoma() {
		int soma=0;
		if(!numeros.isEmpty()) {
			for(Integer i : numeros) {
				soma=soma+i;
			}
		}
		return soma;
	}
	public int encontrarMaiorNumero() {
		int maiorNumero=0;
		if(!numeros.isEmpty()) {
			for(Integer i : numeros) {
				if(maiorNumero<i) {
					maiorNumero=i;
				}
			}
		}
		return maiorNumero;
	}
	public int encontrarMenorNumero() {
		int menorNumero=0;
		if(!numeros.isEmpty()) {
			for(Integer i : numeros) {
				if(menorNumero>i) {
					menorNumero=i;
				}
			}
		}
		return menorNumero;
	}
	public List<Integer> exibirNumeros(){
		return numeros;
	}
	
}
