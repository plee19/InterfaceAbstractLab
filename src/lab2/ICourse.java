package lab2;

/**
 * Interface to provide methods for implementation by the abstract Course subclass, and by extension the specific Course
 * types. The responsibility of this class is simply to define the methods needing to be implemented.
 *
 * @author plee19
 * @version 1.0
 */
public interface ICourse {
    String getCourseNumber();
    void setCourseNumber(String courseNumber);
    double getCredits();
    void setCredits(double credits);
    String getCourseName();
    void setCourseName(String courseName);
    String getPrerequisites();
    void setPrerequisites(String prerequisites);

}
