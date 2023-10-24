/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public class TestDriver {
    public static void main(String[] args) {
        Student stud1 = new Student("1001", "Ali");
        Student.setQuizContribution(20);
        stud1.addQuiz(5);
        stud1.addQuiz(10);
        stud1.addQuiz(3);
        System.out.println("Total Score for " + stud1.getName() + " is " + stud1.getTotalScore());
        
        System.out.println("Courseword mark for " + stud1.getName() + " is " + stud1.calCourseworkMark());
    }
}