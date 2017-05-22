package vehicule;

public class Voiture {
	//propriétés
	int nbOccupants;
	String couleur;
	String energie;
	int vitesseMax;
	
	//constructeurs vide et initialisé
	public Voiture(){
		System.out.println("Je suis le constructeur vide");
		nbOccupants = 0;
		couleur = "";
		energie = "";
		vitesseMax = 0;
	}
	/*public Voiture(int nbOccupants, String couleur,String energie, int vitesseMax){
		this.nbOccupants = nbOccupants;
		this.couleur = couleur;
		this.energie = energie;
		this.vitesseMax = vitesseMax;
	}*/
	

}
