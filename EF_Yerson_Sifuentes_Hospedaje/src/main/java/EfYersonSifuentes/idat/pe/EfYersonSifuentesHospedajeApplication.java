package EfYersonSifuentes.idat.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EfYersonSifuentesHospedajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfYersonSifuentesHospedajeApplication.class, args);
	}

}
