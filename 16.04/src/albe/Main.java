package albe;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try{
            InputStream inputStream = new FileInputStream("D:\\1.txt");
            byte someByte;
            while((someByte = (byte) inputStream.read()) != -1){
                System.out.println((char)someByte);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
