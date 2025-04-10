package cs.miu.edu.cs489apsd.libms;

import cs.miu.edu.cs489apsd.libms.dto.request.AddressRequestDTO;
import cs.miu.edu.cs489apsd.libms.dto.request.PublisherRequestDTO;
import cs.miu.edu.cs489apsd.libms.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class LibmsApplication {
	private final PublisherService publisherService;

	public static void main(String[] args) {
		SpringApplication.run(LibmsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			PublisherRequestDTO publisherRequest = new PublisherRequestDTO(
					"Sample Publisher Inc.",
					new AddressRequestDTO(
							"Unit 5A",
							"123 Main Street",
							"Springfield",
							"Illinois",
							62701
					)
			);
			System.out.println(publisherService.createPublisher(publisherRequest));
			System.out.println(publisherService.findAllPublisher());

		};
	}

}
