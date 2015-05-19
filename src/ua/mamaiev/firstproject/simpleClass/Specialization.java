package ua.mamaiev.firstproject.simpleClass;

public class Specialization {
	private String name;
	
	public Specialization(String n) {
		super();
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	
	@Override
	public String toString() {
		return "[" + getName() + "]";
	}
	
}
