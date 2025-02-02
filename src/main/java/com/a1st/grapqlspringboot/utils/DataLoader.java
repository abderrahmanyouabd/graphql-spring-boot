package com.a1st.grapqlspringboot.utils;

import com.a1st.grapqlspringboot.book.Book;
import com.a1st.grapqlspringboot.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
         bookRepository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
         bookRepository.save(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
         bookRepository.save(new Book("1984", "George Orwell", 1949));
         bookRepository.save(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
         bookRepository.save(new Book("Beloved", "Toni Morrison", 1987));
         bookRepository.save(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
         bookRepository.save(new Book("The Grapes of Wrath", "John Steinbeck", 1939));
         bookRepository.save(new Book("The Color Purple", "Alice Walker", 1982));
         bookRepository.save(new Book("Ulysses", "James Joyce", 1922));
         bookRepository.save(new Book("The Sun Also Rises", "Ernest Hemingway", 1926));
         bookRepository.save(new Book("The Sound and the Fury", "William Faulkner", 1929));
    }

}
