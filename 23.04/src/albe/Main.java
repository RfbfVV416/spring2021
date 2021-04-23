package albe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        stockExchange stock = new stockExchange();
        while (true){
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            String [] inp = input.split(" ");
            new Thread(()->{
                stock.exchange(inp[0], inp[1], Integer.valueOf(inp[2]));
            }).start();
            Thread.sleep(100);
        }
    }
}
