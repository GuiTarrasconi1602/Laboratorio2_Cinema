package acoes;
import java.util.Scanner;

public class Marcacoes {
	String[] Letras = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L"};
	Scanner entrada = new Scanner(System.in);
	String escolha;
	
	
	public int linhas() {
		int valor = 0;
		boolean teste = true;
		while (teste == true) {
			System.out.println("Escolha a linha do seu assento (A-L):");
			String escolha = entrada.next();
			for(int i=0; i<Letras.length; i++) {
				if(escolha.equalsIgnoreCase(Letras[i])) {
					valor = i;
					teste = false;
				}
			}
		}
		return valor;
	}
	
	
	
	
	
	public boolean defineLugar(int linha, int coluna, int[][]posicoes) {
		if((posicoes[linha][coluna]) == 0) {
			System.out.println("Lugar marcado com sucesso!");
			posicoes[linha][coluna] = 1;
			return true;
		}
		else {
			System.out.println("Lugar já marcado, por favor selecione outro");
			return false;
		}
	}
	
	
	
}
