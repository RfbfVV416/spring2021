package albe;
import albe.ComputerBuild.*;
import java.util.ArrayDeque;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayDeque<Body> bodies = new ArrayDeque<Body>();
        ArrayDeque<Memory> memories = new ArrayDeque<Memory>();
        ArrayDeque<HardDrive> hardDrives = new ArrayDeque<HardDrive>();
        ArrayDeque<Motherboard> motherboards = new ArrayDeque<Motherboard>();
        ArrayList<Computer> computersList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
           computersList.add(new Computer(i));
        }

        for(int i = 0; i < 1000; i++){
            if (i <= 250) {
                bodies.addFirst(new Body((int) (Math.random() * 10)));
                Body lastBody = bodies.getLast();
                computersList.get(lastBody.getId()).setBody(lastBody);
            }
            else if (i <= 500) {
                memories.addFirst(new Memory((int) (Math.random() * 10)));
                Memory lastMemory = memories.getLast();
                computersList.get(lastMemory.getId()).setMemory(lastMemory);
            }
            else if (i <= 750) {
                hardDrives.addFirst(new HardDrive((int) (Math.random() * 10)));
                HardDrive lastHardDrive = hardDrives.getLast();
                computersList.get(lastHardDrive.getId()).setHardDrive(lastHardDrive);
            }
            else {
                motherboards.addFirst(new Motherboard((int) (Math.random() * 10)));
                Motherboard lastMotherboard = motherboards.getLast();
                computersList.get(lastMotherboard.getId()).setMotherboard(lastMotherboard);
            }
        }

    }
}


