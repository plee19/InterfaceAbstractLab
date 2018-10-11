package lab1;

public class Startup {
    public static void main(String[] args) {
        Course advJava = new AdvancedJavaCourse("Advanced Java", "100", 4.0, "Intro to Java");
        Course introJava = new IntroJavaCourse("Intro to Java", "101", 3.0, "Intro to Programming");
        Course introProg = new IntroToProgrammingCourse("Intro to Programming", "102", 3.0);
        System.out.println(advJava.toString());
        System.out.println(introJava.toString());
        System.out.println(introProg.toString());
    }
}
