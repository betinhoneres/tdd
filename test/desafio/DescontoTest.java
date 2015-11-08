package desafio;

import org.junit.Assert;
import org.junit.Test;

public class DescontoTest {

	private Compra compra;
	
	@Test
	public void calcularDescontoCincoPorcento(){
		
		compra = new CompraBuilder().addCompra("Cliente", Estado.SP, 2, 10, 250);
		
		new Desconto().desconto(compra);
		
		Assert.assertTrue(Double.valueOf(compra.getValorLiquido()).equals(475));
		
	}
	
}