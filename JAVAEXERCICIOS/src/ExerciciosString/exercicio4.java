package ExerciciosString;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um texto em CAPS LOK: ");
		String texto = entrada.nextLine();
		String texto2 = texto.toLowerCase();
    	System.out.println(texto2);
    	
	}
}
