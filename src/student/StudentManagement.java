package student;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quản lý sinh viên.
 */
public class StudentManagement {
	private Student[] students;

	/**
	 * Lấy danh sách sinh viên.
	 *
	 * @return một mảng chứa các đối tượng Student.
	 */
	public Student[] getStudents() {
		return students;
	}

	/**
	 * Cài đặt danh sách sinh viên.
	 *
	 * @param students một ArrayList chứa các đối tượng Student để thiết lập.
	 */
	public void setStudents(Student[] students) {
		this.students = students;
	}

	/**
	 * Thêm một sinh viên mới.
	 *
	 * @param newStudent đối tượng Student cần thêm.
	 */
	public void addStudent(Student newStudent) {
		if (students == null) {
			students = new Student[0];
		}
		Student[] newStudents = new Student[students.length + 1];
		System.arraycopy(students, 0, newStudents, 0, students.length);
		newStudents[students.length] = newStudent;
		setStudents(newStudents);
	}

	/**
	 * Kiểm tra xem hai sinh viên có thuộc cùng một nhóm hay không.
	 *
	 * @param s1 sinh viên 1 .
	 * @param s2 sinh viên 2.
	 * @return true nếu cả hai sinh viên thuộc cùng một nhóm, ngược lại false.
	 */
	public static boolean sameGroup(Student s1, Student s2) {
		return s1.getGroup().equals(s2.getGroup());
	}

	/**
	 * Thông tin sinh viên theo nhóm.
	 *
	 * @return thông tin sinh viên theo nhóm tương ứng.
	 */
	public String studentsByGroup() {
		StringBuilder studentsInfoByGroup = new StringBuilder();
		Map<String, StringBuilder> studentsByGroup = new LinkedHashMap<>();
		for (Student student : students) {
			if (!studentsByGroup.containsKey(student.getGroup())) {
				studentsByGroup.put(student.getGroup(), new StringBuilder());
			}
			studentsByGroup.get(student.getGroup()).append(student.getInfo()).append("\n");
		}

		for (Map.Entry<String, StringBuilder> entry : studentsByGroup.entrySet()) {
			studentsInfoByGroup.append(entry.getKey() + "\n");
			studentsInfoByGroup.append(entry.getValue());

		}
		return studentsInfoByGroup.toString();
	}

	/**
	 * Xóa sinh viên theo ID.
	 *
	 * @param id ID của sinh viên cần xóa.
	 */
	public void removeStudent(String id) {
		if (students == null) {
			return;
		}

		int indexOfStudent = -1;
		for (int i = 0; i < students.length; i++) {
			System.out.println(students.length);
			if (id.equals(students[i].getId())) {
				indexOfStudent = i;
				break;
			}
		}

		if (indexOfStudent != -1) {
			Student[] newStudents = new Student[students.length - 1];
			System.arraycopy(students, 0, newStudents, 0, indexOfStudent);
			System.arraycopy(students, indexOfStudent + 1, newStudents, indexOfStudent,
					newStudents.length - indexOfStudent);
			students = newStudents;
		}
	}

	public static void main(String[] args) {
		Student student1 = new Student("A", "1", "1@email.com");
		Student student2 = new Student("B", "2", "1@email.com");
		Student student3 = new Student("C", "3", "1@email.com");
		Student student4 = new Student("D", "4", "1@email.com");

		student1.setGroup("K62CC");
		student2.setGroup("K62CC");

		StudentManagement studentManagement = new StudentManagement();
		studentManagement.addStudent(student1);
		studentManagement.addStudent(student2);
		studentManagement.addStudent(student3);
		studentManagement.addStudent(student4);

		studentManagement.removeStudent("1");

		System.out.println(studentManagement.studentsByGroup());

	}
}

