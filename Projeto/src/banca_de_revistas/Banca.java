package banca_de_revistas;

import java.util.Scanner;


public class Banca {
	
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		Revistas Coleção = new Revistas();
		
		Coleção.AddRevistas("Css Eficiente");
		Coleção.AddRevistas("Guia definitivo de JavaScript");
		Coleção.AddRevistas("Clean Code");
		Coleção.AddRevistas("Rede de Computadores");
		Coleção.AddRevistas("Entendendo algoritmos");
		Coleção.AddRevistas("Desbravando Java");
		Coleção.AddRevistas("O guia completo para Linux");
		Coleção.AddRevistas("Web services REST");
		Coleção.AddRevistas("Boas práticas em UX Design");
		Coleção.AddRevistas("Arquitetura de Software");
		
		//System.out.println(Coleção.EscolhendoAsRevistas(4));
		
		for (String X: Coleção.getMagazine()) {
			System.out.println(X);
		}
		
		
	}

}
