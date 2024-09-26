package student;

/**
 * Đối tượng sinh viên.
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Lấy tên của sinh viên.
     *
     * @return tên sinh viên.
     */
    public String getName() {
        return name;
    }

    /**
     * Đặt tên cho sinh viên.
     *
     * @param name tên sinh viên.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Lấy ID của sinh viên.
     *
     * @return ID của sinh viên.
     */
    public String getId() {
        return id;
    }

    /**
     * Đặt ID cho sinh viên.
     *
     * @param id ID sinh viên.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Lấy nhóm của sinh viên.
     *
     * @return nhóm của sinh viên.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Đặt nhóm cho sinh viên.
     *
     * @param group nhóm của sinh viên.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Lấy email của sinh viên.
     *
     * @return email của sinh viên.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Đặt email cho sinh viên.
     *
     * @param email email sinh viên.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * lấy thông tin của sinh viên.
     *
     * @return chuỗi chứa thông tin của sinh viên.
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /**
     * Tạo sinh viên với thông tin mặc định.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Tạo sinh viên với tên, ID và email chỉ định.
     *
     * @param name  tên sinh viên.
     * @param id    ID sinh viên.
     * @param email email sinh viên.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Tạo đối tượng sinh viên mới từ đối tượng sinh viên đã tồn tại.
     *
     * @param student đối tượng Student cần sao chép.
     */
    public Student(Student student) {
        this.name = student.getName();
        this.id = student.getId();
        this.group = student.getGroup();
        this.email = student.getEmail();
    }
}

