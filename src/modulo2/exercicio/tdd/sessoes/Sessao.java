package modulo2.exercicio.tdd.sessoes;

public class Sessao {

	
	private int numero;

	public Sessao(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Sessao){
			
			if(((Sessao)obj).numero == numero)
				return true;
			else return false;
		} 
		
		return false;
	}
	
}
