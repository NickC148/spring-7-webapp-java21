package spring_7_webapp.services;

import spring_7_webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
