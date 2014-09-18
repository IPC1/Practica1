
public class MenuJuego extends Juego{
	String jugador;
	int usarCarta;
	int CartaTurno;
	int tokenUsuario=0;
	int tokenOponente=0;
	
	public MenuJuego (){
	}
	public void menuJuego(int TOKEN){
		System.out.println("\n\n\n\n\n");
		System.out.println("Ingrese su nombre");
		usuario= teclado.next();
		System.out.println("Ingrese el nombre del oponente");
		oponente= teclado.next();
		do{
		System.out.println("Partida No."+noDePartida);
		cartaUsuario1= cartas[0];
		cartaOponente1=cartas[1];
		System.out.println("La carta de "+usuario+" es carta: "+cartaUsuario1.getNombre());
		System.out.println("La carta de "+oponente+" es carta: "+cartaOponente1.getNombre());
		turno=0;
		jugador=jugadorPrimero(cartaUsuario1.getNumeroDeCarta(),cartaOponente1.getNumeroDeCarta());
		System.out.println("Empieza  "+jugador);
		System.out.println("\n");

		do{
		if(turno<=14){
		if(jugador.equalsIgnoreCase(oponente)){
			System.out.println("Es el turno de: "+oponente);
			if (turno==1){
			cartaOponente1= cartas[++turno];
			cartaUsuario1 = cartas [++turno];
			cartaOponente2= cartas[++turno];
			} else {
				System.out.println("\n");
				cartaOponente2=cartas[++turno];
			}
			System.out.println("Tu carta es: "+cartaUsuario1.getNombre());
			usarCarta = cartaJugadaCompu(cartaOponente1.getNumeroDeCarta(), cartaOponente2.getNumeroDeCarta());
			if (usarCarta==cartaOponente1.getNumeroDeCarta())
				cartaOponente1=cartaOponente2;
			if (usarCarta==7&&cartaOponente1.getNumeroDeCarta()==7)
				cartaOponente1=cartaOponente2;
				
			
			System.out.println("Su oponente utilizó la carta: " +nombrePorNumero(usarCarta));
			System.out.println("Carta en el mazo:"+(15-turno));
			switch(usarCarta){
			case 1:
				finJuego=carta1.guardOponente(usarCarta, cartaUsuario1.getNumeroDeCarta(), tokenOponente );
				break;
			case 2:
				break;
			case 3:
				finJuego= carta3.metodoBaron(usarCarta, cartaUsuario1.getNumeroDeCarta(), cartaOponente1.getNumeroDeCarta(), tokenUsuario, tokenOponente);
				break;
			case 4:
				break;
			case 5:
				if(turno<15){
				cartaUsuario1=cartas[++turno];
				}else System.out.println("Ya no hay cartas en el mazo");
				break;
			case 6:
				Carta cartaFlotante= new Carta();
				cartaFlotante=cartaUsuario1;
				cartaUsuario1=cartaOponente1;
				cartaOponente1=cartaFlotante;
				System.out.println("Su nueva carta es: "+ cartaUsuario1.getNombre());
			break;
			case 7:
				break;
			case 8:
				System.out.println("Su oponente ha perdido la partida");
				tokenUsuario++;
				finJuego=true;
			break;
			default:
				System.out.println("Solo puede tener 8 opciones");
			} 
			jugador=usuario;
		}
		
		
		else if (jugador.equalsIgnoreCase(usuario)){
			System.out.println("\n");
			System.out.println("Es tu turno.");
			if (turno==1){
			cartaUsuario1=cartas[++turno];
			cartaOponente1=cartas[++turno];
			cartaUsuario2=cartas[++turno];
			}else {
				cartaUsuario2=cartas[++turno];
			}
			System.out.println("Tokens");
			System.out.println(oponente+": "+tokenOponente);
			System.out.println(usuario+": "+tokenUsuario);
			System.out.println("Carta en el mazo:"+(15-turno));
			CartaTurno=MostrarCartaUsuario();
			if (CartaTurno==1){
				usarCarta=cartaUsuario1.getNumeroDeCarta();
				cartaUsuario1=cartaUsuario2;  //la fija siempre es la 1.
			}else if (CartaTurno==2){
				usarCarta=cartaUsuario2.getNumeroDeCarta();
			}else if (CartaTurno==7){
				usarCarta=7;
			}
			
		
			switch (usarCarta){
			case 1:
				finJuego=carta1.metodoGuard(usarCarta, cartaOponente1.getNumeroDeCarta(), tokenUsuario);
			break;
			case 2:
				carta2.metodoPriest(usarCarta, cartaOponente1.getNombre());
				finJuego=false;
			break;
			case 3:
				finJuego=carta3.metodoBaron(usarCarta, cartaUsuario1.getNumeroDeCarta(), cartaOponente1.getNumeroDeCarta(), tokenUsuario, tokenOponente);
			break;
			case 4:
			break;
			case 5:
				if(turno<15){
				
				String metodo= carta5.metodoPrince(usarCarta, cartaOponente1.getNumeroDeCarta());
				if (metodo=="cartaUsuario1"){
					cartaUsuario1=cartas[++turno];
				System.out.println("Tomando una nueva carta del mazo...");
				System.out.println("Su nueva carta es:"+cartaUsuario1.getNombre());
				}else if (metodo=="cartaOponente1"){
					cartaOponente1=cartas[++turno];
					System.out.println("La carta de su oponente ha sido cambiada");
				}
				}else System.out.println("Ya no hay cartas en el mazo");
				finJuego=false;
			break;
			case 6:
				Carta cartaFlotante= new Carta();
				cartaFlotante=cartaUsuario1;
				cartaUsuario1=cartaOponente1;
				cartaOponente1=cartaFlotante;
				System.out.println("Su nueva carta es: "+ cartaUsuario1.getNombre());
				finJuego=false;
			break;
			case 7:
			break;
			case 8:
				finJuego=carta8.metodoPrincess(usarCarta, tokenOponente);
				tokenOponente++;
			}
			jugador=oponente;
		}
		}
		else if (turno>=15){
			System.out.println("\n\n");
				System.out.println("Ya no hay cartas en el mazo.");
				System.out.println("Verificando cartas en mano...");
				metodoFinal(cartaUsuario1.getNumeroDeCarta(), cartaOponente1.getNumeroDeCarta(), tokenUsuario, tokenOponente);
				finJuego=true;
		}
		finJuego=false;
		}while (finJuego==false);
		noDePartida++;
		}while (tokenUsuario<TOKEN || tokenOponente<TOKEN);
	}
	public int tokens(){
		System.out.println("\n\n\n\n\n");
		System.out.println("Elija a cuantos tokens quiere jugar:");
		System.out.println("(1) Un Token");
		System.out.println("(2) Tres Tokens");
		token=teclado.nextInt();
		if (token==2)
			token=3;
		System.out.println("Su juego sera a "+token+" Tokens");
		return token;
	}
}		


