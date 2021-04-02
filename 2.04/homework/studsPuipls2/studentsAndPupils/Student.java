package albe.studentsAndPupils;

public class Student extends Humanable{
    private int[] marks = new int[100];

    public Student(int[] marks){
        this.marks = marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int sum(){
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            if(marks[i] != 0){
                sum += marks[i];
            }
        }
        return sum;
    }
}
