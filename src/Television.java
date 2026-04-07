public class Television implements Appareil {
    private String nom;
    private int son = 0;

    public Television(String nom) {
        this.nom = nom;
    }

    public void allumer() {
        this.son += 10;
        if (this.son > 100) this.son = 100;
    }

    public void eteindre() {
        this.son = 0;
    }

    public String toString() {
        return "Television: " + son;
    }

}
