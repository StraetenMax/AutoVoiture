package application;

import vehicule.NbOccupantsException;
import vehicule.TypeEnergieException;
import vehicule.Voiture;

public class Test {

	public static void main(String[] args) {
		Voiture V1 = null;
		try{
		Voiture voiture = new Voiture();
		Voiture voiture2 = new Voiture(6, "Jaune", "diesel", 75);
		V1 = new Voiture(-5,"Bleu","Essence",180);
		
		Voiture voiture3 = new Voiture(4, "Bleu","Essence",170);}
		catch(NbOccupantsException Exc1){
			
		}
		catch (TypeEnergieException Exc2){
			
		}
		finally{
			if(V1 == null){
				V1 = new Voiture();
			}
		}
		V1.avancer();
		/*System.out.println(voiture3.vitesseMax);
		voiture3.vitesseMax =150;
		System.out.println(voiture3.vitesseMax);*/
		//System.out.println(voiture3.getVitesseMax());
		//voiture3.setVitesseMax(150);
		//System.out.println(voiture3.getVitesseMax());
		
		//Voiture V = new Voiture(4, "Bleu", "Essence", 170);
		//Voiture V3 = new Voiture(6,"Marron","Electrique", 50);
		//Voiture V2 = new Voiture(40, "Rouge", "Diesel", 100);
		//System.out.println(V.plusRapide(V2));
		//System.out.println(V3.plusRapide(V2));
		//System.out.println(V.plusRapide(V3));
		
	}

}
