package pl.coderslab.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
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

    public Book() {
    }

    public Book(Long id, @Size(max = 255) String author, @Size(max = 255) String isbn, @Size(max = 255) String publisher, @Size(max = 255) String title, @Size(max = 255) String type) {
        this.id = id;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.title = title;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
