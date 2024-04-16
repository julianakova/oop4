import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Stream() {
        this.groups = new ArrayList<>();
    }

    public Stream(List<StudyGroup> groups) {
        this.groups = groups;
    }

    public void add(StudyGroup group) {
        groups.add(group);
    }

    public List<StudyGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new StudyGroupIterator(this);
    }
}
