package example;

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configuration
@EnableAutoConfiguration
@ComponentScan
class MyApp {}

object Application extends App {

 SpringApplication.run(classOf[MyApp]);

}
