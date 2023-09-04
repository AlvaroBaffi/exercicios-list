package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> alunoSet;

	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}
	public void adicionarAluno(String nome, Long matricula, double media) {
		alunoSet.add(new Aluno(nome, matricula, media));
	}
	public void removerAluno(long matricula) {
		for(Aluno a : alunoSet) {
			if(a.getMatricula()==matricula) {
				alunoSet.remove(a);
			}
		}
	}
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
		return alunoPorNome;
	}
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunoPorNota = new TreeSet<>(new CompaatorPorNota());
		alunoPorNota.addAll(alunoSet);
		return alunoPorNota;
	}
	public void exibirAlunos() {
		System.out.println(alunoSet);
	}
}
