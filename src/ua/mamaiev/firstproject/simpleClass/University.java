package ua.mamaiev.firstproject.simpleClass;

public class University {
	private String name;
	private String address;
	private Facultet facultet;
	
	public University(String n, String a, Facultet f) {
		super();
		setName(n);
		setAddress(a);
		setFacultet(f);
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Facultet getFacultet() {
		return facultet;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAddress(String a) {
		address = a;
	}
	public void setFacultet(Facultet f) {
		facultet = new Facultet(f.getName(), f.getSpecialization());
	}
	
	@Override
	public String toString() {
		return "[" +getName() + getAddress() + getFacultet().toString() + "]";
	}
	
	
}
