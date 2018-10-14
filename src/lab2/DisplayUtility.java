package lab2;

/**
 * This class is to act as the display output utility for this program. Its sole responsibility is to use the getter
 * methods for course properties and print out essentially a void toString() method for that course.
 *
 * @author plee19
 * @version 1.00
 */
public class DisplayUtility {

    /**
     * Method whose sole responsibility is to print out a String using concatenated strings and Course property values.
     * @param course instance of Course object
     */
    public void courseOutput(Course course) {
        String str;
        str = course.getCourseName() + " is a " + course.getCredits() + " credit course with a course number of " +
                course.getCourseNumber() + ".";
        if (course.getPrerequisites() != null) {
            str += " Prerequisites for this course are: " + course.getPrerequisites() + ".";
        } else {
            str += " No prerequisites are required.";
        }

        System.out.println(str);
    }
}
