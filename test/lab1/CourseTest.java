package lab1;

import junit.framework.TestCase;
import org.junit.*;

public class CourseTest extends TestCase {
    private Course advJava;
    private Course introProg;

    @Before
    public void setUp() throws Exception {
        advJava = new AdvancedJavaCourse("Advanced Java", "100", 4.0, "Intro to Java");
        introProg = new IntroToProgrammingCourse("Intro to Programming", "102", 3.0);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetCourseNumber() {
        assertEquals("100", advJava.getCourseNumber());
        assertEquals("102", introProg.getCourseNumber());
    }

    @Test
    public void testGetCredits() {
        assertEquals(4.0, advJava.getCredits());
        assertEquals(3.0, introProg.getCredits());
    }

    @Test
    public void testGetCourseName() {
        assertEquals("Advanced Java", advJava.getCourseName());
        assertEquals("Intro to Programming", introProg.getCourseName());
    }

    @Test
    public void testGetPrerequisites() {
        assertEquals("Intro to Java", advJava.getPrerequisites());
        assertEquals(null, introProg.getPrerequisites());
    }
}