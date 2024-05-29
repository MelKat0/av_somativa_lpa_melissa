package lpa_somativa;

import java.util.Scanner;

public class AVSomativa4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //Gerar token

		int num, soma=0; //Declaração de variável
		
		for (int i=0; i<15;i++) {
			System.out.println("Insira um número: "); //Atribuição de variável
			num = ler.nextInt();
			
			soma = soma + num; //Processamento
		}
		System.out.println("O resultado da soma dos valores é: " + soma); //Saída
		
		ler.close(); //Encerramento de scanner
	}

}

//PS: Tokens são sequências de caracteres separados por delimitadores.

//Neste desafio, as variáveis "num" e "soma" são declaradas, e seguintes 15 valores pela repetição de i podem ser atribuídos a "num".
//A soma no Processamento irá contabilizar todos os números já escritos e na Saída, ela será mostrada.
