package oops.animal;

public abstract class WildAnimal extends Animal {

	public WildAnimal(String biologicalName) {
		super(biologicalName, AnimalType.MULTI_CELLED);
	}

	public void killPrey(Animal prey) {
		System.out.println(this.getClass() + " killed " + prey.getClass());
	}
}
