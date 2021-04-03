package principal;

import java.util.Scanner;
import mensagens.Mensagem;

public class Main {

	public static void main(String[] args) {
		// Criação do objeto do tipo Scanner para leitura de valores do teclado.
		Scanner sc = new Scanner(System.in);
		
		// Criação de variáveis
		Aluno aluno1, aluno2;
		int mat;
		String nome;
		float nota; 
		
		// Instanciar (criar) um objeto.
		aluno1 = new Aluno();
		Mensagem mensagem = new Mensagem();
		
		// Entrada de dados.
		System.out.println("---=== Digite os dados do Aluno1 ===---");
		System.out.println("- matrícula: ");
		aluno1.setMatricula(sc.nextInt());
		sc.skip("\n");
		
		System.out.println("- nome: ");
		aluno1.setNome(sc.nextLine());
		
		System.out.println("- nota: ");
		aluno1.setNota(sc.nextFloat());

		// Impressão dos dados buscando diretamente do objeto.
		System.out.println("\n--- Dados do Aluno1 ---");
		System.out.println("- matrícula: " + aluno1.getMatricula());
		System.out.println("- nome     : " + aluno1.getNome());
		System.out.println("- nota     : " + aluno1.getNota());
		
		if(aluno1.getNota() > 7)
			System.out.println("- mensagem : " + mensagem.otimoAluno());
		else
			if((aluno1.getNota() >= 6) && (aluno1.getNota() <= 7))
				System.out.println("- mensagem : " + mensagem.bomAluno());
			else
				System.out.println("- mensagem : " + mensagem.ruimAluno());

		// Aluno2 ==================================================================
		
		// Entrada de dados.
		System.out.println("\n\n---=== Digite os dados do Aluno2 ===---");
		System.out.println("- matrícula: ");
		mat = sc.nextInt();
		sc.skip("\n");
		
		System.out.println("- nome: ");
		nome = sc.nextLine();
		
		System.out.println("- nota: ");
		nota = sc.nextFloat();
		
		// Instanciação utilizando o construtor com parâmetros.
		aluno2 = new Aluno(mat,nome,nota);		

		// Impressão dos dados buscando diretamente do objeto.
		System.out.println("\n--- Dados do Aluno2 ---");
		System.out.println("- matrícula: " + aluno2.getMatricula());
		System.out.println("- nome     : " + aluno2.getNome());
		System.out.println("- nota     : " + aluno2.getNota());
	
		if(aluno2.getNota() > 7)
			System.out.println("- mensagem : " + mensagem.otimoAluno());
		else
			if((aluno2.getNota() >= 6) && (aluno2.getNota() <= 7))
				System.out.println("- mensagem : " + mensagem.bomAluno());
			else
				System.out.println("- mensagem : " + mensagem.ruimAluno());

		
		float media;
		
		media = (aluno1.getNota() + aluno2.getNota()) / 2;
		
		System.out.println("\n\n---===[ Média da Turma ]===---");
		System.out.println("- média: " + media);
		
		sc.close();
	}
}
