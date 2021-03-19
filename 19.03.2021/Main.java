package com.company;

public class Main {

    public static void main(String[] args) {
	Pupil a = new Pupil("Fio");
	Pupil b = new Pupil("Fio", 1);
	Pupil c = new Pupil("Fio", 1, 'c');
    }
}
class Pupil {
    String Fio;
    int classNum;
    char classLetter;

    Pupil(String Fio){
        this.Fio = Fio;
    }
    Pupil (String Fio, int classNum){
        this(Fio);
        this.classNum = classNum;
    }
    Pupil (String Fio, int classNum, char classLetter){
        this(Fio, classNum);
        this.classLetter = classLetter;
    }
}

