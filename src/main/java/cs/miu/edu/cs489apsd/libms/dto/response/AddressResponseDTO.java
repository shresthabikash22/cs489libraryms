package cs.miu.edu.cs489apsd.libms.dto.response;

public record AddressResponseDTO(
        Long id,
        String unitNo,
        String street,
        String city,
        String state,
        Integer zip
) {
}
