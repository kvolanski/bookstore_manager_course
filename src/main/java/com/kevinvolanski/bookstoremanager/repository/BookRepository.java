package com.kevinvolanski.bookstoremanager.repository;

import com.kevinvolanski.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


}
