package Day_13_14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("enter content");
        String newContent = input.nextLine();

        File newfile = new File("C:\\Users\\WalkingTree\\Desktop\\one.txt");

        if(!newfile.exists())
        {
            newfile.createNewFile();
        }


        FileWriter fw = new FileWriter(newfile , true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(newContent , 0 , newContent.length());
        System.out.println("content append to the extisting file");
        bw.close();
    }
}
