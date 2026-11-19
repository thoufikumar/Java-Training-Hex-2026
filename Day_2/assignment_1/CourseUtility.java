package Day_2.assignment_1;
import java.util.Comparator;

public class CourseUtility implements Comparator<Course> {

    String direction;

    public CourseUtility(String direction) {
        this.direction = direction;
    }
    @Override
    public int compare(Course c1, Course c2) {

        if (direction.equals("NAME")) {
            return c1.getcoursename().compareTo(c2.getcoursename());
        }
        if (direction.equals("ASC")) {
            if (c1.getcoursefees() > c2.getcoursefees()) {
                return 1;
            }
            if (c1.getcoursefees() < c2.getcoursefees()) {
                return -1;
            }
        }
        else {
            if (c1.getcoursefees() < c2.getcoursefees()) {
                return 1;
            }
            if (c1.getcoursefees() > c2.getcoursefees()) {
                return -1;
            }
        }
        return 0;
    }
}
