

import java.util.*;

/**
 * CLASSE A PRODUIRE PAR LES ETUDIANTS
 * 
 * La classe Telecommande permet de manipuler une liste de Lampe. Elle sera
 * amenee a commander une liste d'appareil plus generiques par la suite.
 * 
 * on peut rajouter des get avec un entier en parametre pour permettre les tests
 * mais pas de set.
 * 
 */
public class Telecommande {

	/**
	 * la liste des lampes a controler on utilise l'interface pour masquer
	 * l'implementation a ce niveau
	 */
	private List<Appareil> apps;

	/**
	 * construit une telecommande sans lampe
	 */
	public Telecommande() {
		this.apps = new ArrayList<Appareil>();
	}



	public void ajouterAppareil(Appareil a){
		this.apps.add(a);
	}
	public void activerAppareil(int i){
		this.apps.get(i).allumer();
	}
	public void desactiverAppareil(int i){
		this.apps.get(i).eteindre();
	}

	/**
	 * permet d'activer l'ensemble des lampes
	 */
	public void activerTout() {
		for (int i = 0; i < this.apps.size(); i++)
			// reutiliser du code existant
			this.activerAppareil(i);
	}

	public List<Appareil> getAppareil(){
		return this.apps;
	}
	/**
	 * descriptif de la telecommande retourne une ligne par lampe suivi du
	 * status de la lampe.
	 */
	public String toString() {
		String descriptif = "";
		for (int i = 0; i < this.apps.size(); i++) {
			descriptif += i + "-" + this.apps.get(i) + "\n";
		}
		return (descriptif);
	}



}
