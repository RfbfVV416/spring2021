package albe.studentsAndPupils;

public class Humanable implements Comparable<Humanable>{
    @Override
    public int compareTo(Humanable o){
        if (this instanceof Student & o instanceof Student){
            return ((Student) this).sum() - ((Student) o).sum();
        }
        else if (this instanceof Pupil & o instanceof Pupil){
            return ((Pupil) this).sum() - ((Pupil) o).sum();
        }
        else if (this instanceof Student & o instanceof Pupil){
            return 1; //Student > Pupil след-о возвращаем положительное число
        }
        else return -1; //Pupil < Student
    }
}
