package albe;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        try{
            InputStream inputStream = new FileInputStream("D:\\1.txt");
            byte[] val = new byte[255];
            int length = inputStream.read(val, 0 , val.length);
            for (byte n:
                    val) {
                System.out.println((char) n);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
