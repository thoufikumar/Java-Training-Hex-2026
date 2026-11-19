
package Day_2.assignment_1;

public class Course {
    int courseid;
    String coursename;
    int coursefees;

    public Course(int courseid, String coursename, int coursefees) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.coursefees = coursefees;
    }
    public int getcourseid() {
        return courseid;
    }
    public String getcoursename() {
        return coursename;
    }
    public int getcoursefees() {
        return coursefees;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", coursename='" + coursename + '\'' +
                ", coursefees=" + coursefees +
                '}';
    }
}
