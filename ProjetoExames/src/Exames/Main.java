package Exames;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);

        System.out.println("Digite as informações para o exame de Glicemia:");
        System.out.println("Nome do paciente:");
        String nome = tec.nextLine();
        System.out.println("Tipo sanguíneo:");
        String tipoSang = tec.nextLine();
        System.out.println("Ano de nascimento:");
        int anoNasc = tec.nextInt();
        System.out.println("Digite a quantidade de glicose por mg/dL:");
        double qtdGlicose = tec.nextDouble();
        tec.nextLine();  
        Glicemia glicemia = new Glicemia(nome, tipoSang, anoNasc);
        glicemia.cadastrarExame(qtdGlicose, null);
        glicemia.mostrarResultado();

        System.out.println("\nDigite as informações para o exame de Colesterol:");
        System.out.println("Nome do paciente:");
        nome = tec.nextLine();
        System.out.println("Tipo sanguíneo:");
        tipoSang = tec.nextLine();
        System.out.println("Ano de nascimento:");
        anoNasc = tec.nextInt();
        System.out.println("Digite a quantidade de HDL por mg/dL:");
        double qtdHDL = tec.nextDouble();
        System.out.println("Digite a quantidade de LDL por mg/dL:");
        double qtdLDL = tec.nextDouble();
        tec.nextLine();  
        Colesterol colesterol = new Colesterol(nome, tipoSang, anoNasc);
        colesterol.cadastrarExame(qtdHDL, qtdLDL);
        colesterol.mostrarResultado();

        System.out.println("\nDigite as informações para o exame de Triglicerídeos:");
        System.out.println("Nome do paciente:");
        nome = tec.nextLine();
        System.out.println("Tipo sanguíneo:");
        tipoSang = tec.nextLine();
        System.out.println("Ano de nascimento:");
        anoNasc = tec.nextInt();
        System.out.println("Digite a quantidade de triglicerídeos por mg/dL:");
        double qtdTriglicerideos = tec.nextDouble();
        tec.nextLine();  
        Triglicerideos triglicerideos = new Triglicerideos(nome, tipoSang, anoNasc);
        triglicerideos.cadastrarExame(qtdTriglicerideos);
        triglicerideos.mostrarResultado();

        tec.close();
    }
		
}

