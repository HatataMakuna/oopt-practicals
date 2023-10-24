/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class Student {
    private String studentID;
    private String name;
    private String school;
    
    public Student(String studentID, String name, String school) {
        this.studentID = studentID;
        this.name = name;
        this.school = school;
    }
    public static boolean validateStudentID(Student student) {
        String id = student.studentID;
        Character.isDigit
    }
}
