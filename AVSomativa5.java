package lpa_somativa;

import java.util.Scanner;

public class AVSomativa5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String garagem[] = new String[7];
		
		for (int i=1; i<7; i++) {
			System.out.println("Informe um carro para estacionar: ");
			garagem[i] = ler.next();
		}
		
		for (int i=1; i<7; i++) {
			System.out.println(garagem[i] + " está na " + i + " vaga");
		}
		
		ler.close();
	}

}
