package modulo2.exercicio.mocks;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FaturaBuilder {

	private List<Fatura> lista = new ArrayList<Fatura>();

	    public FaturaBuilder naData(Calendar data, String cliente, double... valores) {
	        
	        for(double valor : valores) {
	            lista.add(new Fatura(data, cliente, valor));
	        }
	        
	        return this;
	    }

	    public List<Fatura> constroi() {
	        return lista;
	    }
	
}