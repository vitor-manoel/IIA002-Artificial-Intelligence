package redes_neurais_perceptrons;

public class Perceptron {
	double w[][] = {{-0.5441}, {0.5562}, {-0.4074}};
	double x0[] = {-1, 2, 2};
	double x1[] = {-1, 4, 4};
	double func_ativacao;
	double limiar = 0.0;
	double u0;
	int f; int y0 = 1; int y1 = 0;
	double taxa_aprendizado = 0.1;
	
	public void iteracao() {
		int n = 0;
		while(n < 5) {
			w = entrada0(w);
			for(int i = 0; i < w.length; i++) {
				System.out.println("pesos w = \t" + w[i][0]);
			}
			System.out.println("valor de f = \t" + f);
			w = entrada1(w);
			for(int i = 0; i < w.length; i++) {
				System.out.println("pesos w = \t" + w[i][0]);
			}
			System.out.println("valor de f = \t" + f);
			n = n + 1;
			System.out.println("Número de Treinamentos : " + n + "\n");
		}
	}
	
	public double[][] entrada0(double [][]w){
		System.out.println("entrada0");
		this.w = w;
		u0 = 0;
		for(int i = 0; i < x0.length; i++) {
			u0 += x0[i] * w[i][0];
		}
		System.out.println("u0 = " + u0);
		if(u0 > limiar) {
			f = 1;
		}else {
			f = 0;
		}
		for(int i = 0; i < x0.length; i++) {
			w[i][0] = w[i][0] + taxa_aprendizado * (y0 - f) * x0[i];
		}
		return w;
	}
	
	public double[][] entrada1(double[][] w){
		System.out.println("entrada1");
		this.w = w;
		u0 = 0;
		for(int i = 0; i < x1.length; i++) {
			u0 += x1[i] * w[i][0];
		}	
		System.out.println("u0 = " + u0);
		if(u0 > limiar) {
			f = 1;
		}else {
			f = 0;
		}
		for(int i = 0; i < w.length; i++) {
			w[i][0] = w[i][0] + taxa_aprendizado * (y1 - f) * x1[i];
		}
		return w;
	}
	
	public void testa_rede(double[][] w, double[] x0, double[] x1) {
		System.out.println("TESTE DA REDE NEURAL \n");
		this.w = w;
		x0 = this.x0;
		x1 = this.x1;
		for(int i = 0; i < w.length; i++) {
			System.out.println("pesos resultantes do treinamento");
			System.out.println("w[" + i + "][0] = " + w[i][0]);
		}
		u0 = 0;
		for(int i = 0; i < x0.length; i++) {
			u0 += x0[i] * w[i][0];
			if(u0 > limiar) {
				f = 1;
			}else {
				f = 0;
			}
		}
		System.out.println("\nu0 = " + u0);
		System.out.println("teste da entrada x0 saída y = " + f); 
		u0 = 0;
		for(int i = 0; i < x1.length; i++) {
			u0 += x1[i] * w[i][0];
			if(u0 > limiar) {
				f = 1;
			}else {
				f = 0;
			}
			System.out.println("\nu0 = " + u0);
			System.out.println("teste da entrada x0 saída y = " + f); 
		}
	}
}
