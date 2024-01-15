package Day_13_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Question4 {
    public static void main(String[] args) throws IOException {
        try{
        String filePath = "C:\\Users\\WalkingTree\\Desktop\\record.csv";
        int marks = 0;
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line !=null)
        {
            String[] lineData = line.split(",");
            if(!lineData[1].equals("record")){
                marks += Integer.parseInt(lineData[1]);
            }
            line = br.readLine();
        }
        int avgScore = (marks/4);
        System.out.println("Avg Score: " + avgScore);
        br.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
