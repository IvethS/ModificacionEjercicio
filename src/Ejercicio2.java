
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		//Codigo usado con lo aprendido en clase
		//Este Programa lo que use para realizarlo es un while, asi de esta forma compara el texto y la va repitir
		 // n cantidad de veces con la variable numero que esta es la que define cuantas veces se repetira.
		 //Modificaciones en la condicion del while quitarle el signo = para que solo repitiera la cantidad
		 // de veces correctas y necesarias.
		 Scanner lea = new Scanner(System.in);  
			System.out.print("Introduce un numero: ");
			 int numero=0; 
		        numero=lea.nextInt(); 
		        System.out.println("Ingrese un Texto:  ");
		    	String texto = lea.next();
		    	int x=0;
		    	while (x<numero)
		    	{
		    		System.out.println(texto);
		    		x++;
		    	}
	}

}
