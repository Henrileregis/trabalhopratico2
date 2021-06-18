package trabpratico2.git;

public class Aluno {
	
	protected String nome;
    private int id;
    private double media;
    protected double nota1;
    protected double nota2;

    public void mostraNome(){
        System.out.println("O nome é: " + this.nome);
    }

    public void mudaNome(String nome) {
        this.nome = nome;
    }

    public void mostraId() {
    	System.out.println("O número id é: " + this.id);
    }

    public void mudaId(int id) {
        this.id = id;
    }

    private void calculaMedia(){
        media = ((this.nota1 + this.nota2) / 2);
    }

    public double retornaMedia(){
        calculaMedia();
        return this.media;
    }
    
    public boolean passou(){
        return this.media >= 7;
    }

}
