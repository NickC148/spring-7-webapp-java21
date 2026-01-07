package spring_7_webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring_7_webapp.domain.Author;
import spring_7_webapp.domain.Book;
import spring_7_webapp.domain.Publisher;
import spring_7_webapp.repositories.AuthorRepository;
import spring_7_webapp.repositories.BookRepository;
import spring_7_webapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository,
                         BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        --- Authors ---
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Scott");

        Author ericSaved = authorRepository.save(eric);
        Author rodSaved = authorRepository.save(rod);

//        --- Books ---
        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Book noEJB = new Book();
        noEJB.setTitle("No-EJB");
        noEJB.setIsbn("456789");

        Book dddSaved = bookRepository.save(ddd);
        Book noEJBSaved = bookRepository.save(noEJB);

//        --- Publishers ---
        Publisher penguin = new Publisher();
        penguin.setPublisherName("Penguin");
        penguin.setAddress("123 Some Street");
        penguin.setCity("Miami");
        penguin.setState("Florida");
        penguin.setZip("40317");

        Publisher penguinSaved = publisherRepository.save(penguin);


        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        publisherRepository.save(penguin);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}
