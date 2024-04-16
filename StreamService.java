import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream groups;

    public StreamService(Stream groups) {
        this.groups = groups;
    }

    public Stream getGroups() {
        return groups;
    }

    public List<StudyGroup> getSorteStudyGroups() {
        List<StudyGroup> groupList = new ArrayList<>(groups.getGroups());
        Collections.sort(groupList);
        return groupList;
    }

    public List<StudyGroup> getSorteStudyGroupsByCompa() {
        List<StudyGroup> groupList = new ArrayList<>(groups.getGroups());
        groupList.sort(new StreamComparator());
        return groupList;
    }
}
