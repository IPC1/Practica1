import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Juego{
	//atributos
	Scanner teclado= new Scanner(System.in);
	Guard carta1= new Guard();
	Priest carta2= new Priest();
	Baron carta3= new Baron();
	Handmaid carta4= new Handmaid ();
	Prince carta5= new Prince ();
	King carta6= new King();
	Countess carta7= new Countess();
	Princess carta8= new Princess();
	Carta[] cartas= new Carta[16];
	String usuario, oponente;
	int turno=0;
	int noDePartida=0;
	Carta cartaUsuario2 = new Carta();
	Carta cartaUsuario1 = new Carta ();
	Carta cartaOponente1 = new Carta ();
	Carta cartaOponente2 =new Carta();
	boolean juegoTerminado, finJuego=false;
	
	int token=1;
public Juego (){//constructor
	cartas[0]= carta1;
	cartas[1]= carta1;
	cartas[2]= carta1;
	cartas[3]= carta1;
	cartas[4]= carta1;
	cartas[5]= carta2;
	cartas[6]= carta2;
	cartas[7]= carta3;
	cartas[8]= carta3;
	cartas[9]= carta4;
	cartas [10]=carta4;
	cartas[11]=carta5;
	cartas[12]=carta5;
	cartas[13]=carta6;
	cartas[14]=carta7;
	cartas[15]=carta8;
	Collections.shuffle(Arrays.asList (cartas));
	
}
public String jugadorPrimero( int cartaUsuario, int cartaOponente){//Devuelve quien juega primero
 turno++;
	if (cartaOponente>cartaUsuario)
		return oponente;
	else 
		return usuario;
}	
public int MostrarCartaUsuario(){//muestra las cartas al usuario. Usarlo en cada turno.
	int UsarCarta;
	do{
	System.out.println("Tienes en tu mano las cartas: ");
	System.out.println("1."+cartaUsuario1.getNombre());
	System.out.println("2."+cartaUsuario2.getNombre());
	System.out.println("(1) Usar Carta 1");
	System.out.println("(2) Usar Carta 2");
	int usuario1=cartaUsuario1.getNumeroDeCarta();
	int usuario2=cartaUsuario2.getNumeroDeCarta();
	if((usuario1==7)||(usuario2)==7){
		if (((usuario1==5)||(usuario2==5)
				)||((usuario1==6)||(usuario2==6))){
			System.out.println("Debe Usar la carta Countess.");
		}
		UsarCarta=7;	
	}else{
	 UsarCarta= teclado.nextInt();
	}
	if(UsarCarta>2 && UsarCarta!=7){
		System.out.println("Solo puede elegir entre dos opciones");
	}
	return UsarCarta;
	}while(UsarCarta<3 || UsarCarta==7);
}

public String nombrePorNumero (int n){
	String carta="";
	if (n==1) carta="Guard";
	else if(n==2) carta="Priest";
	else if (n==3) carta="Baron";
	else if(n==4) carta="Handmaid";
	else if(n==5) carta="Prince";
	else if(n==6) carta="King";
	else if(n==7) carta="Countess";
	else if (n==8) carta="Princess";
	return carta;
}

public boolean metodoFinal ( int cartaUsuario1, int cartaOponente1, int tokenUsuario, int tokenOponente){
	
	if (cartaUsuario1>cartaOponente1){
			 System.out.println("Su carta es mayor. Usted gana la partida");
			 tokenUsuario++;
			 juegoTerminado= true;
		 }else if (cartaUsuario1<cartaOponente1){
			 System.out.println("La carta de su oponente es mayor. Usted pierde la partida");
			 tokenOponente++;
			 juegoTerminado=true;
		 }else if(cartaUsuario1==cartaOponente1){
			 System.out.println("Las cartas son iguales. Quedan empate. No se suman tokens.");
			 
			 juegoTerminado=false;
			 }
	 return juegoTerminado; 
}


public int cartaJugadaCompu(int cartaOponente1, int cartaOponente2){
	int cartaJugada=0;
	switch (cartaOponente1){
	case 1: 
		if ((cartaOponente2)==(6)){
			cartaJugada=6;
		}else{
			cartaJugada=1;
		}
	break;
	case 2:
		if ((cartaOponente2)==(6)){
			cartaJugada=6;
		}else if ((cartaOponente2==(1))){
			cartaJugada=1;
		}else if ((cartaOponente2)== (5)){
			cartaJugada=5;
		}else{
			cartaJugada=2;
		}
	break;
	case 3:
		if ((cartaOponente2)<(3)){
			cartaJugada=cartaOponente2;
		}else if ((cartaOponente2)== (5)){
			cartaJugada=5;
		}else if((cartaOponente2)==(6)){
			cartaJugada=6;
		}else{
			cartaJugada=3;
		}
	break;
	case 4:
		if ((cartaOponente2)<(4)){
			cartaJugada=cartaOponente2;
		}else if((cartaOponente2)==(6)){
			cartaJugada=6;
		}else{
			cartaJugada=4;
		}
	break;
	case 5:
		if ((cartaOponente2)==(1)){
			cartaJugada=1;
		}else if ((cartaOponente2==(4))){
			cartaJugada=4;
		}else if ((cartaOponente2)== (7)){
			cartaJugada=7;
		}else{
			cartaJugada=5;
		}
	break;
	case 6:
		if ((cartaOponente2)==(5)){
			cartaJugada=5;
		}else if ((cartaOponente2==(7))){
			cartaJugada=7;
		}else{
			cartaJugada=6;
		}
	break;
	case 7:
		if ((cartaOponente2)<(5)){
			cartaJugada=cartaOponente2;
		}else{
			cartaJugada=7;
		}
	case 8:
		if ((cartaOponente2)<(8)){
			cartaJugada=cartaOponente2;
		}else{
			cartaJugada=8;
		}
	}
return cartaJugada;	
}


}
	
	
	
	
	

	

