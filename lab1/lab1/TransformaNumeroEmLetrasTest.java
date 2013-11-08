package lab1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TransformaNumeroEmLetrasTest {
	
	TransformaNumeroEmLetras transforma;
	
	@Before
	public void testa(){
		transforma = new TransformaNumeroEmLetras();
	}

	//Comportamento 1
	@Test
	public void testaNumeroDe0a10() {
		Assert.assertEquals("O dez est� errado","dez", transforma.zeroADez(10));
		Assert.assertEquals("O zero est� errado","zero", transforma.zeroADez(0));
		Assert.assertEquals("O cinco est� errado","cinco", transforma.zeroADez(5));
		Assert.assertEquals("O dois est� errado","dois", transforma.zeroADez(2));
	}
	
	//Comportamento 2
		@Test
		public void testaNumeroApenasUmaPalavra() {
			Assert.assertEquals("O onze est� errado","onze", transforma.apenasUmaPalavra(11));
			Assert.assertEquals("O doze est� errado","doze", transforma.apenasUmaPalavra(12));
			Assert.assertEquals("O quinze est� errado","quinze", transforma.apenasUmaPalavra(15));
			Assert.assertEquals("O duzentos est� errado","duzentos", transforma.apenasUmaPalavra(200));
			Assert.assertEquals("O quinhentos est� errado","quinhentos", transforma.apenasUmaPalavra(500));
			Assert.assertEquals("O novecentos est� errado","novecentos", transforma.apenasUmaPalavra(900));
			Assert.assertEquals("O mil est� errado","mil", transforma.apenasUmaPalavra(1000));
			
		}


}
