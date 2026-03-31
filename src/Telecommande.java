import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes;

    public Telecommande(){
        this.lampes = new ArrayList<>(50);
    }
    public void ajouterLampe(Lampe l){
        this.lampes.add(l);

    }
    public void activerLampe(int indiceLampe){
        this.lampes.get(indiceLampe).allumer();
    }
    public void desactiverLampe(int indiceLampe){
        this.lampes.get(indiceLampe).eteindre();
    }
    public void  activerTout(){
        for(int i=0 ; i<this.lampes.size();i++){
            this.lampes.get(i).allumer();
        }

    }
    public Lampe getLampe(int indiceLampe){
        return this.lampes.get(indiceLampe);
    }
    public String toString(){
        String aff="";
        for(int i=0 ; i<this.lampes.size();i++){
            aff+= this.lampes.get(i).toString()+"\n";
        }
        return aff;

    }
}
