
public class Baron extends Carta {
	
	 public Baron (){
		numeroDeCarta=3; 
		nombre= "Baron";
	 }
	 public boolean metodoBaron (int cartaUsuario, int cartaUsuario2, int cartaOponente, int tokenUsuario, int tokenOponente){
		 if (cartaUsuario==3){
			 System.out.println("La carta de su oponente  es la carta No."+cartaOponente);
			 if (cartaUsuario2>cartaOponente){
				 System.out.println("Su carta es mayor. Usted gana la partida");
				 tokenUsuario++;
				 juegoTerminado= true;
			 }else if (cartaUsuario2<cartaOponente){
				 System.out.println("La carta de su oponente es mayor. Usted pierde la partida");
				 tokenOponente++;
				 juegoTerminado=true;
			 }else if(cartaUsuario2==cartaOponente){
				 System.out.println("Las cartas son iguales. La partida continua.");
				 juegoTerminado=false;
			 }
		 }
		 return juegoTerminado; 
	 }
}
