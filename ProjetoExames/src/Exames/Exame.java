package Exames;

public class Exame {
	private String nome;
	private String tipoSang;
	private int anoNasc;
	
	public Exame (String nome, String tipoSang, int anoNasc) {
		this.nome = nome;
		this.tipoSang = tipoSang;
		this.anoNasc = anoNasc;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTipoSang() {
		return tipoSang;
	}
	
	public int getAnoNasc() {
		return anoNasc;
	}
	
	public int getIdade() {
		return java.time.Year.now().getValue() - anoNasc;
	}
}
