package lab1;

public class DisplayUtility {
    public String courseOutput(Course course) {
        String str;
        str = course.getCourseName() + " is a " + course.getCredits() + " credit(s) course with a course number of " +
                course.getCourseNumber() + ".";

        return str;
    }
}
