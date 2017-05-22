package application;

import vehicule.Voiture;

public class Test {

	public static void main(String[] args) {
		Voiture voiture = new Voiture();
		Voiture voiture2 = new Voiture(6, "Jaune", "diesel", 75);
	
		Voiture voiture3 = new Voiture(4, "Bleu","Essence",170);
		System.out.println(voiture3.vitesseMax);
		voiture3.vitesseMax =150;
		System.out.println(voiture3.vitesseMax);
		
	}

}
