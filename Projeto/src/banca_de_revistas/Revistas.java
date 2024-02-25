package banca_de_revistas;

import java.util.ArrayList;


public class Revistas {
	
	private ArrayList <String> Magazine = new ArrayList<String>();
	

	public  ArrayList<String> getMagazine() {
		return Magazine;
	}

	 void setMagazine(ArrayList<String> magazine) {
		Magazine = magazine;
	}

	
	
    void AddRevistas( String R) {
		 Magazine.add( R);	
	}

	
	String EscolhendoAsRevistas(int X) {
		return Magazine.get(X);
	}
 
	void RemovendoRevistas(int A) {
		Magazine.remove(A);
	}
	
	
	

}
