package cs.miu.edu.cs489apsd.libms.mapper;

import cs.miu.edu.cs489apsd.libms.dto.request.PublisherRequestDTO;
import cs.miu.edu.cs489apsd.libms.dto.response.PublisherResponseDTO;
import cs.miu.edu.cs489apsd.libms.model.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PublisherMapper {
    // mapper method to map from PublisherRequestDTO to Publisher
    @Mapping(source = "addressRequestDTO", target="address")
    Publisher publisherRequestDTOToPublisher(PublisherRequestDTO pub);

    //mapper method to map from Publisher to PublisherResponseDTO
    @Mapping(source = "address", target = "addressResponseDTO")
    PublisherResponseDTO publisherToPublisherResponseDTO(Publisher publisher);

    // mapping from List<Publisher> to list of PublisherResponseDTO
    @Mapping(source = "address", target = "addressResponseDTO")
    List<PublisherResponseDTO> publishersToPublisherResponseDtoList(List<Publisher> publishers);
}
