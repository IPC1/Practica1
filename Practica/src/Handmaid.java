 
public class Handmaid extends Carta{
	
	 public Handmaid (){
		numeroDeCarta=4;
		nombre= "Handmaid";
	 }
	 public boolean metodoHandmaid(int cartaUsuario){
		 if (cartaUsuario==4)
			 juegoTerminado= false;
		 return juegoTerminado;
	 }
}
