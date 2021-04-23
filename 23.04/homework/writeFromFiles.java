package albe;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:\\texts");

        try(FileOutputStream out = new FileOutputStream("D:\\texts\\output.txt")){
            Arrays.stream(file.listFiles()).forEach((file1) -> {
                        try (FileInputStream inp = new FileInputStream(file1.getAbsolutePath())){
                            out.write(inp.read());
                        }
                        catch (IOException exception){
                            exception.printStackTrace();
                        }
                    }

            );
        }
        catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
