package lab1;

import java.util.Scanner;

public class MainTransforma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numero = 0;
		TransformaNumeroEmLetras transforma = new TransformaNumeroEmLetras();

		while (numero != -1) {

			System.out.println("Tecle -1 para sair:");
			System.out.println("Digite um numero entre 0 e 1000000000: ");
			Scanner scanner = new Scanner(System.in);
			try {
				numero = scanner.nextInt();				
			} catch (Exception e) {
				System.out.println(transforma.entradaErrada());
				continue;
			}
		if(numero != -1){
			if(numero == 1000000000){
				System.out.println(transforma.UmBilhao());
			}else if (numero <= 10) {
				System.out.println(transforma.zeroADez(numero));
			}else if(numero < 20){
				System.out.println(transforma.MaioresQueDezEMenoresQueVinte(numero));
			}else if (numero < 100 ) {
				System.out.println(transforma.MaioresQueVinteEMenoresQueCem(numero));
			}else if (numero < 1000 ) {
				System.out.println(transforma.MaioresQueCemEMenoresQueMil(numero));
			}else if (numero < 2000) {
				System.out.println(transforma.MaioresQueMilEMenoresQueDoisMil(numero));
			}else if (numero < 1000000){
				System.out.println(transforma.MaioresQueDoisMilEMenoresQueMilhao(numero));
			}
		}
		}
	}
}
