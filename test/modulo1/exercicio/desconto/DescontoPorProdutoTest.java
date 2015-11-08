package modulo1.exercicio.desconto;

import org.junit.Assert;
import org.junit.Test;

public class DescontoPorProdutoTest {

	private CompraBuilder compraBuilder;
	private Compra compra;
	
	@Test
	public void validarSeTemDescontoPorProdutoMacbookIphone() {

		compraBuilder.addItem(new Item("MACBOOK", 1, 1));
		compraBuilder.addItem(new Item("IPHONE", 1, 1));
		compraBuilder.addItem(new Item("NOTEBOOK", 1, 1));
		compraBuilder.addItem(new Item("WINDOWS PHONE", 1, 1));
		compraBuilder.addItem(new Item("XBOX", 1, 1));
		
		compra = compraBuilder.getCompra();
		
		DescontoPorProduto.desconto(compra);
		
		Assert.assertEquals(true, Double.valueOf(4.25).equals(compra.getValorLiquido()));
		
		compraBuilder.addItem(new Item("MACBOOK", 1, 1));
		compraBuilder.addItem(new Item("IPHONE", 1, 1));
		
		compra = compraBuilder.getCompra();
		
		DescontoPorProduto.desconto(compra);
		
		Assert.assertEquals(true, Double.valueOf(1.7).equals(compra.getValorLiquido()));
		
	}
	
	@Test
	public void validarSeTemDescontoPorProdutoNotebookWindowPhone() {

		compraBuilder.addItem(new Item("IPHONE", 1, 1));
		compraBuilder.addItem(new Item("NOTEBOOK", 1, 1));
		compraBuilder.addItem(new Item("WINDOWS PHONE", 1, 1));
		compraBuilder.addItem(new Item("XBOX", 1, 1));
		
		compra = compraBuilder.getCompra();
		
		DescontoPorProduto.desconto(compra);
		
		Assert.assertEquals(true, Double.valueOf(3.52).equals(compra.getValorLiquido()));
		
		compraBuilder.addItem(new Item("MACBOOK", 1, 1));
		compraBuilder.addItem(new Item("NOTEBOOK", 1, 1));
		compraBuilder.addItem(new Item("WINDOWS PHONE", 1, 1));
		compraBuilder.addItem(new Item("XBOX", 1, 1));
		
		compra = compraBuilder.getCompra();
		
		DescontoPorProduto.desconto(compra);
		
		Assert.assertEquals(true, Double.valueOf(3.52).equals(compra.getValorLiquido()));
		
	}
	
	@Test
	public void validarSeTemDescontoPorProdutoXbox() {

		compraBuilder.addItem(new Item("IPHONE", 1, 1));
		compraBuilder.addItem(new Item("NOTEBOOK", 1, 1));
		compraBuilder.addItem(new Item("WINDOWS PHONE", 1, 1));
		compraBuilder.addItem(new Item("XBOX", 1, 1));
		
		compra = compraBuilder.getCompra();
		
		DescontoPorProduto.desconto(compra);
		
		Assert.assertEquals(true, Double.valueOf(3.52).equals(compra.getValorLiquido()));
		
	}
	
	@Test
	public void validarSeTemNaoDescontoPorProduto() {

	}

}