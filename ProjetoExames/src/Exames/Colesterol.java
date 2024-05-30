package Exames;

public class Colesterol extends Exame{
	private double qtdHDL;
	private double qtdLDL;
	
	public Colesterol(String nome, String tipoSang, int anoNasc) {
		super(nome, tipoSang, anoNasc);
	}
	
	public void cadastrarExame (double qtdHDL, double qtdLDL) {
		this.qtdHDL = qtdHDL;
		this.qtdLDL = qtdLDL;
		classificarResultado();
	}
	
	public void classificarResultado() {
		String classificacaoHDL = (getIdade() < 20 && qtdHDL > 45) || 
		(getIdade() >= 20 && qtdHDL > 40) ? "HDL - BOM" : "HDL - RUIM";
        String classificacaoLDL = qtdLDL < 100 ? "LDL - BOM" : "LDL - RUIM";
        System.out.println("Classificação do HDL: " + classificacaoHDL);
        System.out.println("Classificação do LDL: " + classificacaoLDL);
	}
	
	public void mostrarResultado() {
		System.out.println("Resultado do exame de Colesterol:");
        System.out.println("Quantidade de HDL: " + qtdHDL + " mg/dL");
        System.out.println("Quantidade de LDL: " + qtdLDL + " mg/dL");
        classificarResultado();
	}
}
