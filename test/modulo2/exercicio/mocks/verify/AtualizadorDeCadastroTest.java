package modulo2.exercicio.mocks.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AtualizadorDeCadastroTest {

	private ProdutoDao dao;
	private AtualizadorDeCadastro atualizadorDeCadastro;

	
	@Test
	public void verificarExecucao() {
		
		dao = Mockito.mock(ProdutoDao.class);
		atualizadorDeCadastro = new AtualizadorDeCadastro(dao);
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(new Produto("teste", 1));
		
		atualizadorDeCadastro.atualiza(produtos);
		
		Mockito.verify(dao, Mockito.times(1)).atualiza(produtos.get(0));
		
	}
	
	
	@Test
	public void verificarProdutosAtualizados() {
		
		dao = Mockito.mock(ProdutoDao.class);
		atualizadorDeCadastro = new AtualizadorDeCadastro(dao);
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(new Produto("teste", 1));
		
		atualizadorDeCadastro.atualiza(produtos);
		
		Assert.assertTrue(Double.valueOf(1.02).equals(produtos.get(0).getPreco()));
		
	}
	
}