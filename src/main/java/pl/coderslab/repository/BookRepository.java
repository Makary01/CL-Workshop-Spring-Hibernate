package pl.coderslab.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    

}
