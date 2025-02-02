package com.a1st.grapqlspringboot.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.graphql.data.GraphQlRepository;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
@GraphQlRepository
public interface BookRepository extends JpaRepository<Book, Long>, QueryByExampleExecutor<Book> {

}
