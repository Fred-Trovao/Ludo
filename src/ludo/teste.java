package ludo;

import controller.JogoController;
import exception.TabuleiroException;

public class teste {

	public static void main(String[] args) throws TabuleiroException {
		JogoController jogo = new JogoController(6, 2);
		
		jogo.getTabuleiro().criaNovaCasa("Casa inicio", "INICIO", null);
		
		System.out.println(jogo.getTabuleiro().getTamanhoTabuleiro());
		
		jogo.getTabuleiro().criaNovaCasa("C6", "IR_PARA", "Casa inicio");
		
		System.out.println(jogo.getTabuleiro().getTamanhoTabuleiro());
		jogo.iniciarJogo();
		
		System.out.println(jogo.getTabuleiro().getCasas().get(0).getId());
		
		System.out.println(jogo.getStatusJogo());
	}
}
