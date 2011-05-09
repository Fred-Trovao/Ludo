package modelo;

import java.util.ArrayList;
import java.util.List;

import exception.TabuleiroException;

public class Tabuleiro {
	private List<Casa> casas;
	private List<String> tiposCasas; //Essa lista servirá apenas para evitar if aninhados, e facilitar adição e remoçao de novas casas.
	
	public Tabuleiro(){
		this.casas = new ArrayList<Casa>();
		this.tiposDeCasas();
	}
	
	public void criaNovaCasa(String id, String casa, String param) throws TabuleiroException{
		if (id == null || id.equals(""))
            throw new TabuleiroException("ID Invalido: '" + id + "'");
		
		if (!isTipoCasa(casa))
			throw new TabuleiroException("Tipo de casa invalido: '" + casa + "'");
		
		if (isCasaExistente(id))
            throw new TabuleiroException("Ja existe uma casa com ID '" + id + "'");
        
		if (casa.equals("VOLTA") || casa.equals("AVANCA") || casa.equals("IR_PARA"))
			this.verificaParam(casa, param);
			
		//Parâmetros válidos, cria o objeto casa e adiciona ao array
		Casa c = new Casa(id,casa,param);
		casas.add(c);
	}
	
	private void tiposDeCasas(){
		this.tiposCasas = new ArrayList<String>();
		
		this.adicionaTipoCasa("INICIO");
		this.adicionaTipoCasa("NADA");
		this.adicionaTipoCasa("REPETE");
		this.adicionaTipoCasa("PARA");
		this.adicionaTipoCasa("VOLTA");
		this.adicionaTipoCasa("AVANCA");
		this.adicionaTipoCasa("IR_PARA");
		this.adicionaTipoCasa("FIM");
	}
	
	private void adicionaTipoCasa(String tipoCasa){
		this.tiposCasas.add(tipoCasa);
	}
	
	private boolean isTipoCasa(String tipo){
		for(String s : tiposCasas)
			if(s.equals(tipo))
				return true;
		return false;
	}
	
	private boolean isCasaExistente(String id) {
        for (Casa c : casas)
            if (c.getId().equals(id))
                return true;
        return false;
    }
	
	private boolean verificaParam(String casa, String param) throws TabuleiroException{
		if(casa.equals("VOLTA") && !isInteiro(param))
			throw new TabuleiroException("Numero de casas para voltar invalido: '" + param + "'");
		
		if(casa.equals("AVANCA") && !isInteiro(param))
			throw new TabuleiroException("Numero de casas para avancar invalido: '" + param + "'");
		
		if (casa.equals("IR_PARA") && (param == null || param.equals("")))
            throw new TabuleiroException("ID de casa invalido: '" + param + "'");
		
		if (casa.equals("IR_PARA") && !isCasaExistente(param))
            throw new TabuleiroException("Nao existe casa com id '" + param + "'");
		return true;
	}
	
	private boolean isInteiro(String num){
	    try{
	        Integer.parseInt(num);
	    } catch(NumberFormatException e) {
	        return false;
	    }
	    return true;
	}
	
	public int getTamanhoTabuleiro(){
		return this.casas.size();
	}

	public List<Casa> getCasas() {
		return casas;
	}
}