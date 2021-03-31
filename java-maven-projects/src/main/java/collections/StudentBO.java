package collections;

import java.util.HashMap;
import java.util.Set;

public class StudentBO {
	HashMap<String, Character> studentMap = new HashMap<String, Character>();

	public StudentBO() {

	}

	public void addStudentDetails(String rollNo, char grade) {
		studentMap.put(rollNo, grade);
	}

	public int findCountOfStudents(char grade) {
		Set<String> keys = studentMap.keySet();
		int count = 0;
		for (String key : keys) {
			if (studentMap.get(key) == grade)
				count++;
		}
		return count;
	}
}
