import java.util.Scanner;


public class Carta {

	int numeroDeCarta;
	String nombre;
	boolean juegoTerminado=false;
	Scanner teclado= new Scanner(System.in);
	int aleatorio= (int)Math.random();
	public Carta(){ 
	
	}
	public int getNumeroDeCarta (){
		return numeroDeCarta;
	}
	public String getNombre (){
		return nombre;
	}
	
		

}
