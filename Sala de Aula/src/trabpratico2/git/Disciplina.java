package trabpratico2.git;

public class Disciplina {
	
	Aluno[] alunos = new Aluno[10];
	String[] listaNomes = {"Henrile" , "Patricia", "Pedro", "Marcia", "Lucas", "Karen", "George", "Andre", "Yasmim", "Victor"};  
	
	public void preencheArray() {
		for (int i = 0; i < 10; i++) {
			addArray(listaNomes[i], geraId(), i, geraNotas(), geraNotas()); 
		}
	}
	
	public void addArray(String nome, int id, int posicao, double nota1, double nota2) {
		Aluno aluno = new Aluno();
		alunos[posicao] = aluno;
		aluno.mudaNome(nome);
		aluno.mudaId(id);
		aluno.nota1 = nota1;
		aluno.nota2 = nota2;
		System.out.println(alunos[posicao]);
		
	}
	
	public void coletaMedia() {
		double soma1 = 0;
		double soma2 = 0;
		for (int i = 0; i < 10; i++) {
			double nota1 = alunos[i].nota1;
			double nota2 = alunos[i].nota2;
			
			soma1 = soma1 + nota1;
			soma2 = soma2 + nota2;
					
		}
		System.out.println("A média da nota 1 é: " + (soma1 / 2));
		System.out.println("A média da nota 2 é: " + (soma2 / 2));
	}
	
	public void antesDepois(int posicao) {
				
		if (posicao == 9) {
			System.out.println("O aluno antecessor é: " + alunos[(posicao - 1)].nome);
			System.out.println("Não existe aluno sucessor.");				
		}
		if (posicao == 0) {
			System.out.println("Não há aluno antecessor.");
			System.out.println("O aluno sucessor é: " + alunos[(posicao + 1)].nome);			
		}		
		if (posicao != 0 && posicao != 9 ) {
			System.out.println("O aluno antecessor é: " + alunos[(posicao - 1)].nome);
			System.out.println("O aluno sucessor é: " + alunos[(posicao + 1)].nome);
		}	
	}
	
	public int geraId() {
		int min = 1;
		int max = 10;
		int aleatoria = (int)Math.floor(Math.random() * (max-min+1) + min);
		return aleatoria;
	}
	
	public double geraNotas() {
		double min = 0;
		double max = 10;	
		double aleatoria = Math.floor(Math.random() * (max-min+1) + min);
		return aleatoria;
	}
	

}
