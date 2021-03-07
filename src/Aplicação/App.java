package Aplicação;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
					System.out.println("\n rograma encerrado!!!");
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					System.out.println("\n Programa encerrado!!!");
					sc.close();
					loop=false;
			
			
			}
		}

	}

}
