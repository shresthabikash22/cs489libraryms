package cs.miu.edu.cs489apsd.libms.service;

import cs.miu.edu.cs489apsd.libms.dto.request.PublisherRequestDTO;
import cs.miu.edu.cs489apsd.libms.dto.response.PublisherResponseDTO;
import cs.miu.edu.cs489apsd.libms.model.Publisher;

import java.util.List;
import java.util.Optional;

public interface PublisherService {
    //Create
    Optional<PublisherResponseDTO> createPublisher(PublisherRequestDTO publisherRequestDTO);

    //Find
    Optional<PublisherResponseDTO> findPublisherByName(String name);
    //FindAll
    List<PublisherResponseDTO> findAllPublisher();
    //Update
    Optional<PublisherResponseDTO> updatePublisher(String name, PublisherRequestDTO publisherRequestDTO);
}
