package lab2;
/**
 * This abstract class implements the methods from ICourse and provides the specific Course types with getter/setter
 * methods and properties.
 *
 * @author plee19
 * @version 1.00
 */
public abstract class Course implements ICourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    private static final double MAX_CREDITS = 4.0;
    private static final double MIN_CREDITS = 0.5;

    /**
     * Constructor method for Course without prerequisites.
     * @param courseName String course name
     * @param courseNumber String course number
     * @param credits double number of credits
     */
    public Course(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    /**
     * Constructor method for Course with prerequisites.
     * @param courseName String course name
     * @param courseNumber String course number
     * @param credits double number of credits
     * @param prerequisites String course prerequisites
     */
    public Course(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    /**
     * Protected method to return course number.
     * @return String course number
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Private method to set course number property, with IllegalArgumentException if input is incorrect.
     * @param courseNumber String course number
     */
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }

    /**
     * Protected method to return course's number of credits.
     * @return double number of credits
     */
    public double getCredits() {
        return credits;
    }

    /**
     * Private method to set course credits property, with IllegalArgumentException if input is incorrect.
     * @param credits double number of credits
     */
    public void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS ) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }

    /**
     * Protected method to return course's name.
     * @return String course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Private method to set the course name, with IllegalArgumentException if input is incorrect.
     * @param courseName String course name
     */
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null or empty string");
        }
        this.courseName = courseName;
    }

    /**
     * Protected method to return any course prerequisites.
     * @return String course prerequisites
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * Private method to set course prerequisites, with IllegalArgumentException if input is incorrect.
     * @param prerequisites String course prerequisites
     */
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null or empty string");
        }
        this.prerequisites = prerequisites;
    }
}
