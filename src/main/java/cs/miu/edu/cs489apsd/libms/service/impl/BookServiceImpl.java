package cs.miu.edu.cs489apsd.libms.service.impl;

import cs.miu.edu.cs489apsd.libms.dto.request.BookRequestDTO;
import cs.miu.edu.cs489apsd.libms.dto.response.BookResponseDTO;
import cs.miu.edu.cs489apsd.libms.service.BookService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public Optional<BookResponseDTO> createBook(BookRequestDTO bookRequestDTO) {
        return Optional.empty();
    }

    @Override
    public Optional<BookResponseDTO> updateBook(String name, BookRequestDTO bookRequestDTO) {
        return Optional.empty();
    }

    @Override
    public Optional<BookResponseDTO> findBookByIsbn(String isbn) {
        return Optional.empty();
    }

    @Override
    public void deleteBookByIsbn(String isbn) {

    }

    @Override
    public List<BookResponseDTO> findAllBooks() {
        return null;
    }
}
