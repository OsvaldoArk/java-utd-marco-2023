package programacaoestruturada.aula01.operadores.math;

public class MaiorDeDoisNumeros {

	public static void main(String[] args) {
		
		
		int numero01 = 200, numero02 = 100;
		
		int maior = ((numero01 + numero02) + Math.abs(numero01 -numero02))/2;
		
		System.out.println(maior);
		
		//System.out.println(numero01>numero02? numero01 : numero02);

	}

}
