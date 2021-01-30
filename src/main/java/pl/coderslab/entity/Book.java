package pl.coderslab.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 255)
    String author;

    @Size(max = 255)
    String isbn;

    @Size(max = 255)
    String publisher;

    @Size(max = 255)
    String title;

    @Size(max = 255)
    String type;
}
