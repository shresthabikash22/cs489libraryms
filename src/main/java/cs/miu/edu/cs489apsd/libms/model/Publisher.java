package cs.miu.edu.cs489apsd.libms.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name ="publishers")
@NoArgsConstructor
@Data
public class Publisher{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="publisher_id")
    private Long id;

    @Column(nullable=false)
    private String name;

    @OneToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books; // Publisher -||-----------<-Book

    public Publisher(String name) {
        this.name = name;
    }
}