
public class Main {

	public static void main(String[] args) {
		Telecommande t=new Telecommande();
		
		
		Lampe l1 = new Lampe("Lampe1");
		Hifi h1 = new Hifi();
		AdapteurCheminee ac = new AdapteurCheminee(new Cheminee());
		t.ajouterAppareil(l1);
		t.ajouterAppareil(h1);
		t.ajouterAppareil(ac);
		/****** A COMPLETER ******/
		// TODO
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		
	}
	
}
