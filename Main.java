/*
### Домашнее задание

- Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
- Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
- В Main протестировать.
*/

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Artem", "Vladimirovich", "Mordvinov");
        Teacher teacher2 = new Teacher(2, "Stepan", "Artemovich", "Mordvinov");
        Teacher teacher3 = new Teacher(3, "Kirill", "SecondName", "Moiseev");
        TeacherGroup teacherGroup = new TeacherGroup();
        teacherGroup.add(teacher3);
        teacherGroup.add(teacher1);
        teacherGroup.add(teacher2);

        TeacherGroupService service = new TeacherGroupService(teacherGroup);
        for (Teacher teacher : teacherGroup) {
            System.out.println(teacher);
        }
        System.out.println();
        for (Teacher teacher : service.getSortedTeacherGroup()) {
            System.out.println(teacher);
        }
        System.out.println();
        for (Teacher teacher : service.getSortedTeacherGroupByFio()) {
            System.out.println(teacher);
        }

        /*StudyGroup group1 = new StudyGroup(1, "ВИЭ-101", "ВИЭ", "Возобновляемые источники энергии");
        StudyGroup group2 = new StudyGroup(2, "ВИЭ-501", "ВИЭ", "Возобновляемые источники энергии");
        StudyGroup group3 = new StudyGroup(3, "ТСК-101", "ТСК", "Технология строительных конструкций");
        StudyGroup group4 = new StudyGroup(4, "ТСК-501", "ТСК", "Технология строительных конструкций");
        StudyGroup group5 = new StudyGroup(5, "ПГС-101", "ПГС", "Промышленно-гражданское строительство");
        StudyGroup group6 = new StudyGroup(6, "ПГС-501", "ПГС", "Промышленно-гражданское строительство");
        Stream stream = new Stream();
        stream.add(group6);
        stream.add(group5);
        stream.add(group4);
        stream.add(group3);
        stream.add(group2);
        stream.add(group1);
        Stream stream1 = new Stream();
        stream1.add(group6);
        stream1.add(group5);
        Stream stream2 = new Stream();
        stream2.add(group4);
        stream2.add(group3);
        Stream stream3 = new Stream();
        stream3.add(group2);
        stream3.add(group1);

        // for (StudyGroup group : stream) {
        //     System.out.println(group);
        // }
        // System.out.println("Сортировка по Id:");
        // StreamService service = new StreamService(stream);
        // for (StudyGroup group : service.getSorteStudyGroups()) {
        //     System.out.println(group);
        // }
        // System.out.println("Сортировка по содержанию:");
        // for (StudyGroup group : service.getSorteStudyGroupsByCompa()) {
        //     System.out.println(group);
        // }

        for (StudyGroup item : stream) {
            System.out.println(item.toString());
        }
        System.out.println("Сортировка по Id:");
        StreamService service = new StreamService(stream);
        for (StudyGroup item : service.getSorteStudyGroups()) {
            System.out.println(item.toString());
        }
        System.out.println("Сортировка по содержанию:");
        for (StudyGroup item : service.getSorteStudyGroupsByCompa()) {
            System.out.println(item.toString());
        }

        // Iterator<StudyGroup> iterator = stream3.iterator();
        // iterator = stream3.iterator();
        // System.out.println("\n");
        // while (iterator.hasNext()){
        //     StudyGroup sg = iterator.next();
        //     System.out.println(sg.toString());
        // }*/
        
        /*Student student1 = new Student(1, "Artem", "Vladimirovich", "Mordvinov");
        Student student2 = new Student(2, "Stepan", "Artemovich", "Mordvinov");
        Student student3 = new Student(3, "Kirill", "SecondName", "Moiseev");
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.add(student3);
        studentGroup.add(student1);
        studentGroup.add(student2);
        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFio()) {
            System.out.println(student);
        }
        // for (Student student : studentGroup) {
        //     System.out.println(student);
        // }*/
    }
}
