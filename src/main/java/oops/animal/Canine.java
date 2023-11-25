package oops.animal;

public interface Canine extends FourLeggedAnimal{
	
	boolean hasSharpTeeth = true;

	void howl();

	default void bigTooth() {
		System.out.println("Has big tooth");
	}

}
