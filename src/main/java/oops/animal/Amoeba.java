package oops.animal;

public class Amoeba extends Animal{

	public Amoeba(String scientificName) {
		super(scientificName, AnimalType.SINGLE_CELLED);
	}

	public String transform() {
		System.out.println("transform to new shape");
		return "success";
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}

}
