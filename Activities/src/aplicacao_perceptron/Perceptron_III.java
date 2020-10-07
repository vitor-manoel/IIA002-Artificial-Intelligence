package aplicacao_perceptron;

public class Perceptron_III {
	double w[] = {0.22, -0.33, 0.44}; //Pesos Iniciais
	double x1[][] = {
			{3, 120},    //Elemento 1 - Classe 0
			{2.45, 98},  //Elemento 2 - Classe 0
			{3.35, 134}, //Elemento 3 - Classe 0
			{2.87, 115}  //Elemento 4 - Classe 0
	};
	double x2[][] = {
			{3.9, 120},  //Elemento 1 - Classe 1
			{4.32, 133}, //Elemento 2 - Classe 1
			{3.51, 108}, //Elemento 3 - Classe 1
			{3.08, 95}   //Elemento 4 - Classe 1
	};
	double func_ativacao;
	double limiar = 0.0;
	double u0;
	int f; int y2 = 1; int y1 = 0;
	double taxa_aprendizado = 0.1;
	
	public void iteracao_perceptron() {
		int n = 0;
		while(n < 1000) { //Número de treinamentos
			for(int v = 0; v < 4; v++) {
				w = entradax1(w, v); //Entrada Classe 0
				w = entradax2(w, v); //entrada Classe 1
			}
			n = n + 1; //Contador treinamentos
			System.out.println("Número de Treinamentos " + n + "\n");
		}
	}
	
	public double[] entradax1(double[] w, int u) {
		System.out.println("Entrada x1 ");
		u0 = 0;
		u0 = w[0] * x1[0][0] + w[1] * x1[u][0] + w[2] * x1[u][1];
		System.out.println("u0 = " + u0);
		if(u0 > limiar) { //Condicional de separação das classes
			f = 1;
		}else {
			f = 0;
		}
		System.out.println("Valor de f = \t" + f);
		w[0] = w[0] + taxa_aprendizado * (y1 - f) * x1[0][0];
		System.out.println("Pesos w = \t" + w[0]);
		w[1] = w[1] + taxa_aprendizado * (y1 - f) * x1[u][0];
		System.out.println("Pesos w = \t" + w[1]);
		w[2] = w[2] + taxa_aprendizado * (y1 - f) * x1[u][1];
		System.out.println("Pesos w = \t" + w[2]);
		return w;
	}
	
	public double[] entradax2(double[] w, int u) {
		System.out.println("Entrada x2 ");
		u0 = 0;
		u0 = w[0] * x2[0][0] + w[1] * x2[u][0] + w[2] * x2[u][1];
		System.out.println("u0 = " + u0);
		if(u0 > limiar) { //Condicional de separação das classes
			f = 1;
		}else {
			f = 0;
		}
		System.out.println("Valor de f = \t" + f);
		w[0] = w[0] + taxa_aprendizado * (y2 - f) * x2[0][0];
		System.out.println("Pesos w = \t" + w[0]);
		w[1] = w[1] + taxa_aprendizado * (y2 - f) * x2[u][0];
		System.out.println("Pesos w = \t" + w[1]);
		w[2] = w[2] + taxa_aprendizado * (y2 - f) * x2[u][1];
		System.out.println("Pesos w = \t" + w[2]);
		return w;
	}
	
	public void verifica_perceptron(double[] w, double[][] x1, double[][] x2) {
		System.out.println("TESTE DA REDE NEURAL \n");
		this.w = w; //Pesos resultantes após treinamento
		for(int i = 0; i < w.length; i++) {
			System.out.println("Pesos resultantes do treinamento ");
			System.out.println("w[" + i + "] = " + w[i]);
		}
		System.out.println("0 = Maçãs / 1 = Laranjas");
		u0 = 0;
		for(int p = 0; p < 5; p++) { //Testes de generalização - Grupo 0
			u0 = w[0] * x1[0][0] + w[1] * x1[p][0] + w[2] * x1[p][1];
			System.out.println("u0 = " + u0);
			if(u0 > limiar) {
				f = 1;
			}else {
				f = 0;
			}
			System.out.println("Teste da entrada x1 saída y = " + f);
		}
		
		u0 = 0;
		for(int p = 0; p < 5; p++) { //Testes de generalização - Grupo 1
			u0 = w[0] * x2[0][0] + w[1] * x2[p][0] + w[2] * x2[p][1];
			System.out.println("u0 = " + u0);
			if(u0 > limiar) {
				f = 1;
			}else {
				f = 0;
			}
			System.out.println("Teste da entrada x2 saída y = " + f);
		}
	}	
}
