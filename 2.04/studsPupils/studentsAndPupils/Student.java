package albe.studentsAndPupils;

public class Student implements Humanable, Comparable<Student> {
    private int[] marks = new int[100];

    public Student(int[] marks){
        this.marks = marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int marksSum(){
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            if(marks[i] != 0){
                sum += marks[i];
            }
        }
        return sum;
    }

    @Override
    public int compareTo(Student o){
        return this.marksSum() - o.marksSum();
    }
}
