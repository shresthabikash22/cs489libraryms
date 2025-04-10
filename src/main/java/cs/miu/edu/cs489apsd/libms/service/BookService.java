package cs.miu.edu.cs489apsd.libms.service;

import cs.miu.edu.cs489apsd.libms.dto.request.BookRequestDTO;
import cs.miu.edu.cs489apsd.libms.dto.response.BookResponseDTO;

import java.util.List;
import java.util.Optional;

public interface BookService {
    //Create
    Optional<BookResponseDTO> createBook(BookRequestDTO bookRequestDTO);
    //Update
    Optional<BookResponseDTO> updateBook(String name,BookRequestDTO bookRequestDTO);
    //Find by isbn
    Optional<BookResponseDTO> findBookByIsbn(String isbn);
    //delete by isbn
    void deleteBookByIsbn(String isbn);
    //find all
    List<BookResponseDTO> findAllBooks();
}
