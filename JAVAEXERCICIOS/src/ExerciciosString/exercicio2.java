package ExerciciosString;
import java.util.Scanner;
public class exercicio2 {
		public static void main(String[] args){
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um texto: ");
			String texto = entrada.nextLine();
				int tam = texto.length();
				System.out.println(tam);
		}
}
