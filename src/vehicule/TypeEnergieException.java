package vehicule;

public class TypeEnergieException extends Exception{
public TypeEnergieException(){
	System.out.println("Instanciation de Vehicule avec energie inconnue:");
}
public TypeEnergieException(String typeEnergie){
	System.out.println("Instanciation de Vehicule avec energie inconnue:"+typeEnergie);
}
	
	
}
