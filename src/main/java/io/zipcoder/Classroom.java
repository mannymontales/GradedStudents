package io.zipcoder;

public class Classroom {
    Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore(){
        double sum = 0;

        for (int i = 0; i < students.length; i++){
            sum += students[i].getAverageExamScore();
        }
        return sum / students.length;
    }

    public Student addStudent(Student student){
        for (int i = 0; i < students.length; i++){
            students[i] = student;
        }
        return null;
    }
}
