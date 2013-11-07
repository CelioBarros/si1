package lab1;

public class TransformaNumeroEmLetras {

	private String resultadoEmExtenso;

	public String zeroADez(int numero){
		int resto = numero%10;
		if (numero == 0){
			return resultadoEmExtenso = "zero";
		}
		switch (resto) {
		case 0:	resultadoEmExtenso = "dez";	break;
		case 1:	resultadoEmExtenso = "um";	break;
		case 2:	resultadoEmExtenso = "dois"; break;
		case 3:	resultadoEmExtenso = "tres"; break;
		case 4:	resultadoEmExtenso = "quatro"; break;
		case 5:	resultadoEmExtenso = "cinco"; break;
		case 6:	resultadoEmExtenso = "seis"; break;
		case 7:	resultadoEmExtenso = "sete"; break;
		case 8:	resultadoEmExtenso = "oito"; break;
		case 9:	resultadoEmExtenso = "nove"; break;
		}
		return resultadoEmExtenso;
		
	}
}
