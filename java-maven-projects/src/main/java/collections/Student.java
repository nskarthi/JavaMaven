package collections;

public class Student implements Comparable<Student> {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return id + " : " + name;
	}

	public int compareTo(Student that) {
		return Integer.compare(that.id, that.id);
	}

}
