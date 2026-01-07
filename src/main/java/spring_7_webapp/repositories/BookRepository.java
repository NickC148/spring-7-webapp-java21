package spring_7_webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring_7_webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
