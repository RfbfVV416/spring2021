package albe.ComputerBuild;

public class Computer{
    private int id;
    private Body body;
    private Memory memory;
    private Motherboard motherboard;
    private HardDrive hardDrive;

    public Computer(int id) {
        this.id = id;
        this.body = null;
        this.memory = null;
        this.motherboard = null;
        this.hardDrive = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }
}
