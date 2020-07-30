package school;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class School {
    private final Map<Integer, Course> courseList;
    private final Map<Integer, Student> studentsList;

    public School(Map<Integer, Course> courseList, Map<Integer, Student> studentsList) {
        this.courseList = courseList;
        this.studentsList = studentsList;
    }

    public void addCourse(int id, String name, String teacher) {
        if (courseList.get(id) != null) {
            throw new IllegalArgumentException("The 'courseId' already exist.");
        }

        courseList.put(id, new Course(id, name, new Teacher(teacher), this));
    }

    public Student add(int id, String name) {
        Student student = new Student(id, name, new ArrayList<>());
        studentsList.put(id, student);

        return student;
    }

    public Collection<Student> getStudentsByCourse(int courseId) {
        Course course = this.courseList.get(courseId);

        return course.getStudents();
    }

    public Collection<Course> getCoursesByStudent(int student) {
        Student student1 = this.studentsList.get(student);
        ArrayList<Course> courses = new ArrayList<>();

        for (int course : student1.getCourses()) {
            courses.add(this.courseList.get(course));
        }

        return courses;
    }

    public Collection<Course> getCoursesByStudent(String name) {
        int id = 0;

        for (Student student : getAllStudents()) {
            if (student.getName().equals(name)) {
                id = student.getId();
            }
        }

        return getCoursesByStudent(id);
    }

    public Collection<Student> getStudentsByTeacher(String name) {
        return new ArrayList<>();
    }

    public Collection<Teacher> getAllTeachers() {
        return new ArrayList<>();
    }

    public Collection<Student> getAllStudents() {
        return studentsList.values();
    }
}
