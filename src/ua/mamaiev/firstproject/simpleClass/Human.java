package ua.mamaiev.firstproject.simpleClass;

public abstract class Human {
	private String name;
	private int year;
	
	
	public Human(String n, int y) {
		super();
		setName(n);
		setYear(y);
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public void setName(String n) {
		name = n;
	}
	public void setYear(int y) {
		year = y;
	}
	
	
}
