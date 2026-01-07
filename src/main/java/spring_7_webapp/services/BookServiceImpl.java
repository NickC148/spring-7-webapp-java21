package spring_7_webapp.services;

import org.springframework.stereotype.Service;
import spring_7_webapp.domain.Book;
import spring_7_webapp.repositories.AuthorRepository;
import spring_7_webapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
