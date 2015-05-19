package ua.mamaiev.firstproject.simpleClass;

import java.util.Arrays;

public class StudentTest {
	public static void main(String[] args) {
		
		Student[] array = {new Student("student1", new University("univer1", "address1", new Facultet("facultet1", new Specialization("specialization1"))), 1999),
				new Student("student453", new University("univer2", "address3", new Facultet("facultet43", new Specialization("specialization423"))), 25552),
				new Student("student777", new University("univer3", "address2", new Facultet("facultet32", new Specialization("specialization2342"))), 5252),
				new Student("student4", new University("univer4", "address6", new Facultet("facultet532", new Specialization("specialization2342"))), 5256)};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		Arrays.sort(array, new StudentNameComporator());
		
		for (Student student : array) {
			System.out.println(student);}
			System.out.println();
			
			Arrays.sort(array, new StudentNameComporatorBack());
			
		for (Student student : array) {
				System.out.println(student);
			
		}
	}
	}
