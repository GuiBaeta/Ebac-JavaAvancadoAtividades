package br.com.ebac.ebac_zookeeper_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EbacZookeeperServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbacZookeeperServerApplication.class, args);
	}

}
