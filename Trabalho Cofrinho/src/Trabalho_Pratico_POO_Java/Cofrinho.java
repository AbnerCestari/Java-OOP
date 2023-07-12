//Trabalho feito por Abner Cestari RU 4259827 curso de Análise e Desenvolvimento de Sistema - Uninter 2023
package Trabalho_Pratico_POO_Java;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>(); // Inicializa a lista de moedas vazia
	}
	
	public void adicionarMoeda(Moeda moeda) {
		this.listaMoedas.add(moeda); // Adiciona uma moeda à lista
	}
	
	public void removerMoeda(Moeda moeda) {
		this.listaMoedas.remove(moeda); // Remove uma quantia de uma moeda (ou total) da lista
	}
	
	public void listarMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Não há nenhuma moeda no cofrinho!\n"); // Mensagem exibida quando o cofrinho está vazio
			return;
		}
		
		for (Moeda moeda : this.listaMoedas) {
			System.out.println(moeda); // Exibe as informações de cada moeda existente no cofrinho
		}
	}
	
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0; // Retorna valor 0 quando não há moedas no cofrinho
		}
		
		double valorAcumulado = 0;
		
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado += moeda.converter(); // Calcula o valor total acumulado das moedas convertido
		}
		
		return valorAcumulado;
	}
}
