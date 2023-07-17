package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public String getExamScores(){
        StringBuilder examScores = new StringBuilder();

        int counter = 1;
        for (Double scores: this.examScores) {
            examScores.append(("Exam " + counter + " -> " + scores + "\n"));
            counter++;
        }
        return String.valueOf(examScores);
    }

    public void addExamScore(double examScoreToBeAdded){
        this.examScores.add(examScoreToBeAdded);
    }

    public void setExamScore(int examIndex, double newScore){
        this.examScores.set(examIndex, newScore);
    }

    public double getAverageExamScore(){
        int sum = 0;
        int counter = 0;

//        for (int i = 0; i < this.examScores.size(); i++){
//            sum += this.examScores
//        }

        for (Double scores: this.examScores){
            sum += this.examScores.get(examScores.indexOf(scores));
            counter++;
        }
        return sum / counter;
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getNumberOfExamsTaken(){
        return getExamScores();
    }
    
    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + "\n" +
                "Average Score: " + getAverageExamScore() + "\n" +
                "ExamScores " + "\n" + getExamScores();
    }
}
