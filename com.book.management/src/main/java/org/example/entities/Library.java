package org.example.entities;


import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> list = new ArrayList<>();
    List<Student> s_list = new ArrayList<>();

    //titles raplaced by current title
    public void addBook(Book book){
        list.add(book);
    }
    public void addStudent(Student student){
        s_list.add(student);

    }
   public void showAllBooks(){
       System.out.println("list of books");
       System.out.println(list.size());
       for(int i = 0; i<list.size();i++){
           System.out.println(list.get(i).title + " "+list.get(i).author + " "+ list.get(i).quantity);
       }
    }

    public void borrowBook(String bookName ){

        for(Book book : list)
        {
            if (book.title.equals(bookName))
            {
                qntyDecrement(book);

            }
        }

    }
    public void qntyDecrement(Book b)
    {
            b.quantity --;
    }
    public void returnBook(String returnBookName) {
        for(Book book : list)
        {
            if (book.title.equals(returnBookName))
            {
                qntyIncrement(book);

            }
        }
    }
    public void qntyIncrement(Book b)
    {
        b.quantity++;
    }
}
