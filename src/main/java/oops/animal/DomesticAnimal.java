package oops.animal;

public class DomesticAnimal extends Animal {

	private String petName;

	public DomesticAnimal(String biologicalName, String petName) {
		super(biologicalName);
		this.petName = petName;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public void stayInHouse() {
		System.out.println("Staying in house");
	}

}
