package nttdata.bootcamp.microservicios.depositos.cuentas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioDepositoCuentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioDepositoCuentaApplication.class, args);
	}

	
	/*
	 * @Bean CommandLineRunner commandLineRunner(KafkaTemplate<String, String>
	 * kafkaTemplate) { return args ->{ kafkaTemplate.send( "DEPOSITSINACCOUNTS",
	 * "Mensaje desde microservicio depositos a cuentas  con apache KAFKA "); }; }
	 */
}
