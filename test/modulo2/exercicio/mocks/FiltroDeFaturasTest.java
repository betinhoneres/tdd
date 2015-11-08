package modulo2.exercicio.mocks;

import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class FiltroDeFaturasTest {

	private FaturaBuilder faturaBuilder;
	
	@Before
	public void setUp(){
		faturaBuilder = new FaturaBuilder();
	}
	
	@Test
	public void test() {

		faturaBuilder.naData(new GregorianCalendar(), "Central IT", 10,20,30);
		
		List<Fatura> faturas = faturaBuilder.constroi();
		
		RepositorioDeFaturas rep = Mockito.mock(RepositorioDeFaturas.class);
		
		List<Fatura> faturasEsperada = (List<Fatura>) Mockito.when(rep.todas()).thenReturn(faturas);

		
		
	}
}