package desafio;

import desafio.Compra;

public class Frete {

	private Compra compra;
	private double valor;
	

	public Frete(Compra compra){
		this.compra = compra;
		this.calculaValorDoFrete(getCompra());
	}
	
	private void calculaValorDoFrete(Compra compra){
		
		valor = new CalcularValorFrete().calcula(compra);
		
	}
	
	public Compra getCompra() {
		return compra;
	}
	
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	public double getValor() {
		return valor;
	}
	
}