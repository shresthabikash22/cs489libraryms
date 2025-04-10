package cs.miu.edu.cs489apsd.libms.service.impl;

import cs.miu.edu.cs489apsd.libms.dto.request.PublisherRequestDTO;
import cs.miu.edu.cs489apsd.libms.dto.response.AddressResponseDTO;
import cs.miu.edu.cs489apsd.libms.dto.response.PublisherResponseDTO;
import cs.miu.edu.cs489apsd.libms.mapper.PublisherMapper;
import cs.miu.edu.cs489apsd.libms.model.Address;
import cs.miu.edu.cs489apsd.libms.model.Publisher;
import cs.miu.edu.cs489apsd.libms.repository.PublisherRepository;
import cs.miu.edu.cs489apsd.libms.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;
    private final PublisherMapper publisherMapper;
    @Override
    public Optional<PublisherResponseDTO> createPublisher(PublisherRequestDTO publisherRequestDTO) {
        //From PublisherRequestDTO,construct publisher
        Publisher publisher = publisherMapper.publisherRequestDTOToPublisher(publisherRequestDTO);
        Publisher savedPublisher =  publisherRepository.save(publisher);
        //Map Publisher to PublisherRequestDTO
        PublisherResponseDTO publisherResponseDTO = publisherMapper.publisherToPublisherResponseDTO(savedPublisher);
        return Optional.of(publisherResponseDTO);

    }

    @Override
    public Optional<PublisherResponseDTO> findPublisherByName(String name) {
        Optional<Publisher> optionalPublisher = publisherRepository.findByName(name);
        return optionalPublisher.map(publisherMapper::publisherToPublisherResponseDTO);
    }

    @Override
    public List<PublisherResponseDTO> findAllPublisher() {
        List<Publisher> publishers = publisherRepository.findAll();
        return publisherMapper.publishersToPublisherResponseDtoList(publishers);
    }

    @Override
    public Optional<PublisherResponseDTO> updatePublisher(String name, PublisherRequestDTO publisherRequestDTO) {
        return Optional.empty();
    }
}
