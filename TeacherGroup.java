import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teachers;

    public TeacherGroup() {
        this.teachers = new ArrayList<>();
    }

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }
}