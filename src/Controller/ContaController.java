package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Conta;
import Entidades.Titular;
import Model.Model;
import View.View;



public class ContaController {
	
	Titular titular = new Titular();
	View view = new View();
	Model model = new Model();
	Scanner sc = new Scanner(System.in);
	
	double depositoInicial,deposito,saque;
	int respostaVerificacao;
	
	Conta respostaConsulta = new Conta();
	String cpf;
	
	
	//Controller de cadastramento de contas
	
	public void cadastrarContaController(){
		
		int opicao,verificarExist;
		Conta cadastrarConta = new Conta();
		
		System.out.println("-----CADASTRO DE CONTA-----");
		
		opicao = view.opcDepositoInicial();
		
		if(opicao == 1 ) {
			
			titular = view.cadastroConta();
			depositoInicial = view.depositoInicial();
			
		}else {
			titular = view.cadastroConta();
		}
		
		verificarExist = verificarExist(titular);
		
		if(verificarExist == 1) {
			cadastrarConta = model.criarConta(titular,depositoInicial, opicao);
			if(cadastrarConta != null) {
				System.out.println("\nConta cadastrada com sucesso");
				System.out.println(cadastrarConta.toString());
				System.out.println("\nAperte Enter para continuar");
				sc.nextLine();
			}else {
				System.out.println("\nErro ao cadastradar a conta");
			}
		}else {
			System.out.println("\nJá existe conta para o CPF informado");
		}	
		
	}
	
	//Controller de realização do deposito
	
	public void depositarController() {
		
		Conta contaExist = new Conta();
		int loop = 0;
		int resultDeposito;
		
		System.out.println("-----DEPOSITO-----");
		
		while(loop==0 && loop!=2) {
			
			cpf = view.titularCpf();
			contaExist = consultarExist(cpf);
			
			if(contaExist!=null) {
				deposito = view.deposito();
				resultDeposito = model.depositar(contaExist,deposito);
				if(resultDeposito==1) {
					System.out.println("\nDeposito feito com sucesso");
					System.out.println(contaExist.toString());
					System.out.println("\nApete Enter para continuar");
					sc.nextLine();
				}
				
				loop=1;
			}else if(contaExist==null) {
				loop=2;
			}
		}
	}
	
	//Controller de realização do saque
	
	public void sacarController() {
		
		Conta contaExist = new Conta();
		int loop = 0;
		int resultSaque;
		
		System.out.println("-----SAQUE-----");
		
		while(loop==0 && loop!=2) {
			
			cpf = view.titularCpf();
			contaExist = consultarExist(cpf);
			
			if(contaExist!=null) {
				saque = view.saque();
				resultSaque = model.sacar(contaExist,saque);
				if(resultSaque==1) {
					System.out.println("\nSaque feito com sucesso");
					System.out.println(contaExist.toString());
					System.out.println("\nApete Enter para continuar");
					sc.nextLine();
				}
				
				loop=1;
			}else if(contaExist==null) {
				loop=2;
			}
		}
	}
	
	//Controller de verificação de existencia de conta criada para o CPF informado
	
	public int verificarExist(Titular titular) {
		
		List<Conta> contasExist = new ArrayList<>();
		
		contasExist = model.consultarContas();
		
		String titularCpf = titular.getCpf();
		
		Titular titularExist = new Titular();
		
		
		
		if(contasExist.size()>=1) {
			for(Conta c : contasExist) {
				titularExist = c.getTitular();
				if(titularCpf.contains(titularExist.getCpf())) {
					respostaVerificacao = 0;
					break;
				}else{
					respostaVerificacao = 1;
				}
			}
		}
		
		if(contasExist.size()<1) {
			respostaVerificacao = 1;
		}
		
		return respostaVerificacao;
	}
	
	//Controller de verificação de conta de destino existente
	
	public Conta consultarExist(String cpf) {
			
			List<Conta> contasExist = new ArrayList<>();
			
			contasExist = model.consultarContas();
			
			String titularCpf = cpf;
			
			Titular titularExist = new Titular();
			
			if(contasExist.size()>=1) {
				for(Conta c : contasExist) {
					titularExist = c.getTitular();
					if(titularCpf.contains(titularExist.getCpf())) {
						respostaConsulta = c;
						System.out.println("\nConta encontrada\n");
						System.out.println(c.toString());
						break;
					}else if(contasExist.size()== contasExist.indexOf(c)+1){
						respostaConsulta = null;
						System.out.println("\nNão existe conta para esse CPF");
					}
				}
	
			}
			if(contasExist.size()<1) {
				respostaConsulta = null;
				System.out.println("\nNão existe contas cadastradas");
			}
			
			return respostaConsulta;
		}
}
