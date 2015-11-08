package desafio;

public class CalcularValorFrete {
	
	public double calcula(Compra compra){
		
		if(compra == null)
			throw new IllegalArgumentException("Compra não pode ser nula");
		
		if(compra.getCliente().getEstado().equals(Estado.SP)){
			
			if(compra.qtdItens() <= 3){
				return 10;
			} else {
				return 17;
			}
			
		} else if(compra.getCliente().getEstado().equals(Estado.RJ)){
			
			if(compra.qtdItens() <= 4){
				return 11;
			} else {
				return 15;
			}
			
		} else if(compra.getCliente().getEstado().equals(Estado.Sul)){
			return 22;
		} else {
			return 25;
		}
	}
}