package Entidades;

public class Conta {
	
	private static int id=0;
	private Double saldo=0.00;
	private Integer numeroConta;
	private Double depositoInicial=0.00;
	private Titular  titular = new Titular();
	
	//Construtores
	public Conta() {
		
	}
	
	public Conta(Titular titular) {
		this.numeroConta = ++id;
		this.titular = titular;
	}
	
	public Conta(Double depositoInicial,Titular titular) {
		this.numeroConta = ++id;
		this.depositoInicial = depositoInicial;
		this.saldo+=depositoInicial;
		this.titular = titular;
	}	
	
	// GET e SET
	
	

	public Double getSaldo() {
		return saldo;
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public Titular getTitular() {
		return titular;
	}
	
	public Double getDepositoInicial() {
		return depositoInicial;
	}
	
	public void setDepositoInicial(Double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	
	

	
	//Metodos
	
	public void sacar(Double valor) {
		this.saldo -=valor + 5.00;
	}
	
	public void deposito(Double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "\nTitular:"+titular.getNome()+
				"\nNúmero da conta:"+numeroConta+
				"\nDeposito Inicial:"+depositoInicial+
				"\nSaldo:"+saldo;
				
	}

	
	
	
}
