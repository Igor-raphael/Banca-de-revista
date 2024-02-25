package banca_de_revistas;

public class Cliente {
	
	private String Nome;
	private int idade;
	private double Dinheiro;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getDinheiro() {
		return Dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		Dinheiro = dinheiro;
	}
	
	
	String ValidaçãoDeIdade () {
		if (getIdade() >= 18) {
			return "Você esta apto para fazer transações.";
		}else {
			return "Menores de 18 Anos não estão aptos a realizar transações. ";
		}
		
	}
	
	
	
	boolean Validação(double Preco) {
		
		if( getDinheiro() >= Preco) {
		     Dinheiro -= Preco;
		     return true;
		}else {
			return false;
		}
	}
	

}
