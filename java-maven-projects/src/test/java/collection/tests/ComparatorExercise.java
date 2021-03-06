package collection.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

import collections.Student;

class DescendingStudentComparator implements Comparator<Student> {
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class ComparatorExercise {
	@Test
	public void testForStudentSorting() {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(2, "Ryan"));
		students.add(new Student(1, "Tony"));
		students.add(new Student(4, "Brian"));
		students.add(new Student(3, "Alex"));

		System.out.println(students);
		Collections.sort(students, new DescendingStudentComparator());
		System.out.println(students);
	}
}
