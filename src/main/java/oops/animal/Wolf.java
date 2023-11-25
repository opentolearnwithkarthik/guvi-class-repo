package oops.animal;

public class Wolf extends WildAnimal implements Canine {

	public Wolf() {
		super("biological name of wolf");
	}

	@Override
	public void howl() {
		System.out.println("Wolf is howling");
	}

	@Override
	public void makeSound() {
		System.out.println("Wolf is roaring");

	}

	@Override
	public void runWithFourLegs() {
		System.out.println("Running with four legs");
	}

}
