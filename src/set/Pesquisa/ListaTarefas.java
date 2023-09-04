package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefas> tarefasSet;

	public ListaTarefas() {
		this.tarefasSet = new HashSet<>();
	}
	public void adicionarTarefa(String descricao) {
		tarefasSet.add(new Tarefas(descricao));
	}
	public void removerTarefa(String descricao) {
		Tarefas tarefaParaRemover=null;
		for(Tarefas t : tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover=t;
				break;
			}
		}
	}
	public void exibirTarefas() {
		System.out.println(tarefasSet);
	}
	public int contarTarefas() {
		return tarefasSet.size();
	}
	public int obterTarefasConcluidas() {
		Set<Tarefas> tarefasConcluidas=null;
		for(Tarefas t : tarefasSet) {
			if(t.getConcluida()==true) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas.size();
	}
	public int obterTarefasPendentes() {
		Set<Tarefas> tarefasPendentes=null;
		for(Tarefas t : tarefasSet) {
			if(t.getConcluida()==false) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes.size();
	}
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefas t : tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
				break;
			}
		}
	}
	public void marcarTarefaPendente(String descricao) {
		for(Tarefas t : tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(false);
				break;
			}
		}
	}
	public void limparListaTarefas() {
		for(Tarefas t : tarefasSet) {
			tarefasSet.remove(t);
		}
	}
}
