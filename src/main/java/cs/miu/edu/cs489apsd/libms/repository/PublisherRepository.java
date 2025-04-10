package cs.miu.edu.cs489apsd.libms.repository;

import cs.miu.edu.cs489apsd.libms.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {

    //JPA query method => find a publisher by name
    Optional<Publisher> findByName(String publisherName);

    void deleteByName(String name);

}
