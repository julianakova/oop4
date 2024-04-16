public class Teacher extends User implements Comparable<Teacher> {
    private Integer teacherId;
    public Teacher(Integer teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }
    public Integer getTeacherId() {
        return teacherId;
    }
    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId +
                ", getFirstName()=" + super.getFirstName() +
                ", getSecondName()=" + super.getSecondName() +
                ", getLastName()=" + super.getLastName() +
                "]";
    }
    @Override
    public int compareTo(Teacher o) {
        return teacherId.compareTo(o.getTeacherId());
    }
}