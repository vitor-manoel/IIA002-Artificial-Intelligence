package redes_neurais_perceptrons;

public class Teste_Perceptron {
	
	public static void main(String args[]) {
		Perceptron p = new Perceptron();
		p.iteracao();
		p.testa_rede(p.w, p.x0, p.x1);
	}

}
