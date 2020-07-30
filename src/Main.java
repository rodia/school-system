import school.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        School school = new School(new HashMap<>(), new HashMap<>());
        school.addCourse(123, "Math", "Primo Subieta");
        school.addCourse(221, "Language", "Octavio Diaz");
        school.addCourse(104, "Science", "Fernando Lopez");
        school.addCourse(356, "History", "Nancy Calderón");

        Student s1 = school.add(10, "Jorge Gonzales");
        s1.addCourses(123, 221, 104);

        Student s2 = school.add(50, "Maria Mercado");
        s2.addCourses(123, 356);

        Student s3 = school.add(32, "Rene Alvarez");
        s3.addCourses(104, 356);

        System.out.println(school.getStudentsByCourse(123));
        System.out.println(school.getCoursesByStudent(32));
        System.out.println(school.getCoursesByStudent("Maria Mercado"));
        System.out.println(school.getStudentsByTeacher("Primo Subieta"));
        System.out.println(school.getAllTeachers());
    }
}
