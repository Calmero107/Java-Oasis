package student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
	private Student[] students;

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student newStudent) {
		Student[] newStudents = new Student[students.length + 1];
		System.arraycopy(students, 0, newStudents, 0, students.length);
		newStudents[students.length] = newStudent;
		setStudents(newStudents);
	}

	public static boolean sameGroup(Student s1, Student s2) {
		return s1.getGroup().equals(s2.getGroup());
	}

	public String studentsByGroup() {
		String studentsByGroup = "";
		for (int i = 0; i < students.length; i++) {
			studentsByGroup += students[i].getInfo() + "\n";
		}
		return studentsByGroup;
	}

	public void removeStudent(String id) {
		int indexOfStudent = -1;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getId().equals(id)) {
//				indexOfStudent =
			}
		}
		Student[] newStudents = new Student[students.length];
	}

	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();
		student2.setGroup("asds");
		System.out.println(student.getInfo());
		System.out.println(sameGroup(student, student2));

		Student[] students = { student };
//		students[0] = null;
		System.out.println(students);
		System.out.println(students.length);
	}
}
