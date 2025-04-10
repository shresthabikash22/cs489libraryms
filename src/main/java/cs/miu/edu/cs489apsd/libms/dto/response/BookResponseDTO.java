package cs.miu.edu.cs489apsd.libms.dto.response;

import cs.miu.edu.cs489apsd.libms.dto.request.AuthorRequestDTO;
import cs.miu.edu.cs489apsd.libms.dto.request.PublisherRequestDTO;

import java.util.List;

public record BookResponseDTO (
    Long id,
    String title,
    String isbn,
    List<AuthorResponseDTO> authorResponseDTOs,
    PublisherResponseDTO publisherResponseDTO) {
}
