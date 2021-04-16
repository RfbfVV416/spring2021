package albe;
import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException{
        try(InputStream fileInputStream = new URL("https://ru.wikipedia.org/wiki/%D0%9E%D0%BB%D0%B0%D1%84,_%D0%AD%D1%80%D0%B2%D0%B8%D0%BD").openStream();
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\1.txt")) {
        byte[] someByte = new byte[1024];
        int length = 0;
        while ((length = fileInputStream.read(someByte)) != -1)
            fileOutputStream.write(someByte);
        fileOutputStream.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
