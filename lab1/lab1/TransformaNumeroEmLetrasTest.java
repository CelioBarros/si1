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
		Assert.assertEquals("O dez está errado","dez", transforma.zeroADez(10));
		Assert.assertEquals("O zero está errado","zero", transforma.zeroADez(0));
		Assert.assertEquals("O cinco está errado","cinco", transforma.zeroADez(5));
		Assert.assertEquals("O dois está errado","dois", transforma.zeroADez(2));
	}
	
	//Comportamento 2
		@Test
		public void testaNumeroApenasUmaPalavra() {
			Assert.assertEquals("O onze está errado","onze", transforma.MaioresQueDezEMenoresQueVinte(11));
			Assert.assertEquals("O doze está errado","doze", transforma.MaioresQueDezEMenoresQueVinte(12));
			Assert.assertEquals("O quinze está errado","quinze", transforma.MaioresQueDezEMenoresQueVinte(15));
			Assert.assertEquals("O duzentos está errado","duzentos", transforma.inteirosDeUmaSoPalavra(200));
			Assert.assertEquals("O quinhentos está errado","quinhentos", transforma.inteirosDeUmaSoPalavra(500));
			Assert.assertEquals("O novecentos está errado","novecentos", transforma.inteirosDeUmaSoPalavra(900));
			Assert.assertEquals("O mil está errado","mil", transforma.inteirosDeUmaSoPalavra(1000));
			
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
