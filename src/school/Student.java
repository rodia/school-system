package school;

import java.util.Collection;

public class Student extends Person {
    private final int id;
    private final Collection<Integer> courses;

    public Student(int id, String name, Collection<Integer> courses) {
        super(name);
        this.id = id;
        this.courses = courses;
    }

    public void addCourses(int... courseIds) {
        for (int id : courseIds) {
            courses.add(id);
        }
    }

    public int getId() {
        return id;
    }

    public Collection<Integer> getCourses() {
        return this.courses;
    }
}
