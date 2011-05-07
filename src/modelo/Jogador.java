package modelo;

public class Jogador {
	private int id;
	private boolean jogaProxima;
	private Casa casaAtual;
	
	public Jogador(int id, Casa casaAtual){
		this.id = id;
		this.casaAtual = casaAtual;
		this.jogaProxima = true;
	}
	
	public boolean isJogaProxima() {
		return jogaProxima;
	}
	
	public void setJogaProxima(boolean jogaProxima) {
		this.jogaProxima = jogaProxima;
	}
	
	public int getId() {
		return id;
	}
	
	public Casa getCasaAtual() {
		return casaAtual;
	}

	public void setCasaAtual(Casa casaAtual) {
		this.casaAtual = casaAtual;
	}
}
