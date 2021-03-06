package lab1;

public class TransformaNumeroEmLetras {

	private String resultadoEmExtenso;

	/**
	 * Retorna os valores entre zero e dez
	 * @param numero
	 * @return
	 */
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
	/**
	 * Retorna os valores entre dez e vinte
	 * @param numero
	 * @return
	 */
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
	/**
	 * Retorna os valores inteiros entre vinte e cem
	 * @param numero
	 * @return
	 */
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
	/**
	 * Retorna os inteiros de cem a mil
	 * @param numero
	 * @return
	 */
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
	/**
	 * Entrada vazia, nao faz nada
	 * @return
	 */
	public String entradaVazia(){
		return "";
	}
	/**
	 * Entrada sem ser com numeros
	 * @return
	 */
	public String entradaErrada() {
		return "Voce deve colocar apenas numeros.";
	}
	/**
	 * Valores entre vinte e cem
	 * @param numero
	 * @return
	 */
	public String MaioresQueVinteEMenoresQueCem(int numero) {
		int resto1 = numero%100;
		int div = resto1/10;
		int resto2 = resto1%10;
		resultadoEmExtenso = inteirosDeUmaSoPalavraAteCem(div*10);
		if(resto2 != 0){
			resultadoEmExtenso += " e " + zeroADez(resto2);
		}	
		return resultadoEmExtenso;
	}
	/**
	 * Valores entre cem e mil
	 * @param numero
	 * @return
	 */
	public String MaioresQueCemEMenoresQueMil(int numero) {
		int resto1 = numero%100;
		int div1 = numero/100;
		int div2 = resto1/10;
		int resto2 = resto1%10;
		if (div1*100 == 100 && numero!= 100) {
			resultadoEmExtenso = "cento";
		} else {
			resultadoEmExtenso = inteirosDeUmaSoPalavraAteMil(div1*100);
		}
		if((resto1>10 && resto1<20) || div2 !=0){
			if((resto1>10 && resto1<20)){
				resultadoEmExtenso += " e " + MaioresQueDezEMenoresQueVinte(resto1);
			}else{
				resultadoEmExtenso += " e " + inteirosDeUmaSoPalavraAteCem(div2*10);
			}
		}
		if(resto2 != 0 && !(resto1>10 && resto1<20)){
			resultadoEmExtenso += " e " + zeroADez(resto2);
		}
		
		return resultadoEmExtenso;
	}

	/**
	 * Entre dois mil e um milhao, incluindo o dois mil
	 * @param numero
	 * @return
	 */
	public String MaioresQueMilEMenoresQueMilhao(int numero) {
		int div = numero/1000;
		int resto = numero %1000;
		int numAux = numero - (1000 * div);
		if (div <=10 && div!=0) {
			resultadoEmExtenso = zeroADez(div) + " mil";
			if (div == 1) {
				resultadoEmExtenso = "mil";
			}
		} else if(div <=20){
			resultadoEmExtenso = MaioresQueDezEMenoresQueVinte(div) + " mil";
		}else if(div <100){
			resultadoEmExtenso = MaioresQueVinteEMenoresQueCem(div) + " mil";
		}else if(div < 1000){
			resultadoEmExtenso = MaioresQueCemEMenoresQueMil(div) + " mil";
		}
		if (resto != 0) {
			if (numAux < 100) {
				if (numAux <= 10 && numAux !=0) {
					resultadoEmExtenso += " e " + zeroADez(numAux);
				}else if (numAux < 21) {
					resultadoEmExtenso += " e " + MaioresQueDezEMenoresQueVinte(numAux);
				}else{
					resultadoEmExtenso += " e " + MaioresQueVinteEMenoresQueCem(numAux);
				}
			}else{
				if (numAux == 100) {
					resultadoEmExtenso += " e cem";
				}else{
					resultadoEmExtenso += " " + MaioresQueCemEMenoresQueMil(numAux);
				}
			}
		}
		return resultadoEmExtenso;
	}
	/**
	 * Um bilhao
	 * @return
	 */
	public String UmBilhao() {
		return "um bilhao";
	}

	/**
	 * Numeros de milhoes e milhao
	 * @param i
	 * @return
	 */
	public String NumerosDeMilhoes(int numero) {
		int div = numero/1000000;
		int resto = numero %1000000;
		int numAux = numero - (1000000 * div);
		if (div <=10 && div!=0) {
			resultadoEmExtenso = zeroADez(div) + " milhoes";
			if (div == 1) {
				resultadoEmExtenso = "um milhao";
			}
		} else if(div <=20){
			resultadoEmExtenso = MaioresQueDezEMenoresQueVinte(div) + " milhoes";
		}else if(div <100){
			resultadoEmExtenso = MaioresQueVinteEMenoresQueCem(div) + " milhoes";
		}else if(div < 1000){
			resultadoEmExtenso = MaioresQueCemEMenoresQueMil(div) + " milhoes";
		}
		if (resto != 0) {
			if (numAux < 100) {
				if (numAux <= 10 && numAux !=0) {
					resultadoEmExtenso += " e " + zeroADez(numAux);
				}else if (numAux < 21) {
					resultadoEmExtenso += " e " + MaioresQueDezEMenoresQueVinte(numAux);
				}else{
					resultadoEmExtenso += " e " + MaioresQueVinteEMenoresQueCem(numAux);
				}
			}else{
				if (numAux == 100) {
					resultadoEmExtenso += " e cem";
				}else{
					if (numAux < 1000) {
						resultadoEmExtenso += " " + MaioresQueCemEMenoresQueMil(numAux);
					}else{
						resultadoEmExtenso += " " + MaioresQueMilEMenoresQueMilhao(numAux);
					}
				}
			}
		}
		return resultadoEmExtenso;
	}
}
