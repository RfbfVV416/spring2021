package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] marks = {2, 9};
	Pupil a = new Pupil("Fio", marks);
	Pupil b = new Pupil("Fio", 1, marks);
	Pupil c = new Pupil("Fio", 1, 'c', marks);
    }
}
class Pupil {

    private int classNum;
    private char classLetter;
    private String fio;
    private int marks[];

    Pupil(String fio, int[] marks){
        this(fio, 1, 'a', marks);
    }
    Pupil (String fio, int classNum, int[] marks){
        this(fio, classNum, 'a', marks);
    }
    Pupil (String fio, int classNum, char classLetter, int[] marks){
        this.fio = fio;
        this.classNum = classNum;
        this.classLetter = classLetter;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 2 || marks[i] > 5) {
                throw new IllegalArgumentException("Wrong type  :( ");
            }
        }
        this.marks = marks;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public char getClassLetter() {
        return classLetter;
    }

    public void setClassLetter(char classLetter) {
        this.classLetter = classLetter;
    }

    public int[] getMarks() {
        return Arrays.copyOf(marks, marks.length);
    }

    public void setMarks(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 2 || marks[i] > 5) {
                throw new IllegalArgumentException("Wrong type  :( ");
            }
        }
        this.marks = Arrays.copyOf(marks, marks.length);
    }

}

