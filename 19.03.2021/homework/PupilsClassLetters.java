package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] marks = {3, 3};

	    Pupil a = new Pupil("Fio");

	    Pupil b = new Pupil("Fio", 1);

	    Pupil c = new Pupil("Fio", 1, 'a', marks);

    }
}
class Pupil {

    private int classNum;
    private char classLetter;
    private String fio;
    private int[] marks;
    static int counterA = 0;
    static int counterB = 0;
    static int counterC = 0;
    static char letter = 'a'; //предполагаем что есть только классы a, b, c

    //определяем букву класса, в котором недостает учеников
    private void classChoice(){
        int minValue = Math.min(Math.min(counterA, counterB), counterC);
        if (counterA == minValue) {
            letter = 'a';
        }
        else if (counterB == minValue){
            letter = 'b';
        }
        else {
            letter = 'c';
        }
        System.out.println("If you will create NEXT Pupil without classLetter its classLetter will be " + letter);
    }

    Pupil(String fio){
        this(fio, 1, letter, new int[]{2});
    }
    Pupil (String fio, int classNum){
        this(fio, classNum, letter, new int[]{2});
    }
    Pupil (String fio, int classNum, char classLetter, int[] marks){
        this.fio = fio;
        this.classNum = classNum;
        this.classLetter = classLetter;
        checkMarks(marks);
        this.marks = Arrays.copyOf(marks, marks.length); //присваиваем копию объекта
        if (classLetter == 'a') counterA++;
        else if (classLetter == 'b') counterB++;
        else counterC++;
        System.out.println("classLetter OF CREATED object is " + classLetter);
        classChoice();
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
        return Arrays.copyOf(marks, marks.length); //возвращаем копию объекта
    }

    public void setMarks(int[] marks) {
        checkMarks(marks);
        this.marks = Arrays.copyOf(marks, marks.length); //присваиваем копию объекта
    }

    private void checkMarks(int[] marks){
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 2 || marks[i] > 5) {
                throw new IllegalArgumentException("Wrong type  :( ");
            }
        }
    }

}

