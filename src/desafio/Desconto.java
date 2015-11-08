package desafio;

public class Desconto {

	public void desconto(Compra compra) {
		
		if(compra.getValorLiquido() <= 500) {
			compra.reduzValor(compra.getValorLiquido() * 0.05);
		} else if (compra.getValorLiquido() <= 2000) {
			compra.reduzValor(compra.getValorLiquido() * 0.1);
		} else if (compra.getValorLiquido() > 2000) {
			compra.reduzValor(compra.getValorLiquido() * 0.15);
		} 
	}
	
}