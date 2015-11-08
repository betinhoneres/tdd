package modulo2.exercicio.mocks.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProdutoBuilder {

	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	@Test
	public void criaProdutos() {
		
		listaProdutos.add(new Produto("", 1));
		
	}

}
