package lab1;

public class TransformaNumeroEmLetras {

	private String resultadoEmExtenso;

	public String zeroADez(int numero){
		switch (numero) {
		case 0: resultadoEmExtenso = "zero";	break;
		case 1:	resultadoEmExtenso = "um";	break;
		case 2:	resultadoEmExtenso = "dois"; break;
		case 3:	resultadoEmExtenso = "tres"; break;
		case 4:	resultadoEmExtenso = "quatro"; break;
		case 5:	resultadoEmExtenso = "cinco"; break;
		case 6:	resultadoEmExtenso = "seis"; break;
		case 7:	resultadoEmExtenso = "sete"; break;
		case 8:	resultadoEmExtenso = "oito"; break;
		case 9:	resultadoEmExtenso = "nove"; break;
		case 10: resultadoEmExtenso = "dez";	break;
		}
		return resultadoEmExtenso;
		
	}
	
	public String MaioresQueDezEMenoresQueVinte(int numero){
		switch (numero) {
		case 11:	resultadoEmExtenso = "onze";	break;
		case 12:	resultadoEmExtenso = "doze";	break;
		case 13:	resultadoEmExtenso = "treze"; break;
		case 14:	resultadoEmExtenso = "quartorze"; break;
		case 15:	resultadoEmExtenso = "quinze"; break;
		case 16:	resultadoEmExtenso = "dezesseis"; break;
		case 17:	resultadoEmExtenso = "dezessete"; break;
		case 18:	resultadoEmExtenso = "dezoito"; break;
		case 19:	resultadoEmExtenso = "dezenove"; break;
		
		}
		return resultadoEmExtenso;
		
	}
	
	public String inteirosDeUmaSoPalavraAteCem(int numero){
		switch (numero) {
		case 20:	resultadoEmExtenso = "vinte"; break;
		case 30:	resultadoEmExtenso = "trinta"; break;
		case 40:	resultadoEmExtenso = "quarenta"; break;
		case 50:	resultadoEmExtenso = "cinquenta"; break;
		case 60:	resultadoEmExtenso = "sessenta"; break;
		case 70:	resultadoEmExtenso = "setenta"; break;
		case 80:	resultadoEmExtenso = "oitenta"; break;
		case 90:	resultadoEmExtenso = "noventa"; break;
		}
		return resultadoEmExtenso;
		
	}
	
	public String inteirosDeUmaSoPalavraAteMil(int numero){
		switch (numero) {
		case 100:	resultadoEmExtenso = "cem"; break;
		case 200:	resultadoEmExtenso = "duzentos"; break;
		case 300:	resultadoEmExtenso = "trezentos"; break;
		case 400:	resultadoEmExtenso = "quatrocentos"; break;
		case 500:	resultadoEmExtenso = "quinhentos"; break;
		case 600:	resultadoEmExtenso = "seiscentos"; break;
		case 700:	resultadoEmExtenso = "setecentos"; break;
		case 800:	resultadoEmExtenso = "oitocentos"; break;
		case 900:	resultadoEmExtenso = "novecentos"; break;
		case 1000:	resultadoEmExtenso = "mil"; break;
	
		}
		return resultadoEmExtenso;
		
	}
	
	public String entradaVazia(){
		return "";
	}

	public String entradaErrada() {
		return "Voce deve colocar apenas numeros.";
	}

	public String MaioresQueVinteEMenoresQueCem(int numero) {
		int resto1 = numero%100;
		int div1 = resto1/10;
		int resto2 = resto1%10;
		String resultadoParcial1 = null, resultadoParcial2 = null;
		resultadoParcial1 = inteirosDeUmaSoPalavraAteCem(div1*10);
		if(resto2 != 0){
			resultadoParcial2 = zeroADez(resto2);
		}	
		
		resultadoEmExtenso = resultadoParcial1 + " e " + resultadoParcial2;
		return resultadoEmExtenso;
	}
}
