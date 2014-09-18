
public class Prince extends Carta {
	
	 public Prince (){
		 numeroDeCarta=5; 
		 nombre= "Prince";
	 }
	 public String metodoPrince(int cartaUsuario, int cartaOponente){
		 String nuevaCarta = "";
		 if (cartaUsuario==5){
			 System.out.println("Que carta quiere botar?");
			 System.out.println ("(1)Carta del Oponente");
			 System.out.println ("(2) Mi carta");
			 int botar= teclado.nextInt();
			 if (botar==1){
				 cartaOponente=0;
				 nuevaCarta="cartaOponente1";
			 }else if (botar==2){
				 cartaUsuario=0;
				 nuevaCarta="cartaUsuario1";
			 } 
		 }
		 return nuevaCarta;
	 }
}
