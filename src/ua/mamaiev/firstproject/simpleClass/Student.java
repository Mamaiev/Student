package ua.mamaiev.firstproject.simpleClass;

public class Student extends Human{
	private University university;
	
	public Student(String n, University u, int y) {
		super(n, y);
		setUniversity(u);
	
	}
	
	public University getUniversity() {
		return university;
	}
	
	public void setUniversity(University u) {
		university = new University(u.getName(), u.getAddress(), u.getFacultet());
	}
	
	@Override
	public String toString() {
		return "[" + getName() + "_" + getYear() +  "_" + getUniversity() + "]";
	}

	
}
