package modulo2.exercicio.tdd.sessoes;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeradorDeSessoesTest {

	private GeradorDeSessoes geradorDeSessoes;
	private SessaoBuilder sessaoBuilder;
	
	private List<Sessao> sessaoEsperada;
	private List<Sessao> sessaoGerada;
	
	@Before
	public void setUp(){
	
		geradorDeSessoes = new GeradorDeSessoes();
		sessaoBuilder = new SessaoBuilder();
		
	}
	
	@Test
	public void testAgendaDiaria() {

		sessaoEsperada = sessaoBuilder.geraSessao(1,2,3,4,5,6,7,8);
		sessaoGerada = geradorDeSessoes.gera(1, 8, Periodo.DIARIA);
		
		Assert.assertEquals(sessaoEsperada, sessaoGerada);
		
		sessaoEsperada = sessaoBuilder.geraSessao(4,5,6,7);
		sessaoGerada = geradorDeSessoes.gera(4, 7, Periodo.DIARIA);
		
		Assert.assertEquals(sessaoEsperada, sessaoGerada);

		sessaoEsperada = sessaoBuilder.geraSessao(5);
		sessaoGerada = geradorDeSessoes.gera(5, 5, Periodo.DIARIA);
		
		Assert.assertEquals(sessaoEsperada, sessaoGerada);
		
	}
	
	@Test
	public void testAgendaSemanal() {

		sessaoEsperada = sessaoBuilder.geraSessao(1,8,15);
		sessaoGerada = geradorDeSessoes.gera(1, 20, Periodo.SEMANAL);
		
		Assert.assertEquals(sessaoEsperada, sessaoGerada);
		
		sessaoEsperada = sessaoBuilder.geraSessao(1,8,15,22);
		sessaoGerada = geradorDeSessoes.gera(1, 22, Periodo.SEMANAL);
		
		Assert.assertEquals(sessaoEsperada, sessaoGerada);
		
		sessaoEsperada = sessaoBuilder.geraSessao(1,8,15, 22);
		sessaoGerada = geradorDeSessoes.gera(1, 25, Periodo.SEMANAL);
		
		Assert.assertEquals(sessaoEsperada, sessaoGerada);
		
		sessaoEsperada = sessaoBuilder.geraSessao(10,17,24,31);
		sessaoGerada = geradorDeSessoes.gera(10, 31, Periodo.SEMANAL);
		
		Assert.assertEquals(sessaoEsperada, sessaoGerada);
		
	}
	
	@Test
	public void testAgendaMensal() {

		List<Sessao> sessaoEsperada = sessaoBuilder.geraSessao(1,31);
		List<Sessao> sessaoGerada = geradorDeSessoes.gera(1, 31, Periodo.MENSAL);
		
		Assert.assertEquals(sessaoEsperada, sessaoGerada);
		
		sessaoEsperada = sessaoBuilder.geraSessao(10);
		sessaoGerada = geradorDeSessoes.gera(10, 40, Periodo.MENSAL);
		
		Assert.assertEquals(sessaoEsperada, sessaoGerada);
		
	}
	
}