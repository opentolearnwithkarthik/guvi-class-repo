package collection.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import oops.animal.Animal;
import oops.animal.Cat;
import oops.animal.Dog;
import oops.animal.Tiger;
import other.pack.ListOfAnimals;

public class CollectionMain {

	public static void main(String[] args) {
		int[] intArray = { 2, 4, 6, 21, 3, 67, 89 }; // add 100
		Integer[] integerArray = { 54, 2, 864, 3, 5, 484, 9 };
		String[] stringArray = { "Jana", "Praba", "Vinetha", "Latha" };
		char[] charArray = { 'r', 'a', 'm', 'u' };
		Character[] test = new Character[6];
		Animal[] animals = { new Dog(null, null), new Cat(null, null) };
//		System.out.println(intArray);

//		intArray[7] = 100;
//		System.out.println(intArray[7]);
		int[] intSizeDefinedArray = new int[100];
		for (int i = 0; i < intArray.length; i++) {
			intSizeDefinedArray[i] = intArray[i];
		}
		intSizeDefinedArray[7] = 100;
		intSizeDefinedArray[8] = 200;
		intSizeDefinedArray[9] = 500;
		System.out.println(intSizeDefinedArray[7]);
//		System.out.println(intSizeDefinedArray);

		ArrayList<Integer> myListVariable = new ArrayList<Integer>();
		LinkedList<Integer> myLinkedListVariable = new LinkedList<Integer>();
//		List myVariable = new ArrayList();
		System.out.println(myListVariable);
		myListVariable.add(100);
		myListVariable.add(100);
		myListVariable.add(100);
		myListVariable.add(100);
		myListVariable.add(200);
		myListVariable.add(500);
		System.out.println(myListVariable);
//		System.out.println(myVariable);
//		myVariable.add("karthik");
//		myVariable.add("guvi");
//		myVariable.add(1);
//		myVariable.add(50.3);
//		String value = myVariable.get(3)
//		System.out.println(myVariable);

		ListOfAnimals myAnimalsList = new ListOfAnimals();
		myAnimalsList.add(new Dog("asd", "Jimmy"));
		myAnimalsList.add(new Dog("asd", "Jimmy"));
		myAnimalsList.add(new Dog("asd", "Jimmy"));
		myAnimalsList.add(new Dog("asd", "Jimmy"));
		myAnimalsList.add(new Tiger("asdasd"));
		myAnimalsList.add(new Cat("asd", "asdasd"));
		myAnimalsList.gatherForOccasion();
		System.out.println(myAnimalsList.get(0));

		List<Integer> arrayList = new ArrayList<Integer>();
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		System.out.println((System.currentTimeMillis() - start1));
		Vector<Integer> vector = new Vector<Integer>();
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			vector.add(i);
		}
		System.out.println((System.currentTimeMillis() - start2));

		System.out.println("*******************");

		Stack<Integer> stack = new Stack<>();
		stack.add(5);
		stack.add(234);
		stack.add(546);
		stack.add(78);
		stack.add(43);
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.push(500));
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println("*******************");
		Dog d1 = new Dog("Jimmy", "Doggie2");
		Dog d2 = new Dog("Jimmy", "Doggie");
		System.out.println(d1.equals(d2));
		System.out.println("*******************");
		String attendees = "Attendees : \r\n" + "\r\n" + "Latha\r\n" + "//Nithya\r\n" + "Ramu Pandiyan\r\n"
				+ "Prabhakaran\r\n" + "//Sivachandran\r\n" + "Vinetha\r\n" + "Janarthanan";

		System.out.println(attendees);
		System.out.println(attendees.hashCode());
		Integer a = 564654;
		System.out.println(a.hashCode());

		Dog jimmy1 = new Dog("abc", "Jimmy");
		jimmy1.setFurColour("brown");
		Dog jimmy2 = new Dog("abc", "Jimmy");
		jimmy2.setFurColour("white");
		HashSet<Dog> dogs = new LinkedHashSet<>();
		dogs.add(jimmy1);
		dogs.add(new Dog("abc", "Tommy"));
		dogs.add(new Dog("abc", "Mani"));
		dogs.add(new Dog("abc", "Bob"));
		dogs.add(new Dog("abc", "Timmi"));
//		if(!dogs.contains(jimmy2)) {
		dogs.add(jimmy2);
//		}
		System.out.println(dogs);
		System.out.println(dogs.contains(new Dog("abc", "Mani")));

		HashMap<Dog, Integer> dogCostMap = new HashMap<>();
		dogCostMap.put(jimmy1, 1000);
		dogCostMap.put(jimmy2, 5000);
		System.out.println(dogCostMap);

		HashSet<Dog> dogSet = new HashSet<>();
		dogSet.add(jimmy1);
		dogSet.add(jimmy2);
		System.out.println(dogSet);
//
//		ArrayList<Dog> dogsList = new ArrayList<>();
//		dogsList.add(jimmy1);
//		dogsList.add(new Dog("abc", "Tommy"));
//		dogsList.add(new Dog("abc", "Mani"));
//		dogsList.add(new Dog("abc", "Bob"));
//		dogsList.add(new Dog("abc", "Timmi"));
//		dogsList.add(jimmy2);
//		System.out.println(dogsList);

		System.out.println("*******************");
		System.out.println(dogs);
		for (Dog each : dogs) {
			if ("Jimmy".equals(each.getPetName())) {
				System.out.println(each.getFurColour());
			}
		}

		TreeSet<Integer> integersTreeSet = new TreeSet<>();
		integersTreeSet.add(50);
		integersTreeSet.add(4);
		integersTreeSet.add(60);
		integersTreeSet.add(90);
		integersTreeSet.add(50);
		integersTreeSet.add(10);
		integersTreeSet.add(20);
		System.out.println(integersTreeSet);
		
		HashMap<Dog,Integer> dogPriceMap = new HashMap<>();
		dogPriceMap.put(jimmy1, 1000);
		dogPriceMap.put(new Dog("abc", "Tommy"), 2000);
		dogPriceMap.put(new Dog("abc", "Mani"), 4000);
		dogPriceMap.put(new Dog("abc", "Bob"), 2000);
		dogPriceMap.put(new Dog("abc", "Timmi"), 10000);
		dogPriceMap.put(jimmy1, 3000);
		System.out.println(dogPriceMap);
		dogPriceMap.get(jimmy2);
		Set<Entry<Dog,Integer>> entrySet = dogPriceMap.entrySet();
		for(Entry<Dog,Integer> entry : entrySet) {
			
		}
	}
}
