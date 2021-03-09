package Aplicação;

import java.util.Scanner;

import Controller.ContaController;



public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContaController controller = new ContaController();
		
		
		int opcao;
		Boolean loop = true;
		
		while(loop) {
			
			System.out.println("\nO que você deseja fazer?\n");
			System.out.println("1 - Cadastrar Conta \n ");
			System.out.println("2 - Sacar \n");
			System.out.println("3 - Depositar \n ");
			System.out.println("4 - Sair \n ");
			System.out.println("Digite o numero da opção desejada:");
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
				case 1: 
					controller.cadastrarContaController();
					break;
				case 2:
					controller.sacarController();
					break;
				case 3:
					controller.depositarController();
					break;
				case 4:
					System.out.println("\n Programa encerrado!!!");
					sc.close();
					loop=false;
			
			
			}
		}

	}

}
