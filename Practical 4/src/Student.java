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
    // Q2
    private String studentId;
    private String name;
    private int numberOfQuiz;
    private double totalScore;
    private static double quizContribution;
    
    // constructors don't have any return type
    public Student() {
        // Q3
        this("","");
    }
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.numberOfQuiz = 0;
        this.totalScore = 0;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public double getTotalScore() {
        return totalScore;
    }
    private int getNumberOfQuiz() {
        return numberOfQuiz;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addQuiz(int score) {
        totalScore += score;
        numberOfQuiz++;
    }
    public static double getQuizContribution() {
        return quizContribution;
    }
    public static void setQuizContribution(double quizContribution) {
        Student.quizContribution = quizContribution;
    }
    public double calCourseworkMark() {
        return (getTotalScore() / (getNumberOfQuiz() * 10)) * Student.getQuizContribution();
    }
}
