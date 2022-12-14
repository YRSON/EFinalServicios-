package EfYersonSifuentes.idat.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EfYersonSifuentesReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfYersonSifuentesReservaApplication.class, args);
	}

}
