
public class Guard extends Carta{


public Guard(){
	numeroDeCarta=1;
	nombre= "Guard";
}

public boolean metodoGuard (int cartaUsuario, int cartaOponente,int tokenUsuario){
	if (cartaUsuario==1){
		int oponente;
		do{
		System.out.println("¿Que carta tiene su rival? (Ingrese el numero)");
		System.out.println("(2)Priest");
		System.out.println("(3)Baron");
		System.out.println("(4)Handmaid");
		System.out.println("(5)Prince");
		System.out.println("(6)King");
		System.out.println("(7)Countess");
		System.out.println("(8)Princess");
		oponente= teclado.nextInt();
		if(oponente==1)
			System.out.println("No puede ingresar esa opción");
		else if (oponente==cartaOponente){
			System.out.println("Has adivinado la carta de tu oponente. La ronda ha terminado");
			tokenUsuario++;
		juegoTerminado=true;
		}	
		else{
			System.out.println("No has adivinado la carta de tu oponente");
		juegoTerminado=false;
		}
	}while (oponente==1);
	}
	return juegoTerminado;
}
public boolean guardOponente (int cartaOponente, int cartaUsuario, int tokenOponente){
	if (cartaOponente==1){
		int aleatorio;
		aleatorio= (int)(Math.random()*(8-2+1)+2);
		if (aleatorio==cartaUsuario){
			tokenOponente++;
		System.out.println("Su oponente adivino su carta. Ud pierde la partida.");
		juegoTerminado=true;
		}	
		else{
			System.out.println("Su oponente no adivino la carta. El juego sigue.");
		juegoTerminado=false;
		}
	}
	
	return juegoTerminado;

}
}
