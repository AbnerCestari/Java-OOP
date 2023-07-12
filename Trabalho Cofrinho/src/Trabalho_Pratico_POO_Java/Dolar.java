//Trabalho feito por Abner Cestari RU 4259827 curso de Análise e Desenvolvimento de Sistema - Uninter 2023
package Trabalho_Pratico_POO_Java;

public class Dolar extends Moeda {
	
	
	public Dolar(double initValue) {
		this.valor = initValue;
	}

	public void info() {
		System.out.println("Dolar ($ USD) - " + valor);
		
	}

		public double converter() {
			return this.valor * 5.01;	
		}
		
		public boolean equals(Object objeto) {
			if (this.getClass() != objeto.getClass()) {
			return false;
			}
			
	Dolar objDolar = (Dolar) objeto;
		
		if (this.valor != objDolar.valor) {
			return false;
		}
		
	return true;
		}
	}