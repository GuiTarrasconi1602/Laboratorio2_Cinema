package main;
import acoes.AssentosLivres;
import acoes.Cancelar;
import acoes.Marcacoes;
import entradas.EntradaUsuario;
import salaDeCinema.Sala;


public class Operacoes {
	Marcacoes m = new Marcacoes();
	Sala s = new Sala();
	EntradaUsuario e = new EntradaUsuario();
	AssentosLivres al = new AssentosLivres();
	Cancelar c = new Cancelar();
	
	
	
	
	public void marcacoes(int [][] posicao) {
		int ingressos= e.numeroIngressos();
			for(int i =0; i<ingressos; i++) {
				boolean a = m.defineLugar(m.linhas(), e.escolheColuna(), posicao);
					
				if(a == false) {
					while(true) {
						if(m.defineLugar(m.linhas(), e.escolheColuna(), posicao) == false) {
							m.defineLugar(m.linhas(), e.escolheColuna(), posicao);
								
						}else break;
					}
				};
			}System.out.println("Obrigado pela compra! Aproveite o filme!");
	}
	
	
	
	public void mostraSala(int [][] posicao) {
		s.sala(posicao);
	}
	
	
	
	public void assentosVagos(int [][] posicao) {
		al.lugaresVagos(posicao);
	}
	
	
	
	public void cancelarMarcacoes(int[][]posicao) {
		 boolean var1 = c.cancelaLugar(m.linhas(), e.escolheColuna(), posicao);
		 if(var1 == false) {
			 s.sala(posicao);
		 }
		 else;
	}
		 
		
}
	

	
	

