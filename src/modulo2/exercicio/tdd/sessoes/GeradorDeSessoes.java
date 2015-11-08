package modulo2.exercicio.tdd.sessoes;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeSessoes {

	private List<Sessao> sessoes = new ArrayList<Sessao>();
	
	public List<Sessao> gera(int inicio, int fim, Periodo periodo) {
		
		for(int n = inicio; n<=fim && n <= 31; n+=periodo.getTamanho()){
			
			sessoes.add(new Sessao(n));
			
		}
			
		return sessoes;
	}
	
}