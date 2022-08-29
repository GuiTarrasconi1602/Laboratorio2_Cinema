package acoes;

import java.util.Scanner;

public class Cancelar {
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
	
	
	public boolean cancelaLugar(int linha, int coluna, int[][]posicoes) {
		if((posicoes[linha][coluna]) == 1) {
			System.out.println("Marcação excluída com sucesso!");
			posicoes[linha][coluna] = 0;
			return true;
		}
		else {
			System.out.println("Este lugar está vazio! Dê uma olhada na sala e para saber quais locais estão ocupados.");
			return false;
		}
	}
	
	
}
