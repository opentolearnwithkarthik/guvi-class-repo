package other.pack;

import java.util.LinkedList;
import java.util.stream.Collectors;

import oops.animal.Animal;

public class ListOfAnimals extends LinkedList<Animal> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8684864223422185667L;

	public void gatherForOccasion() {
		System.out.println(this + "has gathered for an occasion");
	}

	@Override
	public String toString() {
		return this.stream().collect(Collectors.toList()).toString();
	}
	
	

}
