package pl.coderslab.controller;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Book;
import pl.coderslab.repository.BookRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id:\\d+}")
    public Book findById(@PathVariable(name = "id") Long id){
        Optional<Book> bookOptional = bookRepository.findById(id);
        return bookOptional.orElseGet(Book::new);
    }

    @PostMapping("/save")
    public Book save(@RequestBody Book bookToSave){
        return bookRepository.save(bookToSave);
    }

    @PutMapping("/edit")
    public Book edit(@RequestBody Book editedBook){
        Optional<Long> idOptional = Optional.ofNullable(editedBook.getId());
        if(idOptional.isPresent()){
            Optional<Book> bookOptional = bookRepository.findById(idOptional.get());
            if(bookOptional.isPresent()){
                return bookRepository.save(editedBook);
            }else {
                return new Book();
            }
        }else {
            return new Book();
        }
    }

    @DeleteMapping("/{id:\\d+}")
    public Book delete(@PathVariable(name = "id") Long id){
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isPresent()){
            bookRepository.delete(bookOptional.get());
            return bookOptional.get();
        } else {
            return new Book();
        }
    }

}
