
public class King extends Carta {
	 
	 public King (){
		numeroDeCarta=6; 
		nombre= "King";
	 }
	 public boolean metodoKing(int cartaUsuario){
		 if (cartaUsuario==6){
			 juegoTerminado=true;
			 }
		 return juegoTerminado;
	 }
}
