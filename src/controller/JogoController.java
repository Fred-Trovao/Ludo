package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Jogador;
import modelo.Tabuleiro;

public class JogoController {
	private int tamanhoDado;
	private int numPecas;
	private Tabuleiro tabuleiro;
	private List<Jogador> jogadores;
	
	public JogoController(int tamanhoDado, int numPecas) {
		this.tamanhoDado = tamanhoDado;
		this.numPecas = numPecas;
		this.tabuleiro = new Tabuleiro();
	}
	
	public void iniciarJogo(){
		this.jogadores = new ArrayList<Jogador>();
		
		for (int i = 1; i<=this.numPecas; i++){
			this.jogadores.add(new Jogador(i, this.tabuleiro.getCasas().get(0)));
		}
	}
	
	public String getStatusJogo(){
		String status = "";
		
		for (int i = 0; i<this.numPecas; i++){
			if(i==0)
				status = status + "J" + this.jogadores.get(i).getId() + ":" + this.jogadores.get(i).getCasaAtual().getId();
			else
				status = status + "/J" + this.jogadores.get(i).getId() + ":" + this.jogadores.get(i).getCasaAtual().getId();
		}
		return status;
	}
	
	public int getTamanhoDado() {
		return tamanhoDado;
	}
	
	public int getNumPecas() {
		return numPecas;
	}
	
	public Tabuleiro getTabuleiro(){
		return this.tabuleiro;
	}
}
