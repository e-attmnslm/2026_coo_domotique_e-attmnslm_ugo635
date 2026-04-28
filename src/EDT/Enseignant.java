package EDT;

import java.util.List;

public class Enseignant extends Personne {
    private List<Matiere> matiere;

    public Enseignant(String nom, String prenom, List<Matiere> matiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.matiere = matiere;
    }

    public List<Matiere> getMatiere() {
        return matiere;
    }
}
