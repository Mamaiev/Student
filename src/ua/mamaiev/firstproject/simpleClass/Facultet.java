package ua.mamaiev.firstproject.simpleClass;

public class Facultet {
	private String name;
	private Specialization specialization;
	
	public Facultet(String n, Specialization s) {
		super();
		setName(n);
		setSpecialization(s);
	}
	
	public String getName() {
		return name;
	}
	public Specialization getSpecialization() {
		return specialization;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setSpecialization(Specialization s) {
		specialization = new Specialization(s.getName());
	}
	
	@Override
	public String toString() {
		return "[" + getName() + getSpecialization() + "]";
	}
	
}
