package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class Application {
    
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    
    public static void main(String args[]){
        SpringApplication.run(Application.class);
    }
    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
    
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
        return args -> {
            Flight flight = restTemplate.getForObject("https://opensky-network.org/api/states/all?time=1458564121&icao24=3c6444", Flight.class);
            log.info(flight.toString());
        };
    }
    
}
