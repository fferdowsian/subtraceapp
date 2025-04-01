package farhad.instana.subtraceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import farhad.instana.subtraceapp.other.User;

@SpringBootApplication
@RestController
public class SubtraceappApplication {
    public static void main(String[] args) {
      SpringApplication.run(SubtraceappApplication.class, args);
    }
    @GetMapping("/hello")

    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      User user = new User();
      user.setName(name);

      return String.format("Hello %s!", user.getName());
    }
}


/*
@SpringBootApplication
public class SubtraceappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubtraceappApplication.class, args);
	}

}
 */