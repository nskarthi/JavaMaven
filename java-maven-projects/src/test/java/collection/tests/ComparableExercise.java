package collection.tests;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import collections.Student;

public class ComparableExercise {
	@Test
	public void testForStudentSorting() {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(2, "Ryan"));
		students.add(new Student(1, "Tony"));
		students.add(new Student(4, "Brian"));
		students.add(new Student(3, "Alex"));

		System.out.println(students);

		Collections.sort(students);
		System.out.println(students);
	}
}
