
public class Princess extends Carta {
	
	 public Princess (){
		numeroDeCarta=8;
		nombre= "Princess";
	 }
	 public boolean metodoPrincess(int CartaUsuario, int tokenOponente){
		 if (CartaUsuario==8){
			 System.out.println("La Ronda ha terminado. Usted ha perdido.");
			 tokenOponente++;
			 juegoTerminado=true;
		 }
		 return juegoTerminado;
	 }
}
