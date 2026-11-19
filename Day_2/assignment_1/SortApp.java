
package Day_2.assignment_1;
import java.util.*;

public class SortApp {

    public static void main(String[] args) {
        List<Course> courselist = new ArrayList<>();

        Course course1 = new Course(101, "Java", 15000);
        Course course2 = new Course(102, "Python", 12000);
        Course course3 = new Course(103, "React", 15000);
        Course course4 = new Course(104, "SQL", 8000);
        Course course5 = new Course(105, "Angular", 12000);

        courselist.add(course1);
        courselist.add(course2);
        courselist.add(course3);
        courselist.add(course4);
        courselist.add(course5);

        System.out.println("Total Courses: " + courselist.size());
        System.out.println("\nAll Courses");
        for (Course c : courselist) {
            System.out.println(c);
        }
        System.out.println("\nFees in Ascending Order");
        sortCourses(courselist, "ASCENDING");
        System.out.println("\nFees in Descending Order");
        sortCourses(courselist, "DESCENDING");
        System.out.println("\nCourses by Name (A to Z)");
        sortCourses(courselist, "NAME");
    }

    private static void sortCourses(List<Course> courselist, String direction) {
        Collections.sort(courselist, new CourseUtility(direction));
        for (Course c : courselist) {
            System.out.println(c);
        }
    }
}
