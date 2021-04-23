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
                String givenCur = inp[0];
                String receivedCur = inp[1];
                int money = Integer.valueOf(inp[2]);

                if ("rub".equals(givenCur)){
                    if ("eur".equals(receivedCur)) stock.exchangeRE(money);
                    else if ("dol".equals(receivedCur)) stock.exchangeRD(money);
                }
                else if ("eur".equals(givenCur)){
                    if ("rub".equals(receivedCur)) stock.exchangeER(money);
                    else if ("dol".equals(receivedCur)) stock.exchangeED(money);
                }
                else if ("dol".equals(givenCur)){
                    if("rub".equals(receivedCur)) stock.exchangeDR(money);
                    else if ("eur".equals(receivedCur)) stock.exchangeDE(money);
                }
                stock.print();

            }).start();

        }
    }
}
