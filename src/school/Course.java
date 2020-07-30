package school;

import java.util.ArrayList;
import java.util.Collection;

public class Course {
    private final int id;
    private final School currentSchool;
    private String name;
    private Teacher currentTeacher;

    public Course(int id, String name, Teacher currentTeacher, School currentSchool) {
        this.id = id;
        this.name = name;
        this.currentTeacher = currentTeacher;
        this.currentSchool = currentSchool;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getCurrentTeacher() {
        return currentTeacher;
    }

    public void setCurrentTeacher(Teacher currentTeacher) {
        this.currentTeacher = currentTeacher;
    }

    public Collection<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();

        for (Student student : this.getSchool().getAllStudents()) {
            for (int id : student.getCourses()) {
                if (this.id == id) {
                    students.add(student);
                }
            }
        }

        return students;
    }

    public School getSchool() {
        return this.currentSchool;
    }
}
