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
			Assert.assertEquals("O onze est� errado","onze", transforma.MaioresQueDezEMenoresQueVinte(11));
			Assert.assertEquals("O doze est� errado","doze", transforma.MaioresQueDezEMenoresQueVinte(12));
			Assert.assertEquals("O quinze est� errado","quinze", transforma.MaioresQueDezEMenoresQueVinte(15));
			Assert.assertEquals("O duzentos est� errado","duzentos", transforma.inteirosDeUmaSoPalavra(200));
			Assert.assertEquals("O quinhentos est� errado","quinhentos", transforma.inteirosDeUmaSoPalavra(500));
			Assert.assertEquals("O novecentos est� errado","novecentos", transforma.inteirosDeUmaSoPalavra(900));
			Assert.assertEquals("O mil est� errado","mil", transforma.inteirosDeUmaSoPalavra(1000));
			
		}
		
	//Comportamento 3
		@Test
		public void testaEntradaVazia(){
			Assert.assertEquals("", transforma.entradaVazia());
		}
		
	//Comportamento 4
		@Test
		public void testaEntradaErrada(){
			Assert.assertEquals("Voce deve colocar apenas numeros.", transforma.entradaErrada());
		}
	
}
