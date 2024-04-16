public class Student extends User implements Comparable<Student> {
    private Integer studentId;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
                ", firstName=" + super.getFirstName() +
                ", secondName=" + super.getSecondName() +
                ", lastName=" + super.getLastName() +
                "]";
    }

    @Override
    public int compareTo(Student o) {
        if (o.getStudentId() > studentId) {
            return -1;
        }
        else if (o.getStudentId() < studentId) {
            return 1;
        }
        else
            return 0;
        // return studentId.compareTo(o.getStudentId());
    }
}
