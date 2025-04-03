package farhad.instana.subtraceapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;

import farhad.instana.subtraceapp.helpers.BranchProcessor;
@SpringBootApplication
@Controller
public class SubtraceappApplication {
  protected static Logger logger = LoggerFactory.getLogger(SubtraceappApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(SubtraceappApplication.class, args);
  }

  @GetMapping("/")
  public String index() {
    logger.debug("SubtraceappApplication root (/) invoked");
    return "index";
  }

  @PostMapping("/generateTrace")
  public String generateTrace(@RequestParam(value = "traceTree", defaultValue = "1") String traceTree) {

    logger.debug("generateTrace invoked");
    logger.debug("traceTree is " + "\"" + traceTree + "\"");

    try {
      String[] traceBranches = traceTree.split("\\n");
      for (String traceBranch : traceBranches) {
        BranchProcessor.processBranch(traceBranch.trim());
      }
    } catch (Exception e) {
      logger.debug("Exception: " + e);
      e.printStackTrace();
      return "error";
    }

    return "success";
  }
}
