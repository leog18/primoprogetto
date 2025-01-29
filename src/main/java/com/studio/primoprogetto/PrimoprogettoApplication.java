package com.studio.primoprogetto;

import com.studio.primoprogetto.configuration.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ServiceConfiguration.class)
public class PrimoprogettoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimoprogettoApplication.class, args);
	}

}
