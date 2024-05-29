package lpa_somativa;

import java.util.Scanner;

public class AVSomativa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //Gerar token
		
		double a, b, soma, sub, mult, div; //Declaração de variável
		
		System.out.println("Informe o valor do primeiro número: ");
		a = ler.nextDouble();
		                                                               //Atribuição de variável
		System.out.println("Informe o valor do segundo número:");
		b = ler.nextDouble();
		
		soma = a+b;
		sub = a-b; //Processamento
		mult = a*b;
		div = a/b;
		
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A subtração dos valores é: " + sub); //Saída
		System.out.println("A multiplicação dos valores é: " + mult);
		System.out.println("A divisão dos valores é: " + div);
		
		ler.close(); //Encerramento do scanner
	}

}

//PS: Tokens são sequências de caracteres separados por delimitadores.

//No desafio, as variáveis "a" e "b" depois de declaradas serão designadas à valores escritos pelo usuário na Atribuição.
//Os novos valores, farão parte das contas atribuídas a soma, sub, mult e div pelo Processamento.
//Por fim aparecerão na tela na Saída.