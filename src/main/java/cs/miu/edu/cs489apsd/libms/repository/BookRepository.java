package cs.miu.edu.cs489apsd.libms.repository;

import cs.miu.edu.cs489apsd.libms.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {

    Optional<Book> findByIsbn(String isbn);
    void deleteByIsbn(String isbn);

    List<Book> findByTitle(String title);
}
