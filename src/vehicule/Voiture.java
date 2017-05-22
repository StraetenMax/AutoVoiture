package vehicule;

public class Voiture {
	//propriétés
//	private int nbOccupants;
//	private String couleur;
//	private String energie;
//	private int vitesseMax;
	public int nbOccupants;
	public String couleur;
	public String energie;
	public int vitesseMax;
	
	//constructeurs vide et initialisé
	public Voiture(){
		System.out.println("La création d'une voiture");
		nbOccupants = 0;
		couleur = "";
		energie = "";
		vitesseMax = 0;
	}
	public Voiture(int nbOccupants, String couleur,String energie, int vitesseMax){
		System.out.println("la création d'une voiture initialisée");
		this.nbOccupants = nbOccupants;
		this.couleur = couleur;
		this.energie = energie;
		this.vitesseMax = vitesseMax;
	}
	

}
