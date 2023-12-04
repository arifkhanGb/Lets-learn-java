package Day_11_12;

import java.io.*;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) throws Exception
    {

        File fs = new File("C:\\Users\\WalkingTree\\Desktop\\file.txt");
        Scanner scan = new Scanner(fs);


        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }


    }
}
