package oops.animal;

public class Hippopotamus extends WildAnimal implements FourLeggedAnimal {

	public Hippopotamus(String biologicalName) {
		super(biologicalName);
	}

	@Override
	public void makeSound() {
		System.out.println("Yawn");
	}

	@Override
	public void runWithFourLegs() {
		// TODO Auto-generated method stub
		
	}

}
