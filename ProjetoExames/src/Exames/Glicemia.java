package Exames;

public class Glicemia extends Exame{

	private double qtdGlicose;
	private String classificacao;
	
	public Glicemia(String nome, String tipoSang, int anoNasc) {
		super(nome, tipoSang, anoNasc);
	}
	
	public void cadastrarExame(double qtdGlicose, String classificacao) {
		this.qtdGlicose = qtdGlicose;
		classificarResultado();
	}
	
	public void classificarResultado() {
		if(qtdGlicose < 100) {
			classificacao = "Normoglicemia";
		}else if(qtdGlicose < 126) {
			classificacao = "Pré-Diabetes";
		}else {
			classificacao = "Diabetes estabelecido";
		}
	}
	
	public void mostrarResultado() {
        System.out.println("Resultado do exame de Glicemia:");
        System.out.println("Quantidade de glicose: " + this.qtdGlicose + " mg/dL, Classificação: " + this.classificacao);
    }

	

}
