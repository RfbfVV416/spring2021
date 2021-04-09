package albe.ComputerBuild;

public class Motherboard{


    private Integer numOfSlots = 4;
    private int id;

    public Motherboard(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Integer getNumOfSlots() {
        return numOfSlots;
    }
}
