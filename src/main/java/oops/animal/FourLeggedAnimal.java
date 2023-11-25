package oops.animal;

public interface FourLeggedAnimal extends LiveUntilDeath {
	
	boolean isFourLegged = true;
	
	void runWithFourLegs();
	
	default void sitsWithLegsStretched() {
		System.out.println("Sits with the legs stretched");
	}
	
}
