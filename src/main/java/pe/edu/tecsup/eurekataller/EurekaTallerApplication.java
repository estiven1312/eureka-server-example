package pe.edu.tecsup.eurekataller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaTallerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTallerApplication.class, args);
    }

}
