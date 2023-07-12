//Trabalho feito por Abner Cestari RU 4259827 curso de Análise e Desenvolvimento de Sistema - Uninter 2023
package Trabalho_Pratico_POO_Java;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void displayMainMenu() {
		System.out.println("---------------------------------------");
		System.out.println("----------------COFRINHO---------------");
		System.out.println("---------------------------------------");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas"); 
		System.out.println("4 - Calcular total convertido para Real"); 
		System.out.println("0 - Encerrar Programa"); 
		System.out.println("---------------------------------------");
		
		String selectedOpt = sc.next();
		
		switch (selectedOpt){
		case "0":
			System.out.println("Programa Encerrado."); // Mensagem de encerramento do programa
			break;
		
		case "1":		
			displayAddCurrencyMenu(); // Exibe o menu para adicionar moedas
			displayMainMenu();
			break;

		case "2":
			displayRemoveCurrencyMenu(); // Exibe o menu para remover moedas
			displayMainMenu();
			break;
	
		case "3":
			cofrinho.listarMoedas(); // Lista as moedas do cofrinho
			displayMainMenu();
			break;
	
		case "4":
		    double totalConvertedValue = cofrinho.totalConvertido(); // Calcula o valor total convertido para Real
		    String totalStrConvertedValue = String.format("%.2f", totalConvertedValue);
		    totalStrConvertedValue = totalStrConvertedValue.replace(".", ",");
		    System.out.println("Total convertido para real: " + totalStrConvertedValue + "\n"); // Exibe o valor total convertido para Real
		    displayMainMenu();
		    break;
			
		default:
			System.out.println("Total convertido para real: "); // Exibe o valor total convertido para Real
			displayMainMenu(); 
			break;
		}
		
	}

	private void displayAddCurrencyMenu() {
		System.out.println("Selecione qual Moeda deseja adicionar: \n");
		System.out.println("1 - Real  (R$ BRL)");
		System.out.println("2 - Dolar ($ USD)");
		System.out.println("3 - Euro  (€ EUR)");
		
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite a quantidade da Moeda a ser adicionada: \n");
		
		String strCurrencyValue = sc.next();
		
		strCurrencyValue = strCurrencyValue.replace(",", ".");
		double qtdMoeda = Double.valueOf(strCurrencyValue);
		
		Moeda moeda = null;
		
		if (opcaoMoeda == 1){
			moeda = new Real(qtdMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(qtdMoeda);
		}else if (opcaoMoeda == 3){
			moeda = new Euro(qtdMoeda);
		} else {
			System.out.println("Moeda inexistente, voltando ao menu principal...\n");
			displayMainMenu();
		}
		
		cofrinho.adicionarMoeda(moeda); // Adiciona a moeda ao cofrinho
		System.out.println("Valor adicionado à Moeda com sucesso!\n");
	}
	
	private void displayRemoveCurrencyMenu() {
		System.out.println("Escolha a Moeda: \n");
		System.out.println("1 - Real  (R$ BRL)");
		System.out.println("2 - Dolar ($ USD)");
		System.out.println("3 - Euro  (€ EUR)");
		
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor a ser removido: ");
		
		String strCurrencyValue = sc.next();
		
		strCurrencyValue = strCurrencyValue.replace(",", ".");
		double qtdMoeda = Double.valueOf(strCurrencyValue);
		
		Moeda moeda = null;
		
		if (opcaoMoeda == 1){
			moeda = new Real(qtdMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(qtdMoeda);
		}else if (opcaoMoeda == 3){
			moeda = new Euro(qtdMoeda);
		} else {
			System.out.println("Moeda inexistente, voltando ao menu principal...\n"); // Mensagem de moeda inexistente
			displayMainMenu();
		}
		
		cofrinho.removerMoeda(moeda); // Remove a moeda do cofrinho
		System.out.println("Valor da Moeda removido com sucesso.\n"); // Mensagem de sucesso ao remover a moeda
	}
}
