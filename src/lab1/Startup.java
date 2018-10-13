package lab1;

/**
 * Startup method to demonstrate Course subclasses and displayUtility class.
 *
 * For the most part, this seems like a good architecture, however it does get a bit complicated when deciding how to
 * implement the prerequisites in the constructor. Prerequisites will end up with a null value for the IntroToProgramming
 * Course, but I compensated for this within the DisplayUtility by weeding out the null value when printing the Course
 * information. Any further use of getPrerequisites() would have to either handle null values or provide a check much
 * like I did in the courseOutput() method.
 *
 * Using the Liskov Substitution Principle in the Startup class is advantageous as it encourages reusability of the
 * code, reduced coupling and easier maintenance. Anywhere I initialized an object of a specific Course type, it could
 * be replaced with a Course object. I created both constructors in the Course class to allow for flexibility in having
 * prerequisites rather than relying on the subclasses to add that property.
 *
 * @author plee19
 * @version 1.0
 */

public class Startup {
    private static final DisplayUtility displayUtility = new DisplayUtility();

    public static void main(String[] args) {
        Course advJava = new AdvancedJavaCourse("Advanced Java", "100", 4.0, "Intro to Java");
        Course introJava = new IntroJavaCourse("Intro to Java", "101", 3.0, "Intro to Programming");
        Course introProg = new IntroToProgrammingCourse("Intro to Programming", "102", 3.0);
        displayUtility.courseOutput(advJava);
        displayUtility.courseOutput(introJava);
        displayUtility.courseOutput(introProg);
    }
}
