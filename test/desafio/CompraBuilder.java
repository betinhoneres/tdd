package desafio;

import java.util.ArrayList;
import java.util.List;

public class CompraBuilder {

	public Compra addCompra(String nomeCliente, Estado uf, int qtdItensCompra){

		List<Item> itens = new ArrayList<Item>();
		
		for(int i = 0; i < qtdItensCompra; i++){
			itens.add(new Item("", 1, 1));
		}
		
		return new Compra(new Cliente(nomeCliente, uf), itens);
		
	}
	
	
	public Compra addCompra(String nomeCliente, Estado uf, int qtdItensCompra, int qtd, int preco){

		List<Item> itens = new ArrayList<Item>();
		
		for(int i = 0; i < qtdItensCompra; i++){
			itens.add(new Item("", qtd, preco));
		}
		
		return new Compra(new Cliente(nomeCliente, uf), itens);
		
	}
	
}
