package com.boot.awselasticbeanstackcodepipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootElasticbeanstackAwsUploadCodepipelineApplication {

	
	
	@GetMapping("/status")
	public String getststus() {
		return "Welcome to Elastick bean stack and code pipeline sample update server port number to 5000";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootElasticbeanstackAwsUploadCodepipelineApplication.class, args);
	}

}
