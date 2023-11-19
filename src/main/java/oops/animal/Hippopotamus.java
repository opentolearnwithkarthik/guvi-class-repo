package oops.animal;

public class Hippopotamus extends WildAnimal {

	public Hippopotamus(String biologicalName) {
		super(biologicalName);
	}

	@Override
	public void makeSound() {
		System.out.println("Yawn");
	}

}
