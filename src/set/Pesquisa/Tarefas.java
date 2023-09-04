package set.Pesquisa;

import java.util.Objects;

public class Tarefas {
	private String descricao;
	private boolean concluida;
	public Tarefas(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean getConcluida() {
		return concluida;
	}
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	@Override
	public String toString() {
		return "Tarefas [descricao=" + descricao + ", concluida=" + concluida + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefas other = (Tarefas) obj;
		return Objects.equals(descricao, other.descricao);
	}
	
}
