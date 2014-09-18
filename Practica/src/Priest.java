
public class Priest extends Carta {
	
 public Priest (){
		numeroDeCarta=2;
		nombre= "Priest";
 }
 public void metodoPriest(int cartaUsuario, String cartaOponente ){
	 if (cartaUsuario==2){
		 System.out.println ("La carta de sus oponente es: "+cartaOponente); 
	 } 
 }
}
