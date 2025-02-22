package cursojava.classes;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCPF;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public Aluno() {
	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getMediaNota() {
		return (disciplina.getNota1() + 
				disciplina.getNota3() + 
				disciplina.getNota3() + 
				disciplina.getNota4())/4;
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return "Aluno está aprovado";
		}else {
			return "Aluno está reprovado";
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, idade, nome, nomeEscola, nomeMae, nomePai, numeroCPF,
				registroGeral, serieMatriculado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(numeroCPF, other.numeroCPF) && Objects.equals(registroGeral, other.registroGeral)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}

	/*
	@Override
	public String toString() {
		return "Aluno nome =" + this.getNome() + "\n" +
				"idade =" + this.getIdade() + "\n" + 
				"data de Nascimento =" + this.getDataNascimento() + "\n" + 
				"registro Geral =" + this.getRegistroGeral() + "\n" + 
				"CPF  =" + this.getNumeroCPF() + "\n" + 
				"nome da Mae =" + this.getNomeMae() + "\n" + 
				"nome do Pai =" + this.getNomePai() + "\n" + 
				"data de Matricula =" + this.getDataMatricula() + "\n" + 
				"nome da Escola =" + this.getNomeEscola() + "\n" + 
				"serie Matriculado =" + this.getSerieMatriculado() + "\n" + 
				"disciplina 1 =" + disciplina.getDisciplina1() + "\n" + 
				"nota 1 =" + disciplina.getNota1() + "\n" + 
				"disciplina 2 =" + disciplina.getDisciplina2() + "\n" + 
				"nota 2 =" + disciplina.getNota2() + "\n" + 
				"disciplina 3 =" + disciplina.getDisciplina3() + "\n" +
				"nota 3 =" + disciplina.getNota3() + "\n" +
				"disciplina 4 =" + disciplina.getDisciplina4() + "\n" + 
				"nota 4 =" + disciplina.getNota4() + "\n" +
				"Média do aluno = " + getMediaNota() +  "\n" +
				"Situação do aluno = " + getAlunoAprovado2() + "\n"; 
				
	}*/
	
	
	
}
