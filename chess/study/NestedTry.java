package chess.study;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NestedTry{
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\harsela s\\Documents\\chess new\\Chess\\chess\\study\\data.txt");
            BufferedReader br = new BufferedReader(fr);
            try {
                String text = br.readLine();
                if (text == null) {
                    throw new Exception("Empty file");
                }
                System.out.println("File: " + text);
            } catch (Exception e) {
                System.out.println("Empty file");
            }
            //br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    }

