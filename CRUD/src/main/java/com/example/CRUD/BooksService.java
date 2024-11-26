package com.example.CRUD;

//import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//@Data

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    // Convert the Books entity to a Dto (you'll need to map properties manually)
    private Dto convertEntityToDto(Books books) {
        Dto dto = new Dto();

        // Populate the DTO fields from the Books entity
//        dto.s
        dto.setBookname(books.getBookname());
        dto.setBookid(books.getBookid());
        dto.setPrice(books.getPrice());
        dto.setAuthor(books.getAuthor());

        return dto;
    }

    public Optional<Books> getBooksById(int id) {
        return booksRepository.findById(id);
    }

    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    public void update(Books books, int bookid) {
        if (booksRepository.existsById(bookid)) {


            books.setId(bookid);  // Assuming Books has an ID setter
            booksRepository.save(books);  // Save will perform an update
        } else {
            throw new RuntimeException("Book not found with id: " + bookid);
        }
    }
}
