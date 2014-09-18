import java.util.Scanner;


public class Interfaz {
	Scanner teclado =new Scanner(System.in);
	int eleccion;
	int token;
	MenuJuego MenuJuego= new MenuJuego();
	public Interfaz (){
		do{
			System.out.println("\n\n\n\n\n");
			System.out.println ("-=Bienvenido a Love Letter=-");
			System.out.println("Elija una opción:");
			System.out.println ("(1)Jugar una partida");
			System.out.println ("(2)Seleccionar el numero de Tokens a Jugar");
			System.out.println ("(3)Mostrar las reglas del Juego");
			System.out.println ("(4)Salir");
			eleccion = teclado.nextInt();
			switch (eleccion) {
				case 1:
					MenuJuego.menuJuego(token);
					break;
				case 2:
					token=MenuJuego.tokens();	
					break;
				case 3: 
					Reglas reglas= new Reglas();
					break;
				case 4:
					System.out.println("¡Espero te hayas divertido! Hasta Luego.");
					break;
				default: 
					System.out.println ("Debe ingresar el numero de la opción");
					break;
			}		
			}while (eleccion !=4);
	}
}
	

