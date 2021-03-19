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
        this.fio = fio;
    }
    Pupil (String fio, int classNum){
        this(fio);
        this.classNum = classNum;
    }
    Pupil (String fio, int classNum, char classLetter){
        this(fio, classNum);
        this.classLetter = classLetter;
    }
}

