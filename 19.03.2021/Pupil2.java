package com.company;

public class Main {

    public static void main(String[] args) {
	Pupil a = new Pupil("Fio");
	Pupil b = new Pupil("Fio", 1);
	Pupil c = new Pupil("Fio", 1, 'c');
    }
}
class Pupil {
    String fio;
    int classNum;
    char classLetter;


    Pupil(String fio){
        this(fio, 1, 'a');
    }
    Pupil (String fio, int classNum){
        this(fio, classNum, 'a');
    }
    Pupil (String fio, int classNum, char classLetter){
        this.fio = fio;
        this.classNum = classNum;
        this.classLetter = classLetter;
    }
}

