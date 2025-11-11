package Generics;
import java.util.*;

abstract class CourseType { String name; CourseType(String name){this.name=name;} }
class ExamCourse extends CourseType { ExamCourse(String n){super(n);} }
class AssignmentCourse extends CourseType { AssignmentCourse(String n){super(n);} }

class Course<T extends CourseType> {
    T courseType;
    Course(T courseType){ this.courseType = courseType; }
}

class Q14 {
    static void showCourses(List<? extends CourseType> courses){
        for(CourseType c: courses) System.out.println(c.name);
    }
}

