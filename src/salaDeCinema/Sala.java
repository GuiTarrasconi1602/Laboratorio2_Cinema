package salaDeCinema;

public class Sala {
	String[] Letras = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L"};
	
	
	public void filas(int[][] posicao, int i, int j) {
		if(posicao[i][j] == 0) {
			System.out.print(" [ ] ");
		}else {
			System.out.print(" [X] ");
		}
	}
	
	
	public void sala(int[][] posicao) {
		System.out.println("---------------------------- SALA DE CINEMA ---------------------------");
		for(int i = 0; i<posicao.length; i++ ) {
			System.out.print(Letras[i]+" ");
			for (int j = 0; j < posicao[i].length; j++) {
				filas(posicao, i, j);
				
			}
			System.out.println();
			
		}System.out.println("    1    2    3    4    5    6    7    8    9    10   11   12   13   14");
		System.out.println("-----------------------------------------------------------------------");
		
		
		
	}
	
}
