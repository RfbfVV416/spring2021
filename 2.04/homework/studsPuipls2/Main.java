package albe;
import albe.studentsAndPupils.*;
import java.util.Arrays;
import java.util.*;
import java.util.function.*;

public class Main {
//нужно обесп возможность хранить и учеников и студентов в одном arrayList и сортировать и
    //сначала должны идти ученики какие бы оценки у наж не были а потом студенты
    //между собой ученики и студенты должны быть упорядоены по оценкам
    public static void main(String[] args) {
        int [] studMarks1 = {1, 2, 3, 4},
                pupilMarks1 = {3, 4, 5, 5, 5},
                studMarks2 = {1, 2, 4, 5},
                pupilMarks2 = {4, 5, 3, 5};

//        ArrayList<Student> students = new ArrayList<>();
//        ArrayList<Pupil> pupils = new ArrayList<>();
//
//
//        Student student1 = new Student(studMarks1);
//        Pupil pupil1 = new Pupil(pupilMarks1);
//        Student student2 = new Student(studMarks2);
//        Pupil pupil2 = new Pupil(pupilMarks2);
//
//        students.add(student1);
//        students.add(student2);
//        pupils.add(pupil1);
//        pupils.add(pupil2);
//
//        students.sort((s1, s2) ->s1.compareTo(s2));
//        pupils.sort((p1, p2) -> p1.compareTo(p2));

        ArrayList<Humanable> people = new ArrayList<Humanable>();
        Student student1 = new Student(studMarks1);
        Pupil pupil1 = new Pupil(pupilMarks1);
        Student student2 = new Student(studMarks2);
        Pupil pupil2 = new Pupil(pupilMarks2);

        people.add(student1);
        people.add(student2);
        people.add(pupil1);
        people.add(pupil2);

        for (int i = 0; i < people.size(); i++){
            System.out.println(people.get(i).getClass());
        }
        System.out.println();

        people.sort((s1, s2) -> s1.compareTo(s2));

        for (int i = 0; i < people.size(); i++){
            System.out.println(people.get(i).getClass());
        }


    }
}
