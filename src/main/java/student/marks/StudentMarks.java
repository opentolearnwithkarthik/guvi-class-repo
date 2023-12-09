package student.marks;

public class StudentMarks {

	private int id;
	private String name;
	private int english;
	private int tamil;
	private int maths;
	private int physics;
	private int chemistry;
	private int computerScience;

	public StudentMarks(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getTamil() {
		return tamil;
	}

	public void setTamil(int tamil) {
		this.tamil = tamil;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getComputerScience() {
		return computerScience;
	}

	public void setComputerScience(int computerScience) {
		this.computerScience = computerScience;
	}
	
}
