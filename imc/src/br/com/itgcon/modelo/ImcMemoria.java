package br.com.itgcon.modelo;

import java.util.ArrayList;
import java.util.List;

public class ImcMemoria {
	
	private enum TipoComando {
		ZERAR,NUMERO, KG,M,IMC,IGUAL,VIRGULA;
	};
	
	private static final ImcMemoria instancia = new ImcMemoria();
	private final List<ImcMemoriaObservador> observadores = new ArrayList<>();
	
	
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoAtual ="";
	private String textoBuffer ="";
	
	
	private ImcMemoria() {
		
	}

	public static ImcMemoria getInstancia() {
		return instancia;
	}

	public void adicionarObservador(ImcMemoriaObservador o) {
		observadores.add(o);
	}
	 public String getTextoAtual() {
		 return textoAtual.isEmpty() ? "0" : textoAtual;
	 }
	 public void processarComando(String texto) {
			TipoComando tipoComando = detectarTipoComando(texto);
			System.out.println(tipoComando);
			if(tipoComando == null) {
				return;
			} else if(tipoComando == TipoComando.ZERAR) {
				textoAtual ="";
				textoBuffer ="";
				ultimaOperacao = null;
				substituir = false;
			} else if( tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
				textoAtual = substituir ? texto : textoAtual + texto;
				substituir = false;
			} else {
				substituir =true;
				textoAtual = obterResultadoOperacao();
				textoBuffer = textoAtual;
				ultimaOperacao = tipoComando;
				
			}
			observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
			
		}
	 private String obterResultadoOperacao() {
		 if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			 return textoAtual;
		 }
		 double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		 
		 double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
		 
		 double resultado = 0;
		 
		 if(ultimaOperacao == TipoComando.IMC) {
			 resultado = numeroBuffer/ (numeroAtual * numeroAtual);
		 } return resultado;
	 }
	 
	private TipoComando detectarTipoComando(String texto) {
		if(textoAtual.isEmpty() && texto == "0") {
			return null;
		}
		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			if("CE".equals(texto)) {
				return TipoComando.ZERAR;
			} else if("KG".equals(texto)) {
				return TipoComando.KG;
			} else if("M".equals(texto)) {
				return TipoComando.M;
			} else if("IMC".equals(texto)) {
				return TipoComando.IMC;
			} else if(",".equals(texto)) {
				return TipoComando.VIRGULA;
			}
			return null;
		}
	}

	

}
