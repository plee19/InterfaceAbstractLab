package lab1;

/**
 * Abstract class to handle all properties, constructors and getter/setter methods
 */
public abstract class Course {

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
    protected String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Private method to set course number property, with IllegalArgumentException if input is incorrect.
     * @param courseNumber String course number
     */
    private void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }

    /**
     * Protected method to return course's number of credits.
     * @return double number of credits
     */
    protected double getCredits() {
        return credits;
    }

    /**
     * Private method to set course credits property, with IllegalArgumentException if input is incorrect.
     * @param credits double number of credits
     */
    private void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS ) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }

    /**
     * Protected method to return course's name.
     * @return String course name
     */
    protected String getCourseName() {
        return courseName;
    }

    /**
     * Private method to set the course name, with IllegalArgumentException if input is incorrect.
     * @param courseName String course name
     */
    private void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null or empty string");
        }
        this.courseName = courseName;
    }

    /**
     * Protected method to return any course prerequisites.
     * @return String course prerequisites
     */
    protected String getPrerequisites() {
        return prerequisites;
    }

    /**
     * Private method to set course prerequisites, with IllegalArgumentException if input is incorrect.
     * @param prerequisites
     */
    private void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null or empty string");
        }
        this.prerequisites = prerequisites;
    }
}
