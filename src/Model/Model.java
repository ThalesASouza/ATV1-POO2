package Model;

import java.util.ArrayList;
import java.util.List;

import Entidades.Conta;
import Entidades.Titular;

public class Model {
	
	List<Conta> contas =  new ArrayList<>();
	
	Conta conta = new Conta();
	
	int respostaCadastro;
	
	//Model criação da conta
	
	public Conta criarConta(Titular titular, Double depositoInicial, Integer opicao) {
		
		if(opicao == 1) {
			conta = new Conta(depositoInicial,titular);
			contas.add(conta);
			return conta;
		}else if(opicao==2){
			conta = new Conta(titular);
			contas.add(conta);
			return conta;
		}
		
		return null;
		
	}
	
	//Model Deposito
	
	public int depositar(Conta conta, Double valor) {
		
		Titular titularExist = new Titular();
		String titularCpf = conta.getTitular().getCpf();
		int retorno = 0;
		for(Conta c : contas) {
			titularExist = c.getTitular();
			if(titularCpf.contains(titularExist.getCpf())) {
				c.deposito(valor);
				retorno = 1;
			}
		}
		return retorno;
	}
	
	//Model Saque
	
	public int sacar(Conta conta, Double valor) {
		
		Titular titularExist = new Titular();
		String titularCpf = conta.getTitular().getCpf();
		int retorno = 0;
		for(Conta c : contas) {
			titularExist = c.getTitular();
			if(titularCpf.contains(titularExist.getCpf())) {
				c.sacar(valor);
				retorno = 1;
			}
		}
		return retorno;
	}
	
	//Model retornar todas as contas cadastradas

	public List<Conta> consultarContas(){
		return contas;
	}


}
