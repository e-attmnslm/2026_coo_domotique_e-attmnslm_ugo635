import thermos.Thermostat;

public class MainT {
    public static void main(String[] args) {
        Telecommande t = new Telecommande();

        t.ajouterAppareil(new Lampe("lampe"));
        t.ajouterAppareil(new AdapteurTermostat(new Thermostat()));
        t.ajouterAppareil(new AdapteurCheminee(new Cheminee()));
        t.ajouterAppareil(new Hifi());ut


        TelecommandeGraphique g = new TelecommandeGraphique(t);

    }
}
