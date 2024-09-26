package student;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Quản lý sinh viên.
 */
public class StudentManagement {
    private Student[] students;
    private int count;

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

    public StudentManagement() {
        this.students = new Student[100];
        this.count = 0;
    }

    /**
     * Thêm một sinh viên mới.
     *
     * @param newStudent đối tượng Student cần thêm.
     */
    public void addStudent(Student newStudent) {
        if (count >= 100) {
            return;
        }
        students[count] = newStudent;
        count++;
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
        for (int i = 0; i < count; i++) {
            if (!studentsByGroup.containsKey(students[i].getGroup())) {
                studentsByGroup.put(students[i].getGroup(), new StringBuilder());
            }
            studentsByGroup.get(students[i].getGroup()).append(students[i].getInfo()).append("\n");
        }

        for (Map.Entry<String, StringBuilder> entry : studentsByGroup.entrySet()) {
            studentsInfoByGroup.append(entry.getKey()).append("\n");
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
        int indexOfStudent = -1;
        for (int i = 0; i < count; i++) {
            if (id.equals(students[i].getId())) {
                indexOfStudent = i;
                break;
            }
        }

        if (indexOfStudent != -1) {
            count--;
            Student[] newStudents = new Student[100];
            System.arraycopy(students, 0, newStudents, 0, indexOfStudent);
            System.arraycopy(students, indexOfStudent + 1, newStudents, indexOfStudent,
                    count - indexOfStudent);
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

        studentManagement.removeStudent("4");
        studentManagement.removeStudent("1");

        System.out.println(studentManagement.studentsByGroup());

    }
}

