package Entidades;

public class Titular {
	
	@Override
	public String toString() {
		return "Titular [nome=" + nome + ", cpf=" + cpf + "]";
	}


	private String nome;
	private String cpf;
	
	
	public Titular() {
		
	}
	
	public Titular(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	

}
