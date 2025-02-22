
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
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Aluno() {}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	public String getRegistroGeral(){
		return registroGeral;
	}
	
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	
	public String getNumeroCPF() {
		return numeroCPF;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public String getDataMatricula() {
		return dataMatricula;
	}
	
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	public String getNomeEscola() {
		return nomeEscola;
	}
	
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	
	
	
}
