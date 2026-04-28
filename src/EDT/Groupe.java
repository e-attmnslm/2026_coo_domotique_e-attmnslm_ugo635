package EDT;

import java.util.ArrayList;
import java.util.List;

public class Groupe {
    private List<Etudiant> groupe;

    public Groupe() {
        this.groupe = new ArrayList<>();
    }

    public void ajouter(Etudiant etudiant) {
        this.groupe.add(etudiant);
    }

    public List<Etudiant> getGroupe() {
        return groupe;
    }
}
