package albe.studentsAndPupils;

public class Pupil implements Humanable, Comparable<Pupil>{
    private int[] marks = new int[100];

    public Pupil(int[] marks){
        this.marks = marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int marksSum(){
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            if(marks[i] == 5){
                sum += marks[i];
            }
        }
        return sum;
    }

    @Override
    public int compareTo(Pupil o){
        return this.marksSum() - o.marksSum();
    }
}
