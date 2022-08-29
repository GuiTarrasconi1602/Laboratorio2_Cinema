package entradas;
import java.util.Scanner;
public class EntradaUsuario {
	
	Scanner entrada = new Scanner(System.in);
	
	public void saudacao() {
		System.out.println("Seja Bem vindo a sala de conema do filme: The Batman");
	}
	
	public int menu() {
		int numero;
		System.out.println("\n------------------- Menu de Opções -------------------\n"
				           + "Escolha o número da Opção que você deseja realizar:\n"
				           + "1. Reservar lugar\n"
				           + "2. Cancelar reserva\n"
				           + "3. Mostrar Mapa da sala de cinema\n"
				           + "4. Quantidade de lugares livres e ocupados\n"
				           + "5. Sair da aplicação\n"
				           + "------------------------------------------------------\n" );
							
		numero = entrada.nextInt();
		return numero;
	}
	public void lugarMarcado() {
		System.out.println("Lugar já marcado! Escolha outro que esteja vazio.");
	}
	public int numeroIngressos() {
		int numero;
		System.out.println("Quantos ingressos você deseja comprar? ");
		numero = entrada.nextInt();
		return numero;
	}
	public String escolheLinha() {
		System.out.println("Escolha a linha do seu assento(A-L): ");
		String escolha = entrada.next();
		return escolha;
	}
	public int escolheColuna() {
		System.out.println("Escolha a coluna do seu assento(1-14): ");
		int escolha = entrada.nextInt();
		while(escolha < 1 || escolha > 14) {
			System.out.println("Número para coluna inválido, digite um numero entre 1 e 14");
			escolha = entrada.nextInt();
		};
		return (escolha-1);
	}
	

	
	
}
