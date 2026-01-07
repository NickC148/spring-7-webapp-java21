package spring_7_webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring_7_webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
