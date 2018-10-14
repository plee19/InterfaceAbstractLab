package lab2;

/**
 * Startup method to demonstrate Course subclasses and displayUtility class.
 *
 * This was actually a challenging architecture for me to figure out, since properties cannot be used in an interface.
 * I ended up modifying what was done in lab1 by creating an abstract Course class to implement ICourse in order to
 * store the properties in a single class versus using them in each specific course type. The one issue I found with
 * using interfaces is that it doesn't allow you to use anything more strict than a public setting on each implementable
 * method. You cannot set the visibility to anything more specific than what is in the interface itself, and the interface
 * cannot handle protected or private methods.
 *
 * Lab1: Using the Liskov Substitution Principle in the Startup class is advantageous as it encourages reusability of the
 * code, reduced coupling and easier maintenance. Anywhere I initialized an object of a specific Course type, it could
 * be replaced with a Course object. I created both constructors in the Course class to allow for flexibility in having
 * prerequisites rather than relying on the subclasses to add that property.
 *
 * Lab2: I don't see any important differences between the two labs in terms of the Liskov Substitution Principle. There
 * aren't any methods that the specific course types use that could be conflicting, from what I can tell. The Course
 * abstract class handles all of the methods, and I used the prerequisites in an overloaded constructor at the Course
 * level, so nothing should conflict.
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
