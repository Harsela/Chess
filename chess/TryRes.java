package chess;
import java.io.*;
public class TryRes {
    public static void main(String[]args){
        File f = new File("sample.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        }
    }
