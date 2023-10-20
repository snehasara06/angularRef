package com.kgisl.bookstoresb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.bookstoresb.entity.Book;


@Repository
public interface Bookrepository extends JpaRepository<Book, Integer>{

	

}
