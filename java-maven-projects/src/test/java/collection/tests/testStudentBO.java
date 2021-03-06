package collection.tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import collections.StudentBO;

public class testStudentBO {

	@Test
	public void testStudentMapSize() {
		StudentBO studentBO = new StudentBO();
		studentBO.addStudentDetails("1000", 'A');
		studentBO.addStudentDetails("1001", 'B');
		studentBO.addStudentDetails("1002", 'C');
		studentBO.addStudentDetails("1003", 'A');
		studentBO.addStudentDetails("1004", 'C');
		studentBO.addStudentDetails("1005", 'A');
		studentBO.addStudentDetails("1006", 'A');

		assertEquals("Size of Grade 'A'", studentBO.findCountOfStudents('A'), 4);
		assertEquals("Size of Grade 'B'", studentBO.findCountOfStudents('B'), 1);
		assertEquals("Size of Grade 'C'", studentBO.findCountOfStudents('C'), 2);
		assertEquals("Size of Grade 'D'", studentBO.findCountOfStudents('D'), 0);
	}
}
