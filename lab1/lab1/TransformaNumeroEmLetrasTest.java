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

}
