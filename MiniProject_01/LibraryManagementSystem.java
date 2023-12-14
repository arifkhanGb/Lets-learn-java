package MiniProject_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class AddBook{
    String title , author , quantity;

}
class Petron{

}
class AvailBook{

}



public class LibraryManagementSystem {
    public static void main(String[] args) throws IOException {
        String[][] book = {{"c", "jack", "10"}};

        File csvfile = new File("C:\\Users\\WalkingTree\\Desktop\\Library");
        FileWriter f = new FileWriter(csvfile);


    }
}