package redes_neurais_artificiais;

public class Teste_Degrau {
	
	public static void main(String args[]) {
		Degrau ld = new Degrau();
		
		ld.verifica_degrau(ld.x1[0], ld.x2[0], ld.w1, ld.w2);
		ld.verifica_degrau(ld.x1[1], ld.x2[1], ld.w1, ld.w2);
		ld.verifica_degrau(ld.x1[2], ld.x2[2], ld.w1, ld.w2);
		ld.verifica_degrau(ld.x1[3], ld.x2[3], ld.w1, ld.w2);
	}

}
