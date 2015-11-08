package modulo1.exercicio.desconto;

public class DescontoPorValor {

	public static void desconto(Compra compra) {
		
		if(compra.getValorLiquido()<=1000 && compra.qtdItens() <= 2) {
			compra.reduzValor(compra.getValorLiquido() * 0.02);
		}
		
		else if(compra.getValorLiquido() > 3000 && compra.qtdItens() < 5 && compra.qtdItens() > 2) {
			compra.reduzValor(compra.getValorLiquido() * 0.05);
		}

		else if(compra.getValorLiquido() > 3000 && compra.qtdItens() >= 5) {
			compra.reduzValor(compra.getValorLiquido() * 0.06);
		}
	}

}