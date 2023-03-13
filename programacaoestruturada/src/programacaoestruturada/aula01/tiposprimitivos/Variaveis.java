package programacaoestruturada.aula01.tiposprimitivos;

import java.util.Scanner;

/*
 *  Classe voltada para o ensino de tipos primitivos.
 * 
 *  autor: Osvaldo Souza
 *  
 *  data: 06/03/2023
 *  
 *  versão: 1.0
 * 
 */
public class Variaveis {
	//Método de execução da classe
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		final double GRAVIDADE_DA_TERRA = 9.8;		
		
		String nome = "Osvaldo";
		int idade = 35;
		float altura = 1.63f;
		double peso = 78.5;
		char tipoSanguineo = 'A';
		boolean fatorRH = true;
		/*
		System.out.print("nome: "+nome);
		System.out.print(" idade:"+idade);
		System.out.print(" altura: "+altura);
		System.out.print(" peso: "+peso);
		*/
		
		nome = leitor.next();
		
		idade = leitor.nextInt();
		
		tipoSanguineo = leitor.next().charAt(0);
		
		System.out.printf("nome: %s ,\nidade: %d ,\npeso: %.2f ,\naltura %.2f ,\ntipo sanguineo: %c"
							,nome,idade,peso,altura,tipoSanguineo);
		
		
		
	}
}









