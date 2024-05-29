package lpa_somativa;

import java.util.Scanner;

public class AVSomativa2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //Gerar token
		
		int val; //Declaração de variável
		
		System.out.print("Insira um dia da semana(1-7): "); //Atribuição de variável
		val = ler.nextInt();
		
		if (val == 1) {
			System.out.println("Domingo");
		}
		else if (val == 2) {
			System.out.println("Segunda-feira");
		}
		else if (val == 3) {
			System.out.println("Terça-feira"); //Processamento e saída
		}
		else if (val == 4) {
			System.out.println("Quarta-feira");
		}
		else if (val == 5) {
			System.out.println("Quinta-feira");
		}
		else if (val == 6) {
			System.out.println("Sexta-feira");
		}
		else if (val == 7) {
			System.out.println("Sábado");
		}
		else {
			System.out.println("Dia inválido!");
		}
		
		ler.close(); //Encerramento do scanner

	}

}

//PS: Tokens são sequências de caracteres separados por delimitadores.

//No desafio, há a declaração da variável "val", que na programação poderá ser atrinuída como 1,2,3,4,5,6 ou 7 e outros.
//De acordo com o número escolhido pelo usuário, será mostrado na tela sua respectiva valia na Saída.