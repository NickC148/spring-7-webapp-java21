package spring_7_webapp.services;

import spring_7_webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
