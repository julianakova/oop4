import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupService {
    private TeacherGroup teachers;
    
    public TeacherGroupService (TeacherGroup teachers) {
        this.teachers = teachers;
    }
    public TeacherGroup getTeachers() {
        return teachers;
    }
    public List<Teacher> getSortedTeacherGroup() {
        List<Teacher> teacherList = new ArrayList<>(teachers.getTeachers());
        Collections.sort(teacherList);
        return teacherList;
    }
    public List<Teacher> getSortedTeacherGroupByFio() {
        List<Teacher> teacherList = new ArrayList<>(teachers.getTeachers());
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }
}