package programacaoestruturada.aula01.tiposprimitivos;

public class exercicioOperadores {

	public static void main(String[] args) {
		
		//obter um número de 3 dígitos e retornar a unidade, dezena, centena.
		
		int numero =  (int) Math.round((Math.random()*899)+100);
		
		System.out.println(numero);
		
		int unidade = numero % 10;
		
		int dezena = (numero % 100 - unidade)/10;
		
		int centena = numero / 100;
		
		System.out.println("centena: "+centena);
		
		System.out.println("dezena: "+dezena);
		
		System.out.println("unidade: "+unidade);
	}
}
