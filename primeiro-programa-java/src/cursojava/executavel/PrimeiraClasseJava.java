package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai= JOptionPane.showInputDialog("Nome da pai?");
		String dataMatricula = JOptionPane.showInputDialog("Data da matricula?");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola?");
		String serieMatriculada = JOptionPane.showInputDialog("Série matriculada?");
		String nota1 = JOptionPane.showInputDialog("Nota 1?");
		String nota2 = JOptionPane.showInputDialog("Nota 2?");
		String nota3 = JOptionPane.showInputDialog("Nota 3?");
		String nota4 = JOptionPane.showInputDialog("Nota 4?");
		
		Aluno aluno1 = new Aluno();//Aqui será o João
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCPF(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculada);
		aluno1.setNota1(Integer.parseInt(nota1));
		aluno1.setNota2(Integer.parseInt(nota2));
		aluno1.setNota3(Integer.parseInt(nota3));
		aluno1.setNota4(Integer.parseInt(nota4));
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado2 = " + aluno1.getAlunoAprovado2());
		/*-------------------------------------------------------------------*/
		
		Aluno aluno2 = new Aluno();//Aqui será o Pedro
		
		Aluno aluno3 = new Aluno();//Aqui será o Valval
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);

	}

}
