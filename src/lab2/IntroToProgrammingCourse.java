package lab2;

/**
 * This class implements ICourse, extends Course and inherits the Course constructor without prerequisites, leaving
 * that field null. The IntroToProgrammingCourse's responsibilities are to simply handle its properties in a
 * constructor.
 *
 * @author      plee19
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course implements ICourse {

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }
}
