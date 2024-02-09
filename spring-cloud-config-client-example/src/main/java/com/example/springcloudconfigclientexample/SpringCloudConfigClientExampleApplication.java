package com.example.springcloudconfigclientexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
@RefreshScope
@RequestMapping("/show")
public class SpringCloudConfigClientExampleApplication {

          
         

    @Autowired
    private Environment env;
    

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientExampleApplication.class, args);
	}
	@GetMapping
	  public  String showMessage(){
	  
	  return env.getProperty("message");
          }

}
