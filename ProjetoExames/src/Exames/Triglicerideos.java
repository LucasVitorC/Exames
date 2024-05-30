package Exames;

public class Triglicerideos extends Exame {

	private double qtdTriglicerideos;
	
	public Triglicerideos(String nome, String tipoSang, int anoNasc) {
		super(nome, tipoSang, anoNasc);
	}
	
	public void cadastrarExame(double qtdTriglicerideos) {
		this.qtdTriglicerideos = qtdTriglicerideos;
		classificarResultado();
	}
	
	public void classificarResultado() {
	        String classificacao = qtdTriglicerideos < 150 ? "Normal" : 
	                              (qtdTriglicerideos < 200 ? "Limítrofe" : 
	                              (qtdTriglicerideos < 500 ? "Alto" : "Muito alto"));
	        System.out.println("Classificação dos Triglicerídeos: " + classificacao);
	}
	
	public void mostrarResultado() {
        System.out.println("Resultado do exame de Triglicerídeos:");
        System.out.println("Quantidade de Triglicerídeos: " + qtdTriglicerideos + " mg/dL");
        classificarResultado();
    }

}
