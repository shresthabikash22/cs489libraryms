package cs.miu.edu.cs489apsd.libms.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name ="books")
@NoArgsConstructor
@Data
public class Book {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(unique = true, nullable = false)
    private String isbn;
    @ManyToMany (cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    private List<Author> authors;
    @JoinTable(
            name="books_authors", // joining table name
            joinColumns =  @JoinColumn(name = "book_id" ), // which entity owns the association
            inverseJoinColumns = @JoinColumn(name = "author_id")  // other entity, Author's primary key or
                                                                  // any other key  which must be unique
    )

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Publisher publisher; // Book ->------||- Publisher
}
