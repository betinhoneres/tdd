package modulo1.exercicio.desconto;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class AplicadorDeDescontosTest {

	private Compra compra;
	private Item item;
	private List<Item> itens;
	private AplicadorDeDescontos aplicadorDeDescontos = new AplicadorDeDescontos();
	
	@Before
	public void setUp(){
		itens = new ArrayList<Item>();
	}
	
	@Test
	public void validarSeTemDescontoPorProdutoMacbookIphone() {

		itens.add(new Item("MACBOOK", 1, 1));
		itens.add(new Item("IPHONE", 1, 1));
		itens.add(new Item("NOTEBOOK", 1, 1));
		itens.add(new Item("WINDOWS PHONE", 1, 1));
		itens.add(new Item("XBOX", 1, 1));
		
		compra = new Compra(itens);
		aplicadorDeDescontos.aplica(compra);
		
		Assert.assertEquals(true, Double.valueOf(4.25).equals(compra.getValorLiquido()));
		
	}
	
	@Test
	public void validarSeTemDescontoPorProdutoNotebookWindowPhone() {

		itens.add(new Item("MACBOOK", 1, 1));
		itens.add(new Item("NOTEBOOK", 1, 1));
		itens.add(new Item("WINDOWS PHONE", 1, 1));
		
		compra = new Compra(itens);
		aplicadorDeDescontos.aplica(compra);
		
		Assert.assertEquals(true, Double.valueOf(2.64).equals(compra.getValorLiquido()));
		
		itens.add(new Item("IPHONE", 1, 1));
		itens.add(new Item("NOTEBOOK", 1, 1));
		itens.add(new Item("WINDOWS PHONE", 1, 1));
		
		compra = new Compra(itens);
		aplicadorDeDescontos.aplica(compra);
		
		Assert.assertEquals(true, Double.valueOf(2.64).equals(compra.getValorLiquido()));
		
	}
	
	@Test
	public void validarSeTemDescontoPorProdutoXbox() {

		itens.add(new Item("XBOX", 1, 1));
		
		compra = new Compra(itens);
		aplicadorDeDescontos.aplica(compra);
		
		Assert.assertEquals(true, Double.valueOf(0.7).equals(compra.getValorLiquido()));
		
	}
	
	@Test
	public void validarSeNaoTemDesconto() {

		itens = new ArrayList<Item>();
		
		itens.add(new Item("MACBOOK", 1, 1));
		
		compra = new Compra(itens);
		aplicadorDeDescontos.aplica(compra);
		
		Assert.assertEquals(true, Double.valueOf(1).equals(compra.getValorLiquido()));
		
		itens = new ArrayList<Item>();
		
		itens.add(new Item("IPHONE", 1, 1));
		
		compra = new Compra(itens);
		aplicadorDeDescontos.aplica(compra);
		
		Assert.assertEquals(true, Double.valueOf(1).equals(compra.getValorLiquido()));
		
		itens = new ArrayList<Item>();
		
		itens.add(new Item("NOTEBOOK", 1, 1));
		
		compra = new Compra(itens);
		aplicadorDeDescontos.aplica(compra);
		
		Assert.assertEquals(true, Double.valueOf(1).equals(compra.getValorLiquido()));
		
		itens = new ArrayList<Item>();
		
		itens.add(new Item("WINDOWS PHONE", 1, 1));
		
		compra = new Compra(itens);
		aplicadorDeDescontos.aplica(compra);
		
		Assert.assertEquals(true, Double.valueOf(1).equals(compra.getValorLiquido()));
		
	}

}