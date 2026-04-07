public class AdapteurCheminee implements Appareil {
    private Cheminee cheminee;

    public AdapteurCheminee(Cheminee c) {
        this.cheminee = c;
    }

    public void allumer() {
        cheminee.changerIntensite(this.cheminee.getLumiere() + 10);
    }

    public void eteindre() {
        cheminee.changerIntensite(0);
    }

    public String toString() {
        return cheminee.toString();
    }
}
