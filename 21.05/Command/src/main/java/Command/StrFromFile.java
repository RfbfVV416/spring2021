package Command;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StrFromFile {

    private String fileStr = "";
    private String filePath;

    public StrFromFile(String filePath){
        this.filePath = filePath;
        try(FileInputStream fileInputStream = new FileInputStream(filePath)){
            int i;

            while((i=fileInputStream.read())!= -1){
                char x = (char)i;
                fileStr += (char)i;
            }
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    public String getStr() {
        return fileStr;
    }

    public void setStr(String str) {
        fileStr = str;
    }

    public void addSubstring(String sToAdd){
        fileStr += sToAdd;
        //writeStrToFile();
    }

    public void undoString(String sToRemove){
        fileStr = fileStr.replace(sToRemove, "");
        //writeStrToFile();
    }

    private void writeStrToFile(){
        try(FileOutputStream out = new FileOutputStream(filePath)){
            out.write(fileStr.getBytes());
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

}
