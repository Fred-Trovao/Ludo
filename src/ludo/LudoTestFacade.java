package ludo;

import controller.JogoController;
import exception.JogadaException;
import exception.TabuleiroException;

public class LudoTestFacade {
	private JogoController jogo;
	
	public void criarJogo(int numPecas, int tamanhoDado){
		jogo = new JogoController(tamanhoDado, numPecas);
	}

	public int getNumPecas(){
		return jogo.getNumPecas();
	}

	public int getTamanhoDado(){
		return jogo.getTamanhoDado();
	}

	public int getTamanhoTabuleiro(){
		return jogo.getTabuleiro().getTamanhoTabuleiro();
	}

	public void adicionaCasa(String id, String nome, String param) throws TabuleiroException{
		jogo.getTabuleiro().criaNovaCasa(id, nome, param);
	}

	public void jogar(int jogador, int dado) throws JogadaException{
		// implementar
	}

	public String getStatusJogo(){
		return jogo.getStatusJogo();
	}

	public void sairJogo(){
		//System.exit(0);
	}

	public void iniciarJogo(){
		jogo.iniciarJogo();
	}

}
