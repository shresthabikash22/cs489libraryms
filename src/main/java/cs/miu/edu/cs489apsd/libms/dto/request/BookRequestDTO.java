package cs.miu.edu.cs489apsd.libms.dto.request;

import java.util.List;

public record BookRequestDTO(
        String title,
        String isbn,
        List<AuthorRequestDTO> authorRequestDTOs,
        PublisherRequestDTO publisherRequestDTO
) {
}
