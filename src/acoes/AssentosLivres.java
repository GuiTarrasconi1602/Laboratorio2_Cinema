package acoes;

public class AssentosLivres {
	public void lugaresVagos(int[][]posicoes) {
		int lugaresVagos = 168;
		int lugaresOcupados = 0;
		
		for(int i = 0; i<posicoes.length; i++ ) {
			for (int j = 0; j < posicoes[i].length; j++) {
				if(posicoes[i][j] == 1) {
					lugaresOcupados ++;
					lugaresVagos --;
				}
				
			}
	}
	System.out.println("A sala possuí "+lugaresVagos+" lugares livres e "+lugaresOcupados+" assentos estão ocupados.");
	}
	
}