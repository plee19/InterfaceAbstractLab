package lab2;

/**
 * This class implements ICourse, extends Course and inherits the Course constructor, including prerequisites.
 * The AdvancedJavaCourse's responsibilities are to simply handle its properties in a constructor.
 *
 * @author      plee19
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course implements ICourse {

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits, prerequisites);
    }
}