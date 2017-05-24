package vehicule;

public class Voiture {
	//propriétés
	private int nbOccupants;
	private String couleur;
	private String energie;
	private int vitesseMax;
	private String typeTransport;
	private int nbInstances;
	private static int nbInstancesClasse;
//	public int nbOccupants;
//	public String couleur;
//	public String energie;
//	public int vitesseMax;
	
	//constructeurs vide et initialisé
	public Voiture(){
		System.out.println("La création d'une voiture");
		nbInstances++;
		nbInstancesClasse++;
		nbOccupants = 0;
		couleur = "";
		energie = "";
		vitesseMax = 0;
		this.setTypeTransport();
		
	}
	public Voiture(int nbOccupants, String couleur,String energie, int vitesseMax) throws NbOccupantsException, TypeEnergieException{
		if(nbOccupants<0){
			//throw new NbOccupantsException();
			throw new NbOccupantsException(this.nbOccupants);}
			
		if(this.energie != "Essence" && this.energie!= "Diesel" && this.energie != "Petrol"){
			throw new TypeEnergieException(this.energie);
		}else{
		System.out.println("Création vehicule initialisé");
		
		System.out.println("la création d'une voiture initialisée");
		nbInstances++;
		nbInstancesClasse++;
		this.nbOccupants = nbOccupants;
		this.couleur = couleur;
		this.energie = energie;
		this.vitesseMax = vitesseMax;
		this.setTypeTransport();
		}
	}
	
//	accesseur et mutateur
		public int getNbInstances(){
			return nbInstances;
		}
		
		public int getNbInstancesClasse(){
				return nbInstancesClasse;
		}
	
	
		public int getNbOccupants(){
			return nbOccupants;
		}
		public String getCouleur(){
			return couleur;
		}
		public String getEnergie(){
			return energie;
		}
		public int getVitesseMax(){
			return vitesseMax;
		}
		public String getTypeTransport(){
			return typeTransport;
		}
		public void setNbOccupants(int nbOccupants){
			this.nbOccupants = nbOccupants;
		}
		public void setCouleur(String couleur){
			this.couleur= couleur;
		}
		public void setEnergie(String energie){
			this.energie = energie;
		}
		public void setVitesseMax(int vitesseMax){
			this.vitesseMax=vitesseMax;
		}
		public void setTypeTransport(){
			if(this.nbOccupants < 6){
				this.typeTransport = "Particulier";
			}else{
				this.typeTransport = "En commun";
			}
		}
	
      //méthodes
		public String description(){
			String str = "Je suis une voiture pour "+this.getNbOccupants()+" personnes, de couleur "+this.getCouleur()+" Qui roule au "+this.getEnergie()+" a "+this.getVitesseMax()+" Km/h";
			return str;
		}
		
		public String avancer(){
			return "J'avance cool";
		}
		
		public boolean plusRapide(Voiture v1){
		boolean voitPlusRapide;
		if(v1.getVitesseMax() > this.getVitesseMax()){
			voitPlusRapide = false;
		}else{
			voitPlusRapide = true;}
			return voitPlusRapide;
		}
}
