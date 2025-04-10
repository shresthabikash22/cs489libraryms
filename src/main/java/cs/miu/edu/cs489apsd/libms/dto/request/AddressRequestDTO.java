package cs.miu.edu.cs489apsd.libms.dto.request;

public record AddressRequestDTO(
        String unitNo,
        String street,
        String city,
        String state,
        Integer zip
) {

}
