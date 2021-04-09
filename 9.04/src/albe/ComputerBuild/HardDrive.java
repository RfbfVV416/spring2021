package albe.ComputerBuild;

public class HardDrive{


    private Integer RotationPerMinute = 4200;
    private int id;

    public HardDrive(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Integer getRotationPerMinute() {
        return RotationPerMinute;
    }
}
