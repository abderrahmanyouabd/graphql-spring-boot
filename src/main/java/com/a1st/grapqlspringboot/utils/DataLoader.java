package com.a1st.grapqlspringboot.utils;

import com.a1st.grapqlspringboot.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

    }

}
