package com.boot.myapp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.myapp.Entity.Book;

@RestController
public class ctr {
    List<Book> book = new ArrayList<>();
    {

        book.add(new Book(1, "sham", "this is book"));
        book.add(new Book(2, "kanmbari", "this is book2"));
        book.add(new Book(3, "sham2", "this is book4"));
        book.add(new Book(4, "sham3", "this is book5"));
        book.add(new Book(4, "sham4", "this is book6"));
    }

    // get all books
    @GetMapping("/book")
    public List<Book> getAllBooks() {

        // Book book = new Book();
        // book.setId(1);
        // book.setName("Sham");
        // book.setDec("this is book");

        return book;
    }

    // get single book
    @GetMapping("/book/{id}")
    public Book getBookByid(@PathVariable int id) {

        Book b = book.stream().filter(e -> e.getId() == id).findFirst().get();
        System.out.println(b + "fghhjfgh");
        return b;

    }

    // create book *useing post method*
    @PostMapping("/book")
    public Book addBook(@RequestBody Book b) {
        book.add(b);
        return b;

    }

    @DeleteMapping("/book/{id}")
    public boolean deketeBook(@PathVariable int id) {
        boolean status = false;
        // book=book.stream().filter(e ->e.getId()!=id).collect(Collectors.toList());
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getId() == id) {
                book.remove(i);
                return true;
            }

        }

        return status;

    }
}
