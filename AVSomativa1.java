package lpa_somativa;

import java.util.Scanner;

public class AVSomativa1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //Gerar token
		
		double b, h, area; //Declaração de variável
		
		System.out.println("Qual a medida da base do triângulo: "); 
		b = ler.nextDouble();             
		                                                                 //Atribuição de variável
		System.out.println("Qual a medida da altura do triângulo: "); 
		h = ler.nextDouble();
		
		area = b*h/2; //Processamento
		
		System.out.println("A área do triângulo é: " + area); //Saída

		ler.close(); //Encerramento do scanner
	}

}

//PS: Tokens são sequências de caracteres separados por delimitadores.

//No desafio, as variáveis "a" e "b" depois de declaradas, são atribuídas com valores escolhidos pelo usuário.
//A partir disso, a variável "area" irá realizar o cálculo com os ditos valores no Processamento e aparecer na tela na Saida.
 