package farhad.instana.subtraceapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MainController {
  Logger logger = LoggerFactory.getLogger(MainController.class);
  public static void main(String[] args) {
    SpringApplication.run(MainController.class, args);
  }

  @GetMapping("/")
  public String index() {
    logger.debug("MainController invoked");
    return "index";
  }
}
