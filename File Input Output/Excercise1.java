package Day_13_14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Excercise1 {
    public static void main(String[] args) throws IOException {

        //this read the file character by character
        FileReader fr = new FileReader("C:\\Users\\WalkingTree\\Desktop\\file.txt");
//        int i = fr.read();
//        while(i!=-1)
//        {
//            System.out.print((char)i);
//            i = fr.read();
//        }
//        fr.close();

//        while((i=fr.read())!=-1)
//            System.out.print((char)i);
//        fr.close();



        //read file using BufferdReader [this read the file line by line]

        BufferedReader bf =new BufferedReader(fr);
        String line;
        while(true)
        {
            line = bf.readLine();

            if(line == null){
                break;
            }
            System.out.println("reading file");
            System.out.println(line);
        }


    }
}
