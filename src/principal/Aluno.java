package principal;

public class Aluno {
	private int matricula;
	private String nome;
	private float nota;
	
	public Aluno() {
		
	}

	public Aluno(int matricula, String nome, float nota) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota = nota;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int mat) {
		matricula = mat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
}
