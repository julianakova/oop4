import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<StudyGroup> {
    private List<StudyGroup> groups;
    private int counter;
    
    public StudyGroupIterator(Stream groups) {
        this.groups = groups.getGroups();
        counter = 0;
    }    
    @Override
    public boolean hasNext() {
        return counter < groups.size();
    }
    @Override
    public StudyGroup next() {
        if (hasNext()) {
            return groups.get(counter++);
        }
        return null;
    }
    @Override
    public void remove() {
        if (hasNext()) {
            groups.remove(counter);
        }
    }
}
