//Trabalho feito por Abner Cestari RU 4259827 curso de Análise e Desenvolvimento de Sistema - Uninter 2023
package Trabalho_Pratico_POO_Java;

public class Real extends Moeda {
	
	
	public Real(double initValue) {
		this.valor = initValue;
	}

	public void info() {
		System.out.println("Real (R$ BRL) - " + valor);
		
	}

		public double converter() {
			return this.valor;	
		}
	
		public boolean equals(Object objeto) {
			if (this.getClass() != objeto.getClass()) {
			return false;
			}
		
	Real objReal = (Real) objeto;
		
		if (this.valor != objReal.valor) {
		return false;
		}
	
	return true;
		}
	}
