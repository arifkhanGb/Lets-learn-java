package org.example;




import org.example.entities.Book;
import org.example.entities.Library;
import org.example.entities.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static String line;
    static String[] lineData = null;
    public static void scvData() throws IOException{

//        String filePath = "C:\\Users\\WalkingTree\\Desktop\\Library.csv";
//        FileReader fr = new FileReader(filePath);
//        BufferedReader br = new BufferedReader(fr);

//           line = br.readLine();
//        while (line != null) {
//            lineData = line.split(",");
//            if(lineData.length == 3) {
//                String title =lineData[0];
//                String author = lineData[1];
//                int quantity = Integer.parseInt(lineData[2]);
////            System.out.println(lineData[0] + ", " + lineData[1] + ", " + lineData[2]);
//            }
//            line = br.readLine();
//        }
    }

    public static void main(String[] args) throws IOException {








        Library lib = new Library();

        Book book = null;
        Student student;

        do {
            System.out.println("1. for adding a book in library");
            System.out.println("2. for creating student");
            System.out.println("3. for Borrow book from library");
            System.out.println("4. for returning book to library");
            System.out.println("5. show all books present in the library");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            String title =null;
            String author = null;
            int quantity=0;
            
            switch (ch) {
                case 1:

                    String filePath = "C:\\Users\\WalkingTree\\Desktop\\Library.csv";
                    FileReader fr = new FileReader(filePath);
                    BufferedReader br = new BufferedReader(fr);
                    line = br.readLine();
                    while (line != null) {
                        book =new Book();
                        lineData = line.split(",");
                        if(lineData.length == 3) {
                        title =lineData[0];
                         author = lineData[1];
                         quantity = Integer.parseInt(lineData[2]);
                            book.setTitle(title);
                            book.setAuthor(author);
                            book.setQuantity(quantity);
                            lib.addBook(book);
                        }
                        line = br.readLine();
                    }
//                    String title = sc.next();
//                    String author = sc.next();
//                    quantity = sc.nextInt();
//                    book.setTitle(title);
//                    book.setAuthor(author);
//                    book.setQuantity(quantity);
//                    lib.addBook(book);
                    System.out.println("book Added");
                    System.out.println(book.getTitle());
                    System.out.println(book.getAuthor());
                    System.out.println(book.getQuantity());
                    break;

                case 2:

                    student = new Student();
                    String s_name = sc.next();
                    int id = sc.nextInt();
                    student.setName(s_name);
                    student.setId(id);
                    lib.addStudent(student);
                    System.out.println("student Added");
                    System.out.println(student.getName());
                    System.out.println(student.getId());

                    break;
                case 3:
                    System.out.println("which book u wants to Borrow");
                    String bookName = sc.next();
                    int s_ID = sc.nextInt();
                        lib.borrowBook(bookName );
                    break;
                case 4:
                    System.out.println("which book wants to return");
                    String returnBook= sc.next();
                    lib.returnBook(returnBook);
                    break;
                case 5:
                    lib.showAllBooks();
//                    scvData();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("invalid input");
            }
        }while (true);

    }
}