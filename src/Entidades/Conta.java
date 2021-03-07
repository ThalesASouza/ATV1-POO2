package Entidades;

public class Conta {
	
	private static int id=0;
	private Double saldo;
	private Integer numeroConta;
	private Double depositoInicial;
	
	public Conta() {
		 
	}
	public Conta(Double saldo, Integer numeroConta, Double depositoInicial) {
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.depositoInicial = depositoInicial;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public Double getDepositoInicial() {
		return depositoInicial;
	}
	
	public void setDepositoInicial(Double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}

}
