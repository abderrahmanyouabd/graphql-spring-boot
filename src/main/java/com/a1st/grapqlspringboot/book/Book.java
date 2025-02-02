package com.a1st.grapqlspringboot.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private Integer publishedYear;
}
