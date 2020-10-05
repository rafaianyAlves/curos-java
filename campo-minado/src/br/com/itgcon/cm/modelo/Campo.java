package br.com.itgcon.cm.modelo;

import java.util.ArrayList;

import java.util.List;

import br.com.itgcon.cm.excecao.ExplosaoException;
import br.com.itgcon.cm.excecao.ExplosaoException;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<Campo>();
	
	Campo(int linha, int coluna) { // construtor da linha e coluna em si
		this.linha = linha; 
		this.coluna = coluna;
	}
	
	    boolean adicionarVizinho(Campo vizinho ) {
		boolean linhaDiferente = linha != vizinho.linha; // diferente de vizinho
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
			
		} else if(deltaGeral ==2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}
	    void alternarMarcacao() {
	    	if(!aberto) {
	    		marcado = !marcado;
	    	}
	    }
	    boolean abrir() {
	    	if(!aberto && !marcado) {
	    		aberto = true;
	    		if(minado ) {
	    			throw new ExplosaoException(); // interromper processo de abertura e retornar para a exceção
	    		}
	    		if(vizinhancaSegura()) {
	    			vizinhos.forEach(v -> v.abrir()); // se a vizinhança for segura, abre  os outros
	    		}
	    		
	    		return true;
	    	} else {
	    		return false;
	    	}
	    	
	    }
	    boolean vizinhancaSegura() {
	    	return vizinhos.stream().noneMatch(v -> v.minado); // vizinhança é segura
	    }
	    
	  void minar() { 
		  
	    	minado = true;
	    }
	  public boolean isMinado() {
		  return minado;
	  }
	    
	    public boolean isMarcado() {
	    	return marcado;
	    }
	    
         void setAberto(boolean aberto) {
			this.aberto = aberto;
		}

		public boolean isAberto() {
	    	return aberto;
	    }
	    public boolean isFechado() {
	    	return !isAberto();
	    }

		public int getLinha() {
			return linha;
		}

		public int getColuna() {
			return coluna;
		}
	     boolean objetivoAlcancado() {
	    	boolean desvendado = !minado && aberto;
	    	boolean protegido = minado && marcado;
	    	return desvendado || protegido;
	    }
	    long minasNaVizinhanca() {
	    	return vizinhos.stream().filter(v -> v.minado).count(); // sei exatamente a quantidade de minas na vizinhanca
	    }
	    void reiniciar() {
	    	aberto = false;
	        minado = false;
	    	marcado = false;
	    }
	    public String toString() {
	    	if(marcado) {
	    		return "x";
	    	} else if(aberto && minado) {
	    		return "*";
	    	} else if(aberto && minasNaVizinhanca() > 0){
	    		return Long.toString(minasNaVizinhanca());
	    	} else if(aberto) {
	    		return "";
	    		
	    	} else {
	    		return "?";
	    	}
	    }
}
