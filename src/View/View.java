package View;

import java.util.Scanner;


import Entidades.Titular;

public class View {
	
	String nomeTitular,cpf;
	double depositoInicial, deposito,saque;
	int opicao;
	
	Titular titular = new Titular();
	Scanner sc = new Scanner(System.in);
	
	//View de recebimento dos dados do titular
	
	public Titular cadastroConta() {
		
		System.out.println("\nDigite o nome do Titular da Conta\n");
		nomeTitular = sc.nextLine();
		
		System.out.println("\nDigite o CPF do Titular da Conta\n");
		cpf = sc.nextLine();
		
	    titular = new Titular(nomeTitular,cpf);
	   
		return titular;
	}
	
	//View de recebimento da opção de deposito inicial
	
	public int opcDepositoInicial() {
		
		System.out.println("\nDeseja fazer deposito inicial ?\n");
		System.out.println("1 - SIM\n");
		System.out.println("2 - NÃO\n");
		opicao = sc.nextInt();
		sc.nextLine();
		
		return opicao;
	}
	
	//View de recebimento do valor do deposito inicial
	
	public Double depositoInicial() {
		
		System.out.println("\nDigite o valor do deposito inicial\n");
		deposito = sc.nextDouble();
		
		return deposito;
	}
	
	//View de recebimento do CPF do titular da conta
	
	public String titularCpf() {
		
		System.out.println("\nDigite o CPF do Titular da Conta\n");
		cpf = sc.nextLine();
		
		return cpf;
	}
	
	//View de recebimento do valor do deposito
	
	public Double deposito() {
		
		System.out.println("\nDigite o valor do deposito\n");
		deposito = sc.nextDouble();
		sc.nextLine();
		return deposito;
		
		
	}
	
	//View de recebimento do valor do saque
	
	public Double saque() {
		
		System.out.println("\nDigite o valor do saque\n");
		saque = sc.nextDouble();
		sc.nextLine();
		return saque;
		
		
	}
	

}
