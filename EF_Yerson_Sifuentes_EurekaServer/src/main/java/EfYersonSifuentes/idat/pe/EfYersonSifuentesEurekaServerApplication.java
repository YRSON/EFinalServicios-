package EfYersonSifuentes.idat.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EfYersonSifuentesEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfYersonSifuentesEurekaServerApplication.class, args);
	}

}
