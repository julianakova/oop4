import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private List<Teacher> teachers;
    private int counter;
    
    public TeacherGroupIterator(TeacherGroup teachers) {
        this.teachers = teachers.getTeachers();
        counter = 0;
    }
    @Override
    public boolean hasNext() {
        return counter < teachers.size();
    }
    @Override
    public Teacher next() {
        if (hasNext()) {
            return teachers.get(counter++);
        }
        return null;
    }
    @Override
    public void remove() {
        Iterator.super.remove();
    }
}