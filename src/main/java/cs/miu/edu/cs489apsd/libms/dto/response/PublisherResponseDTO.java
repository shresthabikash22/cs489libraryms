package cs.miu.edu.cs489apsd.libms.dto.response;

public record PublisherResponseDTO(
        Long id,
        String name,
        AddressResponseDTO addressResponseDTO
) {
}
