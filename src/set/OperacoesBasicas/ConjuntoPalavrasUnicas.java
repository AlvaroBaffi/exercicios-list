package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavraSet;

	public ConjuntoPalavrasUnicas() {
		this.palavraSet = new HashSet<>();
	}
	public void adicionarPalavra(String palavra) {
		palavraSet.add(palavra);
	}
	public void removerPalavra(String palavra) {
		String palavraParaRemover=null;
		for(String p : palavraSet) {
			if(p.equalsIgnoreCase(palavra)) {
				palavraParaRemover=palavra;
				break;
			}
		}
		palavraSet.remove(palavraParaRemover);
	}
	public boolean verificarPalavra(String palavra) {
		boolean verificador=false;
		for(String p : palavraSet) {
			if(p.equalsIgnoreCase(palavra)) {
				verificador=true;
			}
		}
		return verificador;
	}
	public void exibirPalavrasUnicas() {
		System.out.println(palavraSet);
	}
}
