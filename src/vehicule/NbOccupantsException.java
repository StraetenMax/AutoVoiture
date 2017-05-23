package vehicule;

public class NbOccupantsException extends Exception {
		public NbOccupantsException(){
			System.out.println("Instanciation de Vehicule avec nbOcupants negatif");
		}
		/*public NbOccupantsException(int nbOccupants){
			System.out.println(""+nbOccupants);
		}*/
}
