package modulo1.exercicio.desconto;

import java.util.ArrayList;
import java.util.List;

public class CompraBuilder {
	
	private List<Item> itens;
	
	public CompraBuilder (){
		super();
	}

	public CompraBuilder (Compra compra, Item item){
		
		itens = new ArrayList<Item>();
		itens.add(item);
		
		compra = new Compra(itens);
		
	}

	public Compra criaNovaCompra(Item item){
		
		itens = new ArrayList<Item>();
		itens.add(item);
		
		return new Compra(itens);
		
	}
	
	public Compra criaNovaCompra(List<Item> itens){
		return new Compra(itens);
	}

	public void addItem(Item item){
		itens.add(item);
	}
	
	public Compra getCompra(){
		
		return new Compra(itens);
		
	}
}