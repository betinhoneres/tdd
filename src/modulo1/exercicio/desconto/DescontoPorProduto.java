package modulo1.exercicio.desconto;

public class DescontoPorProduto {

	public static boolean desconto(Compra compra) {
		
		if(compra.tem("MACBOOK") && compra.tem("IPHONE")) {
			compra.reduzValor(compra.getValorLiquido() * 0.15);
			return true;
		}

		if(compra.tem("NOTEBOOK") && compra.tem("WINDOWS PHONE")) {
			compra.reduzValor(compra.getValorLiquido() * 0.12);
			return true;
		}
		
		if(compra.tem("XBOX")) {
			compra.reduzValor(compra.getValorLiquido() * 0.7);
			return true;
		}
		
		return false;
	}

}