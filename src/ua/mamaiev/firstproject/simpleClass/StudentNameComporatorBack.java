package ua.mamaiev.firstproject.simpleClass;

import java.util.Comparator;

public class StudentNameComporatorBack implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg1.getName().compareTo(arg0.getName());
	}

}
