//Trabalho feito por Abner Cestari RU 4259827 curso de Análise e Desenvolvimento de Sistema - Uninter 2023
package Trabalho_Pratico_POO_Java;

public class Euro extends Moeda{
	
	
	public Euro (double initValue) {
		this.valor = initValue;
	}

	public void info() {
		System.out.println("Euro (€ EUR) - " + valor);
		
	}

		public double converter() {
			return this.valor * 5.37;	
		}
		
		public boolean equals(Object objeto) {
			if (this.getClass() != objeto.getClass()) {
			return false;
			}
			
	Euro objEuro = (Euro) objeto;
			
		if (this.valor != objEuro.valor) {
			return false;
		}
		
	return true;
		}
	}