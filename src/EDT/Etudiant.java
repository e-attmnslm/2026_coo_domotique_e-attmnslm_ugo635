package EDT;

public class Etudiant extends Personne {
    private Groupe groupe;

    public Etudiant(String nom, String prenom, Groupe groupe) {
        this.nom = nom;
        this.prenom = prenom;
        this.groupe = groupe;
    }
}
