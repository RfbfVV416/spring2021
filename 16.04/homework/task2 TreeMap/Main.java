package albe;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	    Map<String, String> fioAndBirth = new TreeMap<String, String>();

	    while(true){
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if ("stop".equals(input)){
                for (Map.Entry<String, String> el: fioAndBirth.entrySet()) {
                    System.out.println(el.getKey() + " " + el.getValue());
                }
            }
            else{
                String[] inputPair = input.split(" ");
                fioAndBirth.put(inputPair[0], inputPair[1]);
            }
        }
    }
}
