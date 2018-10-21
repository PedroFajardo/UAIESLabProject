package com.UA.IES.LabProject.LabProject;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LabProjectApplication {

	//private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]){
		//SpringApplication.run(Application.class);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Flight>> response = restTemplate.exchange("https://opensky-network.org/api/flights/arrival?airport=EDDF&begin=1517227200&end=1517230800", HttpMethod.GET, null, new ParameterizedTypeReference<List<Flight>>(){});
		List<Flight> flights = response.getBody();

		for(int i=0; i < flights.size(); i++){
			System.out.println(flights.get(i));
		}

	}

    /*@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
        return args -> {
            ResponseEntity<List<Flight>> response = restTemplate.exchange("https://opensky-network.org/api/flights/departure?airport=EDDF&begin=1517227200&end=1517230800", HttpMethod.GET, null, new ParameterizedTypeReference<List<Flight>>(){});
            List<Flight> flight = response.getBody();
            log.info(flight.toString());
        };
    }*/

}
