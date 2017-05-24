package vehicule;

public class VoitureSport extends Voiture {
	//propriétés
	private int nbChevaux;

	//constructeurs vide et initialisé
	public VoitureSport(){
		super();
		nbChevaux = 0;
	}
	public VoitureSport(int nbOccupants, String couleur,String energie, int vitesseMax, int nbChevaux) throws NbOccupantsException, TypeEnergieException{
		super(nbOccupants, couleur, energie, vitesseMax);
		this.nbChevaux = nbChevaux;
	}
	
	//accesseurs et mutateurs
	public int getNbChevaux(){
		return nbChevaux;
	}
	public void setNbChevaux(int nbChevaux){
		this.nbChevaux = nbChevaux;
	}
	
}
