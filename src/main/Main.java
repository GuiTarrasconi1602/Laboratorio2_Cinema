package main;
import entradas.EntradaUsuario;

public class Main {

	public static void main(String[] args) {
		EntradaUsuario e = new EntradaUsuario();
		Operacoes o =new Operacoes();
		
		int [][] posicao = new int[12][14];
		
		e.saudacao();
		while(true) {
			int opcao = e.menu();
			if(opcao == 1)
				o.marcacoes(posicao);
			else if (opcao == 2)
				o.cancelarMarcacoes(posicao);
			else if (opcao == 3)
				o.mostraSala(posicao);
			else if (opcao == 4)
				o.assentosVagos(posicao);
			else if (opcao == 5)
				break;
			else
				System.out.println("Digite um valor válido (1 até 5)");
		}
	}
}
