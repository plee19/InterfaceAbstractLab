package lab1;

import javax.swing.*;

public abstract class Course {

    private String courseName;
    private String courseNumber;
    private double credits;
    private DisplayUtility displayUtility;

    private static final double MAX_CREDITS = 4.0;
    private static final double MIN_CREDITS = 0.5;

    public Course(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        displayUtility = new DisplayUtility();
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS ) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");
        }
        this.courseName = courseName;
    }

    public String toString() {
        String str;
        str = this.getCourseName() + " is a " + getCredits() + " credit(s) course with a course number of " + getCourseNumber() + ".";
        return str;
    }

}
