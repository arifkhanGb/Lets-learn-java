package Day_13_14;

import java.io.*;

public class Question3 {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\WalkingTree\\Desktop\\one.txt");
        boolean flag = file.createNewFile();

        if (flag)
            System.out.println("file is created");
        else
            System.out.println("file is already exist");

//            adding content to file
        String str = "content adding in a new file";

//            System.out.println("file is creating...");
//
        FileWriter fw = new FileWriter(file, true);
        fw.write(str);
        System.out.println("content added through filewriter");

        BufferedWriter bf = new BufferedWriter(fw);
        bf.write(str);
        System.out.println("content added through Bufferedwriter");

        fw.close();
    }
//    catch(FileNotFoundException e)
//    {
//        System.out.println(e.getMessage());
//    }
    }

