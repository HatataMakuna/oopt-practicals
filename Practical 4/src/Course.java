/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Course {
    // P4Q5(1)
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames;
    private static int courseCount;
    
    public Course(String courseTitle, double feesPerStudent) {
        studentNames = new String[100];
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        courseCount++;
    }
    
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    
    public String getCourseTitle() {
        return courseTitle;
    }
    
    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }
    
    public double getFeesPerStudent() {
        return feesPerStudent;
    }
    
    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
    
    public int getNoOfStudents() {
        return noOfStudents;
    }
    
    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }
    
    public String[] getStudentNames() {
        return studentNames;
    }
    
    public static int getCourseCount() {
        return Course.courseCount;
    }
    
    public double calcFeesCollected() {
        return this.feesPerStudent * this.noOfStudents;
    }
    
    public void addStudent(String studentName) {
        studentNames[noOfStudents] = studentName;
        noOfStudents++;
    }
}
