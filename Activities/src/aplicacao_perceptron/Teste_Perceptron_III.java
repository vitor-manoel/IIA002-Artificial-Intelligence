package aplicacao_perceptron;

public class Teste_Perceptron_III {
	
	public static void main(String args[]) {
		Perceptron_III d = new Perceptron_III();
		
		double x3[][] = { //Teste de generalização - Grupo 0
				{2.5, 130},
				{2, 115},
				{4.4, 115}, //-> Não pertence ao grupo
				{3.5, 125},
				{2.5, 105}
		};
		double x4[][] = {
				{3.5, 105}, //Teste de generalização
				{2, 115}, //-> Não pertence ao grupo
				{5, 125},
				{5.5, 105},
				{4, 95}
		};
		
		d.iteracao_perceptron();
		d.verifica_perceptron(d.w, x3, x4);
	}

}
