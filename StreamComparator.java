import java.util.Comparator;

public class StreamComparator implements Comparator<StudyGroup> {

    @Override
    public int compare(StudyGroup o1, StudyGroup o2) {
        int resultOfComparing = o1.getNumberGroup().compareTo(o2.getNumberGroup());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getGroupShortName().compareTo(o2.getGroupShortName());
            if (resultOfComparing == 0) {
                return o1.getGroupName().compareTo(o2.getGroupName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }

}
