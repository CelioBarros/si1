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
			Assert.assertEquals("O duzentos está errado","duzentos", transforma.inteirosDeUmaSoPalavraAteMil(200));
			Assert.assertEquals("O quinhentos está errado","quinhentos", transforma.inteirosDeUmaSoPalavraAteMil(500));
			Assert.assertEquals("O novecentos está errado","novecentos", transforma.inteirosDeUmaSoPalavraAteMil(900));
			Assert.assertEquals("O mil está errado","mil", transforma.inteirosDeUmaSoPalavraAteMil(1000));
			Assert.assertEquals("O cinquenta está errado","cinquenta", transforma.inteirosDeUmaSoPalavraAteCem(50));
			Assert.assertEquals("O trinta está errado","trinta", transforma.inteirosDeUmaSoPalavraAteCem(30));
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
	
	//Comportamento 5
		@Test
		public void testaNumeroDe21a99(){
			Assert.assertEquals("vinte e um", transforma.MaioresQueVinteEMenoresQueCem(21));
			Assert.assertEquals("trinta e tres", transforma.MaioresQueVinteEMenoresQueCem(33));
			Assert.assertEquals("quarenta e cinco", transforma.MaioresQueVinteEMenoresQueCem(45));
			Assert.assertEquals("cinquenta e quatro", transforma.MaioresQueVinteEMenoresQueCem(54));
			Assert.assertEquals("sessenta e oito", transforma.MaioresQueVinteEMenoresQueCem(68));
			Assert.assertEquals("setenta e dois", transforma.MaioresQueVinteEMenoresQueCem(72));
			Assert.assertEquals("oitenta e sete", transforma.MaioresQueVinteEMenoresQueCem(87));
			Assert.assertEquals("noventa e nove", transforma.MaioresQueVinteEMenoresQueCem(99));
		}	
		
	//Comportamento 6
		@Test
		public void testaNumeroDe101a999(){
			Assert.assertEquals("cento e um", transforma.MaioresQueCemEMenoresQueMil(101));
			Assert.assertEquals("duzentos e trinta e tres", transforma.MaioresQueCemEMenoresQueMil(233));
			Assert.assertEquals("quatrocentos e quarenta e cinco", transforma.MaioresQueCemEMenoresQueMil(445));
			Assert.assertEquals("quinhentos e cinquenta e quatro", transforma.MaioresQueCemEMenoresQueMil(554));
			Assert.assertEquals("trezentos e dezessete", transforma.MaioresQueCemEMenoresQueMil(317));
			Assert.assertEquals("setecentos e setenta e dois", transforma.MaioresQueCemEMenoresQueMil(772));
			Assert.assertEquals("seiscentos e oitenta e sete", transforma.MaioresQueCemEMenoresQueMil(687));
			Assert.assertEquals("oitocentos e noventa e tres", transforma.MaioresQueCemEMenoresQueMil(893));
			Assert.assertEquals("novecentos e noventa e nove", transforma.MaioresQueCemEMenoresQueMil(999));
		}

	//Comportamento 7
		@Test
		public void testaNumeroDe1001a1099(){
			Assert.assertEquals("mil e um", transforma.MaioresQueMilEMenoresQueDoisMil(1001));
			Assert.assertEquals("mil e trinta e tres", transforma.MaioresQueMilEMenoresQueDoisMil(1033));
			Assert.assertEquals("mil e quarenta e cinco", transforma.MaioresQueMilEMenoresQueDoisMil(1045));
			Assert.assertEquals("mil e cinquenta e quatro", transforma.MaioresQueMilEMenoresQueDoisMil(1054));
			Assert.assertEquals("mil e sessenta e oito", transforma.MaioresQueMilEMenoresQueDoisMil(1068));
			Assert.assertEquals("mil e setenta e dois", transforma.MaioresQueMilEMenoresQueDoisMil(1072));
			Assert.assertEquals("mil e oitenta e sete", transforma.MaioresQueMilEMenoresQueDoisMil(1087));
			Assert.assertEquals("mil e noventa e nove", transforma.MaioresQueMilEMenoresQueDoisMil(1099));
		}
		
	//Comportamento 8
		@Test
		public void testaNumeroDe1100a1999(){
			Assert.assertEquals("mil e cem", transforma.MaioresQueMilEMenoresQueDoisMil(1100));
			Assert.assertEquals("mil quinhentos e um", transforma.MaioresQueMilEMenoresQueDoisMil(1501));
			Assert.assertEquals("mil seiscentos e trinta e tres", transforma.MaioresQueMilEMenoresQueDoisMil(1633));
			Assert.assertEquals("mil duzentos e quarenta e cinco", transforma.MaioresQueMilEMenoresQueDoisMil(1245));
			Assert.assertEquals("mil novecentos e cinquenta e quatro", transforma.MaioresQueMilEMenoresQueDoisMil(1954));
			Assert.assertEquals("mil trezentos e dezessete", transforma.MaioresQueMilEMenoresQueDoisMil(1317));
			Assert.assertEquals("mil oitocentos e setenta e dois", transforma.MaioresQueMilEMenoresQueDoisMil(1872));
			Assert.assertEquals("mil setecentos e oitenta e sete", transforma.MaioresQueMilEMenoresQueDoisMil(1787));
			Assert.assertEquals("mil cento e noventa e tres", transforma.MaioresQueMilEMenoresQueDoisMil(1193));
			Assert.assertEquals("mil quatrocentos e noventa e nove", transforma.MaioresQueMilEMenoresQueDoisMil(1499));
			Assert.assertEquals("mil novecentos e noventa e nove", transforma.MaioresQueMilEMenoresQueDoisMil(1999));
		}
}
