package oops.animal;

public class WildAnimal extends Animal {

	public WildAnimal(String biologicalName) {
		super(biologicalName);
	}

	public void killPrey(Animal prey) {
		System.out.println(this.getClass() + " killed " + prey.getClass());
	}
}
