package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
    String courseName;
    private String courseNumber;
    double credits;
    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits);
        this.setPrerequisites(prerequisites);
    }
/*
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

*/
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
        }
        this.prerequisites = prerequisites;
    }
/*
        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
*/
    @Override
    public String toString() {
        String str;
        str = this.getCourseName() + " is a " + getCredits() + " credit(s) course with a course number of " + getCourseNumber() + ".\nPrerequisites " +
        "for this class include: " + getPrerequisites() + ".";
        return str;
    }
}
