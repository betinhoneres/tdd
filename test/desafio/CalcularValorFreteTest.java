package desafio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcularValorFreteTest {

	private Frete frete;
	private Compra compra;
	
	@Before
	public void setUp(){
	}
	
	@Test
	public void calcularFreteSpMenorQue3Itens() {
		
		compra = new CompraBuilder().addCompra("Cliente", Estado.SP, 2);

		frete = new Frete(compra);
		
		Assert.assertTrue(Double.valueOf(10).equals(frete.getValor()));
		
	}

	@Test
	public void calcularFreteSpMaiorQue3Itens() {
		
		compra = new CompraBuilder().addCompra("Cliente", Estado.SP, 4);

		frete = new Frete(compra);
		
		Assert.assertTrue(Double.valueOf(17).equals(frete.getValor()));
		
	}
	
	@Test
	public void calcularFreteRjMaiorQue4Itens() {
		
		compra = new CompraBuilder().addCompra("Cliente", Estado.RJ, 6);

		frete = new Frete(compra);
		
		Assert.assertTrue(Double.valueOf(15).equals(frete.getValor()));
		
	}
	
	@Test
	public void calcularFreteRjMenorQue4Itens() {
		
		compra = new CompraBuilder().addCompra("Cliente", Estado.RJ, 1);

		frete = new Frete(compra);
		
		Assert.assertTrue(Double.valueOf(11).equals(frete.getValor()));
		
	}
	
	@Test
	public void calcularFreteSul() {
		
		compra = new CompraBuilder().addCompra("Cliente", Estado.Sul, 1);

		frete = new Frete(compra);
		
		Assert.assertTrue(Double.valueOf(22).equals(frete.getValor()));
		
	}
	
	@Test
	public void calcularFreteOutrasRegioes() {
		
		compra = new CompraBuilder().addCompra("Cliente", Estado.GO, 1);

		frete = new Frete(compra);
		
		Assert.assertTrue(Double.valueOf(25).equals(frete.getValor()));
		
	}
	
}
