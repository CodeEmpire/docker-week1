package pl.codeempire.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DockerDemoApplication.class, args);
		System.out.println("Hello world from SpringBoot Application!!!");
		Thread.sleep(5000);
		System.out.println("Whats up??");
	}

}
