public class StudyGroup implements Comparable<StudyGroup> {
    private Integer groupId;
    private String numberGroup;
    private String groupShortName;
    private String groupName;

    public StudyGroup(Integer groupID, String numberGroup, String groupShortName, String groupName) {
        this.groupId = groupID;
        this.numberGroup = numberGroup;
        this.groupShortName = groupShortName;
        this.groupName = groupName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getNumberGroup() {
        return numberGroup;
    }

    public String getGroupShortName() {
        return groupShortName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "StudyGroup [groupId=" + groupId +
                ", numberGroup=" + numberGroup +
                ", groupShortName=" + groupShortName +
                ", groupName=" + groupName +
                "]";
    }

    @Override
    public int compareTo(StudyGroup o) {
        return groupId.compareTo(o.getGroupId());
    }
}
