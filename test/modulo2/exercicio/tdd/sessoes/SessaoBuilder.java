package modulo2.exercicio.tdd.sessoes;

import java.util.ArrayList;
import java.util.List;

public class SessaoBuilder {

	private Sessao sessao;
	private List<Sessao> sessoesMarcadas = new ArrayList<Sessao>();

	public List<Sessao> geraSessao(Integer... sessoes){
		
		for(Integer s : sessoes){
			sessoesMarcadas.add(new Sessao(s));	
		}
		
		return sessoesMarcadas;
	}

	
	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

}