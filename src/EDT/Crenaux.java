package EDT;

import java.util.Date;
import java.util.List;

public record Crenaux(
        Matiere matiere,
        List<Etudiant> groupeEtudiant,
        Salle salle,
        Date date
) {}
